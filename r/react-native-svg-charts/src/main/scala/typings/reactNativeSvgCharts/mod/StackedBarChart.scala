package typings.reactNativeSvgCharts.mod

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-svg-charts", "StackedBarChart")
@js.native
class StackedBarChart[T] protected ()
  extends PureComponent[StackedBarChartProps[T], js.Object, js.Any] {
  def this(props: StackedBarChartProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: StackedBarChartProps[T], context: js.Any) = this()
}
/* static members */
object StackedBarChart {
  
  @JSImport("react-native-svg-charts", "StackedBarChart")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extractDataPoints[T](data: T, keys: js.Array[/* keyof T */ String]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataPoints")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def extractDataPoints[T](data: T, keys: js.Array[/* keyof T */ String], order: Unit, offset: OffsetFunction): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataPoints")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], order.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def extractDataPoints[T](data: T, keys: js.Array[/* keyof T */ String], order: OrderFunction): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataPoints")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def extractDataPoints[T](data: T, keys: js.Array[/* keyof T */ String], order: OrderFunction, offset: OffsetFunction): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataPoints")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], order.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
