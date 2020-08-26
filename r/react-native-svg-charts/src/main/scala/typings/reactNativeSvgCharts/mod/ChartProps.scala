package typings.reactNativeSvgCharts.mod

import typings.d3Path.mod.Path_
import typings.d3Scale.mod.ScaleBand_
import typings.d3Shape.mod.CurveFactory
import typings.d3Shape.mod.CurveGenerator
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.anon.Bottom
import typings.reactNativeSvgCharts.anon.PartialPathProps
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartProps[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var contentInset: js.UndefOr[Bottom] = js.native
  var curve: js.UndefOr[CurveFactory] = js.native
  var data: js.Array[T] = js.native
  var gridMax: js.UndefOr[Double] = js.native
  var gridMin: js.UndefOr[Double] = js.native
  var gridProps: js.UndefOr[GridProps[_]] = js.native
  var height: js.UndefOr[Double] = js.native
  var numberOfTicks: js.UndefOr[Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var svg: js.UndefOr[PartialPathProps] = js.native
  var width: js.UndefOr[Double] = js.native
  var xAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.native
  var xMax: js.UndefOr[Double] = js.native
  var xMin: js.UndefOr[Double] = js.native
  var xScale: js.UndefOr[ScaleFunction] = js.native
  var yAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.native
  var yMax: js.UndefOr[Double] = js.native
  var yMin: js.UndefOr[Double] = js.native
  var yScale: js.UndefOr[ScaleFunction] = js.native
}

object ChartProps {
  @scala.inline
  def apply[T](data: js.Array[T]): ChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps[T]]
  }
  @scala.inline
  implicit class ChartPropsOps[Self <: ChartProps[_], T] (val x: Self with ChartProps[T]) extends AnyVal {
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
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setContentInset(value: Bottom): Self = this.set("contentInset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentInset: Self = this.set("contentInset", js.undefined)
    @scala.inline
    def setCurve(value: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator): Self = this.set("curve", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    @scala.inline
    def setGridMax(value: Double): Self = this.set("gridMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridMax: Self = this.set("gridMax", js.undefined)
    @scala.inline
    def setGridMin(value: Double): Self = this.set("gridMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridMin: Self = this.set("gridMin", js.undefined)
    @scala.inline
    def setGridProps(value: GridProps[_]): Self = this.set("gridProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridProps: Self = this.set("gridProps", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setNumberOfTicks(value: Double): Self = this.set("numberOfTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfTicks: Self = this.set("numberOfTicks", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setSvg(value: PartialPathProps): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self = this.set("xAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteXAccessor: Self = this.set("xAccessor", js.undefined)
    @scala.inline
    def setXMax(value: Double): Self = this.set("xMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXMax: Self = this.set("xMax", js.undefined)
    @scala.inline
    def setXMin(value: Double): Self = this.set("xMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXMin: Self = this.set("xMin", js.undefined)
    @scala.inline
    def setXScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self = this.set("xScale", js.Any.fromFunction0(value))
    @scala.inline
    def deleteXScale: Self = this.set("xScale", js.undefined)
    @scala.inline
    def setYAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self = this.set("yAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteYAccessor: Self = this.set("yAccessor", js.undefined)
    @scala.inline
    def setYMax(value: Double): Self = this.set("yMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYMax: Self = this.set("yMax", js.undefined)
    @scala.inline
    def setYMin(value: Double): Self = this.set("yMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYMin: Self = this.set("yMin", js.undefined)
    @scala.inline
    def setYScale(value: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any]): Self = this.set("yScale", js.Any.fromFunction0(value))
    @scala.inline
    def deleteYScale: Self = this.set("yScale", js.undefined)
  }
  
}

