package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndStart extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: Double
}

object AnonEndStart {
  @scala.inline
  def apply(start: Double, end: Int | Double = null): AnonEndStart = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndStart]
  }
}

