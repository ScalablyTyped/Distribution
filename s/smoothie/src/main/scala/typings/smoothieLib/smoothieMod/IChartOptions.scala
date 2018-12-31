package typings
package smoothieLib.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartOptions extends js.Object {
  /**
    * Displays not the latest data, but data from the given percentile.
    * Useful when trying to see old data saved by setting a high value for maxDataSetLength.
    * Should be a value between 0 and 1.
    */
  var displayDataFromPercentile: js.UndefOr[scala.Double] = js.undefined
  /** Whether to render at different DPI depending upon the device. Enabled by default. */
  var enableDpiScaling: js.UndefOr[scala.Boolean] = js.undefined
  var grid: js.UndefOr[IGridOptions] = js.undefined
  var horizontalLines: js.UndefOr[js.Array[IHorizontalLine]] = js.undefined
  /** Controls how lines are drawn between data points. Defaults to "bezier". */
  var interpolation: js.UndefOr[
    smoothieLib.smoothieLibStrings.linear | smoothieLib.smoothieLibStrings.step | smoothieLib.smoothieLibStrings.bezier
  ] = js.undefined
  var labels: js.UndefOr[ILabelOptions] = js.undefined
  /** The maximum frame rate the chart will render at, in FPS. Default is <code>0</code>, meaning no limit. */
  var limitFPS: js.UndefOr[scala.Double] = js.undefined
  var maxDataSetLength: js.UndefOr[scala.Double] = js.undefined
  /** Specify to clamp the upper y-axis to a given value. */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** Allows proportional padding to be added below the chart. For 10% padding, specify 1.1. */
  var maxValueScale: js.UndefOr[scala.Double] = js.undefined
  /** Sets the speed at which the chart pans by. */
  var millisPerPixel: js.UndefOr[scala.Double] = js.undefined
  /** Specify to clamp the lower y-axis to a given value. */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** Allows proportional padding to be added above the chart. For 10% padding, specify 1.1. */
  var minValueScale: js.UndefOr[scala.Double] = js.undefined
  /** Whether to use time of latest data as current time. */
  var nonRealtimeData: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the chart to stretch according to its containers and layout settings. Default is <code>false</code>, for backwards compatibility. */
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls the rate at which y-value zoom animation occurs. */
  var scaleSmoothing: js.UndefOr[scala.Double] = js.undefined
  /** Optional function to format time stamps for bottom of chart. You may use <code>SmoothieChart.timeFormatter</code>, or your own/ */
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ stdLib.Date, java.lang.String]] = js.undefined
  var tooltip: js.UndefOr[scala.Boolean] = js.undefined
  var tooltipFormatter: js.UndefOr[
    js.Function2[
      /* timestamp */ scala.Double, 
      /* data */ js.Array[smoothieLib.Anon_Value], 
      java.lang.String
    ]
  ] = js.undefined
  var tooltipLine: js.UndefOr[smoothieLib.Anon_LineWidth] = js.undefined
  /** Callback function that formats the intermediate y value labels */
  var yIntermediateFormatter: js.UndefOr[
    js.Function2[/* intermediate */ scala.Double, /* precision */ scala.Double, java.lang.String]
  ] = js.undefined
  /** Callback function that formats the max y value label */
  var yMaxFormatter: js.UndefOr[
    js.Function2[/* max */ scala.Double, /* precision */ scala.Double, java.lang.String]
  ] = js.undefined
  /** Callback function that formats the min y value label */
  var yMinFormatter: js.UndefOr[
    js.Function2[/* min */ scala.Double, /* precision */ scala.Double, java.lang.String]
  ] = js.undefined
  var yRangeFunction: js.UndefOr[js.Function1[/* range */ IRange, IRange]] = js.undefined
}

