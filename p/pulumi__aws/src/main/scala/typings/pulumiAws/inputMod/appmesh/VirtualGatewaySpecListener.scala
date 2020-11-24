package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecListener extends js.Object {
  
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[Input[VirtualGatewaySpecListenerHealthCheck]] = js.native
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: Input[VirtualGatewaySpecListenerPortMapping] = js.native
  
  /**
    * The Transport Layer Security (TLS) properties for the listener
    */
  var tls: js.UndefOr[Input[VirtualGatewaySpecListenerTls]] = js.native
}
object VirtualGatewaySpecListener {
  
  @scala.inline
  def apply(portMapping: Input[VirtualGatewaySpecListenerPortMapping]): VirtualGatewaySpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListener]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerOps[Self <: VirtualGatewaySpecListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPortMapping(value: Input[VirtualGatewaySpecListenerPortMapping]): Self = this.set("portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheck(value: Input[VirtualGatewaySpecListenerHealthCheck]): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    
    @scala.inline
    def setTls(value: Input[VirtualGatewaySpecListenerTls]): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
}
