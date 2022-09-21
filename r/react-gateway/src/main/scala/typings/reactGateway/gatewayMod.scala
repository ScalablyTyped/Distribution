package typings.reactGateway

import typings.react.mod.Component
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
    
    var into: String
  }
  object GatewayProps {
    
    inline def apply(into: String): GatewayProps = {
      val __obj = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayProps]
    }
    
    extension [Self <: GatewayProps](x: Self) {
      
      inline def setInto(value: String): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
    }
  }
}
