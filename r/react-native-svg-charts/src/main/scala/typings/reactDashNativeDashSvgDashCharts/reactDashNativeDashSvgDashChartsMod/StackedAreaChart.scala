package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-svg-charts", "StackedAreaChart")
@js.native
class StackedAreaChart[T] ()
  extends Component[StackedAreaChartProps[T], js.Object, js.Any]

/* static members */
@JSImport("react-native-svg-charts", "StackedAreaChart")
@js.native
object StackedAreaChart extends js.Object {
  def extractDataPoints[T](data: js.Array[T], keys: js.Array[String]): js.Array[Double] = js.native
  def extractDataPoints[T](data: js.Array[T], keys: js.Array[String], order: OrderFunction): js.Array[Double] = js.native
  def extractDataPoints[T](data: js.Array[T], keys: js.Array[String], order: OrderFunction, offset: OffsetFunction): js.Array[Double] = js.native
}

