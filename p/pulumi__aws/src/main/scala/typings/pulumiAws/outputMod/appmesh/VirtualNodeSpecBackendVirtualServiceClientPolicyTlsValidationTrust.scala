package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust extends StObject {
  
  /**
    * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm] = js.native
  
  /**
    * The TLS validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile] = js.native
}
object VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust {
  
  @scala.inline
  def apply(): VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustMutableBuilder[Self <: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
