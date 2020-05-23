package typings.reactNativeChartsWrapper.mod

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
    barSpace: js.UndefOr[Double] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    colors: js.Array[Color] = null,
    decreasingColor: js.UndefOr[Color] = js.undefined,
    decreasingPaintStyle: CandleStickPaintStyle = null,
    drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined,
    drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    highlightColor: js.UndefOr[Color] = js.undefined,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    highlightLineWidth: js.UndefOr[Double] = js.undefined,
    increasingColor: js.UndefOr[Color] = js.undefined,
    increasingPaintStyle: CandleStickPaintStyle = null,
    neutralColor: js.UndefOr[Color] = js.undefined,
    shadowColor: js.UndefOr[Color] = js.undefined,
    shadowColorSameAsCandle: js.UndefOr[Boolean] = js.undefined,
    shadowWidth: js.UndefOr[Double] = js.undefined,
    valueFormatter: ValueFormatter = null,
    valueTextColor: js.UndefOr[Color] = js.undefined,
    valueTextSize: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CandleStickDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (!js.isUndefined(barSpace)) __obj.updateDynamic("barSpace")(barSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(decreasingColor)) __obj.updateDynamic("decreasingColor")(decreasingColor.get.asInstanceOf[js.Any])
    if (decreasingPaintStyle != null) __obj.updateDynamic("decreasingPaintStyle")(decreasingPaintStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightColor)) __obj.updateDynamic("highlightColor")(highlightColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightLineWidth)) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(increasingColor)) __obj.updateDynamic("increasingColor")(increasingColor.get.asInstanceOf[js.Any])
    if (increasingPaintStyle != null) __obj.updateDynamic("increasingPaintStyle")(increasingPaintStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(neutralColor)) __obj.updateDynamic("neutralColor")(neutralColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowColor)) __obj.updateDynamic("shadowColor")(shadowColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowColorSameAsCandle)) __obj.updateDynamic("shadowColorSameAsCandle")(shadowColorSameAsCandle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowWidth)) __obj.updateDynamic("shadowWidth")(shadowWidth.get.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextColor)) __obj.updateDynamic("valueTextColor")(valueTextColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextSize)) __obj.updateDynamic("valueTextSize")(valueTextSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickDatasetConfig]
  }
}

