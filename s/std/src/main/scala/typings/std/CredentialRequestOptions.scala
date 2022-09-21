package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialRequestOptions extends StObject {
  
  /* standard dom */
  var mediation: js.UndefOr[CredentialMediationRequirement] = js.undefined
  
  /* standard dom */
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.undefined
  
  /* standard dom */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object CredentialRequestOptions {
  
  inline def apply(): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialRequestOptions]
  }
  
  extension [Self <: CredentialRequestOptions](x: Self) {
    
    inline def setMediation(value: CredentialMediationRequirement): Self = StObject.set(x, "mediation", value.asInstanceOf[js.Any])
    
    inline def setMediationUndefined: Self = StObject.set(x, "mediation", js.undefined)
    
    inline def setPublicKey(value: PublicKeyCredentialRequestOptions): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
