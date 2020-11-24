package typings.simpleOauth2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeHost extends js.Object {
  
  /** String used to set the host to request an "authorization code". Default to the value set on auth.tokenHost. */
  var authorizeHost: js.UndefOr[String] = js.native
  
  /** String path to request an authorization code. Default to /oauth/authorize. */
  var authorizePath: js.UndefOr[String] = js.native
  
  /** String path to revoke an access token. Default to /oauth/revoke. */
  var revokePath: js.UndefOr[String] = js.native
  
  /** String used to set the host to request the tokens to. Required. */
  var tokenHost: String = js.native
  
  /** String path to request an access token. Default to /oauth/token. */
  var tokenPath: js.UndefOr[String] = js.native
}
object AuthorizeHost {
  
  @scala.inline
  def apply(tokenHost: String): AuthorizeHost = {
    val __obj = js.Dynamic.literal(tokenHost = tokenHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeHost]
  }
  
  @scala.inline
  implicit class AuthorizeHostOps[Self <: AuthorizeHost] (val x: Self) extends AnyVal {
    
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
    def setTokenHost(value: String): Self = this.set("tokenHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizeHost(value: String): Self = this.set("authorizeHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizeHost: Self = this.set("authorizeHost", js.undefined)
    
    @scala.inline
    def setAuthorizePath(value: String): Self = this.set("authorizePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizePath: Self = this.set("authorizePath", js.undefined)
    
    @scala.inline
    def setRevokePath(value: String): Self = this.set("revokePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokePath: Self = this.set("revokePath", js.undefined)
    
    @scala.inline
    def setTokenPath(value: String): Self = this.set("tokenPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenPath: Self = this.set("tokenPath", js.undefined)
  }
}
