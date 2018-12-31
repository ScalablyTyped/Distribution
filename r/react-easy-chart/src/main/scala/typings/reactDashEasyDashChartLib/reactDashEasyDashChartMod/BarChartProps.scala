package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[scala.Boolean] = js.undefined
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[reactDashEasyDashChartLib.Anon_YX] = js.undefined
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

