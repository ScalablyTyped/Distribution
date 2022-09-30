package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod {
  
  @JSImport("react-toolbox/components/hoc/Portal", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PortalProps, js.Object, Any]
  
  type Portal = Component[PortalProps, js.Object, Any]
  
  trait PortalProps
    extends StObject
       with Props {
    
    var container: js.UndefOr[Any] = js.undefined
    
    var lockBody: js.UndefOr[Boolean] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setLockBody(value: Boolean): Self = StObject.set(x, "lockBody", value.asInstanceOf[js.Any])
      
      inline def setLockBodyUndefined: Self = StObject.set(x, "lockBody", js.undefined)
    }
  }
}
