package typings.reactMessengerCheckbox.mod

import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typings.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactMessengerProps extends js.Object {
  
  var allowLogin: js.UndefOr[Boolean] = js.native
  
  var appId: String = js.native
  
  var autoLogAppEvents: js.UndefOr[Boolean] = js.native
  
  var centerAlign: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var onEvent: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var origin: String = js.native
  
  var pageId: String = js.native
  
  var prechecked: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[small | medium | large | standard | xlarge] = js.native
  
  var skin: js.UndefOr[light | dark] = js.native
  
  var userRef: String = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var xfbml: js.UndefOr[Boolean] = js.native
}
object ReactMessengerProps {
  
  @scala.inline
  def apply(appId: String, origin: String, pageId: String, userRef: String): ReactMessengerProps = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMessengerProps]
  }
  
  @scala.inline
  implicit class ReactMessengerPropsOps[Self <: ReactMessengerProps] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageId(value: String): Self = this.set("pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRef(value: String): Self = this.set("userRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowLogin(value: Boolean): Self = this.set("allowLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLogin: Self = this.set("allowLogin", js.undefined)
    
    @scala.inline
    def setAutoLogAppEvents(value: Boolean): Self = this.set("autoLogAppEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLogAppEvents: Self = this.set("autoLogAppEvents", js.undefined)
    
    @scala.inline
    def setCenterAlign(value: Boolean): Self = this.set("centerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterAlign: Self = this.set("centerAlign", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOnEvent(value: /* event */ js.Any => Unit): Self = this.set("onEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEvent: Self = this.set("onEvent", js.undefined)
    
    @scala.inline
    def setPrechecked(value: Boolean): Self = this.set("prechecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrechecked: Self = this.set("prechecked", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large | standard | xlarge): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSkin(value: light | dark): Self = this.set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    
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
