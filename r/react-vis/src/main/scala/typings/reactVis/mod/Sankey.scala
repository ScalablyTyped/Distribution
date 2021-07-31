package typings.reactVis.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-vis", "Sankey")
@js.native
class Sankey[T] protected ()
  extends Component[SankeyProps & T, js.Object, js.Any] {
  def this(props: SankeyProps & T) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SankeyProps & T, context: js.Any) = this()
}
