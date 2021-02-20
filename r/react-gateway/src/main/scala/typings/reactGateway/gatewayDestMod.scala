package typings.reactGateway

import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayDestMod {
  
  @JSImport("react-gateway/GatewayDest", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[GatewayDestProps, js.Object, js.Any]
  
  type GatewayDest = Component[GatewayDestProps, js.Object, js.Any]
  
  @js.native
  trait GatewayDestProps extends StObject {
    
    var component: js.UndefOr[String | ComponentType[js.Object]] = js.native
    
    var name: String = js.native
    
    var tagName: js.UndefOr[String] = js.native
  }
  object GatewayDestProps {
    
    @scala.inline
    def apply(name: String): GatewayDestProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayDestProps]
    }
    
    @scala.inline
    implicit class GatewayDestPropsMutableBuilder[Self <: GatewayDestProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String | ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
