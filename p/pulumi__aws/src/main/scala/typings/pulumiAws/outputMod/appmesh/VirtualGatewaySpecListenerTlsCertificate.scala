package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecListenerTlsCertificate extends StObject {
  
  /**
    * An AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualGatewaySpecListenerTlsCertificateAcm] = js.undefined
  
  /**
    * A local file certificate.
    */
  var file: js.UndefOr[VirtualGatewaySpecListenerTlsCertificateFile] = js.undefined
}
object VirtualGatewaySpecListenerTlsCertificate {
  
  @scala.inline
  def apply(): VirtualGatewaySpecListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecListenerTlsCertificate]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerTlsCertificateMutableBuilder[Self <: VirtualGatewaySpecListenerTlsCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: VirtualGatewaySpecListenerTlsCertificateAcm): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: VirtualGatewaySpecListenerTlsCertificateFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
