package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartProps[T /* <: PieChartData */] extends ChartProps[T] {
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var labelRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var padAngle: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[SortFunction[T]] = js.undefined
  var valueAccessor: js.UndefOr[AccessorFunction[T, scala.Double]] = js.undefined
}

