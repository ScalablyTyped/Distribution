package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import typings.d3DashShape.d3DashShapeMod.CurveFactory
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.PathProps
import typings.reactDashNativeDashSvgDashCharts.Anon_Bottom
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var contentInset: js.UndefOr[Anon_Bottom] = js.undefined
  var curve: js.UndefOr[CurveFactory] = js.undefined
  var data: js.Array[T]
  var gridMax: js.UndefOr[Double] = js.undefined
  var gridMin: js.UndefOr[Double] = js.undefined
  var gridProps: js.UndefOr[GridProps[_]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var numberOfTicks: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var svg: js.UndefOr[Partial[PathProps]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
  var xMax: js.UndefOr[Double] = js.undefined
  var xMin: js.UndefOr[Double] = js.undefined
  var xScale: js.UndefOr[ScaleFunction] = js.undefined
  var yAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
  var yMax: js.UndefOr[Double] = js.undefined
  var yMin: js.UndefOr[Double] = js.undefined
  var yScale: js.UndefOr[ScaleFunction] = js.undefined
}

object ChartProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    contentInset: Anon_Bottom = null,
    curve: CurveFactory = null,
    gridMax: Int | Double = null,
    gridMin: Int | Double = null,
    gridProps: GridProps[_] = null,
    height: Int | Double = null,
    numberOfTicks: Int | Double = null,
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
    if (xMax != null) __obj.updateDynamic("xMax")(xMax.asInstanceOf[js.Any])
    if (xMin != null) __obj.updateDynamic("xMin")(xMin.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale)
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(yAccessor)
    if (yMax != null) __obj.updateDynamic("yMax")(yMax.asInstanceOf[js.Any])
    if (yMin != null) __obj.updateDynamic("yMin")(yMin.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale)
    __obj.asInstanceOf[ChartProps[T]]
  }
}

