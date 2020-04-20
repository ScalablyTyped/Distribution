package typings.sharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var current: Double
  var max: Double
}

object AnonMax {
  @scala.inline
  def apply(current: Double, max: Double): AnonMax = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

