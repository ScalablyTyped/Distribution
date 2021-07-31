package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm extends StObject {
  
  /**
    * One or more ACM Amazon Resource Name (ARN)s.
    */
  var certificateAuthorityArns: js.Array[String]
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm {
  
  @scala.inline
  def apply(certificateAuthorityArns: js.Array[String]): VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm = {
    val __obj = js.Dynamic.literal(certificateAuthorityArns = certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcmMutableBuilder[Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArns(value: js.Array[String]): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnsVarargs(value: String*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value :_*))
  }
}
