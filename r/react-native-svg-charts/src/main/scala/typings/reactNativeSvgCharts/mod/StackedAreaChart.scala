package typings.reactNativeSvgCharts.mod

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-svg-charts", "StackedAreaChart")
@js.native
open class StackedAreaChart[T] protected ()
  extends PureComponent[StackedAreaChartProps[T], js.Object, Any] {
  def this(props: StackedAreaChartProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: StackedAreaChartProps[T], context: Any) = this()
}
/* static members */
object StackedAreaChart {
  
  @JSImport("react-native-svg-charts", "StackedAreaChart")
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractDataPoints[T](data: js.Array[T], keys: js.Array[/* keyof T */ String]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataPoints")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def extractDataPoints[T](data: js.Array[T], keys: js.Array[/* keyof T */ String], order: Unit, offset: OffsetFunction): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataPoints")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], order.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def extractDataPoints[T](data: js.Array[T], keys: js.Array[/* keyof T */ String], order: OrderFunction): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataPoints")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def extractDataPoints[T](
    data: js.Array[T],
    keys: js.Array[/* keyof T */ String],
    order: OrderFunction,
    offset: OffsetFunction
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataPoints")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], order.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
