package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Label
import typings.reactNativeChartsWrapper.anon.LineLength
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DAYS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HOURS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MILLISECONDS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MINUTES
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SECONDS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
  var axisLineColor: js.UndefOr[Color] = js.undefined
  var axisLineWidth: js.UndefOr[Double] = js.undefined
  var axisMaximum: js.UndefOr[Double] = js.undefined
  var axisMinimum: js.UndefOr[Double] = js.undefined
  var centerAxisLabels: js.UndefOr[Boolean] = js.undefined
  var drawAxisLines: js.UndefOr[Boolean] = js.undefined
  var drawGridLines: js.UndefOr[Boolean] = js.undefined
  var drawLabels: js.UndefOr[Boolean] = js.undefined
  var drawLimitLinesBehindData: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var granularityEnabled: js.UndefOr[Boolean] = js.undefined
  var gridColor: js.UndefOr[Color] = js.undefined
  var gridDashedLine: js.UndefOr[LineLength] = js.undefined
  var gridLineWidth: js.UndefOr[Double] = js.undefined
  var labelCount: js.UndefOr[Double] = js.undefined
  var labelCountForce: js.UndefOr[Boolean] = js.undefined
  var limitLines: js.UndefOr[js.Array[Label]] = js.undefined
  var since: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[Color] = js.undefined
  var textSize: js.UndefOr[Double] = js.undefined
  var timeUnit: js.UndefOr[MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS] = js.undefined
  var valueFormatter: js.UndefOr[ValueFormatter] = js.undefined
  var valueFormatterPattern: js.UndefOr[String] = js.undefined
}

object Axis {
  @scala.inline
  def apply(
    axisLineColor: js.UndefOr[Color] = js.undefined,
    axisLineWidth: js.UndefOr[Double] = js.undefined,
    axisMaximum: js.UndefOr[Double] = js.undefined,
    axisMinimum: js.UndefOr[Double] = js.undefined,
    centerAxisLabels: js.UndefOr[Boolean] = js.undefined,
    drawAxisLines: js.UndefOr[Boolean] = js.undefined,
    drawGridLines: js.UndefOr[Boolean] = js.undefined,
    drawLabels: js.UndefOr[Boolean] = js.undefined,
    drawLimitLinesBehindData: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontStyle: String = null,
    fontWeight: js.UndefOr[Double] = js.undefined,
    granularity: js.UndefOr[Double] = js.undefined,
    granularityEnabled: js.UndefOr[Boolean] = js.undefined,
    gridColor: js.UndefOr[Color] = js.undefined,
    gridDashedLine: LineLength = null,
    gridLineWidth: js.UndefOr[Double] = js.undefined,
    labelCount: js.UndefOr[Double] = js.undefined,
    labelCountForce: js.UndefOr[Boolean] = js.undefined,
    limitLines: js.Array[Label] = null,
    since: js.UndefOr[Double] = js.undefined,
    textColor: js.UndefOr[Color] = js.undefined,
    textSize: js.UndefOr[Double] = js.undefined,
    timeUnit: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS = null,
    valueFormatter: ValueFormatter = null,
    valueFormatterPattern: String = null
  ): Axis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(axisLineColor)) __obj.updateDynamic("axisLineColor")(axisLineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisLineWidth)) __obj.updateDynamic("axisLineWidth")(axisLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisMaximum)) __obj.updateDynamic("axisMaximum")(axisMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisMinimum)) __obj.updateDynamic("axisMinimum")(axisMinimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAxisLabels)) __obj.updateDynamic("centerAxisLabels")(centerAxisLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawAxisLines)) __obj.updateDynamic("drawAxisLines")(drawAxisLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawGridLines)) __obj.updateDynamic("drawGridLines")(drawGridLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawLabels)) __obj.updateDynamic("drawLabels")(drawLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawLimitLinesBehindData)) __obj.updateDynamic("drawLimitLinesBehindData")(drawLimitLinesBehindData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularityEnabled)) __obj.updateDynamic("granularityEnabled")(granularityEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridColor)) __obj.updateDynamic("gridColor")(gridColor.get.asInstanceOf[js.Any])
    if (gridDashedLine != null) __obj.updateDynamic("gridDashedLine")(gridDashedLine.asInstanceOf[js.Any])
    if (!js.isUndefined(gridLineWidth)) __obj.updateDynamic("gridLineWidth")(gridLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelCount)) __obj.updateDynamic("labelCount")(labelCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelCountForce)) __obj.updateDynamic("labelCountForce")(labelCountForce.get.asInstanceOf[js.Any])
    if (limitLines != null) __obj.updateDynamic("limitLines")(limitLines.asInstanceOf[js.Any])
    if (!js.isUndefined(since)) __obj.updateDynamic("since")(since.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textColor)) __obj.updateDynamic("textColor")(textColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textSize)) __obj.updateDynamic("textSize")(textSize.get.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueFormatterPattern != null) __obj.updateDynamic("valueFormatterPattern")(valueFormatterPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

