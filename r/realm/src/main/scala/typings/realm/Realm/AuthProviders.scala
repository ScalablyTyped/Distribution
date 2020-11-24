package typings.realm.Realm

import typings.realm.Realm.Auth.ApiKeyAuth
import typings.realm.Realm.Auth.EmailPasswordAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with interfaces to all possible authentication providers the app might have.
  */
@js.native
trait AuthProviders extends js.Object {
  
  /** Authentication provider where users identify using an API-key. */
  var apiKey: ApiKeyAuth = js.native
  
  /** Authentication provider where users identify using email and password. */
  var emailPassword: EmailPasswordAuth = js.native
}
object AuthProviders {
  
  @scala.inline
  def apply(apiKey: ApiKeyAuth, emailPassword: EmailPasswordAuth): AuthProviders = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], emailPassword = emailPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthProviders]
  }
  
  @scala.inline
  implicit class AuthProvidersOps[Self <: AuthProviders] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: ApiKeyAuth): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailPassword(value: EmailPasswordAuth): Self = this.set("emailPassword", value.asInstanceOf[js.Any])
  }
}
