package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListener extends js.Object {
  
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
  implicit class VirtualNodeSpecListenerOps[Self <: VirtualNodeSpecListener] (val x: Self) extends AnyVal {
    
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
    def setPortMapping(value: Input[VirtualNodeSpecListenerPortMapping]): Self = this.set("portMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheck(value: Input[VirtualNodeSpecListenerHealthCheck]): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[VirtualNodeSpecListenerTimeout]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTls(value: Input[VirtualNodeSpecListenerTls]): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
}
