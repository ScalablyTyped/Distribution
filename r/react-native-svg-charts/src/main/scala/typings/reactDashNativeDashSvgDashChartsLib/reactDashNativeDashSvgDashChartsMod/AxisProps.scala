package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisProps[T] extends js.Object {
  var data: js.Array[T]
  var formatLabel: js.UndefOr[
    js.Function2[/* value */ js.Any, /* index */ scala.Double, scala.Double | java.lang.String]
  ] = js.undefined
  var numberOfTicks: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[ScaleFunction] = js.undefined
  var spacingInner: js.UndefOr[scala.Double] = js.undefined
  var spacingOuter: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var svg: js.UndefOr[stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.TextProps]] = js.undefined
}

object AxisProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    formatLabel: js.Function2[/* value */ js.Any, /* index */ scala.Double, scala.Double | java.lang.String] = null,
    numberOfTicks: scala.Int | scala.Double = null,
    scale: ScaleFunction = null,
    spacingInner: scala.Int | scala.Double = null,
    spacingOuter: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    svg: stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.TextProps] = null
  ): AxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel)
    if (numberOfTicks != null) __obj.updateDynamic("numberOfTicks")(numberOfTicks.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (spacingInner != null) __obj.updateDynamic("spacingInner")(spacingInner.asInstanceOf[js.Any])
    if (spacingOuter != null) __obj.updateDynamic("spacingOuter")(spacingOuter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg)
    __obj.asInstanceOf[AxisProps[T]]
  }
}

