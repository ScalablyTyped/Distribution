package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Angle
import typings.reactNativeChartsWrapper.anon.Phase
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CUBIC_BEZIER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL_BEZIER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINEAR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.STEPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig
     with LineRadarConfig {
  var circleColor: js.UndefOr[Color] = js.undefined
  var circleColors: js.UndefOr[js.Array[Color]] = js.undefined
  var circleHoleColor: js.UndefOr[Color] = js.undefined
  var circleRadius: js.UndefOr[Double] = js.undefined
  var dashedLine: js.UndefOr[Phase] = js.undefined
  var drawCircleHole: js.UndefOr[Boolean] = js.undefined
  var drawCircles: js.UndefOr[Boolean] = js.undefined
  var drawCubicIntensity: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER] = js.undefined
}

object LineDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    circleColor: js.UndefOr[Color] = js.undefined,
    circleColors: js.Array[Color] = null,
    circleHoleColor: js.UndefOr[Color] = js.undefined,
    circleRadius: js.UndefOr[Double] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    colors: js.Array[Color] = null,
    dashedLine: Phase = null,
    drawCircleHole: js.UndefOr[Boolean] = js.undefined,
    drawCircles: js.UndefOr[Boolean] = js.undefined,
    drawCubicIntensity: js.UndefOr[Double] = js.undefined,
    drawFilled: js.UndefOr[Boolean] = js.undefined,
    drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined,
    drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    fillAlpha: js.UndefOr[Double] = js.undefined,
    fillColor: js.UndefOr[Color] = js.undefined,
    fillGradient: Angle = null,
    highlightColor: js.UndefOr[Color] = js.undefined,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    highlightLineWidth: js.UndefOr[Double] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    mode: LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER = null,
    valueFormatter: ValueFormatter = null,
    valueTextColor: js.UndefOr[Color] = js.undefined,
    valueTextSize: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LineDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (!js.isUndefined(circleColor)) __obj.updateDynamic("circleColor")(circleColor.get.asInstanceOf[js.Any])
    if (circleColors != null) __obj.updateDynamic("circleColors")(circleColors.asInstanceOf[js.Any])
    if (!js.isUndefined(circleHoleColor)) __obj.updateDynamic("circleHoleColor")(circleHoleColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(circleRadius)) __obj.updateDynamic("circleRadius")(circleRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (dashedLine != null) __obj.updateDynamic("dashedLine")(dashedLine.asInstanceOf[js.Any])
    if (!js.isUndefined(drawCircleHole)) __obj.updateDynamic("drawCircleHole")(drawCircleHole.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawCircles)) __obj.updateDynamic("drawCircles")(drawCircles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawCubicIntensity)) __obj.updateDynamic("drawCubicIntensity")(drawCubicIntensity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawFilled)) __obj.updateDynamic("drawFilled")(drawFilled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillAlpha)) __obj.updateDynamic("fillAlpha")(fillAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillColor)) __obj.updateDynamic("fillColor")(fillColor.get.asInstanceOf[js.Any])
    if (fillGradient != null) __obj.updateDynamic("fillGradient")(fillGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightColor)) __obj.updateDynamic("highlightColor")(highlightColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightLineWidth)) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextColor)) __obj.updateDynamic("valueTextColor")(valueTextColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextSize)) __obj.updateDynamic("valueTextSize")(valueTextSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDatasetConfig]
  }
}

