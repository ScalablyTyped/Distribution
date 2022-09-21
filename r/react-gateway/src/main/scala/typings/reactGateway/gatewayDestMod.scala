package typings.reactGateway

import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayDestMod {
  
  @JSImport("react-gateway/GatewayDest", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[GatewayDestProps, js.Object, Any]
  
  type GatewayDest = Component[GatewayDestProps, js.Object, Any]
  
  trait GatewayDestProps extends StObject {
    
    var component: js.UndefOr[String | ComponentType[js.Object]] = js.undefined
    
    var name: String
    
    var tagName: js.UndefOr[String] = js.undefined
  }
  object GatewayDestProps {
    
    inline def apply(name: String): GatewayDestProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayDestProps]
    }
    
    extension [Self <: GatewayDestProps](x: Self) {
      
      inline def setComponent(value: String | ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
