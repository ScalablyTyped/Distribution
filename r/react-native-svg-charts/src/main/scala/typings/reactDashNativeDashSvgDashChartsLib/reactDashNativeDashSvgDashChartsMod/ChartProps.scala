package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps[T] extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var contentInset: js.UndefOr[reactDashNativeDashSvgDashChartsLib.Anon_Bottom] = js.undefined
  var curve: js.UndefOr[d3DashShapeLib.d3DashShapeMod.CurveFactory] = js.undefined
  var data: js.Array[T]
  var gridMax: js.UndefOr[scala.Double] = js.undefined
  var gridMin: js.UndefOr[scala.Double] = js.undefined
  var gridProps: js.UndefOr[GridProps[_]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var numberOfTicks: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var svg: js.UndefOr[stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.PathProps]] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xAccessor: js.UndefOr[AccessorFunction[T, scala.Double]] = js.undefined
  var xScale: js.UndefOr[ScaleFunction] = js.undefined
  var yAccessor: js.UndefOr[AccessorFunction[T, scala.Double]] = js.undefined
  var yScale: js.UndefOr[ScaleFunction] = js.undefined
}

object ChartProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    contentInset: reactDashNativeDashSvgDashChartsLib.Anon_Bottom = null,
    curve: d3DashShapeLib.d3DashShapeMod.CurveFactory = null,
    gridMax: scala.Int | scala.Double = null,
    gridMin: scala.Int | scala.Double = null,
    gridProps: GridProps[_] = null,
    height: scala.Int | scala.Double = null,
    numberOfTicks: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    svg: stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.PathProps] = null,
    width: scala.Int | scala.Double = null,
    xAccessor: AccessorFunction[T, scala.Double] = null,
    xScale: ScaleFunction = null,
    yAccessor: AccessorFunction[T, scala.Double] = null,
    yScale: ScaleFunction = null
  ): ChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset)
    if (curve != null) __obj.updateDynamic("curve")(curve)
    if (gridMax != null) __obj.updateDynamic("gridMax")(gridMax.asInstanceOf[js.Any])
    if (gridMin != null) __obj.updateDynamic("gridMin")(gridMin.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(xAccessor)
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(yAccessor)
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[ChartProps[T]]
  }
}

