package typings.reduxForm.reduxFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reducerMod.FieldState
import typings.reduxForm.reducerMod.RegisteredFieldState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux-form.redux-form/lib/reducer.FormState & {  asyncErrors ? :redux-form.redux-form.FormErrors<FormData, ErrorType>,   asyncValidating  :boolean,   dirty  :boolean,   error ? :any,   initialized  :boolean,   invalid  :boolean,   pristine  :boolean,   submitSucceeded  :boolean,   syncErrors ? :redux-form.redux-form.FormErrors<FormData, ErrorType>,   syncWarnings ? :redux-form.redux-form.FormWarnings<any, any>,   triggerSubmit ? :boolean,   valid  :boolean,   validExceptSubmit  :boolean,   warning ? :any} */
trait DecoratedFormState[FormData, ErrorType] extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var anyTouched: js.UndefOr[Boolean] = js.undefined
  var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.undefined
  var asyncValidating: Boolean
  var dirty: Boolean
  var error: js.UndefOr[js.Any] = js.undefined
  var fields: js.UndefOr[StringDictionary[FieldState]] = js.undefined
  var initialized: Boolean
  var invalid: Boolean
  var pristine: Boolean
  var registeredFields: js.Array[RegisteredFieldState]
  var submitErrors: js.UndefOr[StringDictionary[String]] = js.undefined
  var submitFailed: js.UndefOr[Boolean] = js.undefined
  var submitSucceeded: Boolean
  var submitting: js.UndefOr[Boolean] = js.undefined
  var syncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.undefined
  var syncWarnings: js.UndefOr[FormWarnings[_, _]] = js.undefined
  var triggerSubmit: js.UndefOr[Boolean] = js.undefined
  var valid: Boolean
  var validExceptSubmit: Boolean
  var values: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var warning: js.UndefOr[js.Any] = js.undefined
}

object DecoratedFormState {
  @scala.inline
  def apply[FormData, ErrorType](
    asyncValidating: Boolean,
    dirty: Boolean,
    initialized: Boolean,
    invalid: Boolean,
    pristine: Boolean,
    registeredFields: js.Array[RegisteredFieldState],
    submitSucceeded: Boolean,
    valid: Boolean,
    validExceptSubmit: Boolean,
    active: String = null,
    anyTouched: js.UndefOr[Boolean] = js.undefined,
    asyncErrors: FormErrors[FormData, ErrorType] = null,
    error: js.Any = null,
    fields: StringDictionary[FieldState] = null,
    submitErrors: StringDictionary[String] = null,
    submitFailed: js.UndefOr[Boolean] = js.undefined,
    submitting: js.UndefOr[Boolean] = js.undefined,
    syncErrors: FormErrors[FormData, ErrorType] = null,
    syncWarnings: FormWarnings[_, _] = null,
    triggerSubmit: js.UndefOr[Boolean] = js.undefined,
    values: StringDictionary[js.Any] = null,
    warning: js.Any = null
  ): DecoratedFormState[FormData, ErrorType] = {
    val __obj = js.Dynamic.literal(asyncValidating = asyncValidating.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], registeredFields = registeredFields.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validExceptSubmit = validExceptSubmit.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(anyTouched)) __obj.updateDynamic("anyTouched")(anyTouched.get.asInstanceOf[js.Any])
    if (asyncErrors != null) __obj.updateDynamic("asyncErrors")(asyncErrors.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (submitErrors != null) __obj.updateDynamic("submitErrors")(submitErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(submitFailed)) __obj.updateDynamic("submitFailed")(submitFailed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(submitting)) __obj.updateDynamic("submitting")(submitting.get.asInstanceOf[js.Any])
    if (syncErrors != null) __obj.updateDynamic("syncErrors")(syncErrors.asInstanceOf[js.Any])
    if (syncWarnings != null) __obj.updateDynamic("syncWarnings")(syncWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerSubmit)) __obj.updateDynamic("triggerSubmit")(triggerSubmit.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedFormState[FormData, ErrorType]]
  }
}

