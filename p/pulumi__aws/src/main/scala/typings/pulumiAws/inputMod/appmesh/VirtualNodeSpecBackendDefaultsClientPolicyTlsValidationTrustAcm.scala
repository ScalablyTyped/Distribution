package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm extends StObject {
  
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: Input[js.Array[Input[String]]]
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm {
  
  inline def apply(certificateAuthorityArns: Input[js.Array[Input[String]]]): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm]
  }
  
  extension [Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm](x: Self) {
    
    inline def setCertificateAuthorityArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnsVarargs(value: Input[String]*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value :_*))
  }
}
