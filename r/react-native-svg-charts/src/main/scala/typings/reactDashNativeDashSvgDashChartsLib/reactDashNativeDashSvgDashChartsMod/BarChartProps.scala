package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarChartProps[T] extends ChartProps[T] {
  var spacingInner: js.UndefOr[scala.Double] = js.undefined
  var spacingOuter: js.UndefOr[scala.Double] = js.undefined
}

object BarChartProps {
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
    spacingInner: scala.Int | scala.Double = null,
    spacingOuter: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    svg: stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.PathProps] = null,
    width: scala.Int | scala.Double = null,
    xAccessor: AccessorFunction[T, scala.Double] = null,
    xMax: scala.Int | scala.Double = null,
    xMin: scala.Int | scala.Double = null,
    xScale: ScaleFunction = null,
    yAccessor: AccessorFunction[T, scala.Double] = null,
    yMax: scala.Int | scala.Double = null,
    yMin: scala.Int | scala.Double = null,
    yScale: ScaleFunction = null
  ): BarChartProps[T] = {
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
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[BarChartProps[T]]
  }
}

