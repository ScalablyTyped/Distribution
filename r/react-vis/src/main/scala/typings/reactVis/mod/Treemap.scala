package typings.reactVis.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-vis", "Treemap")
@js.native
open class Treemap[T] protected ()
  extends Component[TreemapProps & T, js.Object, Any] {
  def this(props: TreemapProps & T) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: TreemapProps & T, context: Any) = this()
}
