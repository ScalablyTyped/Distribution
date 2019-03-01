package typings
package reactDashSDashAlertLib.reactDashSDashAlertMod.SAlertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertBeepProps extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var info: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[java.lang.String] = js.undefined
  var warning: js.UndefOr[java.lang.String] = js.undefined
}

object SAlertBeepProps {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    info: java.lang.String = null,
    success: java.lang.String = null,
    warning: java.lang.String = null
  ): SAlertBeepProps = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (success != null) __obj.updateDynamic("success")(success)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[SAlertBeepProps]
  }
}

