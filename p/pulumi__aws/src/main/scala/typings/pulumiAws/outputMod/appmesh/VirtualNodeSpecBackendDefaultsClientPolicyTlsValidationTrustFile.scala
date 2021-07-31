package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile extends StObject {
  
  /**
    * The certificate chain for the certificate. Must be between 1 and 255 characters in length.
    */
  var certificateChain: String
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile {
  
  @scala.inline
  def apply(certificateChain: String): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileMutableBuilder[Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
  }
}
