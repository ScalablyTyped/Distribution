package typings.sharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: Double
  var high: Double
  var max: Double
}

object AnonCurrent {
  @scala.inline
  def apply(current: Double, high: Double, max: Double): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
}

