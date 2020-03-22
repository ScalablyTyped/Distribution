package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.AnonLabel
import typings.reactNativeChartsWrapper.AnonLineLength
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTH_SIDED
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_INSIDE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DAYS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HOURS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MILLISECONDS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MINUTES
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SECONDS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_INSIDE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait xAxis extends Axis {
  var avoidFirstLastClipping: js.UndefOr[Boolean] = js.undefined
  var labelRotationAngle: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE] = js.undefined
  var yOffset: js.UndefOr[Double] = js.undefined
}

object xAxis {
  @scala.inline
  def apply(
    avoidFirstLastClipping: js.UndefOr[Boolean] = js.undefined,
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
    labelRotationAngle: Int | Double = null,
    limitLines: js.Array[AnonLabel] = null,
    position: TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE = null,
    since: Int | Double = null,
    textColor: Int | Double = null,
    textSize: Int | Double = null,
    timeUnit: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS = null,
    valueFormatter: ValueFormatter = null,
    valueFormatterPattern: String = null,
    yOffset: Int | Double = null
  ): xAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidFirstLastClipping)) __obj.updateDynamic("avoidFirstLastClipping")(avoidFirstLastClipping.asInstanceOf[js.Any])
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
    if (labelRotationAngle != null) __obj.updateDynamic("labelRotationAngle")(labelRotationAngle.asInstanceOf[js.Any])
    if (limitLines != null) __obj.updateDynamic("limitLines")(limitLines.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueFormatterPattern != null) __obj.updateDynamic("valueFormatterPattern")(valueFormatterPattern.asInstanceOf[js.Any])
    if (yOffset != null) __obj.updateDynamic("yOffset")(yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[xAxis]
  }
}

