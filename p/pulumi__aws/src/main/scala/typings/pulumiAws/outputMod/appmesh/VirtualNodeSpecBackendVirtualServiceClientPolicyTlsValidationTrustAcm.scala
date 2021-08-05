package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm extends StObject {
  
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: js.Array[String]
}
object VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm {
  
  inline def apply(certificateAuthorityArns: js.Array[String]): VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm]
  }
  
  extension [Self <: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm](x: Self) {
    
    inline def setCertificateAuthorityArns(value: js.Array[String]): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnsVarargs(value: String*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value :_*))
  }
}
