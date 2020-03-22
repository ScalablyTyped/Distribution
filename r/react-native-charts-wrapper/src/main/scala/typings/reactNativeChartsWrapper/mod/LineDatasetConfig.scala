package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.AnonAngle
import typings.reactNativeChartsWrapper.AnonPhase
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
  var dashedLine: js.UndefOr[AnonPhase] = js.undefined
  var drawCircleHole: js.UndefOr[Boolean] = js.undefined
  var drawCircles: js.UndefOr[Boolean] = js.undefined
  var drawCubicIntensity: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER] = js.undefined
}

object LineDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    circleColor: Int | Double = null,
    circleColors: js.Array[Color] = null,
    circleHoleColor: Int | Double = null,
    circleRadius: Int | Double = null,
    color: Int | Double = null,
    colors: js.Array[Color] = null,
    dashedLine: AnonPhase = null,
    drawCircleHole: js.UndefOr[Boolean] = js.undefined,
    drawCircles: js.UndefOr[Boolean] = js.undefined,
    drawCubicIntensity: Int | Double = null,
    drawFilled: js.UndefOr[Boolean] = js.undefined,
    drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined,
    drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    fillAlpha: Int | Double = null,
    fillColor: Int | Double = null,
    fillGradient: AnonAngle = null,
    highlightColor: Int | Double = null,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    highlightLineWidth: Int | Double = null,
    lineWidth: Int | Double = null,
    mode: LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER = null,
    valueFormatter: ValueFormatter = null,
    valueTextColor: Int | Double = null,
    valueTextSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LineDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (circleColor != null) __obj.updateDynamic("circleColor")(circleColor.asInstanceOf[js.Any])
    if (circleColors != null) __obj.updateDynamic("circleColors")(circleColors.asInstanceOf[js.Any])
    if (circleHoleColor != null) __obj.updateDynamic("circleHoleColor")(circleHoleColor.asInstanceOf[js.Any])
    if (circleRadius != null) __obj.updateDynamic("circleRadius")(circleRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (dashedLine != null) __obj.updateDynamic("dashedLine")(dashedLine.asInstanceOf[js.Any])
    if (!js.isUndefined(drawCircleHole)) __obj.updateDynamic("drawCircleHole")(drawCircleHole.asInstanceOf[js.Any])
    if (!js.isUndefined(drawCircles)) __obj.updateDynamic("drawCircles")(drawCircles.asInstanceOf[js.Any])
    if (drawCubicIntensity != null) __obj.updateDynamic("drawCubicIntensity")(drawCubicIntensity.asInstanceOf[js.Any])
    if (!js.isUndefined(drawFilled)) __obj.updateDynamic("drawFilled")(drawFilled.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.asInstanceOf[js.Any])
    if (fillAlpha != null) __obj.updateDynamic("fillAlpha")(fillAlpha.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillGradient != null) __obj.updateDynamic("fillGradient")(fillGradient.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.asInstanceOf[js.Any])
    if (highlightLineWidth != null) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueTextColor != null) __obj.updateDynamic("valueTextColor")(valueTextColor.asInstanceOf[js.Any])
    if (valueTextSize != null) __obj.updateDynamic("valueTextSize")(valueTextSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDatasetConfig]
  }
}

