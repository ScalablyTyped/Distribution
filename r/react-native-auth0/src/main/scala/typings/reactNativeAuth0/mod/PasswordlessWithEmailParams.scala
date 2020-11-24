package typings.reactNativeAuth0.mod

import typings.reactNativeAuth0.reactNativeAuth0Strings.code
import typings.reactNativeAuth0.reactNativeAuth0Strings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordlessWithEmailParams extends js.Object {
  
  var authParams: js.UndefOr[AuthParams] = js.native
  
  var email: String = js.native
  
  var send: js.UndefOr[link | code] = js.native
}
object PasswordlessWithEmailParams {
  
  @scala.inline
  def apply(email: String): PasswordlessWithEmailParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessWithEmailParams]
  }
  
  @scala.inline
  implicit class PasswordlessWithEmailParamsOps[Self <: PasswordlessWithEmailParams] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthParams(value: AuthParams): Self = this.set("authParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthParams: Self = this.set("authParams", js.undefined)
    
    @scala.inline
    def setSend(value: link | code): Self = this.set("send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
  }
}
