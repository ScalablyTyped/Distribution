package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation extends StObject {
  
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
  implicit class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationMutableBuilder[Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrust(value: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
