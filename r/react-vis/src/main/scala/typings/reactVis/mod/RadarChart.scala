package typings.reactVis.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-vis", "RadarChart")
@js.native
open class RadarChart[T] protected ()
  extends Component[RadarChartProps & T, js.Object, Any] {
  def this(props: RadarChartProps & T) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: RadarChartProps & T, context: Any) = this()
}
