package typings.reactFacebookLoginComponent.mod

import typings.react.mod.ButtonHTMLAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacebookLoginProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  
  var buttonText: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[String] = js.native
  
  def responseHandler(response: FacebookLoginInfo): Unit = js.native
  
  var socialId: String = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var xfbml: js.UndefOr[Boolean] = js.native
}
object FacebookLoginProps {
  
  @scala.inline
  def apply(responseHandler: FacebookLoginInfo => Unit, socialId: String): FacebookLoginProps = {
    val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacebookLoginProps]
  }
  
  @scala.inline
  implicit class FacebookLoginPropsOps[Self <: FacebookLoginProps] (val x: Self) extends AnyVal {
    
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
    def setResponseHandler(value: FacebookLoginInfo => Unit): Self = this.set("responseHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSocialId(value: String): Self = this.set("socialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setXfbml(value: Boolean): Self = this.set("xfbml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXfbml: Self = this.set("xfbml", js.undefined)
  }
}
