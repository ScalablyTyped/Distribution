package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import typings.reactDashNativeDashChartsDashWrapper.Anon_Enabled
import typings.reactDashNativeDashChartsDashWrapper.Anon_LEFTBOTTOM
import typings.reactDashNativeDashChartsDashWrapper.Anon_LineLength
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.DAYS
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.HOURS
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.INSIDE_CHART
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.MILLISECONDS
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.MINUTES
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.OUTSIDE_CHART
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.SECONDS
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
  var zeroLine: js.UndefOr[Anon_Enabled] = js.undefined
}

object yAxis {
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
    gridDashedLine: Anon_LineLength = null,
    gridLineWidth: Int | Double = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    labelCount: Int | Double = null,
    labelCountForce: js.UndefOr[Boolean] = js.undefined,
    limitLines: js.Array[Anon_LEFTBOTTOM] = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    position: OUTSIDE_CHART | INSIDE_CHART = null,
    since: Int | Double = null,
    spaceBottom: Int | Double = null,
    spaceTop: Int | Double = null,
    textColor: Int | Double = null,
    textSize: Int | Double = null,
    timeUnit: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS = null,
    valueFormatter: ValueFormatter = null,
    valueFormatterPattern: String = null,
    zeroLine: Anon_Enabled = null
  ): yAxis = {
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
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (labelCount != null) __obj.updateDynamic("labelCount")(labelCount.asInstanceOf[js.Any])
    if (!js.isUndefined(labelCountForce)) __obj.updateDynamic("labelCountForce")(labelCountForce.asInstanceOf[js.Any])
    if (limitLines != null) __obj.updateDynamic("limitLines")(limitLines.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (spaceBottom != null) __obj.updateDynamic("spaceBottom")(spaceBottom.asInstanceOf[js.Any])
    if (spaceTop != null) __obj.updateDynamic("spaceTop")(spaceTop.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueFormatterPattern != null) __obj.updateDynamic("valueFormatterPattern")(valueFormatterPattern.asInstanceOf[js.Any])
    if (zeroLine != null) __obj.updateDynamic("zeroLine")(zeroLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[yAxis]
  }
}

