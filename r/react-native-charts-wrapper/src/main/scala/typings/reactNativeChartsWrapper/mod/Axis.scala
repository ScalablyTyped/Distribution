package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.AnonLabel
import typings.reactNativeChartsWrapper.AnonLineLength
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
  var gridDashedLine: js.UndefOr[AnonLineLength] = js.undefined
  var gridLineWidth: js.UndefOr[Double] = js.undefined
  var labelCount: js.UndefOr[Double] = js.undefined
  var labelCountForce: js.UndefOr[Boolean] = js.undefined
  var limitLines: js.UndefOr[js.Array[AnonLabel]] = js.undefined
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
    axisLineColor: Int | Double = null,
    axisLineWidth: Int | Double = null,
    axisMaximum: Int | Double = null,
    axisMinimum: Int | Double = null,
    centerAxisLabels: js.UndefOr[Boolean] = js.undefined,
    drawAxisLines: js.UndefOr[Boolean] = js.undefined,
    drawGridLines: js.UndefOr[Boolean] = js.undefined,
    drawLabels: js.UndefOr[Boolean] = js.undefined,
    drawLimitLinesBehindData: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontStyle: String = null,
    fontWeight: Int | Double = null,
    granularity: Int | Double = null,
    granularityEnabled: js.UndefOr[Boolean] = js.undefined,
    gridColor: Int | Double = null,
    gridDashedLine: AnonLineLength = null,
    gridLineWidth: Int | Double = null,
    labelCount: Int | Double = null,
    labelCountForce: js.UndefOr[Boolean] = js.undefined,
    limitLines: js.Array[AnonLabel] = null,
    since: Int | Double = null,
    textColor: Int | Double = null,
    textSize: Int | Double = null,
    timeUnit: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS = null,
    valueFormatter: ValueFormatter = null,
    valueFormatterPattern: String = null
  ): Axis = {
    val __obj = js.Dynamic.literal()
    if (axisLineColor != null) __obj.updateDynamic("axisLineColor")(axisLineColor.asInstanceOf[js.Any])
    if (axisLineWidth != null) __obj.updateDynamic("axisLineWidth")(axisLineWidth.asInstanceOf[js.Any])
    if (axisMaximum != null) __obj.updateDynamic("axisMaximum")(axisMaximum.asInstanceOf[js.Any])
    if (axisMinimum != null) __obj.updateDynamic("axisMinimum")(axisMinimum.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAxisLabels)) __obj.updateDynamic("centerAxisLabels")(centerAxisLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(drawAxisLines)) __obj.updateDynamic("drawAxisLines")(drawAxisLines.asInstanceOf[js.Any])
    if (!js.isUndefined(drawGridLines)) __obj.updateDynamic("drawGridLines")(drawGridLines.asInstanceOf[js.Any])
    if (!js.isUndefined(drawLabels)) __obj.updateDynamic("drawLabels")(drawLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(drawLimitLinesBehindData)) __obj.updateDynamic("drawLimitLinesBehindData")(drawLimitLinesBehindData.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (!js.isUndefined(granularityEnabled)) __obj.updateDynamic("granularityEnabled")(granularityEnabled.asInstanceOf[js.Any])
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor.asInstanceOf[js.Any])
    if (gridDashedLine != null) __obj.updateDynamic("gridDashedLine")(gridDashedLine.asInstanceOf[js.Any])
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (labelCount != null) __obj.updateDynamic("labelCount")(labelCount.asInstanceOf[js.Any])
    if (!js.isUndefined(labelCountForce)) __obj.updateDynamic("labelCountForce")(labelCountForce.asInstanceOf[js.Any])
    if (limitLines != null) __obj.updateDynamic("limitLines")(limitLines.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueFormatterPattern != null) __obj.updateDynamic("valueFormatterPattern")(valueFormatterPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

