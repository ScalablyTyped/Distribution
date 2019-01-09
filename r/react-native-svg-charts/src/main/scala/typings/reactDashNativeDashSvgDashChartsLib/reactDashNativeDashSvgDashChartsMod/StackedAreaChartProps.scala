package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedAreaChartProps[T] extends ChartProps[T] {
  var colors: js.Array[java.lang.String]
  var extras: js.UndefOr[js.Array[_]] = js.undefined
  var keys: js.Array[java.lang.String]
  var offset: js.UndefOr[OffsetFunction] = js.undefined
  var order: js.UndefOr[OrderFunction] = js.undefined
  var renderDecorator: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var renderGradient: js.UndefOr[
    js.Function1[
      /* props */ reactDashNativeDashSvgDashChartsLib.Anon_Color[T], 
      reactLib.reactMod.Component[
        reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.LinearGradientProps | reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.RadialGradientProps, 
        js.Object, 
        _
      ]
    ]
  ] = js.undefined
  var showGrid: js.UndefOr[scala.Boolean] = js.undefined
}

