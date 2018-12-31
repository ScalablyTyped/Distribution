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

