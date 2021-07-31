package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile extends StObject {
  
  /**
    * The certificate chain for the certificate. Must be between 1 and 255 characters in length.
    */
  var certificateChain: Input[String]
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile {
  
  @scala.inline
  def apply(certificateChain: Input[String]): VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFileMutableBuilder[Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
  }
}
