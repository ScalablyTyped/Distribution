package typings.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBarWidth extends js.Object {
  var barWidth: js.UndefOr[Double] = js.undefined
  var group: js.UndefOr[AnonBarSpace] = js.undefined
}

object AnonBarWidth {
  @scala.inline
  def apply(barWidth: Int | Double = null, group: AnonBarSpace = null): AnonBarWidth = {
    val __obj = js.Dynamic.literal()
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBarWidth]
  }
}

