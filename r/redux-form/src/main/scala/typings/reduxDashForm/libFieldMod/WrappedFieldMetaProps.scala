package typings.reduxDashForm.libFieldMod

import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedFieldMetaProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var asyncValidating: Boolean
  var autofilled: Boolean
  var dirty: Boolean
  var dispatch: Dispatch[_]
  var error: js.UndefOr[js.Any] = js.undefined
  var form: String
  var initial: js.Any
  var invalid: Boolean
  var pristine: Boolean
  var submitFailed: Boolean
  var submitting: Boolean
  var touched: Boolean
  var valid: Boolean
  var visited: Boolean
  var warning: js.UndefOr[js.Any] = js.undefined
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
    visited: Boolean,
    active: js.UndefOr[Boolean] = js.undefined,
    error: js.Any = null,
    warning: js.Any = null
  ): WrappedFieldMetaProps = {
    val __obj = js.Dynamic.literal(asyncValidating = asyncValidating, autofilled = autofilled, dirty = dirty, dispatch = js.Any.fromFunction1(dispatch), form = form, initial = initial, invalid = invalid, pristine = pristine, submitFailed = submitFailed, submitting = submitting, touched = touched, valid = valid, visited = visited)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (error != null) __obj.updateDynamic("error")(error)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[WrappedFieldMetaProps]
  }
}

