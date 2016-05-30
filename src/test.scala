/**
 * Created by bright on 2015/5/31.
 */

class Counter {
  var value = 0
  def increment(): Unit = {
    value += 1
  }

  def current = value
}

class User {
  var name = "anonymous"
  var age:Int = _
  val country = "china"
  def email = name + "@mail"
}

object TrafficLightColor extends Enumeration {
  val Red, Yellow, Green = Value
}

class AddOne extends ((Int) => Int) {
  def apply(m: Int): Int = m + 1
}

object test {
  def main(args: Array[String]) {
//    val x: BigInt = 1234546
//    println(x*x*x)
//    println(pow(2, 6))
//
//    def fun (n: Int): Float = {
//      n*n
//    }
//
//    println(fun(22))

//    val myCounter = new Counter()
//    myCounter.increment()
//    println(myCounter.current)
//    println(myCounter.value)
    val u = new User
    println(u.age)

    println(TrafficLightColor(0))
    val color = TrafficLightColor.Green
    println(color)

    println(1 to 5 reverseMap (10*))

  }
}


