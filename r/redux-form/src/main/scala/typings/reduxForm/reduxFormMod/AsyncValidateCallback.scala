package typings.reduxForm.reduxFormMod

import typings.reduxForm.mod.FormErrors
import typings.reduxForm.reduxFormStrings.blur
import typings.reduxForm.reduxFormStrings.submit
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
    val __obj = js.Dynamic.literal(initialized = initialized.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], syncValidationPasses = syncValidationPasses.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (asyncErrors != null) __obj.updateDynamic("asyncErrors")(asyncErrors.asInstanceOf[js.Any])
    if (blurredField != null) __obj.updateDynamic("blurredField")(blurredField.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncValidateCallback[FormData, ErrorType]]
  }
}

