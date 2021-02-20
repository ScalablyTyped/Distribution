package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListener extends StObject {
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[Input[VirtualNodeSpecListenerHealthCheck]] = js.native
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: Input[VirtualNodeSpecListenerPortMapping] = js.native
  
  /**
    * Timeouts for different protocols.
    */
  var timeout: js.UndefOr[Input[VirtualNodeSpecListenerTimeout]] = js.native
  
  /**
    * The Transport Layer Security (TLS) properties for the listener
    */
  var tls: js.UndefOr[Input[VirtualNodeSpecListenerTls]] = js.native
}
object VirtualNodeSpecListener {
  
  @scala.inline
  def apply(portMapping: Input[VirtualNodeSpecListenerPortMapping]): VirtualNodeSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListener]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerMutableBuilder[Self <: VirtualNodeSpecListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: Input[VirtualNodeSpecListenerHealthCheck]): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setPortMapping(value: Input[VirtualNodeSpecListenerPortMapping]): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Input[VirtualNodeSpecListenerTimeout]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTls(value: Input[VirtualNodeSpecListenerTls]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
