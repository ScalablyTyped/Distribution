package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialRequestOptions extends StObject {
  
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  
  var challenge: BufferSource
  
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}
object PublicKeyCredentialRequestOptions {
  
  inline def apply(challenge: BufferSource): PublicKeyCredentialRequestOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRequestOptions]
  }
  
  extension [Self <: PublicKeyCredentialRequestOptions](x: Self) {
    
    inline def setAllowCredentials(value: js.Array[PublicKeyCredentialDescriptor]): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    inline def setAllowCredentialsVarargs(value: PublicKeyCredentialDescriptor*): Self = StObject.set(x, "allowCredentials", js.Array(value :_*))
    
    inline def setChallenge(value: BufferSource): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: AuthenticationExtensionsClientInputs): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setRpId(value: java.lang.String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    inline def setRpIdUndefined: Self = StObject.set(x, "rpId", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUserVerification(value: UserVerificationRequirement): Self = StObject.set(x, "userVerification", value.asInstanceOf[js.Any])
    
    inline def setUserVerificationUndefined: Self = StObject.set(x, "userVerification", js.undefined)
  }
}
