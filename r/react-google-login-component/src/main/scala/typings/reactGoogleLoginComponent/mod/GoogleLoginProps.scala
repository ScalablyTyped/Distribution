package typings.reactGoogleLoginComponent.mod

import typings.react.mod.ButtonHTMLAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleLoginProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  
  var buttonText: js.UndefOr[String] = js.native
  
  var fetchBasicProfile: js.UndefOr[Boolean] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  def responseHandler(response: GoogleLoginInfo): Unit = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var socialId: String = js.native
}
object GoogleLoginProps {
  
  @scala.inline
  def apply(responseHandler: GoogleLoginInfo => Unit, socialId: String): GoogleLoginProps = {
    val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleLoginProps]
  }
  
  @scala.inline
  implicit class GoogleLoginPropsOps[Self <: GoogleLoginProps] (val x: Self) extends AnyVal {
    
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
    def setResponseHandler(value: GoogleLoginInfo => Unit): Self = this.set("responseHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSocialId(value: String): Self = this.set("socialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setFetchBasicProfile(value: Boolean): Self = this.set("fetchBasicProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchBasicProfile: Self = this.set("fetchBasicProfile", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
