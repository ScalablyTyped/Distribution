package typings.randomNumber.mod

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
    val __obj = js.Dynamic.literal(integer = integer.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

