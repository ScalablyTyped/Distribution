package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation extends js.Object {
  
  /**
    * The TLS validation context trust.
    */
  var trust: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust = js.native
}
object VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation {
  
  @scala.inline
  def apply(trust: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust): VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationOps[Self <: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation] (val x: Self) extends AnyVal {
    
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
    def setTrust(value: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust): Self = this.set("trust", value.asInstanceOf[js.Any])
  }
}
