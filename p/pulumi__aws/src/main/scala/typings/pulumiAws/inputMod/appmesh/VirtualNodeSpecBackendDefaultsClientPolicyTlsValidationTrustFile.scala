package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile extends StObject {
  
  /**
    * The certificate chain for the certificate. Must be between 1 and 255 characters in length.
    */
  var certificateChain: Input[String] = js.native
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile {
  
  @scala.inline
  def apply(certificateChain: Input[String]): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileMutableBuilder[Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
  }
}
