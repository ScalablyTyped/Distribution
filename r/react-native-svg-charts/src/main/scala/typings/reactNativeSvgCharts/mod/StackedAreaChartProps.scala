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
import typings.reactNativeSvgCharts.AnonBottom
import typings.reactNativeSvgCharts.AnonColor
import typings.reactNativeSvgCharts.PartialPathProps
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedAreaChartProps[T] extends ChartProps[T] {
  var colors: js.Array[String]
  var extras: js.UndefOr[js.Array[_]] = js.undefined
  var keys: js.Array[String]
  var offset: js.UndefOr[OffsetFunction] = js.undefined
  var order: js.UndefOr[OrderFunction] = js.undefined
  var renderDecorator: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var renderGradient: js.UndefOr[
    js.Function1[
      /* props */ AnonColor[T], 
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
    keys: js.Array[String],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    contentInset: AnonBottom = null,
    curve: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator = null,
    extras: js.Array[_] = null,
    gridMax: Int | Double = null,
    gridMin: Int | Double = null,
    gridProps: GridProps[_] = null,
    height: Int | Double = null,
    numberOfTicks: Int | Double = null,
    offset: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Unit = null,
    order: /* series */ Series[js.Any, js.Any] => js.Array[Double] = null,
    renderDecorator: () => js.Object = null,
    renderGradient: /* props */ AnonColor[T] => Component[LinearGradientProps | RadialGradientProps, js.Object, _] = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    svg: PartialPathProps = null,
    width: Int | Double = null,
    xAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    xMax: Int | Double = null,
    xMin: Int | Double = null,
    xScale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    yAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    yMax: Int | Double = null,
    yMin: Int | Double = null,
    yScale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null
  ): StackedAreaChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(js.Any.fromFunction1(curve))
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    if (gridMax != null) __obj.updateDynamic("gridMax")(gridMax.asInstanceOf[js.Any])
    if (gridMin != null) __obj.updateDynamic("gridMin")(gridMin.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(js.Any.fromFunction2(offset))
    if (order != null) __obj.updateDynamic("order")(js.Any.fromFunction1(order))
    if (renderDecorator != null) __obj.updateDynamic("renderDecorator")(js.Any.fromFunction0(renderDecorator))
    if (renderGradient != null) __obj.updateDynamic("renderGradient")(js.Any.fromFunction1(renderGradient))
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1(xAccessor))
    if (xMax != null) __obj.updateDynamic("xMax")(xMax.asInstanceOf[js.Any])
    if (xMin != null) __obj.updateDynamic("xMin")(xMin.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction0(xScale))
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1(yAccessor))
    if (yMax != null) __obj.updateDynamic("yMax")(yMax.asInstanceOf[js.Any])
    if (yMin != null) __obj.updateDynamic("yMin")(yMin.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction0(yScale))
    __obj.asInstanceOf[StackedAreaChartProps[T]]
  }
}

