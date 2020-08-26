package typings.reactEasyChart.mod

import typings.reactEasyChart.anon.Bottom
import typings.reactEasyChart.anon.X
import typings.reactEasyChart.reactEasyChartStrings.linear
import typings.reactEasyChart.reactEasyChartStrings.text
import typings.reactEasyChart.reactEasyChartStrings.time
import typings.std.Date
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[Boolean] = js.native
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[X] = js.native
  /** The width of an individual bar in pixels */
  var barWidth: js.UndefOr[Double] = js.native
  var clickHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** Whether to automatically color the bars */
  var colorBars: js.UndefOr[Boolean] = js.native
  var data: js.Array[BarData] = js.native
  /** A d3 time formatting pattern to be applied to format the x axis values */
  var datePattern: js.UndefOr[String] = js.native
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[Boolean] = js.native
  /** Height of the chart in pixels */
  var height: js.UndefOr[Double] = js.native
  /** Interpolation method if you add a line to this chart (via lineData) */
  var interpolate: js.UndefOr[String] = js.native
  var lineData: js.UndefOr[js.Array[LineData]] = js.native
  /** css margins */
  var margin: js.UndefOr[Bottom] = js.native
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ BarData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** The d3 time format to be used for the x axis (when xType is 'time') */
  var tickTimeDisplayFormat: js.UndefOr[String] = js.native
  /** Width of the chart in pixels */
  var width: js.UndefOr[Double] = js.native
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[Date | Double | String]] = js.native
  /** The amount of ticks to be shown on the x axis */
  var xTickNumber: js.UndefOr[Double] = js.native
  /** What data type the x axis is */
  var xType: js.UndefOr[time | text | linear] = js.native
  /** What data type the second y axis is */
  var y2Type: js.UndefOr[time | text | linear] = js.native
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[Boolean] = js.native
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[Double]] = js.native
  /** The amount of ticks to be shown on the y axis */
  var yTickNumber: js.UndefOr[Double] = js.native
}

object BarChartProps {
  @scala.inline
  def apply(data: js.Array[BarData]): BarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps]
  }
  @scala.inline
  implicit class BarChartPropsOps[Self <: BarChartProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: BarData*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[BarData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxes(value: Boolean): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setAxisLabels(value: X): Self = this.set("axisLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLabels: Self = this.set("axisLabels", js.undefined)
    @scala.inline
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
    @scala.inline
    def setClickHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = this.set("clickHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteClickHandler: Self = this.set("clickHandler", js.undefined)
    @scala.inline
    def setColorBars(value: Boolean): Self = this.set("colorBars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBars: Self = this.set("colorBars", js.undefined)
    @scala.inline
    def setDatePattern(value: String): Self = this.set("datePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePattern: Self = this.set("datePattern", js.undefined)
    @scala.inline
    def setGrid(value: Boolean): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInterpolate(value: String): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    @scala.inline
    def setLineDataVarargs(value: LineData*): Self = this.set("lineData", js.Array(value :_*))
    @scala.inline
    def setLineData(value: js.Array[LineData]): Self = this.set("lineData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineData: Self = this.set("lineData", js.undefined)
    @scala.inline
    def setMargin(value: Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMouseMoveHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseMoveHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseMoveHandler: Self = this.set("mouseMoveHandler", js.undefined)
    @scala.inline
    def setMouseOutHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseOutHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseOutHandler: Self = this.set("mouseOutHandler", js.undefined)
    @scala.inline
    def setMouseOverHandler(value: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseOverHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseOverHandler: Self = this.set("mouseOverHandler", js.undefined)
    @scala.inline
    def setTickTimeDisplayFormat(value: String): Self = this.set("tickTimeDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickTimeDisplayFormat: Self = this.set("tickTimeDisplayFormat", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXDomainRangeVarargs(value: (Date | Double | String)*): Self = this.set("xDomainRange", js.Array(value :_*))
    @scala.inline
    def setXDomainRange(value: js.Array[Date | Double | String]): Self = this.set("xDomainRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXDomainRange: Self = this.set("xDomainRange", js.undefined)
    @scala.inline
    def setXTickNumber(value: Double): Self = this.set("xTickNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXTickNumber: Self = this.set("xTickNumber", js.undefined)
    @scala.inline
    def setXType(value: time | text | linear): Self = this.set("xType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXType: Self = this.set("xType", js.undefined)
    @scala.inline
    def setY2Type(value: time | text | linear): Self = this.set("y2Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2Type: Self = this.set("y2Type", js.undefined)
    @scala.inline
    def setYAxisOrientRight(value: Boolean): Self = this.set("yAxisOrientRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisOrientRight: Self = this.set("yAxisOrientRight", js.undefined)
    @scala.inline
    def setYDomainRangeVarargs(value: Double*): Self = this.set("yDomainRange", js.Array(value :_*))
    @scala.inline
    def setYDomainRange(value: js.Array[Double]): Self = this.set("yDomainRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYDomainRange: Self = this.set("yDomainRange", js.undefined)
    @scala.inline
    def setYTickNumber(value: Double): Self = this.set("yTickNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYTickNumber: Self = this.set("yTickNumber", js.undefined)
  }
  
}

