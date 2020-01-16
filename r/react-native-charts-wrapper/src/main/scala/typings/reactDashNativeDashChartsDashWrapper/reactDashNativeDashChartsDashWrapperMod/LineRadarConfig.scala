package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import typings.reactDashNativeDashChartsDashWrapper.Anon_Angle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineRadarConfig extends js.Object {
  var drawFilled: js.UndefOr[Boolean] = js.undefined
  var fillAlpha: js.UndefOr[Double] = js.undefined
  var fillColor: js.UndefOr[Color] = js.undefined
  var fillGradient: js.UndefOr[Anon_Angle] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object LineRadarConfig {
  @scala.inline
  def apply(
    drawFilled: js.UndefOr[Boolean] = js.undefined,
    fillAlpha: Int | Double = null,
    fillColor: Int | Double = null,
    fillGradient: Anon_Angle = null,
    lineWidth: Int | Double = null
  ): LineRadarConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawFilled)) __obj.updateDynamic("drawFilled")(drawFilled.asInstanceOf[js.Any])
    if (fillAlpha != null) __obj.updateDynamic("fillAlpha")(fillAlpha.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillGradient != null) __obj.updateDynamic("fillGradient")(fillGradient.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineRadarConfig]
  }
}

