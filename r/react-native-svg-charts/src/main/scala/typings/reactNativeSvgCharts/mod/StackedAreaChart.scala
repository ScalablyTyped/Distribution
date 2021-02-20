package typings.reactNativeSvgCharts.mod

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-svg-charts", "StackedAreaChart")
@js.native
class StackedAreaChart[T] protected ()
  extends PureComponent[StackedAreaChartProps[T], js.Object, js.Any] {
  def this(props: StackedAreaChartProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: StackedAreaChartProps[T], context: js.Any) = this()
}
/* static members */
object StackedAreaChart {
  
  @JSImport("react-native-svg-charts", "StackedAreaChart.extractDataPoints")
  @js.native
  def extractDataPoints[T](data: js.Array[T], keys: js.Array[/* keyof T */ String]): js.Array[Double] = js.native
  @JSImport("react-native-svg-charts", "StackedAreaChart.extractDataPoints")
  @js.native
  def extractDataPoints[T](
    data: js.Array[T],
    keys: js.Array[/* keyof T */ String],
    order: js.UndefOr[scala.Nothing],
    offset: OffsetFunction
  ): js.Array[Double] = js.native
  @JSImport("react-native-svg-charts", "StackedAreaChart.extractDataPoints")
  @js.native
  def extractDataPoints[T](data: js.Array[T], keys: js.Array[/* keyof T */ String], order: OrderFunction): js.Array[Double] = js.native
  @JSImport("react-native-svg-charts", "StackedAreaChart.extractDataPoints")
  @js.native
  def extractDataPoints[T](
    data: js.Array[T],
    keys: js.Array[/* keyof T */ String],
    order: OrderFunction,
    offset: OffsetFunction
  ): js.Array[Double] = js.native
}
