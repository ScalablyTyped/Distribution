package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillProps extends js.Object {
  var fill: js.UndefOr[int32ARGBColor | rgbaArray | String] = js.undefined
  var fillOpacity: js.UndefOr[NumberProp] = js.undefined
  var fillRule: js.UndefOr[FillRule] = js.undefined
}

object FillProps {
  @scala.inline
  def apply(
    fill: int32ARGBColor | rgbaArray | String = null,
    fillOpacity: NumberProp = null,
    fillRule: FillRule = null
  ): FillProps = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    __obj.asInstanceOf[FillProps]
  }
}

