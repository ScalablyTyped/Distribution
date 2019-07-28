package typings.reduxDashForm.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldArrayMetaProps extends js.Object {
  var dirty: Boolean
  var error: js.UndefOr[js.Any] = js.undefined
  var form: String
  var invalid: Boolean
  var pristine: Boolean
  var submitFailed: Boolean
  var submitting: Boolean
  var valid: Boolean
  var warning: js.UndefOr[js.Any] = js.undefined
}

object FieldArrayMetaProps {
  @scala.inline
  def apply(
    dirty: Boolean,
    form: String,
    invalid: Boolean,
    pristine: Boolean,
    submitFailed: Boolean,
    submitting: Boolean,
    valid: Boolean,
    error: js.Any = null,
    warning: js.Any = null
  ): FieldArrayMetaProps = {
    val __obj = js.Dynamic.literal(dirty = dirty, form = form, invalid = invalid, pristine = pristine, submitFailed = submitFailed, submitting = submitting, valid = valid)
    if (error != null) __obj.updateDynamic("error")(error)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[FieldArrayMetaProps]
  }
}

