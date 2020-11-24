package typings.reactGoogleLoginComponent.mod

import typings.reactGoogleLoginComponent.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleLoginInfo extends js.Object {
  
  def getAuthResponse(): Accesstoken = js.native
}
object GoogleLoginInfo {
  
  @scala.inline
  def apply(getAuthResponse: () => Accesstoken): GoogleLoginInfo = {
    val __obj = js.Dynamic.literal(getAuthResponse = js.Any.fromFunction0(getAuthResponse))
    __obj.asInstanceOf[GoogleLoginInfo]
  }
  
  @scala.inline
  implicit class GoogleLoginInfoOps[Self <: GoogleLoginInfo] (val x: Self) extends AnyVal {
    
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
    def setGetAuthResponse(value: () => Accesstoken): Self = this.set("getAuthResponse", js.Any.fromFunction0(value))
  }
}
