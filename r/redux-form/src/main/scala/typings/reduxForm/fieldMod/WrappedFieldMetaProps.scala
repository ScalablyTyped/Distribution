package typings.reduxForm.fieldMod

import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFieldMetaProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var asyncValidating: Boolean = js.native
  var autofilled: Boolean = js.native
  var dirty: Boolean = js.native
  var dispatch: Dispatch[_] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var form: String = js.native
  var initial: js.Any = js.native
  var invalid: Boolean = js.native
  var pristine: Boolean = js.native
  var submitFailed: Boolean = js.native
  var submitting: Boolean = js.native
  var touched: Boolean = js.native
  var valid: Boolean = js.native
  var visited: Boolean = js.native
  var warning: js.UndefOr[js.Any] = js.native
}

object WrappedFieldMetaProps {
  @scala.inline
  def apply(
    asyncValidating: Boolean,
    autofilled: Boolean,
    dirty: Boolean,
    dispatch: _ => _,
    form: String,
    initial: js.Any,
    invalid: Boolean,
    pristine: Boolean,
    submitFailed: Boolean,
    submitting: Boolean,
    touched: Boolean,
    valid: Boolean,
    visited: Boolean
  ): WrappedFieldMetaProps = {
    val __obj = js.Dynamic.literal(asyncValidating = asyncValidating.asInstanceOf[js.Any], autofilled = autofilled.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), form = form.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldMetaProps]
  }
  @scala.inline
  implicit class WrappedFieldMetaPropsOps[Self <: WrappedFieldMetaProps] (val x: Self) extends AnyVal {
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
    def setAsyncValidating(value: Boolean): Self = this.set("asyncValidating", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofilled(value: Boolean): Self = this.set("autofilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispatch(value: _ => _): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: js.Any): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPristine(value: Boolean): Self = this.set("pristine", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitFailed(value: Boolean): Self = this.set("submitFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitting(value: Boolean): Self = this.set("submitting", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouched(value: Boolean): Self = this.set("touched", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisited(value: Boolean): Self = this.set("visited", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
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

