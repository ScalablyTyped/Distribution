package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import typings.d3DashScale.d3DashScaleMod.ScaleBand
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.TextProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisProps[T] extends js.Object {
  var data: js.Array[T]
  var formatLabel: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ Double, Double | String]] = js.undefined
  var numberOfTicks: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[ScaleFunction] = js.undefined
  var spacingInner: js.UndefOr[Double] = js.undefined
  var spacingOuter: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var svg: js.UndefOr[Partial[TextProps]] = js.undefined
}

object AxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    formatLabel: (/* value */ js.Any, /* index */ Double) => Double | String = null,
    numberOfTicks: Int | Double = null,
    scale: () => (ScaleType[js.Any, js.Any]) | ScaleBand[js.Any] = null,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    svg: Partial[TextProps] = null
  ): AxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction0(scale))
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg)
    __obj.asInstanceOf[AxisProps[T]]
  }
}

