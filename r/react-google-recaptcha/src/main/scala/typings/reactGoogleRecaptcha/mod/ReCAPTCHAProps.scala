package typings.reactGoogleRecaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReCAPTCHAProps extends js.Object {
  /**
    * The badge location for g-recaptcha with size of "invisible".
    * @default "bottomright"
    */
  var badge: js.UndefOr[Badge] = js.native
  /**
    *  If you are using the barebone component you need to provide access to the
    *  google grecaptcha object.
    */
  var grecaptcha: js.UndefOr[js.Object] = js.native
  /**
    *  Forces the widget to render in a specific language.
    *  Auto-detects the user's language if unspecified.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * The function to be called when the user successfully completes the normal
    * or the compact captcha. It will also be called with null, when captcha expires.
    * @param token string or null
    */
  var onChange: js.UndefOr[js.Function1[/* token */ String | Null, Unit]] = js.native
  /**
    *  Optional callback, called when reCAPTCHA encounters an error (usually network connectivity)
    *  and cannot continue until connectivity is restored. If you specify a function here, you are
    *  responsible for informing the user that they should retry.
    */
  var onErrored: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback called when a challenge expires and has to be redone by the user.
    */
  var onExpired: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The API client key
    */
  var sitekey: String = js.native
  /**
    * This allows you to change the size or do an invisible captcha.
    * @default "normal"
    */
  var size: js.UndefOr[Size] = js.native
  /**
    * Set the stoken parameter, which allows the captcha to be used from different domains.
    * @see reCAPTCHA secure-token
    */
  var stoken: js.UndefOr[String] = js.native
  /**
    * The tabindex of the element.
    * @default 0
    */
  var tabindex: js.UndefOr[Double] = js.native
  /**
    * The theme of the widget.
    * @default "light"
    */
  var theme: js.UndefOr[Theme] = js.native
  /**
    * The type of initial captcha.
    * @default "image"
    */
  var `type`: js.UndefOr[Type] = js.native
}

object ReCAPTCHAProps {
  @scala.inline
  def apply(sitekey: String): ReCAPTCHAProps = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReCAPTCHAProps]
  }
  @scala.inline
  implicit class ReCAPTCHAPropsOps[Self <: ReCAPTCHAProps] (val x: Self) extends AnyVal {
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
    def setSitekey(value: String): Self = this.set("sitekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadge(value: Badge): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setGrecaptcha(value: js.Object): Self = this.set("grecaptcha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrecaptcha: Self = this.set("grecaptcha", js.undefined)
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    @scala.inline
    def setOnChange(value: /* token */ String | Null => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnErrored(value: () => Unit): Self = this.set("onErrored", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnErrored: Self = this.set("onErrored", js.undefined)
    @scala.inline
    def setOnExpired(value: () => Unit): Self = this.set("onExpired", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnExpired: Self = this.set("onExpired", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStoken(value: String): Self = this.set("stoken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoken: Self = this.set("stoken", js.undefined)
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

