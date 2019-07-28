package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import typings.react.reactMod.PureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-svg-charts", "StackedBarChart")
@js.native
class StackedBarChart[T] ()
  extends PureComponent[StackedBarChartProps[T], js.Object, js.Any]

/* static members */
@JSImport("react-native-svg-charts", "StackedBarChart")
@js.native
object StackedBarChart extends js.Object {
  def extractDataPoints[T](data: T, keys: js.Array[String]): js.Array[Double] = js.native
  def extractDataPoints[T](data: T, keys: js.Array[String], order: OrderFunction): js.Array[Double] = js.native
  def extractDataPoints[T](data: T, keys: js.Array[String], order: OrderFunction, offset: OffsetFunction): js.Array[Double] = js.native
}

