package typings.reactDashEasyDashChart.reactDashEasyDashChartMod

import typings.reactDashEasyDashChart.Anon_Bottom
import typings.reactDashEasyDashChart.Anon_X
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.linear
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.text
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.time
import typings.std.Date
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[Boolean] = js.undefined
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[Anon_X] = js.undefined
  /** The width of an individual bar in pixels */
  var barWidth: js.UndefOr[Double] = js.undefined
  var clickHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  /** Whether to automatically color the bars */
  var colorBars: js.UndefOr[Boolean] = js.undefined
  var data: js.Array[BarData]
  /** A d3 time formatting pattern to be applied to format the x axis values */
  var datePattern: js.UndefOr[String] = js.undefined
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[Boolean] = js.undefined
  /** Height of the chart in pixels */
  var height: js.UndefOr[Double] = js.undefined
  /** Interpolation method if you add a line to this chart (via lineData) */
  var interpolate: js.UndefOr[String] = js.undefined
  var lineData: js.UndefOr[js.Array[LineData]] = js.undefined
  /** css margins */
  var margin: js.UndefOr[Anon_Bottom] = js.undefined
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  /** The d3 time format to be used for the x axis (when xType is 'time') */
  var tickTimeDisplayFormat: js.UndefOr[String] = js.undefined
  /** Width of the chart in pixels */
  var width: js.UndefOr[Double] = js.undefined
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[Date | Double | String]] = js.undefined
  /** The amount of ticks to be shown on the x axis */
  var xTickNumber: js.UndefOr[Double] = js.undefined
  /** What data type the x axis is */
  var xType: js.UndefOr[time | text | linear] = js.undefined
  /** What data type the second y axis is */
  var y2Type: js.UndefOr[time | text | linear] = js.undefined
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[Boolean] = js.undefined
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[Double]] = js.undefined
  /** The amount of ticks to be shown on the y axis */
  var yTickNumber: js.UndefOr[Double] = js.undefined
}

object BarChartProps {
  @scala.inline
  def apply(
    data: js.Array[BarData],
    axes: js.UndefOr[Boolean] = js.undefined,
    axisLabels: Anon_X = null,
    barWidth: Int | Double = null,
    clickHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _ = null,
    colorBars: js.UndefOr[Boolean] = js.undefined,
    datePattern: String = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    interpolate: String = null,
    lineData: js.Array[LineData] = null,
    margin: Anon_Bottom = null,
    mouseMoveHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _ = null,
    tickTimeDisplayFormat: String = null,
    width: Int | Double = null,
    xDomainRange: js.Array[Date | Double | String] = null,
    xTickNumber: Int | Double = null,
    xType: time | text | linear = null,
    y2Type: time | text | linear = null,
    yAxisOrientRight: js.UndefOr[Boolean] = js.undefined,
    yDomainRange: js.Array[Double] = null,
    yTickNumber: Int | Double = null
  ): BarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (!js.isUndefined(colorBars)) __obj.updateDynamic("colorBars")(colorBars.asInstanceOf[js.Any])
    if (datePattern != null) __obj.updateDynamic("datePattern")(datePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (lineData != null) __obj.updateDynamic("lineData")(lineData.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (tickTimeDisplayFormat != null) __obj.updateDynamic("tickTimeDisplayFormat")(tickTimeDisplayFormat.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xTickNumber != null) __obj.updateDynamic("xTickNumber")(xTickNumber.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (y2Type != null) __obj.updateDynamic("y2Type")(y2Type.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight.asInstanceOf[js.Any])
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (yTickNumber != null) __obj.updateDynamic("yTickNumber")(yTickNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps]
  }
}

