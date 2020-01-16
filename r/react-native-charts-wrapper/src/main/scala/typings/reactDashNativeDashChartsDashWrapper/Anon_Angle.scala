package typings.reactDashNativeDashChartsDashWrapper

import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod.Color
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.BL_TR
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.BOTTOM_TOP
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.BR_TL
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.LEFT_RIGHT
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.RIGHT_LEFT
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.TL_BR
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.TOP_BOTTOM
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.TR_BL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var orientation: js.UndefOr[
    TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR
  ] = js.undefined
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
}

object Anon_Angle {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    colors: js.Array[Color] = null,
    orientation: TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR = null,
    positions: js.Array[Double] = null
  ): Anon_Angle = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Angle]
  }
}

