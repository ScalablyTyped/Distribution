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

trait PieChartProps[T /* <: PieChartData */] extends ChartProps[T] {
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  var labelRadius: js.UndefOr[Double | String] = js.undefined
  var outerRadius: js.UndefOr[Double | String] = js.undefined
  var padAngle: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[SortFunction[T]] = js.undefined
  var valueAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
}

object PieChartProps {
  @scala.inline
  def apply[/* <: typings.reactNativeSvgCharts.mod.PieChartData */ T](
    data: js.Array[T],
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    contentInset: Bottom = null,
    curve: /* context */ CanvasRenderingContext2D | Path_ => CurveGenerator = null,
    gridMax: js.UndefOr[Double] = js.undefined,
    gridMin: js.UndefOr[Double] = js.undefined,
    gridProps: GridProps[_] = null,
    height: js.UndefOr[Double] = js.undefined,
    innerRadius: Double | String = null,
    labelRadius: Double | String = null,
    numberOfTicks: js.UndefOr[Double] = js.undefined,
    outerRadius: Double | String = null,
    padAngle: js.UndefOr[Double] = js.undefined,
    sort: (T, T) => Double = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    svg: PartialPathProps = null,
    valueAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    width: js.UndefOr[Double] = js.undefined,
    xAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    xMax: js.UndefOr[Double] = js.undefined,
    xMin: js.UndefOr[Double] = js.undefined,
    xScale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null,
    yAccessor: /* props */ AccessorFunctionProps[T] => Double = null,
    yMax: js.UndefOr[Double] = js.undefined,
    yMin: js.UndefOr[Double] = js.undefined,
    yScale: () => (ScaleType[js.Any, js.Any]) | ScaleBand_[js.Any] = null
  ): PieChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(js.Any.fromFunction1(curve))
    if (!js.isUndefined(gridMax)) __obj.updateDynamic("gridMax")(gridMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridMin)) __obj.updateDynamic("gridMin")(gridMin.get.asInstanceOf[js.Any])
    if (gridProps != null) __obj.updateDynamic("gridProps")(gridProps.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (labelRadius != null) __obj.updateDynamic("labelRadius")(labelRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfTicks)) __obj.updateDynamic("numberOfTicks")(numberOfTicks.get.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(padAngle)) __obj.updateDynamic("padAngle")(padAngle.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (valueAccessor != null) __obj.updateDynamic("valueAccessor")(js.Any.fromFunction1(valueAccessor))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(js.Any.fromFunction1(xAccessor))
    if (!js.isUndefined(xMax)) __obj.updateDynamic("xMax")(xMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xMin)) __obj.updateDynamic("xMin")(xMin.get.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(js.Any.fromFunction0(xScale))
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(js.Any.fromFunction1(yAccessor))
    if (!js.isUndefined(yMax)) __obj.updateDynamic("yMax")(yMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yMin)) __obj.updateDynamic("yMin")(yMin.get.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(js.Any.fromFunction0(yScale))
    __obj.asInstanceOf[PieChartProps[T]]
  }
}

