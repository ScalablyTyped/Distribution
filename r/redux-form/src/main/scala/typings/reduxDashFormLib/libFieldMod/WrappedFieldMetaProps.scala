package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedFieldMetaProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var asyncValidating: scala.Boolean
  var autofilled: scala.Boolean
  var dirty: scala.Boolean
  var dispatch: reduxLib.reduxMod.Dispatch[_]
  var error: js.UndefOr[js.Any] = js.undefined
  var form: java.lang.String
  var initial: js.Any
  var invalid: scala.Boolean
  var pristine: scala.Boolean
  var submitFailed: scala.Boolean
  var submitting: scala.Boolean
  var touched: scala.Boolean
  var valid: scala.Boolean
  var visited: scala.Boolean
  var warning: js.UndefOr[js.Any] = js.undefined
}

object WrappedFieldMetaProps {
  @scala.inline
  def apply(
    asyncValidating: scala.Boolean,
    autofilled: scala.Boolean,
    dirty: scala.Boolean,
    dispatch: reduxLib.reduxMod.Dispatch[_],
    form: java.lang.String,
    initial: js.Any,
    invalid: scala.Boolean,
    pristine: scala.Boolean,
    submitFailed: scala.Boolean,
    submitting: scala.Boolean,
    touched: scala.Boolean,
    valid: scala.Boolean,
    visited: scala.Boolean,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Any = null,
    warning: js.Any = null
  ): WrappedFieldMetaProps = {
    val __obj = js.Dynamic.literal(asyncValidating = asyncValidating, autofilled = autofilled, dirty = dirty, dispatch = dispatch, form = form, initial = initial, invalid = invalid, pristine = pristine, submitFailed = submitFailed, submitting = submitting, touched = touched, valid = valid, visited = visited)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (error != null) __obj.updateDynamic("error")(error)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[WrappedFieldMetaProps]
  }
}

