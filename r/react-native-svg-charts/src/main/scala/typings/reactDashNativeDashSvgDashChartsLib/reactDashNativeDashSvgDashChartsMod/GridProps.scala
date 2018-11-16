package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GridProps[T] extends js.Object {
  var belowChart: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[GridDirection] = js.undefined
  var svg: js.UndefOr[stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.LineProps]] = js.undefined
  var ticks: js.UndefOr[js.Array[T]] = js.undefined
  var x: js.UndefOr[js.Function1[/* t */ T, scala.Double]] = js.undefined
  var y: js.UndefOr[js.Function1[/* t */ T, scala.Double]] = js.undefined
}

