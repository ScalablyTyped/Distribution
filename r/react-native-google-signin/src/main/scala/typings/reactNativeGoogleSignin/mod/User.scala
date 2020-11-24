package typings.reactNativeGoogleSignin.mod

import typings.reactNativeGoogleSignin.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  var accessToken: String | Null = js.native
  
  /**
    * Deprecated
    */
  var accessTokenExpirationDate: Double | Null = js.native
  
  var idToken: String | Null = js.native
  
  var scopes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Not null only if a valid webClientId and offlineAccess: true was
    * specified in configure().
    */
  var serverAuthCode: String | Null = js.native
  
  var user: Email = js.native
}
object User {
  
  @scala.inline
  def apply(user: Email): User = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setUser(value: Email): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenNull: Self = this.set("accessToken", null)
    
    @scala.inline
    def setAccessTokenExpirationDate(value: Double): Self = this.set("accessTokenExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenExpirationDateNull: Self = this.set("accessTokenExpirationDate", null)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenNull: Self = this.set("idToken", null)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    
    @scala.inline
    def setServerAuthCode(value: String): Self = this.set("serverAuthCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerAuthCodeNull: Self = this.set("serverAuthCode", null)
  }
}
