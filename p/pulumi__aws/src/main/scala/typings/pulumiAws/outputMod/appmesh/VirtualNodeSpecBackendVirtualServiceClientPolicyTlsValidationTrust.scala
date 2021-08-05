package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust extends StObject {
  
  /**
    * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm] = js.undefined
  
  /**
    * The TLS validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile] = js.undefined
}
object VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust {
  
  inline def apply(): VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust]
  }
  
  extension [Self <: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust](x: Self) {
    
    inline def setAcm(value: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
