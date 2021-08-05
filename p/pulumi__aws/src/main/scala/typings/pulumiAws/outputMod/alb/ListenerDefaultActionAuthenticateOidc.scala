package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultActionAuthenticateOidc extends StObject {
  
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The authorization endpoint of the IdP.
    */
  var authorizationEndpoint: String
  
  /**
    * The OAuth 2.0 client identifier.
    */
  var clientId: String
  
  /**
    * The OAuth 2.0 client secret.
    */
  var clientSecret: String
  
  /**
    * The OIDC issuer identifier of the IdP.
    */
  var issuer: String
  
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: String
  
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: String
  
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: String
  
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: Double
  
  /**
    * The token endpoint of the IdP.
    */
  var tokenEndpoint: String
  
  /**
    * The user info endpoint of the IdP.
    */
  var userInfoEndpoint: String
}
object ListenerDefaultActionAuthenticateOidc {
  
  inline def apply(
    authorizationEndpoint: String,
    clientId: String,
    clientSecret: String,
    issuer: String,
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    tokenEndpoint: String,
    userInfoEndpoint: String
  ): ListenerDefaultActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionAuthenticateOidc]
  }
  
  extension [Self <: ListenerDefaultActionAuthenticateOidc](x: Self) {
    
    inline def setAuthenticationRequestExtraParams(value: StringDictionary[String]): Self = StObject.set(x, "authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationRequestExtraParamsUndefined: Self = StObject.set(x, "authenticationRequestExtraParams", js.undefined)
    
    inline def setAuthorizationEndpoint(value: String): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setOnUnauthenticatedRequest(value: String): Self = StObject.set(x, "onUnauthenticatedRequest", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSessionCookieName(value: String): Self = StObject.set(x, "sessionCookieName", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUserInfoEndpoint(value: String): Self = StObject.set(x, "userInfoEndpoint", value.asInstanceOf[js.Any])
  }
}
