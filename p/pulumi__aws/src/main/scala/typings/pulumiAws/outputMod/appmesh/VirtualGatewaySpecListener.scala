package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecListener extends StObject {
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[VirtualGatewaySpecListenerHealthCheck] = js.native
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualGatewaySpecListenerPortMapping = js.native
  
  /**
    * The Transport Layer Security (TLS) properties for the listener
    */
  var tls: js.UndefOr[VirtualGatewaySpecListenerTls] = js.native
}
object VirtualGatewaySpecListener {
  
  @scala.inline
  def apply(portMapping: VirtualGatewaySpecListenerPortMapping): VirtualGatewaySpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListener]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerMutableBuilder[Self <: VirtualGatewaySpecListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: VirtualGatewaySpecListenerHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setPortMapping(value: VirtualGatewaySpecListenerPortMapping): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls(value: VirtualGatewaySpecListenerTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
