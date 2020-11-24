package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation extends js.Object {
  
  /**
    * The TLS validation context trust.
    */
  var trust: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust = js.native
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation {
  
  @scala.inline
  def apply(trust: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationOps[Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation] (val x: Self) extends AnyVal {
    
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
    def setTrust(value: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust): Self = this.set("trust", value.asInstanceOf[js.Any])
  }
}
