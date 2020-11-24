package typings.rest.oAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var authorizationUrl: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var oAuthCallback: js.UndefOr[js.Function1[/* hash */ String, Unit]] = js.native
  
  var oAuthCallbackName: js.UndefOr[String] = js.native
  
  var redirectUrl: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var windowStrategy: js.UndefOr[js.Function1[/* url */ String, DismissWindow]] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationUrl: Self = this.set("authorizationUrl", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setOAuthCallback(value: /* hash */ String => Unit): Self = this.set("oAuthCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOAuthCallback: Self = this.set("oAuthCallback", js.undefined)
    
    @scala.inline
    def setOAuthCallbackName(value: String): Self = this.set("oAuthCallbackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAuthCallbackName: Self = this.set("oAuthCallbackName", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setWindowStrategy(value: /* url */ String => DismissWindow): Self = this.set("windowStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWindowStrategy: Self = this.set("windowStrategy", js.undefined)
  }
}
