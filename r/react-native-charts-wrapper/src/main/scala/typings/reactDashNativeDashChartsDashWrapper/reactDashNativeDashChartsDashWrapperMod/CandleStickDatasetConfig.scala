package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandleStickDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  var barSpace: js.UndefOr[Double] = js.undefined
  var decreasingColor: js.UndefOr[Color] = js.undefined
  var decreasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.undefined
  var increasingColor: js.UndefOr[Color] = js.undefined
  var increasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.undefined
  var neutralColor: js.UndefOr[Color] = js.undefined
  var shadowColor: js.UndefOr[Color] = js.undefined
  var shadowColorSameAsCandle: js.UndefOr[Boolean] = js.undefined
  var shadowWidth: js.UndefOr[Double] = js.undefined
}

object CandleStickDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    barSpace: Int | Double = null,
    color: Int | Double = null,
    colors: js.Array[Color] = null,
    decreasingColor: Int | Double = null,
    decreasingPaintStyle: CandleStickPaintStyle = null,
    drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined,
    drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    highlightColor: Int | Double = null,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    highlightLineWidth: Int | Double = null,
    increasingColor: Int | Double = null,
    increasingPaintStyle: CandleStickPaintStyle = null,
    neutralColor: Int | Double = null,
    shadowColor: Int | Double = null,
    shadowColorSameAsCandle: js.UndefOr[Boolean] = js.undefined,
    shadowWidth: Int | Double = null,
    valueFormatter: ValueFormatter = null,
    valueTextColor: Int | Double = null,
    valueTextSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CandleStickDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (barSpace != null) __obj.updateDynamic("barSpace")(barSpace.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (decreasingColor != null) __obj.updateDynamic("decreasingColor")(decreasingColor.asInstanceOf[js.Any])
    if (decreasingPaintStyle != null) __obj.updateDynamic("decreasingPaintStyle")(decreasingPaintStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.asInstanceOf[js.Any])
    if (highlightLineWidth != null) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.asInstanceOf[js.Any])
    if (increasingColor != null) __obj.updateDynamic("increasingColor")(increasingColor.asInstanceOf[js.Any])
    if (increasingPaintStyle != null) __obj.updateDynamic("increasingPaintStyle")(increasingPaintStyle.asInstanceOf[js.Any])
    if (neutralColor != null) __obj.updateDynamic("neutralColor")(neutralColor.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowColorSameAsCandle)) __obj.updateDynamic("shadowColorSameAsCandle")(shadowColorSameAsCandle.asInstanceOf[js.Any])
    if (shadowWidth != null) __obj.updateDynamic("shadowWidth")(shadowWidth.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueTextColor != null) __obj.updateDynamic("valueTextColor")(valueTextColor.asInstanceOf[js.Any])
    if (valueTextSize != null) __obj.updateDynamic("valueTextSize")(valueTextSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickDatasetConfig]
  }
}

