package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaults extends StObject {
  
  /**
    * The default client policy for virtual gateway backends.
    */
  var clientPolicy: js.UndefOr[Input[VirtualGatewaySpecBackendDefaultsClientPolicy]] = js.undefined
}
object VirtualGatewaySpecBackendDefaults {
  
  inline def apply(): VirtualGatewaySpecBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaults]
  }
  
  extension [Self <: VirtualGatewaySpecBackendDefaults](x: Self) {
    
    inline def setClientPolicy(value: Input[VirtualGatewaySpecBackendDefaultsClientPolicy]): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
  }
}
