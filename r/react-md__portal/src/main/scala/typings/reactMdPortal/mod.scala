package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.reactMdPortal.conditionalPortalMod.ConditionalPortalProps
import typings.reactMdPortal.portalMod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/portal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object ConditionalPortal extends js.Object {
    /**
      * This is a very simple component that is used in other places within react-md
      * to conditionally render the children within a portal or not based on general
      * portal config props.
      */
    def apply(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): ReactElement | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: js.Any = js.native
      var portal: js.Any = js.native
      var portalInto: js.Any = js.native
      var portalIntoId: js.Any = js.native
    }
    
  }
  
  @js.native
  object Portal extends js.Object {
    /**
      * This component is a simple wrapper for the `createPortal` API from ReactDOM
      * that will just ensure that `null` is always returned for server side
      * rendering as well as a "nice" way to choose specific portal targets or just
      * falling back to the `document.body`.
      */
    def apply(hasIntoIntoIdChildren: PortalProps): ReactElement | Null = js.native
    @js.native
    object propTypes extends js.Object {
      var children: js.Any = js.native
      var into: js.Any = js.native
      var intoId: js.Any = js.native
    }
    
  }
  
}

