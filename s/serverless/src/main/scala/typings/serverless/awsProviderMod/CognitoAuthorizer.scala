package typings.serverless.awsProviderMod

import typings.serverless.anon.Prompt
import typings.serverless.serverlessStrings.cognito
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoAuthorizer extends StObject {
  
  var allowUnauthenticated: js.UndefOr[Boolean] = js.undefined
  
  var requestExtraParams: js.UndefOr[Prompt] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var sessionCookieName: js.UndefOr[String] = js.undefined
  
  var sessionTimeout: js.UndefOr[Double | String] = js.undefined
  
  var `type`: cognito
  
  var userPoolArn: String
  
  var userPoolClientId: String
  
  var userPoolDomain: String
}
object CognitoAuthorizer {
  
  inline def apply(userPoolArn: String, userPoolClientId: String, userPoolDomain: String): CognitoAuthorizer = {
    val __obj = js.Dynamic.literal(userPoolArn = userPoolArn.asInstanceOf[js.Any], userPoolClientId = userPoolClientId.asInstanceOf[js.Any], userPoolDomain = userPoolDomain.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cognito")
    __obj.asInstanceOf[CognitoAuthorizer]
  }
  
  extension [Self <: CognitoAuthorizer](x: Self) {
    
    inline def setAllowUnauthenticated(value: Boolean): Self = StObject.set(x, "allowUnauthenticated", value.asInstanceOf[js.Any])
    
    inline def setAllowUnauthenticatedUndefined: Self = StObject.set(x, "allowUnauthenticated", js.undefined)
    
    inline def setRequestExtraParams(value: Prompt): Self = StObject.set(x, "requestExtraParams", value.asInstanceOf[js.Any])
    
    inline def setRequestExtraParamsUndefined: Self = StObject.set(x, "requestExtraParams", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSessionCookieName(value: String): Self = StObject.set(x, "sessionCookieName", value.asInstanceOf[js.Any])
    
    inline def setSessionCookieNameUndefined: Self = StObject.set(x, "sessionCookieName", js.undefined)
    
    inline def setSessionTimeout(value: Double | String): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    inline def setType(value: cognito): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserPoolArn(value: String): Self = StObject.set(x, "userPoolArn", value.asInstanceOf[js.Any])
    
    inline def setUserPoolClientId(value: String): Self = StObject.set(x, "userPoolClientId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolDomain(value: String): Self = StObject.set(x, "userPoolDomain", value.asInstanceOf[js.Any])
  }
}
