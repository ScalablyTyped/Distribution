package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListener extends StObject {
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[Input[VirtualNodeSpecListenerHealthCheck]] = js.undefined
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: Input[VirtualNodeSpecListenerPortMapping]
  
  /**
    * Timeouts for different protocols.
    */
  var timeout: js.UndefOr[Input[VirtualNodeSpecListenerTimeout]] = js.undefined
  
  /**
    * The Transport Layer Security (TLS) properties for the listener
    */
  var tls: js.UndefOr[Input[VirtualNodeSpecListenerTls]] = js.undefined
}
object VirtualNodeSpecListener {
  
  inline def apply(portMapping: Input[VirtualNodeSpecListenerPortMapping]): VirtualNodeSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListener]
  }
  
  extension [Self <: VirtualNodeSpecListener](x: Self) {
    
    inline def setHealthCheck(value: Input[VirtualNodeSpecListenerHealthCheck]): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setPortMapping(value: Input[VirtualNodeSpecListenerPortMapping]): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Input[VirtualNodeSpecListenerTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTls(value: Input[VirtualNodeSpecListenerTls]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
