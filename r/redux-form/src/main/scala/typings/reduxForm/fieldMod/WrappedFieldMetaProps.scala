package typings.reduxForm.fieldMod

import typings.redux.mod.Dispatch
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
    val __obj = js.Dynamic.literal(asyncValidating = asyncValidating.asInstanceOf[js.Any], autofilled = autofilled.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), form = form.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldMetaProps]
  }
}

