package typings.reactNativeSvgCharts.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-svg-charts", "StackedBarChart")
@js.native
class StackedBarChart[T] ()
  extends Component[StackedBarChartProps[T], js.Object, js.Any]
/* static members */
@JSImport("react-native-svg-charts", "StackedBarChart")
@js.native
object StackedBarChart extends js.Object {
  
  def extractDataPoints[T](data: T, keys: js.Array[/* keyof T */ String]): js.Array[Double] = js.native
  def extractDataPoints[T](
    data: T,
    keys: js.Array[/* keyof T */ String],
    order: js.UndefOr[scala.Nothing],
    offset: OffsetFunction
  ): js.Array[Double] = js.native
  def extractDataPoints[T](data: T, keys: js.Array[/* keyof T */ String], order: OrderFunction): js.Array[Double] = js.native
  def extractDataPoints[T](data: T, keys: js.Array[/* keyof T */ String], order: OrderFunction, offset: OffsetFunction): js.Array[Double] = js.native
}
