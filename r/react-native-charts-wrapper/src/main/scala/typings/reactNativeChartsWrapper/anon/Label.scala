package typings.reactNativeChartsWrapper.anon

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM] = js.undefined
  var limit: Double
  var lineColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  var lineDashLengths: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashPhase: js.UndefOr[Double] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var valueFont: js.UndefOr[String] = js.undefined
  var valueTextColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    limit: Double,
    label: String = null,
    labelPosition: LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM = null,
    lineColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined,
    lineDashLengths: js.Array[Double] = null,
    lineDashPhase: js.UndefOr[Double] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    valueFont: String = null,
    valueTextColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  ): Label = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(lineColor)) __obj.updateDynamic("lineColor")(lineColor.get.asInstanceOf[js.Any])
    if (lineDashLengths != null) __obj.updateDynamic("lineDashLengths")(lineDashLengths.asInstanceOf[js.Any])
    if (!js.isUndefined(lineDashPhase)) __obj.updateDynamic("lineDashPhase")(lineDashPhase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (valueFont != null) __obj.updateDynamic("valueFont")(valueFont.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextColor)) __obj.updateDynamic("valueTextColor")(valueTextColor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

