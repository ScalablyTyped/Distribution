package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation extends StObject {
  
  /**
    * The TLS validation context trust.
    */
  var trust: Input[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust]
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation {
  
  inline def apply(trust: Input[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust]): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation]
  }
  
  extension [Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation](x: Self) {
    
    inline def setTrust(value: Input[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust]): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
