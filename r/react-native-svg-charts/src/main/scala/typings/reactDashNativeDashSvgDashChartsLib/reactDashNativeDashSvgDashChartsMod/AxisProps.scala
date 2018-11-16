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

