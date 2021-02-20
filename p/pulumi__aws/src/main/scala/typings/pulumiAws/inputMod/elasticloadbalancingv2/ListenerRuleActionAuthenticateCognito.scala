package typings.pulumiAws.inputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleActionAuthenticateCognito extends StObject {
  
  /**
    * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
    */
  var authenticationRequestExtraParams: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
    */
  var onUnauthenticatedRequest: js.UndefOr[Input[String]] = js.native
  
  /**
    * The set of user claims to be requested from the IdP.
    */
  var scope: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the cookie used to maintain session information.
    */
  var sessionCookieName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum duration of the authentication session, in seconds.
    */
  var sessionTimeout: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN of the Cognito user pool.
    */
  var userPoolArn: Input[String] = js.native
  
  /**
    * The ID of the Cognito user pool client.
    */
  var userPoolClientId: Input[String] = js.native
  
  /**
    * The domain prefix or fully-qualified domain name of the Cognito user pool.
    */
  var userPoolDomain: Input[String] = js.native
}
object ListenerRuleActionAuthenticateCognito {
  
  @scala.inline
  def apply(userPoolArn: Input[String], userPoolClientId: Input[String], userPoolDomain: Input[String]): ListenerRuleActionAuthenticateCognito = {
    val __obj = js.Dynamic.literal(userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionAuthenticateCognito]
  }
  
  @scala.inline
  implicit class ListenerRuleActionAuthenticateCognitoMutableBuilder[Self <: ListenerRuleActionAuthenticateCognito] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationRequestExtraParams(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "authenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationRequestExtraParamsUndefined: Self = StObject.set(x, "authenticationRequestExtraParams", js.undefined)
    
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
    def setUserPoolArn(value: Input[String]): Self = StObject.set(x, "userPoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolClientId(value: Input[String]): Self = StObject.set(x, "userPoolClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolDomain(value: Input[String]): Self = StObject.set(x, "userPoolDomain", value.asInstanceOf[js.Any])
  }
}
