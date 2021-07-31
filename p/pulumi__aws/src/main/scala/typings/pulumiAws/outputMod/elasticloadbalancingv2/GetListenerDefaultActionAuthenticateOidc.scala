package typings.pulumiAws.outputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetListenerDefaultActionAuthenticateOidc extends StObject {
  
  var authenticationRequestExtraParams: StringDictionary[String]
  
  var authorizationEndpoint: String
  
  var clientId: String
  
  var clientSecret: String
  
  var issuer: String
  
  var onUnauthenticatedRequest: String
  
  var scope: String
  
  var sessionCookieName: String
  
  var sessionTimeout: Double
  
  var tokenEndpoint: String
  
  var userInfoEndpoint: String
}
object GetListenerDefaultActionAuthenticateOidc {
  
  @scala.inline
  def apply(
    authenticationRequestExtraParams: StringDictionary[String],
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
  ): GetListenerDefaultActionAuthenticateOidc = {
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams.asInstanceOf[js.Any], authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateOidc]
  }
  
  @scala.inline
  implicit class GetListenerDefaultActionAuthenticateOidcMutableBuilder[Self <: GetListenerDefaultActionAuthenticateOidc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationRequestExtraParams(value: StringDictionary[String]): Self = StObject.set(x, "authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationEndpoint(value: String): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnauthenticatedRequest(value: String): Self = StObject.set(x, "onUnauthenticatedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionCookieName(value: String): Self = StObject.set(x, "sessionCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoEndpoint(value: String): Self = StObject.set(x, "userInfoEndpoint", value.asInstanceOf[js.Any])
  }
}
