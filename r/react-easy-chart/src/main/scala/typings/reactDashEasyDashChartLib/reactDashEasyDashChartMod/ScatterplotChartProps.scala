package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterplotChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[scala.Boolean] = js.undefined
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[reactDashEasyDashChartLib.Anon_XY] = js.undefined
  var clickHandler: js.UndefOr[
    js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _]
  ] = js.undefined
  /** Allows styling of individual types of points */
  var config: js.UndefOr[js.Array[reactDashEasyDashChartLib.Anon_ColorStroke]] = js.undefined
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

object ScatterplotChartProps {
  @scala.inline
  def apply(
    data: js.Array[ScatterplotData],
    axes: js.UndefOr[scala.Boolean] = js.undefined,
    axisLabels: reactDashEasyDashChartLib.Anon_XY = null,
    clickHandler: js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _] = null,
    config: js.Array[reactDashEasyDashChartLib.Anon_ColorStroke] = null,
    dotRadius: scala.Int | scala.Double = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    margin: reactDashEasyDashChartLib.Anon_Bottom = null,
    mouseMoveHandler: js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _] = null,
    mouseOutHandler: js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _] = null,
    mouseOverHandler: js.Function2[/* data */ ScatterplotData, /* mouseEvent */ reactLib.MouseEvent, _] = null,
    verticalGrid: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    xDomainRange: js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[java.lang.String] = null,
    xType: reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear = null,
    yAxisOrientRight: js.UndefOr[scala.Boolean] = js.undefined,
    yDomainRange: js.Array[scala.Double] | js.Array[stdLib.Date] | js.Array[java.lang.String] = null,
    yType: reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.time | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.text | reactDashEasyDashChartLib.reactDashEasyDashChartLibStrings.linear = null
  ): ScatterplotChartProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes)
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels)
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(clickHandler)
    if (config != null) __obj.updateDynamic("config")(config)
    if (dotRadius != null) __obj.updateDynamic("dotRadius")(dotRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(mouseMoveHandler)
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(mouseOutHandler)
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(mouseOverHandler)
    if (!js.isUndefined(verticalGrid)) __obj.updateDynamic("verticalGrid")(verticalGrid)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight)
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (yType != null) __obj.updateDynamic("yType")(yType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterplotChartProps]
  }
}

