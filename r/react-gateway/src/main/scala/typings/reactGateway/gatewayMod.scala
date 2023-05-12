package typings.reactGateway

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayMod {
  
  @JSImport("react-gateway/Gateway", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[GatewayProps, js.Object, Any]
  
  type Gateway = Component[GatewayProps, js.Object, Any]
  
  trait GatewayProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var into: String
  }
  object GatewayProps {
    
    inline def apply(into: String): GatewayProps = {
      val __obj = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GatewayProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInto(value: String): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
    }
  }
}
