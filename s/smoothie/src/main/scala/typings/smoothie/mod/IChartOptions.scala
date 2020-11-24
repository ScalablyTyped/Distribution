package typings.smoothie.mod

import typings.smoothie.anon.Index
import typings.smoothie.anon.LineWidth
import typings.smoothie.smoothieStrings.bezier
import typings.smoothie.smoothieStrings.linear
import typings.smoothie.smoothieStrings.step
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartOptions extends js.Object {
  
  /**
    * Displays not the latest data, but data from the given percentile.
    * Useful when trying to see old data saved by setting a high value for maxDataSetLength.
    * Should be a value between 0 and 1.
    */
  var displayDataFromPercentile: js.UndefOr[Double] = js.native
  
  /** Whether to render at different DPI depending upon the device. Enabled by default. */
  var enableDpiScaling: js.UndefOr[Boolean] = js.native
  
  var grid: js.UndefOr[IGridOptions] = js.native
  
  var horizontalLines: js.UndefOr[js.Array[IHorizontalLine]] = js.native
  
  /** Controls how lines are drawn between data points. Defaults to "bezier". */
  var interpolation: js.UndefOr[linear | step | bezier] = js.native
  
  var labels: js.UndefOr[ILabelOptions] = js.native
  
  /** The maximum frame rate the chart will render at, in FPS. Default is <code>0</code>, meaning no limit. */
  var limitFPS: js.UndefOr[Double] = js.native
  
  var maxDataSetLength: js.UndefOr[Double] = js.native
  
  /** Specify to clamp the upper y-axis to a given value. */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** Allows proportional padding to be added below the chart. For 10% padding, specify 1.1. */
  var maxValueScale: js.UndefOr[Double] = js.native
  
  /** Sets the speed at which the chart pans by. */
  var millisPerPixel: js.UndefOr[Double] = js.native
  
  /** Specify to clamp the lower y-axis to a given value. */
  var minValue: js.UndefOr[Double] = js.native
  
  /** Allows proportional padding to be added above the chart. For 10% padding, specify 1.1. */
  var minValueScale: js.UndefOr[Double] = js.native
  
  /** Whether to use time of latest data as current time. */
  var nonRealtimeData: js.UndefOr[Boolean] = js.native
  
  /** Allows the chart to stretch according to its containers and layout settings. Default is <code>false</code>, for backwards compatibility. */
  var responsive: js.UndefOr[Boolean] = js.native
  
  /** Controls the rate at which y-value zoom animation occurs. */
  var scaleSmoothing: js.UndefOr[Double] = js.native
  
  /** Optional function to format time stamps for bottom of chart. You may use <code>SmoothieChart.timeFormatter</code>, or your own/ */
  var timestampFormatter: js.UndefOr[js.Function1[/* date */ Date, String]] = js.native
  
  var tooltip: js.UndefOr[Boolean] = js.native
  
  var tooltipFormatter: js.UndefOr[js.Function2[/* timestamp */ Double, /* data */ js.Array[Index], String]] = js.native
  
  var tooltipLine: js.UndefOr[LineWidth] = js.native
  
  /** Callback function that formats the intermediate y value labels */
  var yIntermediateFormatter: js.UndefOr[js.Function2[/* intermediate */ Double, /* precision */ Double, String]] = js.native
  
  /** Callback function that formats the max y value label */
  var yMaxFormatter: js.UndefOr[js.Function2[/* max */ Double, /* precision */ Double, String]] = js.native
  
  /** Callback function that formats the min y value label */
  var yMinFormatter: js.UndefOr[js.Function2[/* min */ Double, /* precision */ Double, String]] = js.native
  
  var yRangeFunction: js.UndefOr[js.Function1[/* range */ IRange, IRange]] = js.native
}
object IChartOptions {
  
  @scala.inline
  def apply(): IChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartOptions]
  }
  
  @scala.inline
  implicit class IChartOptionsOps[Self <: IChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayDataFromPercentile(value: Double): Self = this.set("displayDataFromPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayDataFromPercentile: Self = this.set("displayDataFromPercentile", js.undefined)
    
    @scala.inline
    def setEnableDpiScaling(value: Boolean): Self = this.set("enableDpiScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDpiScaling: Self = this.set("enableDpiScaling", js.undefined)
    
    @scala.inline
    def setGrid(value: IGridOptions): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setHorizontalLinesVarargs(value: IHorizontalLine*): Self = this.set("horizontalLines", js.Array(value :_*))
    
    @scala.inline
    def setHorizontalLines(value: js.Array[IHorizontalLine]): Self = this.set("horizontalLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalLines: Self = this.set("horizontalLines", js.undefined)
    
    @scala.inline
    def setInterpolation(value: linear | step | bezier): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setLabels(value: ILabelOptions): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLimitFPS(value: Double): Self = this.set("limitFPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitFPS: Self = this.set("limitFPS", js.undefined)
    
    @scala.inline
    def setMaxDataSetLength(value: Double): Self = this.set("maxDataSetLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDataSetLength: Self = this.set("maxDataSetLength", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMaxValueScale(value: Double): Self = this.set("maxValueScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValueScale: Self = this.set("maxValueScale", js.undefined)
    
    @scala.inline
    def setMillisPerPixel(value: Double): Self = this.set("millisPerPixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisPerPixel: Self = this.set("millisPerPixel", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setMinValueScale(value: Double): Self = this.set("minValueScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValueScale: Self = this.set("minValueScale", js.undefined)
    
    @scala.inline
    def setNonRealtimeData(value: Boolean): Self = this.set("nonRealtimeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonRealtimeData: Self = this.set("nonRealtimeData", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setScaleSmoothing(value: Double): Self = this.set("scaleSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleSmoothing: Self = this.set("scaleSmoothing", js.undefined)
    
    @scala.inline
    def setTimestampFormatter(value: /* date */ Date => String): Self = this.set("timestampFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTimestampFormatter: Self = this.set("timestampFormatter", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipFormatter(value: (/* timestamp */ Double, /* data */ js.Array[Index]) => String): Self = this.set("tooltipFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipFormatter: Self = this.set("tooltipFormatter", js.undefined)
    
    @scala.inline
    def setTooltipLine(value: LineWidth): Self = this.set("tooltipLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipLine: Self = this.set("tooltipLine", js.undefined)
    
    @scala.inline
    def setYIntermediateFormatter(value: (/* intermediate */ Double, /* precision */ Double) => String): Self = this.set("yIntermediateFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteYIntermediateFormatter: Self = this.set("yIntermediateFormatter", js.undefined)
    
    @scala.inline
    def setYMaxFormatter(value: (/* max */ Double, /* precision */ Double) => String): Self = this.set("yMaxFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteYMaxFormatter: Self = this.set("yMaxFormatter", js.undefined)
    
    @scala.inline
    def setYMinFormatter(value: (/* min */ Double, /* precision */ Double) => String): Self = this.set("yMinFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteYMinFormatter: Self = this.set("yMinFormatter", js.undefined)
    
    @scala.inline
    def setYRangeFunction(value: /* range */ IRange => IRange): Self = this.set("yRangeFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteYRangeFunction: Self = this.set("yRangeFunction", js.undefined)
  }
}
