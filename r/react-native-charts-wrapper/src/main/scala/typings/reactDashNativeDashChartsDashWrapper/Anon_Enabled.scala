package typings.reactDashNativeDashChartsDashWrapper

import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var lineColor: js.UndefOr[Color] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    lineColor: Int | Double = null,
    lineWidth: Int | Double = null
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enabled]
  }
}

