package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedAreaChartProps[T] extends ChartProps[T] {
  var colors: js.Array[java.lang.String]
  var extras: js.UndefOr[js.Array[_]] = js.undefined
  var keys: js.Array[java.lang.String]
  var offset: js.UndefOr[OffsetFunction] = js.undefined
  var order: js.UndefOr[OrderFunction] = js.undefined
  var renderDecorator: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var renderGradient: js.UndefOr[
    js.Function1[
      /* props */ reactDashNativeDashSvgDashChartsLib.Anon_Color[T], 
      reactLib.reactMod.Component[
        reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.LinearGradientProps | reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.RadialGradientProps, 
        js.Object, 
        _
      ]
    ]
  ] = js.undefined
  var showGrid: js.UndefOr[scala.Boolean] = js.undefined
}

object StackedAreaChartProps {
  @scala.inline
  def apply[T](
    colors: js.Array[java.lang.String],
    data: js.Array[T],
    keys: js.Array[java.lang.String],
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    contentInset: reactDashNativeDashSvgDashChartsLib.Anon_Bottom = null,
    curve: d3DashShapeLib.d3DashShapeMod.CurveFactory = null,
    extras: js.Array[_] = null,
    gridMax: scala.Int | scala.Double = null,
    gridMin: scala.Int | scala.Double = null,
    gridProps: GridProps[_] = null,
    height: scala.Int | scala.Double = null,
    numberOfTicks: scala.Int | scala.Double = null,
    offset: OffsetFunction = null,
    order: OrderFunction = null,
    renderDecorator: js.Function0[js.Object] = null,
    renderGradient: js.Function1[
      /* props */ reactDashNativeDashSvgDashChartsLib.Anon_Color[T], 
      reactLib.reactMod.Component[
        reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.LinearGradientProps | reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.RadialGradientProps, 
        js.Object, 
        _
      ]
    ] = null,
    showGrid: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    svg: stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.PathProps] = null,
    width: scala.Int | scala.Double = null,
    xAccessor: AccessorFunction[T, scala.Double] = null,
    xScale: ScaleFunction = null,
    yAccessor: AccessorFunction[T, scala.Double] = null,
    yScale: ScaleFunction = null
  ): StackedAreaChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors, data = data, keys = keys)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset)
    if (curve != null) __obj.updateDynamic("curve")(curve)
    if (extras != null) __obj.updateDynamic("extras")(extras)
    if (gridMax != null) __obj.updateDynamic("gridMax")(gridMax.asInstanceOf[js.Any])
    if (gridMin != null) __obj.updateDynamic("gridMin")(gridMin.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (order != null) __obj.updateDynamic("order")(order)
    if (renderDecorator != null) __obj.updateDynamic("renderDecorator")(renderDecorator)
    if (renderGradient != null) __obj.updateDynamic("renderGradient")(renderGradient)
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(xAccessor)
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(yAccessor)
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[StackedAreaChartProps[T]]
  }
}

