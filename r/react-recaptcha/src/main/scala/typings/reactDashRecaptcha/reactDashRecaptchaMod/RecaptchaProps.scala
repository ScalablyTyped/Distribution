package typings.reactDashRecaptcha.reactDashRecaptchaMod

import typings.reactDashRecaptcha.reactDashRecaptchaStrings.`inline`
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.audio
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.bottomleft
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.bottomright
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.compact
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.dark
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.explicit
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.image
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.invisible
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.light
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.normal
import typings.reactDashRecaptcha.reactDashRecaptchaStrings.onload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecaptchaProps extends js.Object {
  var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var elementID: js.UndefOr[String] = js.undefined
  var expiredCallback: js.UndefOr[js.Function0[_]] = js.undefined
  var expiredCallbackName: js.UndefOr[String] = js.undefined
  var hl: js.UndefOr[String] = js.undefined
  var onloadCallback: js.UndefOr[js.Function0[_]] = js.undefined
  var onloadCallbackName: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[onload | explicit] = js.undefined
  var sitekey: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[normal | compact | invisible] = js.undefined
  var tabindex: js.UndefOr[Double | String] = js.undefined
  var theme: js.UndefOr[dark | light] = js.undefined
  var `type`: js.UndefOr[audio | image] = js.undefined
  var verifyCallback: js.UndefOr[js.Function1[/* response */ String, _]] = js.undefined
  var verifyCallbackName: js.UndefOr[String] = js.undefined
}

object RecaptchaProps {
  @scala.inline
  def apply(
    badge: bottomright | bottomleft | `inline` = null,
    className: String = null,
    elementID: String = null,
    expiredCallback: () => _ = null,
    expiredCallbackName: String = null,
    hl: String = null,
    onloadCallback: () => _ = null,
    onloadCallbackName: String = null,
    render: onload | explicit = null,
    sitekey: String = null,
    size: normal | compact | invisible = null,
    tabindex: Double | String = null,
    theme: dark | light = null,
    `type`: audio | image = null,
    verifyCallback: /* response */ String => _ = null,
    verifyCallbackName: String = null
  ): RecaptchaProps = {
    val __obj = js.Dynamic.literal()
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (elementID != null) __obj.updateDynamic("elementID")(elementID)
    if (expiredCallback != null) __obj.updateDynamic("expiredCallback")(js.Any.fromFunction0(expiredCallback))
    if (expiredCallbackName != null) __obj.updateDynamic("expiredCallbackName")(expiredCallbackName)
    if (hl != null) __obj.updateDynamic("hl")(hl)
    if (onloadCallback != null) __obj.updateDynamic("onloadCallback")(js.Any.fromFunction0(onloadCallback))
    if (onloadCallbackName != null) __obj.updateDynamic("onloadCallbackName")(onloadCallbackName)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (sitekey != null) __obj.updateDynamic("sitekey")(sitekey)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verifyCallback != null) __obj.updateDynamic("verifyCallback")(js.Any.fromFunction1(verifyCallback))
    if (verifyCallbackName != null) __obj.updateDynamic("verifyCallbackName")(verifyCallbackName)
    __obj.asInstanceOf[RecaptchaProps]
  }
}

