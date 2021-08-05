package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecListener extends StObject {
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[VirtualGatewaySpecListenerHealthCheck] = js.undefined
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualGatewaySpecListenerPortMapping
  
  /**
    * The Transport Layer Security (TLS) properties for the listener
    */
  var tls: js.UndefOr[VirtualGatewaySpecListenerTls] = js.undefined
}
object VirtualGatewaySpecListener {
  
  inline def apply(portMapping: VirtualGatewaySpecListenerPortMapping): VirtualGatewaySpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListener]
  }
  
  extension [Self <: VirtualGatewaySpecListener](x: Self) {
    
    inline def setHealthCheck(value: VirtualGatewaySpecListenerHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setPortMapping(value: VirtualGatewaySpecListenerPortMapping): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    inline def setTls(value: VirtualGatewaySpecListenerTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
