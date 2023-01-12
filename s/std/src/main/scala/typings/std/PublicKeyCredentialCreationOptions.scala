package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialCreationOptions extends StObject {
  
  /* standard dom */
  var attestation: js.UndefOr[AttestationConveyancePreference] = js.undefined
  
  /* standard dom */
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.undefined
  
  /* standard dom */
  var challenge: BufferSource
  
  /* standard dom */
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  
  /* standard dom */
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  
  /* standard dom */
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters]
  
  /* standard dom */
  var rp: PublicKeyCredentialRpEntity
  
  /* standard dom */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var user: PublicKeyCredentialUserEntity
}
object PublicKeyCredentialCreationOptions {
  
  inline def apply(
    challenge: BufferSource,
    pubKeyCredParams: js.Array[PublicKeyCredentialParameters],
    rp: PublicKeyCredentialRpEntity,
    user: PublicKeyCredentialUserEntity
  ): PublicKeyCredentialCreationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], pubKeyCredParams = pubKeyCredParams.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialCreationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyCredentialCreationOptions] (val x: Self) extends AnyVal {
    
    inline def setAttestation(value: AttestationConveyancePreference): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setAuthenticatorSelection(value: AuthenticatorSelectionCriteria): Self = StObject.set(x, "authenticatorSelection", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorSelectionUndefined: Self = StObject.set(x, "authenticatorSelection", js.undefined)
    
    inline def setChallenge(value: BufferSource): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setExcludeCredentials(value: js.Array[PublicKeyCredentialDescriptor]): Self = StObject.set(x, "excludeCredentials", value.asInstanceOf[js.Any])
    
    inline def setExcludeCredentialsUndefined: Self = StObject.set(x, "excludeCredentials", js.undefined)
    
    inline def setExcludeCredentialsVarargs(value: PublicKeyCredentialDescriptor*): Self = StObject.set(x, "excludeCredentials", js.Array(value*))
    
    inline def setExtensions(value: AuthenticationExtensionsClientInputs): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setPubKeyCredParams(value: js.Array[PublicKeyCredentialParameters]): Self = StObject.set(x, "pubKeyCredParams", value.asInstanceOf[js.Any])
    
    inline def setPubKeyCredParamsVarargs(value: PublicKeyCredentialParameters*): Self = StObject.set(x, "pubKeyCredParams", js.Array(value*))
    
    inline def setRp(value: PublicKeyCredentialRpEntity): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUser(value: PublicKeyCredentialUserEntity): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
