package typings.reactDashSDashAlert.reactDashSDashAlertMod.SAlert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertBeepProps extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[String] = js.undefined
  var warning: js.UndefOr[String] = js.undefined
}

object SAlertBeepProps {
  @scala.inline
  def apply(error: String = null, info: String = null, success: String = null, warning: String = null): SAlertBeepProps = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAlertBeepProps]
  }
}

