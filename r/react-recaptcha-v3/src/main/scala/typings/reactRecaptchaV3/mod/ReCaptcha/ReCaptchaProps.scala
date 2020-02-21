package typings.reactRecaptchaV3.mod.ReCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReCaptchaProps extends js.Object {
  var action: String
  var elementID: js.UndefOr[String] = js.undefined
  var sitekey: String
  var verifyCallback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.undefined
  var verifyCallbackName: js.UndefOr[String] = js.undefined
}

object ReCaptchaProps {
  @scala.inline
  def apply(
    action: String,
    sitekey: String,
    elementID: String = null,
    verifyCallback: /* response */ String => Unit = null,
    verifyCallbackName: String = null
  ): ReCaptchaProps = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
    if (elementID != null) __obj.updateDynamic("elementID")(elementID.asInstanceOf[js.Any])
    if (verifyCallback != null) __obj.updateDynamic("verifyCallback")(js.Any.fromFunction1(verifyCallback))
    if (verifyCallbackName != null) __obj.updateDynamic("verifyCallbackName")(verifyCallbackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReCaptchaProps]
  }
}

