package typings.primereact.captchaCaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptchaProps extends js.Object {
  
  var id: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var onExpire: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onResponse: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.native
  
  var siteKey: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object CaptchaProps {
  
  @scala.inline
  def apply(): CaptchaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptchaProps]
  }
  
  @scala.inline
  implicit class CaptchaPropsOps[Self <: CaptchaProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOnExpire(value: () => Unit): Self = this.set("onExpire", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExpire: Self = this.set("onExpire", js.undefined)
    
    @scala.inline
    def setOnResponse(value: /* response */ js.Any => Unit): Self = this.set("onResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponse: Self = this.set("onResponse", js.undefined)
    
    @scala.inline
    def setSiteKey(value: String): Self = this.set("siteKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteKey: Self = this.set("siteKey", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
