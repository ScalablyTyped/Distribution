package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[scala.Boolean] = js.undefined
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[reactDashEasyDashChartLib.Anon_X] = js.undefined
  /** The width of an individual bar in pixels */
  var barWidth: js.UndefOr[scala.Double] = js.undefined
  var clickHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ reactLib.MouseEvent, _]] = js.undefined
  /** Whether to automatically color the bars */
  var colorBars: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.Array[BarData]
  /** A d3 time formatting pattern to be applied to format the x axis values */
  var datePattern: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[scala.Boolean] = js.undefined
  /** Height of the chart in pixels */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Interpolation method if you add a line to this chart (via lineData) */
  var interpolate: js.UndefOr[java.lang.String] = js.undefined
  var lineData: js.UndefOr[js.Array[LineData]] = js.undefined
  /** css margins */
  var margin: js.UndefOr[reactDashEasyDashChartLib.Anon_Bottom] = js.undefined
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ reactLib.MouseEvent, _]] = js.undefined
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ reactLib.MouseEvent, _]] = js.undefined
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ reactLib.MouseEvent, _]] = js.undefined
  /** The d3 time format to be used for the x axis (when xType is 'time') */
  var tickTimeDisplayFormat: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the chart in pixels */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[java.lang.String]] = js.undefined
  /** The amount of ticks to be shown on the x axis */
  var xTickNumber: js.UndefOr[scala.Double] = js.undefined
  /** What data type the x axis is */
  var xType: js.UndefOr[
    reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear
  ] = js.undefined
  /** What data type the second y axis is */
  var y2Type: js.UndefOr[
    reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear
  ] = js.undefined
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[scala.Boolean] = js.undefined
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** The amount of ticks to be shown on the y axis */
  var yTickNumber: js.UndefOr[scala.Double] = js.undefined
}

object BarChartProps {
  @scala.inline
  def apply(
    data: js.Array[BarData],
    axes: js.UndefOr[scala.Boolean] = js.undefined,
    axisLabels: reactDashEasyDashChartLib.Anon_X = null,
    barWidth: scala.Int | scala.Double = null,
    clickHandler: js.Function2[/* data */ BarData, /* mouseEvent */ reactLib.MouseEvent, _] = null,
    colorBars: js.UndefOr[scala.Boolean] = js.undefined,
    datePattern: java.lang.String = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    interpolate: java.lang.String = null,
    lineData: js.Array[LineData] = null,
    margin: reactDashEasyDashChartLib.Anon_Bottom = null,
    mouseMoveHandler: js.Function2[/* data */ BarData, /* mouseEvent */ reactLib.MouseEvent, _] = null,
    mouseOutHandler: js.Function2[/* data */ BarData, /* mouseEvent */ reactLib.MouseEvent, _] = null,
    mouseOverHandler: js.Function2[/* data */ BarData, /* mouseEvent */ reactLib.MouseEvent, _] = null,
    tickTimeDisplayFormat: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xDomainRange: js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[java.lang.String] = null,
    xTickNumber: scala.Int | scala.Double = null,
    xType: reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear = null,
    y2Type: reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear = null,
    yAxisOrientRight: js.UndefOr[scala.Boolean] = js.undefined,
    yDomainRange: js.Array[scala.Double] = null,
    yTickNumber: scala.Int | scala.Double = null
  ): BarChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes)
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels)
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(clickHandler)
    if (!js.isUndefined(colorBars)) __obj.updateDynamic("colorBars")(colorBars)
    if (datePattern != null) __obj.updateDynamic("datePattern")(datePattern)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (lineData != null) __obj.updateDynamic("lineData")(lineData)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(mouseMoveHandler)
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(mouseOutHandler)
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(mouseOverHandler)
    if (tickTimeDisplayFormat != null) __obj.updateDynamic("tickTimeDisplayFormat")(tickTimeDisplayFormat)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xTickNumber != null) __obj.updateDynamic("xTickNumber")(xTickNumber.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (y2Type != null) __obj.updateDynamic("y2Type")(y2Type.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight)
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange)
    if (yTickNumber != null) __obj.updateDynamic("yTickNumber")(yTickNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps]
  }
}

