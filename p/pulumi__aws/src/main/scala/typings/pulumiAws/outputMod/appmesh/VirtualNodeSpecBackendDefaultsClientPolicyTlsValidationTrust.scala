package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust extends StObject {
  
  /**
    * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm] = js.undefined
  
  /**
    * The TLS validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile] = js.undefined
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust {
  
  inline def apply(): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust]
  }
  
  extension [Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust](x: Self) {
    
    inline def setAcm(value: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
