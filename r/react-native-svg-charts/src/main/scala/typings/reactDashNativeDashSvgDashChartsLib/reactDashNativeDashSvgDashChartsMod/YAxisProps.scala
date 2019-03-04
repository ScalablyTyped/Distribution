package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[reactDashNativeDashSvgDashChartsLib.Anon_BottomTop] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var yAccessor: js.UndefOr[AccessorFunction[T, _]] = js.undefined
}

object YAxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    contentInset: reactDashNativeDashSvgDashChartsLib.Anon_BottomTop = null,
    formatLabel: js.Function2[/* value */ js.Any, /* index */ scala.Double, scala.Double | java.lang.String] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    numberOfTicks: scala.Int | scala.Double = null,
    scale: ScaleFunction = null,
    spacingInner: scala.Int | scala.Double = null,
    spacingOuter: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    svg: stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.TextProps] = null,
    yAccessor: AccessorFunction[T, _] = null
  ): YAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data)
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg)
    if (yAccessor != null) __obj.updateDynamic("yAccessor")(yAccessor)
    __obj.asInstanceOf[YAxisProps[T]]
  }
}

