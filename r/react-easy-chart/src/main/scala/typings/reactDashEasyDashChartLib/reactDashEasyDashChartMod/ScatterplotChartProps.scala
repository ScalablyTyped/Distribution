package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScatterplotChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[scala.Boolean] = js.undefined
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[reactDashEasyDashChartLib.Anon_Y] = js.undefined
  var clickHandler: js.UndefOr[
    js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _]
  ] = js.undefined
  /** Allows styling of individual types of points */
  var config: js.UndefOr[js.Array[reactDashEasyDashChartLib.Anon_Stroke]] = js.undefined
  var data: js.Array[ScatterplotData]
  /** Radius of the dots on the chart */
  var dotRadius: js.UndefOr[scala.Double] = js.undefined
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[scala.Boolean] = js.undefined
  /** Height of the chart in pixels */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** css margins */
  var margin: js.UndefOr[reactDashEasyDashChartLib.Anon_Bottom] = js.undefined
  var mouseMoveHandler: js.UndefOr[
    js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _]
  ] = js.undefined
  var mouseOutHandler: js.UndefOr[
    js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _]
  ] = js.undefined
  var mouseOverHandler: js.UndefOr[
    js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _]
  ] = js.undefined
  /** Whether to show vertical grid lines on the chart */
  var verticalGrid: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the chart in pixels */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[java.lang.String]] = js.undefined
  /** What data type the x axis is */
  var xType: js.UndefOr[
    reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear
  ] = js.undefined
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[scala.Boolean] = js.undefined
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[java.lang.String]] = js.undefined
  /** What data type the x axis is */
  var yType: js.UndefOr[
    reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear
  ] = js.undefined
}

