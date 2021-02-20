package typings.serverless.awsProviderMod

import typings.serverless.anon.Prompt
import typings.serverless.serverlessStrings.cognito
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoAuthorizer extends StObject {
  
  var allowUnauthenticated: js.UndefOr[Boolean] = js.native
  
  var requestExtraParams: js.UndefOr[Prompt] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var sessionCookieName: js.UndefOr[String] = js.native
  
  var sessionTimeout: js.UndefOr[Double | String] = js.native
  
  var `type`: cognito = js.native
  
  var userPoolArn: String = js.native
  
  var userPoolClientId: String = js.native
  
  var userPoolDomain: String = js.native
}
object CognitoAuthorizer {
  
  @scala.inline
  def apply(`type`: cognito, userPoolArn: String, userPoolClientId: String, userPoolDomain: String): CognitoAuthorizer = {
    val __obj = js.Dynamic.literal(userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoAuthorizer]
  }
  
  @scala.inline
  implicit class CognitoAuthorizerMutableBuilder[Self <: CognitoAuthorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnauthenticated(value: Boolean): Self = StObject.set(x, "allowUnauthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnauthenticatedUndefined: Self = StObject.set(x, "allowUnauthenticated", js.undefined)
    
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
    def setType(value: cognito): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolArn(value: String): Self = StObject.set(x, "userPoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolClientId(value: String): Self = StObject.set(x, "userPoolClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolDomain(value: String): Self = StObject.set(x, "userPoolDomain", value.asInstanceOf[js.Any])
  }
}
