package typings.pulumiAws.inputMod.applicationloadbalancing

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleActionAuthenticateOidc extends StObject {
  
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * The authorization endpoint of the IdP.
    */
  var authorizationEndpoint: Input[String]
  
  /**
    * The OAuth 2.0 client identifier.
    */
  var clientId: Input[String]
  
  /**
    * The OAuth 2.0 client secret.
    */
  var clientSecret: Input[String]
  
  /**
    * The OIDC issuer identifier of the IdP.
    */
  var issuer: Input[String]
  
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The token endpoint of the IdP.
    */
  var tokenEndpoint: Input[String]
  
  /**
    * The user info endpoint of the IdP.
    */
  var userInfoEndpoint: Input[String]
}
object ListenerRuleActionAuthenticateOidc {
  
  @scala.inline
  def apply(
    authorizationEndpoint: Input[String],
    clientId: Input[String],
    clientSecret: Input[String],
    issuer: Input[String],
    tokenEndpoint: Input[String],
    userInfoEndpoint: Input[String]
  ): ListenerRuleActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionAuthenticateOidc]
  }
  
  @scala.inline
  implicit class ListenerRuleActionAuthenticateOidcMutableBuilder[Self <: ListenerRuleActionAuthenticateOidc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationRequestExtraParams(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationRequestExtraParamsUndefined: Self = StObject.set(x, "authenticationRequestExtraParams", js.undefined)
    
    @scala.inline
    def setAuthorizationEndpoint(value: Input[String]): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: Input[String]): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: Input[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: Input[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnauthenticatedRequest(value: Input[String]): Self = StObject.set(x, "onUnauthenticatedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnauthenticatedRequestUndefined: Self = StObject.set(x, "onUnauthenticatedRequest", js.undefined)
    
    @scala.inline
    def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSessionCookieName(value: Input[String]): Self = StObject.set(x, "sessionCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionCookieNameUndefined: Self = StObject.set(x, "sessionCookieName", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Input[Double]): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    @scala.inline
    def setTokenEndpoint(value: Input[String]): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoEndpoint(value: Input[String]): Self = StObject.set(x, "userInfoEndpoint", value.asInstanceOf[js.Any])
  }
}
