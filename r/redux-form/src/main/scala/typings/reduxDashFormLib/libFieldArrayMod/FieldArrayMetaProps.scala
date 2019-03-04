package typings
package reduxDashFormLib.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldArrayMetaProps extends js.Object {
  var dirty: scala.Boolean
  var error: js.UndefOr[js.Any] = js.undefined
  var form: java.lang.String
  var invalid: scala.Boolean
  var pristine: scala.Boolean
  var submitFailed: scala.Boolean
  var submitting: scala.Boolean
  var valid: scala.Boolean
  var warning: js.UndefOr[js.Any] = js.undefined
}

object FieldArrayMetaProps {
  @scala.inline
  def apply(
    dirty: scala.Boolean,
    form: java.lang.String,
    invalid: scala.Boolean,
    pristine: scala.Boolean,
    submitFailed: scala.Boolean,
    submitting: scala.Boolean,
    valid: scala.Boolean,
    error: js.Any = null,
    warning: js.Any = null
  ): FieldArrayMetaProps = {
    val __obj = js.Dynamic.literal(dirty = dirty, form = form, invalid = invalid, pristine = pristine, submitFailed = submitFailed, submitting = submitting, valid = valid)
    if (error != null) __obj.updateDynamic("error")(error)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[FieldArrayMetaProps]
  }
}

