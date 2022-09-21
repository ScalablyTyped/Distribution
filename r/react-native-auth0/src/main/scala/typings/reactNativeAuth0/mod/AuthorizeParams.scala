package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeParams
  extends StObject
     with // The invitation URL to join an organization. Takes precedence over the "organization" parameter.
/* key */ StringDictionary[js.UndefOr[String | Double | Boolean]] {
  
  // Random string to prevent replay attacks of id_tokens.
  var audience: js.UndefOr[String] = js.undefined
  
  // Scopes requested for the issued tokens. e.g. `openid profile`
  var connection: js.UndefOr[String] = js.undefined
  
  // The ID of the organization to join
  var invitationUrl: js.UndefOr[String] = js.undefined
  
  // The name of the identity provider to use, e.g. "google-oauth2" or "facebook". When not set, it will display Auth0's Universal Login Page.
  var language: js.UndefOr[String] = js.undefined
  
  var max_age: js.UndefOr[Double] = js.undefined
  
  // Random string to prevent CSRF attacks and used to discard unexpected results. By default it is a cryptographically secure random.
  var nonce: js.UndefOr[String] = js.undefined
  
  // The allowable elapsed time in seconds since the last time the user was authenticated (optional).
  var organization: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  // Identifier of Resource Server (RS) to be included as the audience (aud claim) of the issued access token
  var scope: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object AuthorizeParams {
  
  inline def apply(): AuthorizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeParams]
  }
  
  extension [Self <: AuthorizeParams](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setInvitationUrl(value: String): Self = StObject.set(x, "invitationUrl", value.asInstanceOf[js.Any])
    
    inline def setInvitationUrlUndefined: Self = StObject.set(x, "invitationUrl", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMax_age(value: Double): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
    
    inline def setMax_ageUndefined: Self = StObject.set(x, "max_age", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
