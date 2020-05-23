package typings.reactNativeSvgCharts.mod

import typings.d3Path.mod.Path_
import typings.d3Scale.mod.ScaleBand_
import typings.d3Shape.mod.CurveGenerator
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvgCharts.anon.Bottom
import typings.reactNativeSvgCharts.anon.PartialPathProps
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarChartProps[T] extends ChartProps[T] {
  var spacingInner: js.UndefOr[Double] = js.undefined
  var spacingOuter: js.UndefOr[Double] = js.undefined
}

object BarChartProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    contentInset: Bottom = null,
    curve: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator = null,
    gridMax: js.UndefOr[Double] = js.undefined,
    gridMin: js.UndefOr[Double] = js.undefined,
    gridProps: GridProps[_] = null,
    height: js.UndefOr[Double] = js.undefined,
    numberOfTicks: js.UndefOr[Double] = js.undefined,
    spacingInner: js.UndefOr[Double] = js.undefined,
    spacingOuter: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    svg: PartialPathProps = null,
    width: js.UndefOr[Double] = js.undefined,
    xAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    xMax: js.UndefOr[Double] = js.undefined,
    xMin: js.UndefOr[Double] = js.undefined,
    xScale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    yAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    yMax: js.UndefOr[Double] = js.undefined,
    yMin: js.UndefOr[Double] = js.undefined,
    yScale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null
  ): BarChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(js.Any.fromFunction1(curve))
    if (!js.isUndefined(gridMax)) __obj.updateDynamic("gridMax")(gridMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridMin)) __obj.updateDynamic("gridMin")(gridMin.get.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfTicks)) __obj.updateDynamic("numberOfTicks")(numberOfTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingInner)) __obj.updateDynamic("spacingInner")(spacingInner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingOuter)) __obj.updateDynamic("spacingOuter")(spacingOuter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1(xAccessor))
    if (!js.isUndefined(xMax)) __obj.updateDynamic("xMax")(xMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xMin)) __obj.updateDynamic("xMin")(xMin.get.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction0(xScale))
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1(yAccessor))
    if (!js.isUndefined(yMax)) __obj.updateDynamic("yMax")(yMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yMin)) __obj.updateDynamic("yMin")(yMin.get.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction0(yScale))
    __obj.asInstanceOf[BarChartProps[T]]
  }
}

