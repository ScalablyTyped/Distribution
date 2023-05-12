package typings.reactVis.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-vis", "XYPlot")
@js.native
open class XYPlot[T] protected ()
  extends Component[XYPlotProps & T, js.Object, Any] {
  def this(props: XYPlotProps & T) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: XYPlotProps & T, context: Any) = this()
}
