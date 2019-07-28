package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import typings.d3DashShape.d3DashShapeMod.CurveFactory
import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.LinearGradientProps
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.PathProps
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.RadialGradientProps
import typings.reactDashNativeDashSvgDashCharts.Anon_Bottom
import typings.reactDashNativeDashSvgDashCharts.Anon_Id
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedBarChartProps[T] extends ChartProps[T] {
  var colors: js.Array[String]
  var extra: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var extras: js.UndefOr[js.Array[_]] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var keys: js.Array[String]
  var offset: js.UndefOr[OffsetFunction] = js.undefined
  var order: js.UndefOr[OrderFunction] = js.undefined
  var renderGradient: js.UndefOr[
    js.Function1[
      /* props */ Anon_Id, 
      Component[LinearGradientProps | RadialGradientProps, js.Object, _]
    ]
  ] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var spacingInner: js.UndefOr[Double] = js.undefined
  var spacingOuter: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
}

object StackedBarChartProps {
  @scala.inline
  def apply[T](
    colors: js.Array[String],
    data: js.Array[T],
    keys: js.Array[String],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    contentInset: Anon_Bottom = null,
    curve: CurveFactory = null,
    extra: () => js.Object = null,
    extras: js.Array[_] = null,
    gridMax: Int | Double = null,
    gridMin: Int | Double = null,
    gridProps: GridProps[_] = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    numberOfTicks: Int | Double = null,
    offset: OffsetFunction = null,
    order: OrderFunction = null,
    renderGradient: /* props */ Anon_Id => Component[LinearGradientProps | RadialGradientProps, js.Object, _] = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    strokeColor: String = null,
    style: StyleProp[ViewStyle] = null,
    svg: Partial[PathProps] = null,
    width: Int | Double = null,
    xAccessor: AccessorFunction[T, Double] = null,
    xMax: Int | Double = null,
    xMin: Int | Double = null,
    xScale: ScaleFunction = null,
    yAccessor: AccessorFunction[T, Double] = null,
    yMax: Int | Double = null,
    yMin: Int | Double = null,
    yScale: ScaleFunction = null
  ): StackedBarChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors, data = data, keys = keys)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset)
    if (curve != null) __obj.updateDynamic("curve")(curve)
    if (extra != null) __obj.updateDynamic("extra")(js.Any.fromFunction0(extra))
    if (extras != null) __obj.updateDynamic("extras")(extras)
    if (gridMax != null) __obj.updateDynamic("gridMax")(gridMax.asInstanceOf[js.Any])
    if (gridMin != null) __obj.updateDynamic("gridMin")(gridMin.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (order != null) __obj.updateDynamic("order")(order)
    if (renderGradient != null) __obj.updateDynamic("renderGradient")(js.Any.fromFunction1(renderGradient))
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(xAccessor)
    if (xMax != null) __obj.updateDynamic("xMax")(xMax.asInstanceOf[js.Any])
    if (xMin != null) __obj.updateDynamic("xMin")(xMin.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(yAccessor)
    if (yMax != null) __obj.updateDynamic("yMax")(yMax.asInstanceOf[js.Any])
    if (yMin != null) __obj.updateDynamic("yMin")(yMin.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[StackedBarChartProps[T]]
  }
}

