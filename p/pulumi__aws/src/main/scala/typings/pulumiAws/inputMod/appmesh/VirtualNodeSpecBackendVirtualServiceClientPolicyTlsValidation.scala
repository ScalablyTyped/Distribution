package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation extends StObject {
  
  /**
    * The TLS validation context trust.
    */
  var trust: Input[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust]
}
object VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation {
  
  inline def apply(trust: Input[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust]): VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation]
  }
  
  extension [Self <: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation](x: Self) {
    
    inline def setTrust(value: Input[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust]): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
