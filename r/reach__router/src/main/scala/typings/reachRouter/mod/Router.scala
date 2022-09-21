package typings.reachRouter.mod

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@reach/router", "Router")
@js.native
open class Router protected ()
  extends Component[RouterProps & HTMLProps[HTMLDivElement], js.Object, Any] {
  def this(props: RouterProps & HTMLProps[HTMLDivElement]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: RouterProps & HTMLProps[HTMLDivElement], context: Any) = this()
}
