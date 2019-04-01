package typings
package primereactLib.componentsCaptchaCaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptchaProps extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var onExpire: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onResponse: js.UndefOr[js.Function1[/* response */ js.Any, scala.Unit]] = js.undefined
  var siteKey: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CaptchaProps {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    language: java.lang.String = null,
    onExpire: () => scala.Unit = null,
    onResponse: /* response */ js.Any => scala.Unit = null,
    siteKey: java.lang.String = null,
    size: java.lang.String = null,
    tabIndex: scala.Int | scala.Double = null,
    theme: java.lang.String = null,
    `type`: java.lang.String = null
  ): CaptchaProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (onExpire != null) __obj.updateDynamic("onExpire")(js.Any.fromFunction0(onExpire))
    if (onResponse != null) __obj.updateDynamic("onResponse")(js.Any.fromFunction1(onResponse))
    if (siteKey != null) __obj.updateDynamic("siteKey")(siteKey)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CaptchaProps]
  }
}

