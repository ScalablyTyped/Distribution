package typings.serverless.awsProviderMod

import typings.serverless.anon.Prompt
import typings.serverless.serverlessStrings.oidc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcAuthorizer extends StObject {
  
  var allowUnauthenticated: js.UndefOr[Boolean] = js.native
  
  var authorizationEndpoint: String = js.native
  
  var clientId: String = js.native
  
  var clientSecret: js.UndefOr[String] = js.native
  
  var issuer: String = js.native
  
  var requestExtraParams: js.UndefOr[Prompt] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var sessionCookieName: js.UndefOr[String] = js.native
  
  var sessionTimeout: js.UndefOr[Double | String] = js.native
  
  var tokenEndpoint: String = js.native
  
  var `type`: oidc = js.native
  
  var useExistingClientSecret: js.UndefOr[Boolean] = js.native
  
  var userInfoEndpoint: String = js.native
}
object OidcAuthorizer {
  
  @scala.inline
  def apply(
    authorizationEndpoint: String,
    clientId: String,
    issuer: String,
    tokenEndpoint: String,
    `type`: oidc,
    userInfoEndpoint: String
  ): OidcAuthorizer = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidcAuthorizer]
  }
  
  @scala.inline
  implicit class OidcAuthorizerMutableBuilder[Self <: OidcAuthorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnauthenticated(value: Boolean): Self = StObject.set(x, "allowUnauthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnauthenticatedUndefined: Self = StObject.set(x, "allowUnauthenticated", js.undefined)
    
    @scala.inline
    def setAuthorizationEndpoint(value: String): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestExtraParams(value: Prompt): Self = StObject.set(x, "requestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestExtraParamsUndefined: Self = StObject.set(x, "requestExtraParams", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSessionCookieName(value: String): Self = StObject.set(x, "sessionCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionCookieNameUndefined: Self = StObject.set(x, "sessionCookieName", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double | String): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    @scala.inline
    def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: oidc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingClientSecret(value: Boolean): Self = StObject.set(x, "useExistingClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingClientSecretUndefined: Self = StObject.set(x, "useExistingClientSecret", js.undefined)
    
    @scala.inline
    def setUserInfoEndpoint(value: String): Self = StObject.set(x, "userInfoEndpoint", value.asInstanceOf[js.Any])
  }
}
