package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecListenerTlsCertificate extends StObject {
  
  /**
    * An AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[Input[VirtualGatewaySpecListenerTlsCertificateAcm]] = js.undefined
  
  /**
    * A local file certificate.
    */
  var file: js.UndefOr[Input[VirtualGatewaySpecListenerTlsCertificateFile]] = js.undefined
}
object VirtualGatewaySpecListenerTlsCertificate {
  
  inline def apply(): VirtualGatewaySpecListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecListenerTlsCertificate]
  }
  
  extension [Self <: VirtualGatewaySpecListenerTlsCertificate](x: Self) {
    
    inline def setAcm(value: Input[VirtualGatewaySpecListenerTlsCertificateAcm]): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: Input[VirtualGatewaySpecListenerTlsCertificateFile]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
