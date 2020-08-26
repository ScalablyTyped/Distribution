package typings.reactEasyChart.mod

import typings.reactEasyChart.anon.Bottom
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
import typings.std.Date
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[Boolean] = js.native
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[Y] = js.native
  var clickHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
  var data: js.Array[js.Array[LineData]] = js.native
  /** Whether to show circles on the data points */
  var dataPoints: js.UndefOr[Boolean] = js.native
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[Boolean] = js.native
  /** Height of the chart in pixels */
  var height: js.UndefOr[Double] = js.native
  /** Smoothing option for the lines */
  var interpolate: js.UndefOr[
    linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
  ] = js.native
  var lineColors: js.UndefOr[js.Array[String]] = js.native
  /** css margins */
  var margin: js.UndefOr[Bottom] = js.native
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ LineData, /* mouseEvent */ MouseEvent, _]] = js.native
  /** The d3 time format to be used for the x axis (when xType is 'time') */
  var tickTimeDisplayFormat: js.UndefOr[String] = js.native
  /** Whether to show vertical grid lines on the chart */
  var verticalGrid: js.UndefOr[Boolean] = js.native
  /** Width of the chart in pixels */
  var width: js.UndefOr[Double] = js.native
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[Date | Double | String]] = js.native
  /** The amount of ticks to be shown on the x axis */
  var xTicks: js.UndefOr[Double] = js.native
  /** What data type the x axis is */
  var xType: js.UndefOr[time | text | linear] = js.native
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[Boolean] = js.native
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[Double | String]] = js.native
  /** The amount of ticks to be shown on the y axis */
  var yTicks: js.UndefOr[Double] = js.native
  /** What data type the x axis is */
  var yType: js.UndefOr[time | text | linear] = js.native
}

object LineChartProps {
  @scala.inline
  def apply(data: js.Array[js.Array[LineData]]): LineChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineChartProps]
  }
  @scala.inline
  implicit class LineChartPropsOps[Self <: LineChartProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Array[LineData]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[LineData]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxes(value: Boolean): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setAxisLabels(value: Y): Self = this.set("axisLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLabels: Self = this.set("axisLabels", js.undefined)
    @scala.inline
    def setClickHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = this.set("clickHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteClickHandler: Self = this.set("clickHandler", js.undefined)
    @scala.inline
    def setDataPoints(value: Boolean): Self = this.set("dataPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataPoints: Self = this.set("dataPoints", js.undefined)
    @scala.inline
    def setGrid(value: Boolean): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInterpolate(
      value: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
    ): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    @scala.inline
    def setLineColorsVarargs(value: String*): Self = this.set("lineColors", js.Array(value :_*))
    @scala.inline
    def setLineColors(value: js.Array[String]): Self = this.set("lineColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColors: Self = this.set("lineColors", js.undefined)
    @scala.inline
    def setMargin(value: Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMouseMoveHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseMoveHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseMoveHandler: Self = this.set("mouseMoveHandler", js.undefined)
    @scala.inline
    def setMouseOutHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseOutHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseOutHandler: Self = this.set("mouseOutHandler", js.undefined)
    @scala.inline
    def setMouseOverHandler(value: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _): Self = this.set("mouseOverHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMouseOverHandler: Self = this.set("mouseOverHandler", js.undefined)
    @scala.inline
    def setTickTimeDisplayFormat(value: String): Self = this.set("tickTimeDisplayFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickTimeDisplayFormat: Self = this.set("tickTimeDisplayFormat", js.undefined)
    @scala.inline
    def setVerticalGrid(value: Boolean): Self = this.set("verticalGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalGrid: Self = this.set("verticalGrid", js.undefined)
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
    def setXTicks(value: Double): Self = this.set("xTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXTicks: Self = this.set("xTicks", js.undefined)
    @scala.inline
    def setXType(value: time | text | linear): Self = this.set("xType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXType: Self = this.set("xType", js.undefined)
    @scala.inline
    def setYAxisOrientRight(value: Boolean): Self = this.set("yAxisOrientRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisOrientRight: Self = this.set("yAxisOrientRight", js.undefined)
    @scala.inline
    def setYDomainRangeVarargs(value: (Double | String)*): Self = this.set("yDomainRange", js.Array(value :_*))
    @scala.inline
    def setYDomainRange(value: js.Array[Double | String]): Self = this.set("yDomainRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYDomainRange: Self = this.set("yDomainRange", js.undefined)
    @scala.inline
    def setYTicks(value: Double): Self = this.set("yTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYTicks: Self = this.set("yTicks", js.undefined)
    @scala.inline
    def setYType(value: time | text | linear): Self = this.set("yType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYType: Self = this.set("yType", js.undefined)
  }
  
}

