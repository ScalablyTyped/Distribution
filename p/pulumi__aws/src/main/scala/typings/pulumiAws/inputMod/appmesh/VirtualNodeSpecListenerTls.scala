package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTls extends js.Object {
  
  /**
    * The listener's TLS certificate.
    */
  var certificate: Input[VirtualNodeSpecListenerTlsCertificate] = js.native
  
  /**
    * The listener's TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
    */
  var mode: Input[String] = js.native
}
object VirtualNodeSpecListenerTls {
  
  @scala.inline
  def apply(certificate: Input[VirtualNodeSpecListenerTlsCertificate], mode: Input[String]): VirtualNodeSpecListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerTls]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTlsOps[Self <: VirtualNodeSpecListenerTls] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: Input[VirtualNodeSpecListenerTlsCertificate]): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Input[String]): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
