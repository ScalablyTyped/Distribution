package typings.reactVis.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-vis", "Sunburst")
@js.native
open class Sunburst[T] protected ()
  extends Component[SunburstProps & T, js.Object, Any] {
  def this(props: SunburstProps & T) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SunburstProps & T, context: Any) = this()
}
