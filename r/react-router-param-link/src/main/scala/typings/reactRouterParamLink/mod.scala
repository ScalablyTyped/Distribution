package typings.reactRouterParamLink

import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.reactRouterDom.mod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-param-link", "ParamLink")
  @js.native
  class ParamLink protected ()
    extends Component[LinkProps[LocationState], js.Any, js.Any] {
    def this(props: LinkProps[LocationState]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinkProps[LocationState], context: js.Any) = this()
  }
}
