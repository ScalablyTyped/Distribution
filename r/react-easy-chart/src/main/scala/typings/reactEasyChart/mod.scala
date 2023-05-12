package typings.reactEasyChart

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactEasyChart.anon.Bottom
import typings.reactEasyChart.anon.Color
import typings.reactEasyChart.anon.ColorString
import typings.reactEasyChart.anon.Stroke
import typings.reactEasyChart.anon.X
import typings.reactEasyChart.anon.Y
import typings.reactEasyChart.reactEasyChartStrings.`basis-closed`
import typings.reactEasyChart.reactEasyChartStrings.`basis-open`
import typings.reactEasyChart.reactEasyChartStrings.`cardinal-closed`
import typings.reactEasyChart.reactEasyChartStrings.`cardinal-open`
import typings.reactEasyChart.reactEasyChartStrings.`linear-closed`
import typings.reactEasyChart.reactEasyChartStrings.`step-after`
import typings.reactEasyChart.reactEasyChartStrings.`step-before`
import typings.reactEasyChart.reactEasyChartStrings.basis
import typings.reactEasyChart.reactEasyChartStrings.bundle
import typings.reactEasyChart.reactEasyChartStrings.cardinal
import typings.reactEasyChart.reactEasyChartStrings.linear
import typings.reactEasyChart.reactEasyChartStrings.monotone
import typings.reactEasyChart.reactEasyChartStrings.step
import typings.reactEasyChart.reactEasyChartStrings.text
import typings.reactEasyChart.reactEasyChartStrings.time
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-easy-chart", "AreaChart")
  @js.native
  open class AreaChart protected ()
    extends Component[AreaChartProps, js.Object, Any] {
    def this(props: AreaChartProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: AreaChartProps, context: Any) = this()
  }
  
  @JSImport("react-easy-chart", "BarChart")
  @js.native
  open class BarChart protected ()
    extends Component[BarChartProps, js.Object, Any] {
    def this(props: BarChartProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: BarChartProps, context: Any) = this()
  }
  
  @JSImport("react-easy-chart", "Legend")
  @js.native
  open class Legend protected ()
    extends Component[LegendProps, js.Object, Any] {
    def this(props: LegendProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: LegendProps, context: Any) = this()
  }
  
  @JSImport("react-easy-chart", "LineChart")
  @js.native
  open class LineChart protected ()
    extends Component[LineChartProps, js.Object, Any] {
    def this(props: LineChartProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: LineChartProps, context: Any) = this()
  }
  
  @JSImport("react-easy-chart", "PieChart")
  @js.native
  open class PieChart protected ()
    extends Component[PieChartProps, js.Object, Any] {
    def this(props: PieChartProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: PieChartProps, context: Any) = this()
  }
  
  @JSImport("react-easy-chart", "ScatterplotChart")
  @js.native
  open class ScatterplotChart protected ()
    extends Component[ScatterplotChartProps, js.Object, Any] {
    def this(props: ScatterplotChartProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ScatterplotChartProps, context: Any) = this()
  }
  
  trait AreaChartProps
    extends StObject
       with LineChartProps {
    
    /** Make the gradient area a solid fill rather than a gradient */
    var noAreaGradient: js.UndefOr[Boolean] = js.undefined
  }
  object AreaChartProps {
    
    inline def apply(data: js.Array[js.Array[LineData]]): AreaChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AreaChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AreaChartProps] (val x: Self) extends AnyVal {
      
      inline def setNoAreaGradient(value: Boolean): Self = StObject.set(x, "noAreaGradient", value.asInstanceOf[js.Any])
      
      inline def setNoAreaGradientUndefined: Self = StObject.set(x, "noAreaGradient", js.undefined)
    }
  }
  
  trait BarChartProps extends StObject {
    
    /** Whether to show axis labels */
    var axes: js.UndefOr[Boolean] = js.undefined
    
    /** Labels for each of the axis */
    var axisLabels: js.UndefOr[X] = js.undefined
    
    /** The width of an individual bar in pixels */
    var barWidth: js.UndefOr[Double] = js.undefined
    
    var clickHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
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
    var margin: js.UndefOr[Bottom] = js.undefined
    
    var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var mouseOutHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var mouseOverHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    /** The d3 time format to be used for the x axis (when xType is 'time') */
    var tickTimeDisplayFormat: js.UndefOr[String] = js.undefined
    
    /** Width of the chart in pixels */
    var width: js.UndefOr[Double] = js.undefined
    
    /** The range that the x axis should show (otherwise automatically calculated) */
    var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
    
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
    
    inline def apply(data: js.Array[BarData]): BarChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarChartProps] (val x: Self) extends AnyVal {
      
      inline def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setAxisLabels(value: X): Self = StObject.set(x, "axisLabels", value.asInstanceOf[js.Any])
      
      inline def setAxisLabelsUndefined: Self = StObject.set(x, "axisLabels", js.undefined)
      
      inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      inline def setClickHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "clickHandler", js.Any.fromFunction2(value))
      
      inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      inline def setColorBars(value: Boolean): Self = StObject.set(x, "colorBars", value.asInstanceOf[js.Any])
      
      inline def setColorBarsUndefined: Self = StObject.set(x, "colorBars", js.undefined)
      
      inline def setData(value: js.Array[BarData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: BarData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDatePattern(value: String): Self = StObject.set(x, "datePattern", value.asInstanceOf[js.Any])
      
      inline def setDatePatternUndefined: Self = StObject.set(x, "datePattern", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInterpolate(value: String): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setLineData(value: js.Array[LineData]): Self = StObject.set(x, "lineData", value.asInstanceOf[js.Any])
      
      inline def setLineDataUndefined: Self = StObject.set(x, "lineData", js.undefined)
      
      inline def setLineDataVarargs(value: LineData*): Self = StObject.set(x, "lineData", js.Array(value*))
      
      inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMouseMoveHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseMoveHandler", js.Any.fromFunction2(value))
      
      inline def setMouseMoveHandlerUndefined: Self = StObject.set(x, "mouseMoveHandler", js.undefined)
      
      inline def setMouseOutHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction2(value))
      
      inline def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      inline def setMouseOverHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction2(value))
      
      inline def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      inline def setTickTimeDisplayFormat(value: String): Self = StObject.set(x, "tickTimeDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setTickTimeDisplayFormatUndefined: Self = StObject.set(x, "tickTimeDisplayFormat", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXDomainRange(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "xDomainRange", value.asInstanceOf[js.Any])
      
      inline def setXDomainRangeUndefined: Self = StObject.set(x, "xDomainRange", js.undefined)
      
      inline def setXDomainRangeVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "xDomainRange", js.Array(value*))
      
      inline def setXTickNumber(value: Double): Self = StObject.set(x, "xTickNumber", value.asInstanceOf[js.Any])
      
      inline def setXTickNumberUndefined: Self = StObject.set(x, "xTickNumber", js.undefined)
      
      inline def setXType(value: time | text | linear): Self = StObject.set(x, "xType", value.asInstanceOf[js.Any])
      
      inline def setXTypeUndefined: Self = StObject.set(x, "xType", js.undefined)
      
      inline def setY2Type(value: time | text | linear): Self = StObject.set(x, "y2Type", value.asInstanceOf[js.Any])
      
      inline def setY2TypeUndefined: Self = StObject.set(x, "y2Type", js.undefined)
      
      inline def setYAxisOrientRight(value: Boolean): Self = StObject.set(x, "yAxisOrientRight", value.asInstanceOf[js.Any])
      
      inline def setYAxisOrientRightUndefined: Self = StObject.set(x, "yAxisOrientRight", js.undefined)
      
      inline def setYDomainRange(value: js.Array[Double]): Self = StObject.set(x, "yDomainRange", value.asInstanceOf[js.Any])
      
      inline def setYDomainRangeUndefined: Self = StObject.set(x, "yDomainRange", js.undefined)
      
      inline def setYDomainRangeVarargs(value: Double*): Self = StObject.set(x, "yDomainRange", js.Array(value*))
      
      inline def setYTickNumber(value: Double): Self = StObject.set(x, "yTickNumber", value.asInstanceOf[js.Any])
      
      inline def setYTickNumberUndefined: Self = StObject.set(x, "yTickNumber", js.undefined)
    }
  }
  
  trait BarData extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var x: Double | js.Date | String
    
    var y: Double
  }
  object BarData {
    
    inline def apply(x: Double | js.Date | String, y: Double): BarData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarData] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setX(value: Double | js.Date | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegendProps extends StObject {
    
    /** Override the color of the items */
    var config: js.UndefOr[js.Array[ColorString]] = js.undefined
    
    var data: js.Array[Any]
    
    var dataId: String
    
    /** change list items to inline-block (default block) */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /** Override the css styles of individual components, see http://rma-consulting.github.io/react-easy-chart/legend/index.html */
    var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.undefined
  }
  object LegendProps {
    
    inline def apply(data: js.Array[Any], dataId: String): LegendProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataId = dataId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendProps] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: js.Array[ColorString]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConfigVarargs(value: ColorString*): Self = StObject.set(x, "config", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setStyles(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait LineChartProps extends StObject {
    
    /** Whether to show axis labels */
    var axes: js.UndefOr[Boolean] = js.undefined
    
    /** Labels for each of the axis */
    var axisLabels: js.UndefOr[Y] = js.undefined
    
    var clickHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var data: js.Array[js.Array[LineData]]
    
    /** Whether to show circles on the data points */
    var dataPoints: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to show horizontal grid lines on the chart */
    var grid: js.UndefOr[Boolean] = js.undefined
    
    /** Height of the chart in pixels */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Smoothing option for the lines */
    var interpolate: js.UndefOr[
        linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
      ] = js.undefined
    
    var lineColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** css margins */
    var margin: js.UndefOr[Bottom] = js.undefined
    
    var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var mouseOutHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var mouseOverHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    /** The d3 time format to be used for the x axis (when xType is 'time') */
    var tickTimeDisplayFormat: js.UndefOr[String] = js.undefined
    
    /** Whether to show vertical grid lines on the chart */
    var verticalGrid: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the chart in pixels */
    var width: js.UndefOr[Double] = js.undefined
    
    /** The range that the x axis should show (otherwise automatically calculated) */
    var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
    
    /** The amount of ticks to be shown on the x axis */
    var xTicks: js.UndefOr[Double] = js.undefined
    
    /** What data type the x axis is */
    var xType: js.UndefOr[time | text | linear] = js.undefined
    
    /** Whether to show the axis on the right (default false: left) */
    var yAxisOrientRight: js.UndefOr[Boolean] = js.undefined
    
    /** The range that the y axis should show (otherwise automatically calculated) */
    var yDomainRange: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    /** The amount of ticks to be shown on the y axis */
    var yTicks: js.UndefOr[Double] = js.undefined
    
    /** What data type the x axis is */
    var yType: js.UndefOr[time | text | linear] = js.undefined
  }
  object LineChartProps {
    
    inline def apply(data: js.Array[js.Array[LineData]]): LineChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineChartProps] (val x: Self) extends AnyVal {
      
      inline def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setAxisLabels(value: Y): Self = StObject.set(x, "axisLabels", value.asInstanceOf[js.Any])
      
      inline def setAxisLabelsUndefined: Self = StObject.set(x, "axisLabels", js.undefined)
      
      inline def setClickHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "clickHandler", js.Any.fromFunction2(value))
      
      inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      inline def setData(value: js.Array[js.Array[LineData]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataPoints(value: Boolean): Self = StObject.set(x, "dataPoints", value.asInstanceOf[js.Any])
      
      inline def setDataPointsUndefined: Self = StObject.set(x, "dataPoints", js.undefined)
      
      inline def setDataVarargs(value: js.Array[LineData]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInterpolate(
        value: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
      ): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setLineColors(value: js.Array[String]): Self = StObject.set(x, "lineColors", value.asInstanceOf[js.Any])
      
      inline def setLineColorsUndefined: Self = StObject.set(x, "lineColors", js.undefined)
      
      inline def setLineColorsVarargs(value: String*): Self = StObject.set(x, "lineColors", js.Array(value*))
      
      inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMouseMoveHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseMoveHandler", js.Any.fromFunction2(value))
      
      inline def setMouseMoveHandlerUndefined: Self = StObject.set(x, "mouseMoveHandler", js.undefined)
      
      inline def setMouseOutHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction2(value))
      
      inline def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      inline def setMouseOverHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction2(value))
      
      inline def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      inline def setTickTimeDisplayFormat(value: String): Self = StObject.set(x, "tickTimeDisplayFormat", value.asInstanceOf[js.Any])
      
      inline def setTickTimeDisplayFormatUndefined: Self = StObject.set(x, "tickTimeDisplayFormat", js.undefined)
      
      inline def setVerticalGrid(value: Boolean): Self = StObject.set(x, "verticalGrid", value.asInstanceOf[js.Any])
      
      inline def setVerticalGridUndefined: Self = StObject.set(x, "verticalGrid", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXDomainRange(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "xDomainRange", value.asInstanceOf[js.Any])
      
      inline def setXDomainRangeUndefined: Self = StObject.set(x, "xDomainRange", js.undefined)
      
      inline def setXDomainRangeVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "xDomainRange", js.Array(value*))
      
      inline def setXTicks(value: Double): Self = StObject.set(x, "xTicks", value.asInstanceOf[js.Any])
      
      inline def setXTicksUndefined: Self = StObject.set(x, "xTicks", js.undefined)
      
      inline def setXType(value: time | text | linear): Self = StObject.set(x, "xType", value.asInstanceOf[js.Any])
      
      inline def setXTypeUndefined: Self = StObject.set(x, "xType", js.undefined)
      
      inline def setYAxisOrientRight(value: Boolean): Self = StObject.set(x, "yAxisOrientRight", value.asInstanceOf[js.Any])
      
      inline def setYAxisOrientRightUndefined: Self = StObject.set(x, "yAxisOrientRight", js.undefined)
      
      inline def setYDomainRange(value: js.Array[Double | String]): Self = StObject.set(x, "yDomainRange", value.asInstanceOf[js.Any])
      
      inline def setYDomainRangeUndefined: Self = StObject.set(x, "yDomainRange", js.undefined)
      
      inline def setYDomainRangeVarargs(value: (Double | String)*): Self = StObject.set(x, "yDomainRange", js.Array(value*))
      
      inline def setYTicks(value: Double): Self = StObject.set(x, "yTicks", value.asInstanceOf[js.Any])
      
      inline def setYTicksUndefined: Self = StObject.set(x, "yTicks", js.undefined)
      
      inline def setYType(value: time | text | linear): Self = StObject.set(x, "yType", value.asInstanceOf[js.Any])
      
      inline def setYTypeUndefined: Self = StObject.set(x, "yType", js.undefined)
    }
  }
  
  trait LineData extends StObject {
    
    var x: Double | js.Date | String
    
    var y: Double | js.Date | String
  }
  object LineData {
    
    inline def apply(x: Double | js.Date | String, y: Double | js.Date | String): LineData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineData] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double | js.Date | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double | js.Date | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PieChartProps extends StObject {
    
    var clickHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var data: js.Array[Color]
    
    /** Size in pixels of the inner hole (diameter) */
    var innerHoleSize: js.UndefOr[Double] = js.undefined
    
    /** Whether to add labels the to pie segments */
    var labels: js.UndefOr[Boolean] = js.undefined
    
    var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var mouseOutHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var mouseOverHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    /** Padding around the chart in pixels */
    var padding: js.UndefOr[Double] = js.undefined
    
    /** Size in pixels in each dimension */
    var size: js.UndefOr[Double] = js.undefined
    
    var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.undefined
  }
  object PieChartProps {
    
    inline def apply(data: js.Array[Color]): PieChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieChartProps] (val x: Self) extends AnyVal {
      
      inline def setClickHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "clickHandler", js.Any.fromFunction2(value))
      
      inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      inline def setData(value: js.Array[Color]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Color*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setInnerHoleSize(value: Double): Self = StObject.set(x, "innerHoleSize", value.asInstanceOf[js.Any])
      
      inline def setInnerHoleSizeUndefined: Self = StObject.set(x, "innerHoleSize", js.undefined)
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMouseMoveHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseMoveHandler", js.Any.fromFunction2(value))
      
      inline def setMouseMoveHandlerUndefined: Self = StObject.set(x, "mouseMoveHandler", js.undefined)
      
      inline def setMouseOutHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction2(value))
      
      inline def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      inline def setMouseOverHandler(value: (/* data */ PieData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction2(value))
      
      inline def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyles(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait PieData extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var value: Double
  }
  object PieData {
    
    inline def apply(key: String, value: Double): PieData = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieData] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScatterplotChartProps extends StObject {
    
    /** Whether to show axis labels */
    var axes: js.UndefOr[Boolean] = js.undefined
    
    /** Labels for each of the axis */
    var axisLabels: js.UndefOr[Y] = js.undefined
    
    var clickHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    /** Allows styling of individual types of points */
    var config: js.UndefOr[js.Array[Stroke]] = js.undefined
    
    var data: js.Array[ScatterplotData]
    
    /** Radius of the dots on the chart */
    var dotRadius: js.UndefOr[Double] = js.undefined
    
    /** Whether to show horizontal grid lines on the chart */
    var grid: js.UndefOr[Boolean] = js.undefined
    
    /** Height of the chart in pixels */
    var height: js.UndefOr[Double] = js.undefined
    
    /** css margins */
    var margin: js.UndefOr[Bottom] = js.undefined
    
    var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var mouseOutHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    var mouseOverHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, Any]] = js.undefined
    
    /** Whether to show vertical grid lines on the chart */
    var verticalGrid: js.UndefOr[Boolean] = js.undefined
    
    /** Width of the chart in pixels */
    var width: js.UndefOr[Double] = js.undefined
    
    /** The range that the x axis should show (otherwise automatically calculated) */
    var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
    
    /** What data type the x axis is */
    var xType: js.UndefOr[time | text | linear] = js.undefined
    
    /** Whether to show the axis on the right (default false: left) */
    var yAxisOrientRight: js.UndefOr[Boolean] = js.undefined
    
    /** The range that the y axis should show (otherwise automatically calculated) */
    var yDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
    
    /** What data type the x axis is */
    var yType: js.UndefOr[time | text | linear] = js.undefined
  }
  object ScatterplotChartProps {
    
    inline def apply(data: js.Array[ScatterplotData]): ScatterplotChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterplotChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterplotChartProps] (val x: Self) extends AnyVal {
      
      inline def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setAxisLabels(value: Y): Self = StObject.set(x, "axisLabels", value.asInstanceOf[js.Any])
      
      inline def setAxisLabelsUndefined: Self = StObject.set(x, "axisLabels", js.undefined)
      
      inline def setClickHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "clickHandler", js.Any.fromFunction2(value))
      
      inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
      
      inline def setConfig(value: js.Array[Stroke]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConfigVarargs(value: Stroke*): Self = StObject.set(x, "config", js.Array(value*))
      
      inline def setData(value: js.Array[ScatterplotData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ScatterplotData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDotRadius(value: Double): Self = StObject.set(x, "dotRadius", value.asInstanceOf[js.Any])
      
      inline def setDotRadiusUndefined: Self = StObject.set(x, "dotRadius", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMouseMoveHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseMoveHandler", js.Any.fromFunction2(value))
      
      inline def setMouseMoveHandlerUndefined: Self = StObject.set(x, "mouseMoveHandler", js.undefined)
      
      inline def setMouseOutHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseOutHandler", js.Any.fromFunction2(value))
      
      inline def setMouseOutHandlerUndefined: Self = StObject.set(x, "mouseOutHandler", js.undefined)
      
      inline def setMouseOverHandler(value: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => Any): Self = StObject.set(x, "mouseOverHandler", js.Any.fromFunction2(value))
      
      inline def setMouseOverHandlerUndefined: Self = StObject.set(x, "mouseOverHandler", js.undefined)
      
      inline def setVerticalGrid(value: Boolean): Self = StObject.set(x, "verticalGrid", value.asInstanceOf[js.Any])
      
      inline def setVerticalGridUndefined: Self = StObject.set(x, "verticalGrid", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXDomainRange(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "xDomainRange", value.asInstanceOf[js.Any])
      
      inline def setXDomainRangeUndefined: Self = StObject.set(x, "xDomainRange", js.undefined)
      
      inline def setXDomainRangeVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "xDomainRange", js.Array(value*))
      
      inline def setXType(value: time | text | linear): Self = StObject.set(x, "xType", value.asInstanceOf[js.Any])
      
      inline def setXTypeUndefined: Self = StObject.set(x, "xType", js.undefined)
      
      inline def setYAxisOrientRight(value: Boolean): Self = StObject.set(x, "yAxisOrientRight", value.asInstanceOf[js.Any])
      
      inline def setYAxisOrientRightUndefined: Self = StObject.set(x, "yAxisOrientRight", js.undefined)
      
      inline def setYDomainRange(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "yDomainRange", value.asInstanceOf[js.Any])
      
      inline def setYDomainRangeUndefined: Self = StObject.set(x, "yDomainRange", js.undefined)
      
      inline def setYDomainRangeVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "yDomainRange", js.Array(value*))
      
      inline def setYType(value: time | text | linear): Self = StObject.set(x, "yType", value.asInstanceOf[js.Any])
      
      inline def setYTypeUndefined: Self = StObject.set(x, "yType", js.undefined)
    }
  }
  
  trait ScatterplotData extends StObject {
    
    var `type`: String | Double
    
    var x: Double | js.Date | String
    
    var y: Double | js.Date | String
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object ScatterplotData {
    
    inline def apply(`type`: String | Double, x: Double | js.Date | String, y: Double | js.Date | String): ScatterplotData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterplotData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterplotData] (val x: Self) extends AnyVal {
      
      inline def setType(value: String | Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double | js.Date | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double | js.Date | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
