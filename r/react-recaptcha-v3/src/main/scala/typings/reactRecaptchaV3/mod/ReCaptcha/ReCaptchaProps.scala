package typings.reactRecaptchaV3.mod.ReCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReCaptchaProps extends js.Object {
  var action: String = js.native
  var elementID: js.UndefOr[String] = js.native
  var sitekey: String = js.native
  var verifyCallback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.native
  var verifyCallbackName: js.UndefOr[String] = js.native
}

object ReCaptchaProps {
  @scala.inline
  def apply(action: String, sitekey: String): ReCaptchaProps = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReCaptchaProps]
  }
  @scala.inline
  implicit class ReCaptchaPropsOps[Self <: ReCaptchaProps] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setSitekey(value: String): Self = this.set("sitekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementID(value: String): Self = this.set("elementID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementID: Self = this.set("elementID", js.undefined)
    @scala.inline
    def setVerifyCallback(value: /* response */ String => Unit): Self = this.set("verifyCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVerifyCallback: Self = this.set("verifyCallback", js.undefined)
    @scala.inline
    def setVerifyCallbackName(value: String): Self = this.set("verifyCallbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyCallbackName: Self = this.set("verifyCallbackName", js.undefined)
  }
  
}

