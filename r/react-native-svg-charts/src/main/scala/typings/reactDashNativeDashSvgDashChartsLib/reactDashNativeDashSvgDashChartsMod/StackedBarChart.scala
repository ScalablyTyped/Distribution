package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-svg-charts", "StackedBarChart")
@js.native
class StackedBarChart[T] ()
  extends reactLib.reactMod.PureComponent[StackedBarChartProps[T], js.Object, js.Any]

/* static members */
@JSImport("react-native-svg-charts", "StackedBarChart")
@js.native
object StackedBarChart extends js.Object {
  def extractDataPoints[T](data: T, keys: js.Array[java.lang.String]): js.Array[scala.Double] = js.native
  def extractDataPoints[T](
    data: T,
    keys: js.Array[java.lang.String],
    order: reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod.OrderFunction
  ): js.Array[scala.Double] = js.native
  def extractDataPoints[T](
    data: T,
    keys: js.Array[java.lang.String],
    order: reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod.OrderFunction,
    offset: reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod.OffsetFunction
  ): js.Array[scala.Double] = js.native
}

