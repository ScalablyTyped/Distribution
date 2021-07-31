package typings.reactGateway

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayMod {
  
  @JSImport("react-gateway/Gateway", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[GatewayProps, js.Object, js.Any]
  
  type Gateway = Component[GatewayProps, js.Object, js.Any]
  
  trait GatewayProps extends StObject {
    
    var into: String
  }
  object GatewayProps {
    
    @scala.inline
    def apply(into: String): GatewayProps = {
      val __obj = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayProps]
    }
    
    @scala.inline
    implicit class GatewayPropsMutableBuilder[Self <: GatewayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInto(value: String): Self = StObject.set(x, "into", value.asInstanceOf[js.Any])
    }
  }
}
