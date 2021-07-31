package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaults extends StObject {
  
  /**
    * The default client policy for virtual gateway backends.
    */
  var clientPolicy: js.UndefOr[VirtualGatewaySpecBackendDefaultsClientPolicy] = js.undefined
}
object VirtualGatewaySpecBackendDefaults {
  
  @scala.inline
  def apply(): VirtualGatewaySpecBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaults]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsMutableBuilder[Self <: VirtualGatewaySpecBackendDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientPolicy(value: VirtualGatewaySpecBackendDefaultsClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
  }
}
