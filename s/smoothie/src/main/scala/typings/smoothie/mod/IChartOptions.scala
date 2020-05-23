package typings.smoothie.mod

import typings.smoothie.anon.Index
import typings.smoothie.anon.LineWidth
import typings.smoothie.smoothieStrings.bezier
import typings.smoothie.smoothieStrings.linear
import typings.smoothie.smoothieStrings.step
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartOptions extends js.Object {
  /**
    * Displays not the latest data, but data from the given percentile.
    * Useful when trying to see old data saved by setting a high value for maxDataSetLength.
    * Should be a value between 0 and 1.
    */
  var displayDataFromPercentile: js.UndefOr[Double] = js.undefined
  /** Whether to render at different DPI depending upon the device. Enabled by default. */
  var enableDpiScaling: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[IGridOptions] = js.undefined
  var horizontalLines: js.UndefOr[js.Array[IHorizontalLine]] = js.undefined
  /** Controls how lines are drawn between data points. Defaults to "bezier". */
  var interpolation: js.UndefOr[linear | step | bezier] = js.undefined
  var labels: js.UndefOr[ILabelOptions] = js.undefined
  /** The maximum frame rate the chart will render at, in FPS. Default is <code>0</code>, meaning no limit. */
  var limitFPS: js.UndefOr[Double] = js.undefined
  var maxDataSetLength: js.UndefOr[Double] = js.undefined
  /** Specify to clamp the upper y-axis to a given value. */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Allows proportional padding to be added below the chart. For 10% padding, specify 1.1. */
  var maxValueScale: js.UndefOr[Double] = js.undefined
  /** Sets the speed at which the chart pans by. */
  var millisPerPixel: js.UndefOr[Double] = js.undefined
  /** Specify to clamp the lower y-axis to a given value. */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Allows proportional padding to be added above the chart. For 10% padding, specify 1.1. */
  var minValueScale: js.UndefOr[Double] = js.undefined
  /** Whether to use time of latest data as current time. */
  var nonRealtimeData: js.UndefOr[Boolean] = js.undefined
  /** Allows the chart to stretch according to its containers and layout settings. Default is <code>false</code>, for backwards compatibility. */
  var responsive: js.UndefOr[Boolean] = js.undefined
  /** Controls the rate at which y-value zoom animation occurs. */
  var scaleSmoothing: js.UndefOr[Double] = js.undefined
  /** Optional function to format time stamps for bottom of chart. You may use <code>SmoothieChart.timeFormatter</code>, or your own/ */
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ Date, String]] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
  var tooltipFormatter: js.UndefOr[js.Function2[/* timestamp */ Double, /* data */ js.Array[Index], String]] = js.undefined
  var tooltipLine: js.UndefOr[LineWidth] = js.undefined
  /** Callback function that formats the intermediate y value labels */
  var yIntermediateFormatter: js.UndefOr[js.Function2[/* intermediate */ Double, /* precision */ Double, String]] = js.undefined
  /** Callback function that formats the max y value label */
  var yMaxFormatter: js.UndefOr[js.Function2[/* max */ Double, /* precision */ Double, String]] = js.undefined
  /** Callback function that formats the min y value label */
  var yMinFormatter: js.UndefOr[js.Function2[/* min */ Double, /* precision */ Double, String]] = js.undefined
  var yRangeFunction: js.UndefOr[js.Function1[/* range */ IRange, IRange]] = js.undefined
}

object IChartOptions {
  @scala.inline
  def apply(
    displayDataFromPercentile: js.UndefOr[Double] = js.undefined,
    enableDpiScaling: js.UndefOr[Boolean] = js.undefined,
    grid: IGridOptions = null,
    horizontalLines: js.Array[IHorizontalLine] = null,
    interpolation: linear | step | bezier = null,
    labels: ILabelOptions = null,
    limitFPS: js.UndefOr[Double] = js.undefined,
    maxDataSetLength: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    maxValueScale: js.UndefOr[Double] = js.undefined,
    millisPerPixel: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    minValueScale: js.UndefOr[Double] = js.undefined,
    nonRealtimeData: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    scaleSmoothing: js.UndefOr[Double] = js.undefined,
    timestampFormatter: /* date */ Date => String = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    tooltipFormatter: (/* timestamp */ Double, /* data */ js.Array[Index]) => String = null,
    tooltipLine: LineWidth = null,
    yIntermediateFormatter: (/* intermediate */ Double, /* precision */ Double) => String = null,
    yMaxFormatter: (/* max */ Double, /* precision */ Double) => String = null,
    yMinFormatter: (/* min */ Double, /* precision */ Double) => String = null,
    yRangeFunction: /* range */ IRange => IRange = null
  ): IChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayDataFromPercentile)) __obj.updateDynamic("displayDataFromPercentile")(displayDataFromPercentile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDpiScaling)) __obj.updateDynamic("enableDpiScaling")(enableDpiScaling.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (horizontalLines != null) __obj.updateDynamic("horizontalLines")(horizontalLines.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(limitFPS)) __obj.updateDynamic("limitFPS")(limitFPS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDataSetLength)) __obj.updateDynamic("maxDataSetLength")(maxDataSetLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValueScale)) __obj.updateDynamic("maxValueScale")(maxValueScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(millisPerPixel)) __obj.updateDynamic("millisPerPixel")(millisPerPixel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValueScale)) __obj.updateDynamic("minValueScale")(minValueScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonRealtimeData)) __obj.updateDynamic("nonRealtimeData")(nonRealtimeData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleSmoothing)) __obj.updateDynamic("scaleSmoothing")(scaleSmoothing.get.asInstanceOf[js.Any])
    if (timestampFormatter != null) __obj.updateDynamic("timestampFormatter")(js.Any.fromFunction1(timestampFormatter))
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.get.asInstanceOf[js.Any])
    if (tooltipFormatter != null) __obj.updateDynamic("tooltipFormatter")(js.Any.fromFunction2(tooltipFormatter))
    if (tooltipLine != null) __obj.updateDynamic("tooltipLine")(tooltipLine.asInstanceOf[js.Any])
    if (yIntermediateFormatter != null) __obj.updateDynamic("yIntermediateFormatter")(js.Any.fromFunction2(yIntermediateFormatter))
    if (yMaxFormatter != null) __obj.updateDynamic("yMaxFormatter")(js.Any.fromFunction2(yMaxFormatter))
    if (yMinFormatter != null) __obj.updateDynamic("yMinFormatter")(js.Any.fromFunction2(yMinFormatter))
    if (yRangeFunction != null) __obj.updateDynamic("yRangeFunction")(js.Any.fromFunction1(yRangeFunction))
    __obj.asInstanceOf[IChartOptions]
  }
}

