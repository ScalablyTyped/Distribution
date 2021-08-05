package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation extends StObject {
  
  /**
    * The TLS validation context trust.
    */
  var trust: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation {
  
  inline def apply(trust: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust): VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation]
  }
  
  extension [Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation](x: Self) {
    
    inline def setTrust(value: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
