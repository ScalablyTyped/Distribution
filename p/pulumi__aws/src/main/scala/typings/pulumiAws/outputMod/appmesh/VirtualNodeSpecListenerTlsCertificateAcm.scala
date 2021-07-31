package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTlsCertificateAcm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var certificateArn: String
}
object VirtualNodeSpecListenerTlsCertificateAcm {
  
  @scala.inline
  def apply(certificateArn: String): VirtualNodeSpecListenerTlsCertificateAcm = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerTlsCertificateAcm]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTlsCertificateAcmMutableBuilder[Self <: VirtualNodeSpecListenerTlsCertificateAcm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
  }
}
