package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm extends StObject {
  
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: js.Array[String]
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm {
  
  inline def apply(certificateAuthorityArns: js.Array[String]): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm]
  }
  
  extension [Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm](x: Self) {
    
    inline def setCertificateAuthorityArns(value: js.Array[String]): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnsVarargs(value: String*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value :_*))
  }
}
