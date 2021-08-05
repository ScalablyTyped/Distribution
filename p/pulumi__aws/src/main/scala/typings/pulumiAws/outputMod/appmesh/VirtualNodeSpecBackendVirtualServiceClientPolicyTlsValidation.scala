package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation extends StObject {
  
  /**
    * The TLS validation context trust.
    */
  var trust: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust
}
object VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation {
  
  inline def apply(trust: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust): VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation]
  }
  
  extension [Self <: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation](x: Self) {
    
    inline def setTrust(value: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
