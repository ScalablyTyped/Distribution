package typings.reactRecaptcha.mod

import typings.reactRecaptcha.reactRecaptchaStrings.`inline`
import typings.reactRecaptcha.reactRecaptchaStrings.audio
import typings.reactRecaptcha.reactRecaptchaStrings.bottomleft
import typings.reactRecaptcha.reactRecaptchaStrings.bottomright
import typings.reactRecaptcha.reactRecaptchaStrings.compact
import typings.reactRecaptcha.reactRecaptchaStrings.dark
import typings.reactRecaptcha.reactRecaptchaStrings.explicit
import typings.reactRecaptcha.reactRecaptchaStrings.image
import typings.reactRecaptcha.reactRecaptchaStrings.invisible
import typings.reactRecaptcha.reactRecaptchaStrings.light
import typings.reactRecaptcha.reactRecaptchaStrings.normal
import typings.reactRecaptcha.reactRecaptchaStrings.onload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecaptchaProps extends js.Object {
  var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.native
  var className: js.UndefOr[String] = js.native
  var elementID: js.UndefOr[String] = js.native
  var expiredCallback: js.UndefOr[js.Function0[_]] = js.native
  var expiredCallbackName: js.UndefOr[String] = js.native
  var hl: js.UndefOr[String] = js.native
  var onloadCallback: js.UndefOr[js.Function0[_]] = js.native
  var onloadCallbackName: js.UndefOr[String] = js.native
  var render: js.UndefOr[onload | explicit] = js.native
  var sitekey: js.UndefOr[String] = js.native
  var size: js.UndefOr[normal | compact | invisible] = js.native
  var tabindex: js.UndefOr[Double | String] = js.native
  var theme: js.UndefOr[dark | light] = js.native
  var `type`: js.UndefOr[audio | image] = js.native
  var verifyCallback: js.UndefOr[js.Function1[/* response */ String, _]] = js.native
  var verifyCallbackName: js.UndefOr[String] = js.native
}

object RecaptchaProps {
  @scala.inline
  def apply(): RecaptchaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecaptchaProps]
  }
  @scala.inline
  implicit class RecaptchaPropsOps[Self <: RecaptchaProps] (val x: Self) extends AnyVal {
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
    def setBadge(value: bottomright | bottomleft | `inline`): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setElementID(value: String): Self = this.set("elementID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementID: Self = this.set("elementID", js.undefined)
    @scala.inline
    def setExpiredCallback(value: () => _): Self = this.set("expiredCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExpiredCallback: Self = this.set("expiredCallback", js.undefined)
    @scala.inline
    def setExpiredCallbackName(value: String): Self = this.set("expiredCallbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiredCallbackName: Self = this.set("expiredCallbackName", js.undefined)
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    @scala.inline
    def setOnloadCallback(value: () => _): Self = this.set("onloadCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnloadCallback: Self = this.set("onloadCallback", js.undefined)
    @scala.inline
    def setOnloadCallbackName(value: String): Self = this.set("onloadCallbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnloadCallbackName: Self = this.set("onloadCallbackName", js.undefined)
    @scala.inline
    def setRender(value: onload | explicit): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setSitekey(value: String): Self = this.set("sitekey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSitekey: Self = this.set("sitekey", js.undefined)
    @scala.inline
    def setSize(value: normal | compact | invisible): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTabindex(value: Double | String): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    @scala.inline
    def setTheme(value: dark | light): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: audio | image): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerifyCallback(value: /* response */ String => _): Self = this.set("verifyCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVerifyCallback: Self = this.set("verifyCallback", js.undefined)
    @scala.inline
    def setVerifyCallbackName(value: String): Self = this.set("verifyCallbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyCallbackName: Self = this.set("verifyCallbackName", js.undefined)
  }
  
}

