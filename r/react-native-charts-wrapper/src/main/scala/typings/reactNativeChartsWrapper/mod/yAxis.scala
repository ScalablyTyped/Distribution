package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Enabled
import typings.reactNativeChartsWrapper.anon.Label
import typings.reactNativeChartsWrapper.anon.LineLength
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DAYS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HOURS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.INSIDE_CHART
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MILLISECONDS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MINUTES
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.OUTSIDE_CHART
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SECONDS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait yAxis extends Axis {
  var inverted: js.UndefOr[Boolean] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[OUTSIDE_CHART | INSIDE_CHART] = js.undefined
  var spaceBottom: js.UndefOr[Double] = js.undefined
  var spaceTop: js.UndefOr[Double] = js.undefined
  var zeroLine: js.UndefOr[Enabled] = js.undefined
}

object yAxis {
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
    inverted: js.UndefOr[Boolean] = js.undefined,
    labelCount: js.UndefOr[Double] = js.undefined,
    labelCountForce: js.UndefOr[Boolean] = js.undefined,
    limitLines: js.Array[Label] = null,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    position: OUTSIDE_CHART | INSIDE_CHART = null,
    since: js.UndefOr[Double] = js.undefined,
    spaceBottom: js.UndefOr[Double] = js.undefined,
    spaceTop: js.UndefOr[Double] = js.undefined,
    textColor: js.UndefOr[Color] = js.undefined,
    textSize: js.UndefOr[Double] = js.undefined,
    timeUnit: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS = null,
    valueFormatter: ValueFormatter = null,
    valueFormatterPattern: String = null,
    zeroLine: Enabled = null
  ): yAxis = {
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
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelCount)) __obj.updateDynamic("labelCount")(labelCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelCountForce)) __obj.updateDynamic("labelCountForce")(labelCountForce.get.asInstanceOf[js.Any])
    if (limitLines != null) __obj.updateDynamic("limitLines")(limitLines.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(since)) __obj.updateDynamic("since")(since.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBottom)) __obj.updateDynamic("spaceBottom")(spaceBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceTop)) __obj.updateDynamic("spaceTop")(spaceTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textColor)) __obj.updateDynamic("textColor")(textColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textSize)) __obj.updateDynamic("textSize")(textSize.get.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueFormatterPattern != null) __obj.updateDynamic("valueFormatterPattern")(valueFormatterPattern.asInstanceOf[js.Any])
    if (zeroLine != null) __obj.updateDynamic("zeroLine")(zeroLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[yAxis]
  }
}

