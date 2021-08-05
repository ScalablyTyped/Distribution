package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm extends StObject {
  
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: Input[js.Array[Input[String]]]
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm {
  
  inline def apply(certificateAuthorityArns: Input[js.Array[Input[String]]]): VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm]
  }
  
  extension [Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm](x: Self) {
    
    inline def setCertificateAuthorityArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnsVarargs(value: Input[String]*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value :_*))
  }
}
