package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetListenerDefaultActionAuthenticateCognito extends StObject {
  
  var authenticationRequestExtraParams: StringDictionary[String]
  
  var onUnauthenticatedRequest: String
  
  var scope: String
  
  var sessionCookieName: String
  
  var sessionTimeout: Double
  
  var userPoolArn: String
  
  var userPoolClientId: String
  
  var userPoolDomain: String
}
object GetListenerDefaultActionAuthenticateCognito {
  
  @scala.inline
  def apply(
    authenticationRequestExtraParams: StringDictionary[String],
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String
  ): GetListenerDefaultActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(authenticationRequestExtraParams = authenticationRequestExtraParams.asInstanceOf[js.Any], onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionAuthenticateCognito]
  }
  
  @scala.inline
  implicit class GetListenerDefaultActionAuthenticateCognitoMutableBuilder[Self <: GetListenerDefaultActionAuthenticateCognito] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationRequestExtraParams(value: StringDictionary[String]): Self = StObject.set(x, "authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnauthenticatedRequest(value: String): Self = StObject.set(x, "onUnauthenticatedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionCookieName(value: String): Self = StObject.set(x, "sessionCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolArn(value: String): Self = StObject.set(x, "userPoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolClientId(value: String): Self = StObject.set(x, "userPoolClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolDomain(value: String): Self = StObject.set(x, "userPoolDomain", value.asInstanceOf[js.Any])
  }
}
