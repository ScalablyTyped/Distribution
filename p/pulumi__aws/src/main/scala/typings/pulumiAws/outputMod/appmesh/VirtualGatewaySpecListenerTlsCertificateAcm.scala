package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecListenerTlsCertificateAcm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var certificateArn: String
}
object VirtualGatewaySpecListenerTlsCertificateAcm {
  
  @scala.inline
  def apply(certificateArn: String): VirtualGatewaySpecListenerTlsCertificateAcm = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListenerTlsCertificateAcm]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerTlsCertificateAcmMutableBuilder[Self <: VirtualGatewaySpecListenerTlsCertificateAcm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
  }
}
