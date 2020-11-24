package typings.serverless.awsProviderMod

import typings.serverless.anon.Prompt
import typings.serverless.serverlessStrings.cognito
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoAuthorizer extends js.Object {
  
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
  implicit class CognitoAuthorizerOps[Self <: CognitoAuthorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: cognito): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolArn(value: String): Self = this.set("userPoolArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolClientId(value: String): Self = this.set("userPoolClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolDomain(value: String): Self = this.set("userPoolDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnauthenticated(value: Boolean): Self = this.set("allowUnauthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnauthenticated: Self = this.set("allowUnauthenticated", js.undefined)
    
    @scala.inline
    def setRequestExtraParams(value: Prompt): Self = this.set("requestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestExtraParams: Self = this.set("requestExtraParams", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSessionCookieName(value: String): Self = this.set("sessionCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionCookieName: Self = this.set("sessionCookieName", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double | String): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
  }
}
