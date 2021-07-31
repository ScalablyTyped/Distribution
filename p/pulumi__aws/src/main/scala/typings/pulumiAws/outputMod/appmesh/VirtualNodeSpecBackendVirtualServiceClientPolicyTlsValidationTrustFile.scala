package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile extends StObject {
  
  /**
    * The certificate chain for the certificate. Must be between 1 and 255 characters in length.
    */
  var certificateChain: String
}
object VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile {
  
  @scala.inline
  def apply(certificateChain: String): VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileMutableBuilder[Self <: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
  }
}
