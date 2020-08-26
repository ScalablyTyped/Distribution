package typings.reduxForm.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldArrayMetaProps extends js.Object {
  var dirty: Boolean = js.native
  var error: js.UndefOr[js.Any] = js.native
  var form: String = js.native
  var invalid: Boolean = js.native
  var pristine: Boolean = js.native
  var submitFailed: Boolean = js.native
  var submitting: Boolean = js.native
  var valid: Boolean = js.native
  var warning: js.UndefOr[js.Any] = js.native
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
    valid: Boolean
  ): FieldArrayMetaProps = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldArrayMetaProps]
  }
  @scala.inline
  implicit class FieldArrayMetaPropsOps[Self <: FieldArrayMetaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPristine(value: Boolean): Self = this.set("pristine", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitFailed(value: Boolean): Self = this.set("submitFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitting(value: Boolean): Self = this.set("submitting", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setWarning(value: js.Any): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

