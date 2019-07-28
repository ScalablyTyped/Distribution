package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.TextProps
import typings.reactDashNativeDashSvgDashCharts.Anon_Left
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[Anon_Left] = js.undefined
  var xAccessor: js.UndefOr[AccessorFunction[T, _]] = js.undefined
}

object XAxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    contentInset: Anon_Left = null,
    formatLabel: (/* value */ js.Any, /* index */ Double) => Double | String = null,
    numberOfTicks: Int | Double = null,
    scale: ScaleFunction = null,
    spacingInner: Int | Double = null,
    spacingOuter: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    svg: Partial[TextProps] = null,
    xAccessor: AccessorFunction[T, _] = null
  ): XAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data)
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg)
    if (xAccessor != null) __obj.updateDynamic("xAccessor")(xAccessor)
    __obj.asInstanceOf[XAxisProps[T]]
  }
}

