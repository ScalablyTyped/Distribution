package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import typings.reactDashNativeDashSvg.int32ARGBColor
import typings.reactDashNativeDashSvg.rgbaArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopProps extends js.Object {
  var offset: js.UndefOr[NumberProp] = js.undefined
  var stopColor: js.UndefOr[int32ARGBColor | rgbaArray | String] = js.undefined
  var stopOpacity: js.UndefOr[NumberProp] = js.undefined
}

object StopProps {
  @scala.inline
  def apply(
    offset: NumberProp = null,
    stopColor: int32ARGBColor | rgbaArray | String = null,
    stopOpacity: NumberProp = null
  ): StopProps = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProps]
  }
}

