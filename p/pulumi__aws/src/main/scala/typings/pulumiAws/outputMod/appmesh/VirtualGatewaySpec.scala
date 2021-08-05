package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpec extends StObject {
  
  /**
    * The defaults for backends.
    */
  var backendDefaults: js.UndefOr[VirtualGatewaySpecBackendDefaults] = js.undefined
  
  /**
    * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
    */
  var listener: VirtualGatewaySpecListener
  
  /**
    * The inbound and outbound access logging information for the virtual gateway.
    */
  var logging: js.UndefOr[VirtualGatewaySpecLogging] = js.undefined
}
object VirtualGatewaySpec {
  
  inline def apply(listener: VirtualGatewaySpecListener): VirtualGatewaySpec = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpec]
  }
  
  extension [Self <: VirtualGatewaySpec](x: Self) {
    
    inline def setBackendDefaults(value: VirtualGatewaySpecBackendDefaults): Self = StObject.set(x, "backendDefaults", value.asInstanceOf[js.Any])
    
    inline def setBackendDefaultsUndefined: Self = StObject.set(x, "backendDefaults", js.undefined)
    
    inline def setListener(value: VirtualGatewaySpecListener): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setLogging(value: VirtualGatewaySpecLogging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
  }
}
