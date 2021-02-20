package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecListenerTlsCertificateFile extends StObject {
  
  /**
    * The certificate chain for the certificate. Must be between 1 and 255 characters in length.
    */
  var certificateChain: Input[String] = js.native
  
  /**
    * The private key for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
    */
  var privateKey: Input[String] = js.native
}
object VirtualGatewaySpecListenerTlsCertificateFile {
  
  @scala.inline
  def apply(certificateChain: Input[String], privateKey: Input[String]): VirtualGatewaySpecListenerTlsCertificateFile = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListenerTlsCertificateFile]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerTlsCertificateFileMutableBuilder[Self <: VirtualGatewaySpecListenerTlsCertificateFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
