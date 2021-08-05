package typings.smoothie

import typings.smoothie.anon.Index
import typings.smoothie.anon.LineWidth
import typings.smoothie.smoothieStrings.bezier
import typings.smoothie.smoothieStrings.linear
import typings.smoothie.smoothieStrings.step
import typings.std.Date
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smoothie", "SmoothieChart")
  @js.native
  class SmoothieChart () extends StObject {
    def this(chartOptions: IChartOptions) = this()
    
    /**
      * Adds a <code>TimeSeries</code> to this chart, with optional presentation options.
      */
    def addTimeSeries(series: TimeSeries): Unit = js.native
    def addTimeSeries(series: TimeSeries, seriesOptions: ITimeSeriesPresentationOptions): Unit = js.native
    
    /**
      * Brings the specified <code>TimeSeries</code> to the top of the chart. It will be rendered last.
      */
    def bringToFront(timeSeries: TimeSeries): Unit = js.native
    
    /**
      * Gets render options for the specified <code>TimeSeries</code>.
      *
      * As you may use a single <code>TimeSeries</code> in multiple charts with different formatting in each usage,
      * these settings are stored in the chart.
      */
    def getTimeSeriesOptions(timeSeries: TimeSeries): ITimeSeriesPresentationOptions = js.native
    
    /**
      * Change or inspect presentation options.
      */
    var options: IChartOptions = js.native
    
    /**
      * Removes the specified <code>TimeSeries</code> from the chart.
      */
    def removeTimeSeries(series: TimeSeries): Unit = js.native
    
    def render(): Unit = js.native
    def render(canvas: Unit, time: Double): Unit = js.native
    def render(canvas: HTMLCanvasElement): Unit = js.native
    def render(canvas: HTMLCanvasElement, time: Double): Unit = js.native
    
    /**
      * Starts the animation of this chart. Called by <code>streamTo</code>.
      */
    def start(): Unit = js.native
    
    /**
      * Stops the animation of this chart.
      */
    def stop(): Unit = js.native
    
    /**
      * Instructs the <code>SmoothieChart</code> to start rendering to the provided canvas, with specified delay.
      *
      * @param canvas the target canvas element
      * @param delayMillis an amount of time to wait before a data point is shown. This can prevent the end of the series
      * from appearing on screen, with new values flashing into view, at the expense of some latency.
      */
    def streamTo(canvas: HTMLCanvasElement): Unit = js.native
    def streamTo(canvas: HTMLCanvasElement, delayMillis: Double): Unit = js.native
    
    def updateValueRange(): Unit = js.native
  }
  /* static members */
  object SmoothieChart {
    
    @JSImport("smoothie", "SmoothieChart")
    @js.native
    val ^ : js.Any = js.native
    
    inline def timeFormatter(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatter")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("smoothie", "TimeSeries")
  @js.native
  /**
    * Initialises a new <code>TimeSeries</code> with optional data options.
    *
    * Options are of the form (defaults shown):
    *
    * <pre>
    * {
    *   resetBounds: true,        // enables/disables automatic scaling of the y-axis
    *   resetBoundsInterval: 3000 // the period between scaling calculations, in millis
    * }
    * </pre>
    *
    * Presentation options for TimeSeries are specified as an argument to <code>SmoothieChart.addTimeSeries</code>.
    */
  class TimeSeries () extends StObject {
    def this(options: ITimeSeriesOptions) = this()
    
    /**
      * Adds a new data point to the <code>TimeSeries</code>, preserving chronological order.
      *
      * @param timestamp the position, in time, of this data point
      * @param value the value of this data point
      * @param sumRepeatedTimeStampValues if <code>timestamp</code> has an exact match in the series, this flag controls
      * whether it is replaced, or the values summed (defaults to false.)
      */
    def append(timestamp: Double, value: Double): Unit = js.native
    def append(timestamp: Double, value: Double, sumRepeatedTimeStampValues: Boolean): Unit = js.native
    
    /**
      * Clears all data and state from this TimeSeries object.
      */
    def clear(): Unit = js.native
    
    /**
      * Hide this <code>TimeSeries</code> object in the chart.
      */
    var disabled: Boolean = js.native
    
    def dropOldData(oldestValidTime: Double, maxDataSetLength: Double): Unit = js.native
    
    /**
      * Adjust or inspect the upper y-axis for this <code>TimeSeries</code> object.
      */
    var maxValue: Double = js.native
    
    /**
      * Adjust or inspect the lower y-axis for this <code>TimeSeries</code> object.
      */
    var minValue: Double = js.native
    
    /**
      * Recalculate the min/max values for this <code>TimeSeries</code> object.
      *
      * This causes the graph to scale itself in the y-axis.
      */
    def resetBounds(): Unit = js.native
  }
  
  trait IChartOptions extends StObject {
    
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
    
    inline def apply(): IChartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChartOptions]
    }
    
    extension [Self <: IChartOptions](x: Self) {
      
      inline def setDisplayDataFromPercentile(value: Double): Self = StObject.set(x, "displayDataFromPercentile", value.asInstanceOf[js.Any])
      
      inline def setDisplayDataFromPercentileUndefined: Self = StObject.set(x, "displayDataFromPercentile", js.undefined)
      
      inline def setEnableDpiScaling(value: Boolean): Self = StObject.set(x, "enableDpiScaling", value.asInstanceOf[js.Any])
      
      inline def setEnableDpiScalingUndefined: Self = StObject.set(x, "enableDpiScaling", js.undefined)
      
      inline def setGrid(value: IGridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHorizontalLines(value: js.Array[IHorizontalLine]): Self = StObject.set(x, "horizontalLines", value.asInstanceOf[js.Any])
      
      inline def setHorizontalLinesUndefined: Self = StObject.set(x, "horizontalLines", js.undefined)
      
      inline def setHorizontalLinesVarargs(value: IHorizontalLine*): Self = StObject.set(x, "horizontalLines", js.Array(value :_*))
      
      inline def setInterpolation(value: linear | step | bezier): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setLabels(value: ILabelOptions): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLimitFPS(value: Double): Self = StObject.set(x, "limitFPS", value.asInstanceOf[js.Any])
      
      inline def setLimitFPSUndefined: Self = StObject.set(x, "limitFPS", js.undefined)
      
      inline def setMaxDataSetLength(value: Double): Self = StObject.set(x, "maxDataSetLength", value.asInstanceOf[js.Any])
      
      inline def setMaxDataSetLengthUndefined: Self = StObject.set(x, "maxDataSetLength", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueScale(value: Double): Self = StObject.set(x, "maxValueScale", value.asInstanceOf[js.Any])
      
      inline def setMaxValueScaleUndefined: Self = StObject.set(x, "maxValueScale", js.undefined)
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMillisPerPixel(value: Double): Self = StObject.set(x, "millisPerPixel", value.asInstanceOf[js.Any])
      
      inline def setMillisPerPixelUndefined: Self = StObject.set(x, "millisPerPixel", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueScale(value: Double): Self = StObject.set(x, "minValueScale", value.asInstanceOf[js.Any])
      
      inline def setMinValueScaleUndefined: Self = StObject.set(x, "minValueScale", js.undefined)
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setNonRealtimeData(value: Boolean): Self = StObject.set(x, "nonRealtimeData", value.asInstanceOf[js.Any])
      
      inline def setNonRealtimeDataUndefined: Self = StObject.set(x, "nonRealtimeData", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setScaleSmoothing(value: Double): Self = StObject.set(x, "scaleSmoothing", value.asInstanceOf[js.Any])
      
      inline def setScaleSmoothingUndefined: Self = StObject.set(x, "scaleSmoothing", js.undefined)
      
      inline def setTimestampFormatter(value: /* date */ Date => String): Self = StObject.set(x, "timestampFormatter", js.Any.fromFunction1(value))
      
      inline def setTimestampFormatterUndefined: Self = StObject.set(x, "timestampFormatter", js.undefined)
      
      inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFormatter(value: (/* timestamp */ Double, /* data */ js.Array[Index]) => String): Self = StObject.set(x, "tooltipFormatter", js.Any.fromFunction2(value))
      
      inline def setTooltipFormatterUndefined: Self = StObject.set(x, "tooltipFormatter", js.undefined)
      
      inline def setTooltipLine(value: LineWidth): Self = StObject.set(x, "tooltipLine", value.asInstanceOf[js.Any])
      
      inline def setTooltipLineUndefined: Self = StObject.set(x, "tooltipLine", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setYIntermediateFormatter(value: (/* intermediate */ Double, /* precision */ Double) => String): Self = StObject.set(x, "yIntermediateFormatter", js.Any.fromFunction2(value))
      
      inline def setYIntermediateFormatterUndefined: Self = StObject.set(x, "yIntermediateFormatter", js.undefined)
      
      inline def setYMaxFormatter(value: (/* max */ Double, /* precision */ Double) => String): Self = StObject.set(x, "yMaxFormatter", js.Any.fromFunction2(value))
      
      inline def setYMaxFormatterUndefined: Self = StObject.set(x, "yMaxFormatter", js.undefined)
      
      inline def setYMinFormatter(value: (/* min */ Double, /* precision */ Double) => String): Self = StObject.set(x, "yMinFormatter", js.Any.fromFunction2(value))
      
      inline def setYMinFormatterUndefined: Self = StObject.set(x, "yMinFormatter", js.undefined)
      
      inline def setYRangeFunction(value: /* range */ IRange => IRange): Self = StObject.set(x, "yRangeFunction", js.Any.fromFunction1(value))
      
      inline def setYRangeFunctionUndefined: Self = StObject.set(x, "yRangeFunction", js.undefined)
    }
  }
  
  trait IGridOptions extends StObject {
    
    /** Whether the grid lines trace the border of the chart or not. */
    var borderVisible: js.UndefOr[Boolean] = js.undefined
    
    /** The background colour of the chart. */
    var fillStyle: js.UndefOr[String] = js.undefined
    
    /** The pixel width of grid lines. */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /** Distance between vertical grid lines. */
    var millisPerLine: js.UndefOr[Double] = js.undefined
    
    /** Controls whether grid lines are 1px sharp, or softened. */
    var sharpLines: js.UndefOr[Boolean] = js.undefined
    
    /** Colour of grid lines. */
    var strokeStyle: js.UndefOr[String] = js.undefined
    
    /** Number of vertical sections marked out by horizontal grid lines. */
    var verticalSections: js.UndefOr[Double] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGridOptions]
    }
    
    extension [Self <: IGridOptions](x: Self) {
      
      inline def setBorderVisible(value: Boolean): Self = StObject.set(x, "borderVisible", value.asInstanceOf[js.Any])
      
      inline def setBorderVisibleUndefined: Self = StObject.set(x, "borderVisible", js.undefined)
      
      inline def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
      
      inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setMillisPerLine(value: Double): Self = StObject.set(x, "millisPerLine", value.asInstanceOf[js.Any])
      
      inline def setMillisPerLineUndefined: Self = StObject.set(x, "millisPerLine", js.undefined)
      
      inline def setSharpLines(value: Boolean): Self = StObject.set(x, "sharpLines", value.asInstanceOf[js.Any])
      
      inline def setSharpLinesUndefined: Self = StObject.set(x, "sharpLines", js.undefined)
      
      inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setVerticalSections(value: Double): Self = StObject.set(x, "verticalSections", value.asInstanceOf[js.Any])
      
      inline def setVerticalSectionsUndefined: Self = StObject.set(x, "verticalSections", js.undefined)
    }
  }
  
  trait IHorizontalLine extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object IHorizontalLine {
    
    inline def apply(): IHorizontalLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHorizontalLine]
    }
    
    extension [Self <: IHorizontalLine](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ILabelOptions extends StObject {
    
    /** Enables/disables labels showing the min/max values. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Colour for text of labels. */
    var fillStyle: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var intermediateLabelSameAxis: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    /** Shows intermediate labels between min and max values along y axis. */
    var showIntermediateLabels: js.UndefOr[Boolean] = js.undefined
  }
  object ILabelOptions {
    
    inline def apply(): ILabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabelOptions]
    }
    
    extension [Self <: ILabelOptions](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
      
      inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setIntermediateLabelSameAxis(value: Boolean): Self = StObject.set(x, "intermediateLabelSameAxis", value.asInstanceOf[js.Any])
      
      inline def setIntermediateLabelSameAxisUndefined: Self = StObject.set(x, "intermediateLabelSameAxis", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setShowIntermediateLabels(value: Boolean): Self = StObject.set(x, "showIntermediateLabels", value.asInstanceOf[js.Any])
      
      inline def setShowIntermediateLabelsUndefined: Self = StObject.set(x, "showIntermediateLabels", js.undefined)
    }
  }
  
  trait IRange extends StObject {
    
    var max: Double
    
    var min: Double
  }
  object IRange {
    
    inline def apply(max: Double, min: Double): IRange = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRange]
    }
    
    extension [Self <: IRange](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimeSeriesOptions extends StObject {
    
    var resetBounds: js.UndefOr[Boolean] = js.undefined
    
    var resetBoundsInterval: js.UndefOr[Double] = js.undefined
  }
  object ITimeSeriesOptions {
    
    inline def apply(): ITimeSeriesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimeSeriesOptions]
    }
    
    extension [Self <: ITimeSeriesOptions](x: Self) {
      
      inline def setResetBounds(value: Boolean): Self = StObject.set(x, "resetBounds", value.asInstanceOf[js.Any])
      
      inline def setResetBoundsInterval(value: Double): Self = StObject.set(x, "resetBoundsInterval", value.asInstanceOf[js.Any])
      
      inline def setResetBoundsIntervalUndefined: Self = StObject.set(x, "resetBoundsInterval", js.undefined)
      
      inline def setResetBoundsUndefined: Self = StObject.set(x, "resetBounds", js.undefined)
    }
  }
  
  trait ITimeSeriesPresentationOptions extends StObject {
    
    var fillStyle: js.UndefOr[String] = js.undefined
    
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    var strokeStyle: js.UndefOr[String] = js.undefined
  }
  object ITimeSeriesPresentationOptions {
    
    inline def apply(): ITimeSeriesPresentationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimeSeriesPresentationOptions]
    }
    
    extension [Self <: ITimeSeriesPresentationOptions](x: Self) {
      
      inline def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
      
      inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    }
  }
}
