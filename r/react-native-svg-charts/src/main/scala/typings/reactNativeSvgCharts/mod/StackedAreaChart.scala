package typings.reactNativeSvgCharts.mod

import typings.react.mod.Component
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
  def extractDataPoints[T](data: js.Array[T], keys: js.Array[/* keyof T */ String]): js.Array[Double] = js.native
  def extractDataPoints[T](data: js.Array[T], keys: js.Array[/* keyof T */ String], order: OrderFunction): js.Array[Double] = js.native
  def extractDataPoints[T](
    data: js.Array[T],
    keys: js.Array[/* keyof T */ String],
    order: OrderFunction,
    offset: OffsetFunction
  ): js.Array[Double] = js.native
}

