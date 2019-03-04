package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidateCallback[FormData, ErrorType] extends js.Object {
  var asyncErrors: js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]] = js.undefined
  var blurredField: js.UndefOr[java.lang.String] = js.undefined
  var initialized: scala.Boolean
  var pristine: scala.Boolean
  var syncValidationPasses: scala.Boolean
  var trigger: reduxDashFormLib.reduxDashFormLibStrings.blur | reduxDashFormLib.reduxDashFormLibStrings.submit
}

object AsyncValidateCallback {
  @scala.inline
  def apply[FormData, ErrorType](
    initialized: scala.Boolean,
    pristine: scala.Boolean,
    syncValidationPasses: scala.Boolean,
    trigger: reduxDashFormLib.reduxDashFormLibStrings.blur | reduxDashFormLib.reduxDashFormLibStrings.submit,
    asyncErrors: reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType] = null,
    blurredField: java.lang.String = null
  ): AsyncValidateCallback[FormData, ErrorType] = {
    val __obj = js.Dynamic.literal(initialized = initialized, pristine = pristine, syncValidationPasses = syncValidationPasses, trigger = trigger.asInstanceOf[js.Any])
    if (asyncErrors != null) __obj.updateDynamic("asyncErrors")(asyncErrors)
    if (blurredField != null) __obj.updateDynamic("blurredField")(blurredField)
    __obj.asInstanceOf[AsyncValidateCallback[FormData, ErrorType]]
  }
}

