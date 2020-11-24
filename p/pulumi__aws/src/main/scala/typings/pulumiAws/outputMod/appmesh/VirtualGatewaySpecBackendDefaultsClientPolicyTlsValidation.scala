package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation extends js.Object {
  
  /**
    * The TLS validation context trust.
    */
  var trust: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust = js.native
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation {
  
  @scala.inline
  def apply(trust: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust): VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationOps[Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation] (val x: Self) extends AnyVal {
    
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
    def setTrust(value: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust): Self = this.set("trust", value.asInstanceOf[js.Any])
  }
}
