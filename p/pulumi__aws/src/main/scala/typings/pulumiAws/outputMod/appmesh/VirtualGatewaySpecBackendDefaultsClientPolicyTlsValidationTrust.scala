package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust extends StObject {
  
  /**
    * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm] = js.undefined
  
  /**
    * The TLS validation context trust for a local file.
    */
  var file: js.UndefOr[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile] = js.undefined
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust {
  
  @scala.inline
  def apply(): VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustMutableBuilder[Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcm(value: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    @scala.inline
    def setFile(value: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
