package typings.reactGoogleRecaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReCAPTCHAProps extends js.Object {
  /**
    * Optional. The badge location for g-recaptcha with size of "invisible".
    *
    * @default "bottomright"
    */
  var badge: js.UndefOr[Badge] = js.undefined
  /**
    *  if you are using the barebone component you need to provide access  to the google grecaptcha object.
    */
  var grecaptcha: js.UndefOr[js.Object] = js.undefined
  /**
    *  Optional. Forces the widget to render in a specific language. Auto-detects the user's language if unspecified.
    */
  var hl: js.UndefOr[String] = js.undefined
  /**
    *  The function to be called when the user successfully completes the normal or compat captcha.
    *     It will also be called with null, when captcha expires
    *  @param token string or null
    */
  var onChange: js.UndefOr[js.Function1[/* token */ String | Null, Unit]] = js.undefined
  /**
    *  Optional callback, called when reCAPTCHA encounters an error (usually network connectivity)
    *  and cannot continue until connectivity is restored. If you specify a function here, you are
    *  responsible for informing the user that they should retry.
    */
  var onErrored: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    *  Optional callback, called when a challenge expires and has to be redone by the user.
    */
  var onExpired: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    *  The API client key
    */
  var sitekey: String
  /**
    *  Optional compact, normal or invisible. This allows you to change the size or do an invisible captcha
    */
  var size: js.UndefOr[Size] = js.undefined
  /**
    *  Optional set the stoken parameter, which allows the captcha to be used from different domains,
    *  @see reCAPTCHA secure-token
    */
  var stoken: js.UndefOr[String] = js.undefined
  /**
    *  Optional the tabindex of the element
    *  @default 0
    */
  var tabindex: js.UndefOr[Double] = js.undefined
  /**
    *  Optional light or dark theme of the widget
    *  @default "light"
    */
  var theme: js.UndefOr[Theme] = js.undefined
  /**
    * Optional image or audio The type of initial captcha
    * @default "image"
    */
  var `type`: js.UndefOr[Type] = js.undefined
}

object ReCAPTCHAProps {
  @scala.inline
  def apply(
    sitekey: String,
    badge: Badge = null,
    grecaptcha: js.Object = null,
    hl: String = null,
    onChange: /* token */ String | Null => Unit = null,
    onErrored: () => Unit = null,
    onExpired: () => Unit = null,
    size: Size = null,
    stoken: String = null,
    tabindex: js.UndefOr[Double] = js.undefined,
    theme: Theme = null,
    `type`: Type = null
  ): ReCAPTCHAProps = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (grecaptcha != null) __obj.updateDynamic("grecaptcha")(grecaptcha.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onErrored != null) __obj.updateDynamic("onErrored")(js.Any.fromFunction0(onErrored))
    if (onExpired != null) __obj.updateDynamic("onExpired")(js.Any.fromFunction0(onExpired))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stoken != null) __obj.updateDynamic("stoken")(stoken.asInstanceOf[js.Any])
    if (!js.isUndefined(tabindex)) __obj.updateDynamic("tabindex")(tabindex.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReCAPTCHAProps]
  }
}

