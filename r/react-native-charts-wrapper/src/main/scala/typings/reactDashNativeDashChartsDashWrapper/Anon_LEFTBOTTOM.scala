package typings.reactDashNativeDashChartsDashWrapper

import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod.Color
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.LEFT_BOTTOM
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.LEFT_TOP
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.RIGHT_BOTTOM
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.RIGHT_TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LEFTBOTTOM extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM] = js.undefined
  var limit: Double
  var lineColor: js.UndefOr[Color] = js.undefined
  var lineDashLengths: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashPhase: js.UndefOr[Double] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var valueFont: js.UndefOr[String] = js.undefined
  var valueTextColor: js.UndefOr[Color] = js.undefined
}

object Anon_LEFTBOTTOM {
  @scala.inline
  def apply(
    limit: Double,
    label: String = null,
    labelPosition: LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM = null,
    lineColor: Int | Double = null,
    lineDashLengths: js.Array[Double] = null,
    lineDashPhase: Int | Double = null,
    lineWidth: Int | Double = null,
    valueFont: String = null,
    valueTextColor: Int | Double = null
  ): Anon_LEFTBOTTOM = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineDashLengths != null) __obj.updateDynamic("lineDashLengths")(lineDashLengths.asInstanceOf[js.Any])
    if (lineDashPhase != null) __obj.updateDynamic("lineDashPhase")(lineDashPhase.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (valueFont != null) __obj.updateDynamic("valueFont")(valueFont.asInstanceOf[js.Any])
    if (valueTextColor != null) __obj.updateDynamic("valueTextColor")(valueTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LEFTBOTTOM]
  }
}

