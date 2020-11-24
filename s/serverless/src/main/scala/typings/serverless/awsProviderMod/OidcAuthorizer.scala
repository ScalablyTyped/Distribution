package typings.serverless.awsProviderMod

import typings.serverless.anon.Prompt
import typings.serverless.serverlessStrings.oidc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcAuthorizer extends js.Object {
  
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
  implicit class OidcAuthorizerOps[Self <: OidcAuthorizer] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationEndpoint(value: String): Self = this.set("authorizationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEndpoint(value: String): Self = this.set("tokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: oidc): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoEndpoint(value: String): Self = this.set("userInfoEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnauthenticated(value: Boolean): Self = this.set("allowUnauthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnauthenticated: Self = this.set("allowUnauthenticated", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    
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
    
    @scala.inline
    def setUseExistingClientSecret(value: Boolean): Self = this.set("useExistingClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExistingClientSecret: Self = this.set("useExistingClientSecret", js.undefined)
  }
}
