package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: Double
}

object AnonStart {
  @scala.inline
  def apply(start: Double, end: Int | Double = null): AnonStart = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStart]
  }
}

