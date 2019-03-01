package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[reactDashNativeDashSvgDashChartsLib.Anon_Left] = js.undefined
  var xAccessor: js.UndefOr[AccessorFunction[T, _]] = js.undefined
}

object XAxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    contentInset: reactDashNativeDashSvgDashChartsLib.Anon_Left = null,
    formatLabel: js.Function2[/* value */ js.Any, /* index */ scala.Double, scala.Double | java.lang.String] = null,
    numberOfTicks: scala.Int | scala.Double = null,
    scale: ScaleFunction = null,
    spacingInner: scala.Int | scala.Double = null,
    spacingOuter: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    svg: stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.TextProps] = null,
    xAccessor: AccessorFunction[T, _] = null
  ): XAxisProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel)
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

