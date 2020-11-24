package typings.shareApiPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareAPIPolyfillOptions extends js.Object {
  
  var copy: js.UndefOr[Boolean] = js.native
  
  var email: js.UndefOr[Boolean] = js.native
  
  var facebook: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var linkedin: js.UndefOr[Boolean] = js.native
  
  var messenger: js.UndefOr[Boolean] = js.native
  
  var print: js.UndefOr[Boolean] = js.native
  
  var skype: js.UndefOr[Boolean] = js.native
  
  var sms: js.UndefOr[Boolean] = js.native
  
  var telegram: js.UndefOr[Boolean] = js.native
  
  var twitter: js.UndefOr[Boolean] = js.native
  
  var whatsapp: js.UndefOr[Boolean] = js.native
}
object ShareAPIPolyfillOptions {
  
  @scala.inline
  def apply(): ShareAPIPolyfillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareAPIPolyfillOptions]
  }
  
  @scala.inline
  implicit class ShareAPIPolyfillOptionsOps[Self <: ShareAPIPolyfillOptions] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: Boolean): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setEmail(value: Boolean): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFacebook(value: Boolean): Self = this.set("facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebook: Self = this.set("facebook", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLinkedin(value: Boolean): Self = this.set("linkedin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedin: Self = this.set("linkedin", js.undefined)
    
    @scala.inline
    def setMessenger(value: Boolean): Self = this.set("messenger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessenger: Self = this.set("messenger", js.undefined)
    
    @scala.inline
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    
    @scala.inline
    def setSkype(value: Boolean): Self = this.set("skype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkype: Self = this.set("skype", js.undefined)
    
    @scala.inline
    def setSms(value: Boolean): Self = this.set("sms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSms: Self = this.set("sms", js.undefined)
    
    @scala.inline
    def setTelegram(value: Boolean): Self = this.set("telegram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelegram: Self = this.set("telegram", js.undefined)
    
    @scala.inline
    def setTwitter(value: Boolean): Self = this.set("twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitter: Self = this.set("twitter", js.undefined)
    
    @scala.inline
    def setWhatsapp(value: Boolean): Self = this.set("whatsapp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhatsapp: Self = this.set("whatsapp", js.undefined)
  }
}
