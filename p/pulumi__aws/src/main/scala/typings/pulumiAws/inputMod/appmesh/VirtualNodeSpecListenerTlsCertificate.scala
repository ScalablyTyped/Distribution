package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTlsCertificate extends StObject {
  
  /**
    * An AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[Input[VirtualNodeSpecListenerTlsCertificateAcm]] = js.undefined
  
  /**
    * A local file certificate.
    */
  var file: js.UndefOr[Input[VirtualNodeSpecListenerTlsCertificateFile]] = js.undefined
}
object VirtualNodeSpecListenerTlsCertificate {
  
  inline def apply(): VirtualNodeSpecListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTlsCertificate]
  }
  
  extension [Self <: VirtualNodeSpecListenerTlsCertificate](x: Self) {
    
    inline def setAcm(value: Input[VirtualNodeSpecListenerTlsCertificateAcm]): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: Input[VirtualNodeSpecListenerTlsCertificateFile]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
