package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialCreationOptions extends StObject {
  
  var attestation: js.UndefOr[AttestationConveyancePreference] = js.native
  
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.native
  
  var challenge: BufferSource = js.native
  
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.native
  
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.native
  
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters] = js.native
  
  var rp: PublicKeyCredentialRpEntity = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var user: PublicKeyCredentialUserEntity = js.native
}
object PublicKeyCredentialCreationOptions {
  
  @scala.inline
  def apply(
    challenge: BufferSource,
    pubKeyCredParams: js.Array[PublicKeyCredentialParameters],
    rp: PublicKeyCredentialRpEntity,
    user: PublicKeyCredentialUserEntity
  ): PublicKeyCredentialCreationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], pubKeyCredParams = pubKeyCredParams.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialCreationOptions]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialCreationOptionsMutableBuilder[Self <: PublicKeyCredentialCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestation(value: AttestationConveyancePreference): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    @scala.inline
    def setAuthenticatorSelection(value: AuthenticatorSelectionCriteria): Self = StObject.set(x, "authenticatorSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticatorSelectionUndefined: Self = StObject.set(x, "authenticatorSelection", js.undefined)
    
    @scala.inline
    def setChallenge(value: BufferSource): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeCredentials(value: js.Array[PublicKeyCredentialDescriptor]): Self = StObject.set(x, "excludeCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeCredentialsUndefined: Self = StObject.set(x, "excludeCredentials", js.undefined)
    
    @scala.inline
    def setExcludeCredentialsVarargs(value: PublicKeyCredentialDescriptor*): Self = StObject.set(x, "excludeCredentials", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: AuthenticationExtensionsClientInputs): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setPubKeyCredParams(value: js.Array[PublicKeyCredentialParameters]): Self = StObject.set(x, "pubKeyCredParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubKeyCredParamsVarargs(value: PublicKeyCredentialParameters*): Self = StObject.set(x, "pubKeyCredParams", js.Array(value :_*))
    
    @scala.inline
    def setRp(value: PublicKeyCredentialRpEntity): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUser(value: PublicKeyCredentialUserEntity): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
