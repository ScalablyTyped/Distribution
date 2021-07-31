package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecListenerTlsCertificateAcm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var certificateArn: Input[String]
}
object VirtualGatewaySpecListenerTlsCertificateAcm {
  
  @scala.inline
  def apply(certificateArn: Input[String]): VirtualGatewaySpecListenerTlsCertificateAcm = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListenerTlsCertificateAcm]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerTlsCertificateAcmMutableBuilder[Self <: VirtualGatewaySpecListenerTlsCertificateAcm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
  }
}
