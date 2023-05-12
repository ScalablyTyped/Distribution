package typings.reactVis.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-vis", "Sankey")
@js.native
open class Sankey[T] protected ()
  extends Component[SankeyProps & T, js.Object, Any] {
  def this(props: SankeyProps & T) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: SankeyProps & T, context: Any) = this()
}
