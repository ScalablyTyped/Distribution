package typings.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleActionAuthenticateCognito extends StObject {
  
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
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
    * The ARN of the Cognito user pool.
    */
  var userPoolArn: String
  
  /**
    * The ID of the Cognito user pool client.
    */
  var userPoolClientId: String
  
  /**
    * The domain prefix or fully-qualified domain name of the Cognito user pool.
    */
  var userPoolDomain: String
}
object ListenerRuleActionAuthenticateCognito {
  
  @scala.inline
  def apply(
    onUnauthenticatedRequest: String,
    scope: String,
    sessionCookieName: String,
    sessionTimeout: Double,
    userPoolArn: String,
    userPoolClientId: String,
    userPoolDomain: String
  ): ListenerRuleActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(onUnauthenticatedRequest = onUnauthenticatedRequest.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sessionCookieName = sessionCookieName.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionAuthenticateCognito]
  }
  
  @scala.inline
  implicit class ListenerRuleActionAuthenticateCognitoMutableBuilder[Self <: ListenerRuleActionAuthenticateCognito] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationRequestExtraParams(value: StringDictionary[String]): Self = StObject.set(x, "authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationRequestExtraParamsUndefined: Self = StObject.set(x, "authenticationRequestExtraParams", js.undefined)
    
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
