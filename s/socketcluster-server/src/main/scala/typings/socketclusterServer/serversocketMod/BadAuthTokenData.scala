package typings.socketclusterServer.serversocketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadAuthTokenData extends js.Object {
  
  var authError: Error = js.native
  
  var signedAuthToken: String = js.native
}
object BadAuthTokenData {
  
  @scala.inline
  def apply(authError: Error, signedAuthToken: String): BadAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadAuthTokenData]
  }
  
  @scala.inline
  implicit class BadAuthTokenDataOps[Self <: BadAuthTokenData] (val x: Self) extends AnyVal {
    
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
    def setAuthError(value: Error): Self = this.set("authError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedAuthToken(value: String): Self = this.set("signedAuthToken", value.asInstanceOf[js.Any])
  }
}
