package typings.reduxDashForm.libReduxFormMod

import typings.reduxDashForm.reduxDashFormMod.FormErrors
import typings.reduxDashForm.reduxDashFormStrings.blur
import typings.reduxDashForm.reduxDashFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidateCallback[FormData, ErrorType] extends js.Object {
  var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.undefined
  var blurredField: js.UndefOr[String] = js.undefined
  var initialized: Boolean
  var pristine: Boolean
  var syncValidationPasses: Boolean
  var trigger: blur | submit
}

object AsyncValidateCallback {
  @scala.inline
  def apply[FormData, ErrorType](
    initialized: Boolean,
    pristine: Boolean,
    syncValidationPasses: Boolean,
    trigger: blur | submit,
    asyncErrors: FormErrors[FormData, ErrorType] = null,
    blurredField: String = null
  ): AsyncValidateCallback[FormData, ErrorType] = {
    val __obj = js.Dynamic.literal(initialized = initialized, pristine = pristine, syncValidationPasses = syncValidationPasses, trigger = trigger.asInstanceOf[js.Any])
    if (asyncErrors != null) __obj.updateDynamic("asyncErrors")(asyncErrors)
    if (blurredField != null) __obj.updateDynamic("blurredField")(blurredField)
    __obj.asInstanceOf[AsyncValidateCallback[FormData, ErrorType]]
  }
}

