package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTlsCertificate extends StObject {
  
  /**
    * An AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualNodeSpecListenerTlsCertificateAcm] = js.native
  
  /**
    * A local file certificate.
    */
  var file: js.UndefOr[VirtualNodeSpecListenerTlsCertificateFile] = js.native
}
object VirtualNodeSpecListenerTlsCertificate {
  
  @scala.inline
  def apply(): VirtualNodeSpecListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTlsCertificate]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTlsCertificateMutableBuilder[Self <: VirtualNodeSpecListenerTlsCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: VirtualNodeSpecListenerTlsCertificateAcm): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: VirtualNodeSpecListenerTlsCertificateFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
