package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust extends StObject {
  
  /**
    * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[Input[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm]] = js.undefined
  
  /**
    * The TLS validation context trust for a local file.
    */
  var file: js.UndefOr[Input[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile]] = js.undefined
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust {
  
  inline def apply(): VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust]
  }
  
  extension [Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust](x: Self) {
    
    inline def setAcm(value: Input[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm]): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setFile(value: Input[VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
