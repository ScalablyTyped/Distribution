package typings.reactNativeTextInputMask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: Double
}

object AnonEnd {
  @scala.inline
  def apply(start: Double, end: Int | Double = null): AnonEnd = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

