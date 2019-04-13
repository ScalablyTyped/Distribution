package typings
package reactDashRecaptchaLib.reactDashRecaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecaptchaProps extends js.Object {
  var badge: js.UndefOr[
    reactDashRecaptchaLib.reactDashRecaptchaLibStrings.bottomright | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.bottomleft | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.`inline`
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var elementID: js.UndefOr[java.lang.String] = js.undefined
  var expiredCallback: js.UndefOr[js.Function0[_]] = js.undefined
  var expiredCallbackName: js.UndefOr[java.lang.String] = js.undefined
  var hl: js.UndefOr[java.lang.String] = js.undefined
  var onloadCallback: js.UndefOr[js.Function0[_]] = js.undefined
  var onloadCallbackName: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[
    reactDashRecaptchaLib.reactDashRecaptchaLibStrings.onload | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.explicit
  ] = js.undefined
  var sitekey: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    reactDashRecaptchaLib.reactDashRecaptchaLibStrings.normal | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.compact | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.invisible
  ] = js.undefined
  var tabindex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var theme: js.UndefOr[
    reactDashRecaptchaLib.reactDashRecaptchaLibStrings.dark | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.light
  ] = js.undefined
  var `type`: js.UndefOr[
    reactDashRecaptchaLib.reactDashRecaptchaLibStrings.audio | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.image
  ] = js.undefined
  var verifyCallback: js.UndefOr[js.Function1[/* response */ java.lang.String, _]] = js.undefined
  var verifyCallbackName: js.UndefOr[java.lang.String] = js.undefined
}

object RecaptchaProps {
  @scala.inline
  def apply(
    badge: reactDashRecaptchaLib.reactDashRecaptchaLibStrings.bottomright | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.bottomleft | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.`inline` = null,
    className: java.lang.String = null,
    elementID: java.lang.String = null,
    expiredCallback: () => _ = null,
    expiredCallbackName: java.lang.String = null,
    hl: java.lang.String = null,
    onloadCallback: () => _ = null,
    onloadCallbackName: java.lang.String = null,
    render: reactDashRecaptchaLib.reactDashRecaptchaLibStrings.onload | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.explicit = null,
    sitekey: java.lang.String = null,
    size: reactDashRecaptchaLib.reactDashRecaptchaLibStrings.normal | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.compact | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.invisible = null,
    tabindex: scala.Double | java.lang.String = null,
    theme: reactDashRecaptchaLib.reactDashRecaptchaLibStrings.dark | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.light = null,
    `type`: reactDashRecaptchaLib.reactDashRecaptchaLibStrings.audio | reactDashRecaptchaLib.reactDashRecaptchaLibStrings.image = null,
    verifyCallback: /* response */ java.lang.String => _ = null,
    verifyCallbackName: java.lang.String = null
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

