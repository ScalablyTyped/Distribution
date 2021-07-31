package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecListener extends StObject {
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[Input[VirtualGatewaySpecListenerHealthCheck]] = js.undefined
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: Input[VirtualGatewaySpecListenerPortMapping]
  
  /**
    * The Transport Layer Security (TLS) properties for the listener
    */
  var tls: js.UndefOr[Input[VirtualGatewaySpecListenerTls]] = js.undefined
}
object VirtualGatewaySpecListener {
  
  @scala.inline
  def apply(portMapping: Input[VirtualGatewaySpecListenerPortMapping]): VirtualGatewaySpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListener]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerMutableBuilder[Self <: VirtualGatewaySpecListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: Input[VirtualGatewaySpecListenerHealthCheck]): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setPortMapping(value: Input[VirtualGatewaySpecListenerPortMapping]): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls(value: Input[VirtualGatewaySpecListenerTls]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
