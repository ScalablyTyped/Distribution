package typings.rotDashJs.rotDashJsMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  def mod(n: Double): Double
}

object Number {
  @scala.inline
  def apply(mod: Double => Double): Number = {
    val __obj = js.Dynamic.literal(mod = js.Any.fromFunction1(mod))
  
    __obj.asInstanceOf[Number]
  }
}

