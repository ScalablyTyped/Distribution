package typings.reactNativeSvgCharts.mod

import typings.d3Path.mod.Path_
import typings.d3Scale.mod.ScaleBand_
import typings.d3Shape.mod.CurveGenerator
import typings.d3Shape.mod.Series
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSvg.mod.LinearGradientProps
import typings.reactNativeSvg.mod.RadialGradientProps
import typings.reactNativeSvgCharts.anon.Bottom
import typings.reactNativeSvgCharts.anon.Color
import typings.reactNativeSvgCharts.anon.PartialPathProps
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedAreaChartProps[T] extends ChartProps[T] {
  var colors: js.Array[String]
  var extras: js.UndefOr[js.Array[_]] = js.undefined
  var keys: js.Array[/* keyof T */ String]
  var offset: js.UndefOr[OffsetFunction] = js.undefined
  var order: js.UndefOr[OrderFunction] = js.undefined
  var renderDecorator: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var renderGradient: js.UndefOr[
    js.Function1[
      /* props */ Color[T], 
      Component[LinearGradientProps | RadialGradientProps, js.Object, _]
    ]
  ] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
}

object StackedAreaChartProps {
  @scala.inline
  def apply[T](
    colors: js.Array[String],
    data: js.Array[T],
    keys: js.Array[/* keyof T */ String],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    contentInset: Bottom = null,
    curve: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator = null,
    extras: js.Array[_] = null,
    gridMax: js.UndefOr[Double] = js.undefined,
    gridMin: js.UndefOr[Double] = js.undefined,
    gridProps: GridProps[_] = null,
    height: js.UndefOr[Double] = js.undefined,
    numberOfTicks: js.UndefOr[Double] = js.undefined,
    offset: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Unit = null,
    order: /* series */ Series[js.Any, js.Any] => js.Array[Double] = null,
    renderDecorator: () => js.Object = null,
    renderGradient: /* props */ Color[T] => Component[LinearGradientProps | RadialGradientProps, js.Object, _] = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
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
  ): StackedAreaChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(js.Any.fromFunction1(curve))
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    if (!js.isUndefined(gridMax)) __obj.updateDynamic("gridMax")(gridMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridMin)) __obj.updateDynamic("gridMin")(gridMin.get.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfTicks)) __obj.updateDynamic("numberOfTicks")(numberOfTicks.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(js.Any.fromFunction2(offset))
    if (order != null) __obj.updateDynamic("order")(js.Any.fromFunction1(order))
    if (renderDecorator != null) __obj.updateDynamic("renderDecorator")(js.Any.fromFunction0(renderDecorator))
    if (renderGradient != null) __obj.updateDynamic("renderGradient")(js.Any.fromFunction1(renderGradient))
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.get.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[StackedAreaChartProps[T]]
  }
}

