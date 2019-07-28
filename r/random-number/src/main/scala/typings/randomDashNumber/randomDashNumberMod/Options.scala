package typings.randomDashNumber.randomDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var integer: Boolean
  var max: Double
  var min: Double
}

object Options {
  @scala.inline
  def apply(integer: Boolean, max: Double, min: Double): Options = {
    val __obj = js.Dynamic.literal(integer = integer, max = max, min = min)
  
    __obj.asInstanceOf[Options]
  }
}

