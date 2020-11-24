package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.reactMdPortal.conditionalPortalMod.ConditionalPortalProps
import typings.reactMdPortal.portalMod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/portal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object ConditionalPortal extends js.Object {
    
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
    
    def apply(hasIntoIntoIdChildren: PortalProps): ReactElement | Null = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var into: js.Any = js.native
      
      var intoId: js.Any = js.native
    }
  }
}
