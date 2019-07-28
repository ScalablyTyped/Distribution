package typings.reduxDashForm.libReduxFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedFormProps[FormData, P, ErrorType] extends js.Object {
  var anyTouched: Boolean
  var array: InjectedArrayProps
  var asyncValidating: String | Boolean
  var dirty: Boolean
  var error: ErrorType
  var form: String
  var handleSubmit: SubmitHandler[FormData, P, ErrorType]
  var initialValues: Partial[FormData]
  var initialized: Boolean
  var invalid: Boolean
  var pristine: Boolean
  var registeredFields: StringDictionary[RegisteredField]
  var submitFailed: Boolean
  var submitSucceeded: Boolean
  var submitting: Boolean
  var valid: Boolean
  var warning: js.Any
  def asyncValidate(): Unit
  def autofill(field: String, value: js.Any): Unit
  def blur(field: String, value: js.Any): Unit
  def change(field: String, value: js.Any): Unit
  def clearAsyncError(field: String): Unit
  def destroy(): Unit
  def initialize(data: Partial[FormData]): Unit
  def reset(): Unit
  def touch(field: String*): Unit
  def untouch(field: String*): Unit
}

object InjectedFormProps {
  @scala.inline
  def apply[FormData, P, ErrorType](
    anyTouched: Boolean,
    array: InjectedArrayProps,
    asyncValidate: () => Unit,
    asyncValidating: String | Boolean,
    autofill: (String, js.Any) => Unit,
    blur: (String, js.Any) => Unit,
    change: (String, js.Any) => Unit,
    clearAsyncError: String => Unit,
    destroy: () => Unit,
    dirty: Boolean,
    error: ErrorType,
    form: String,
    handleSubmit: SubmitHandler[FormData, P, ErrorType],
    initialValues: Partial[FormData],
    initialize: Partial[FormData] => Unit,
    initialized: Boolean,
    invalid: Boolean,
    pristine: Boolean,
    registeredFields: StringDictionary[RegisteredField],
    reset: () => Unit,
    submitFailed: Boolean,
    submitSucceeded: Boolean,
    submitting: Boolean,
    touch: /* repeated */ String => Unit,
    untouch: /* repeated */ String => Unit,
    valid: Boolean,
    warning: js.Any
  ): InjectedFormProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(anyTouched = anyTouched, array = array, asyncValidate = js.Any.fromFunction0(asyncValidate), asyncValidating = asyncValidating.asInstanceOf[js.Any], autofill = js.Any.fromFunction2(autofill), blur = js.Any.fromFunction2(blur), change = js.Any.fromFunction2(change), clearAsyncError = js.Any.fromFunction1(clearAsyncError), destroy = js.Any.fromFunction0(destroy), dirty = dirty, error = error.asInstanceOf[js.Any], form = form, handleSubmit = handleSubmit, initialValues = initialValues, initialize = js.Any.fromFunction1(initialize), initialized = initialized, invalid = invalid, pristine = pristine, registeredFields = registeredFields, reset = js.Any.fromFunction0(reset), submitFailed = submitFailed, submitSucceeded = submitSucceeded, submitting = submitting, touch = js.Any.fromFunction1(touch), untouch = js.Any.fromFunction1(untouch), valid = valid, warning = warning)
  
    __obj.asInstanceOf[InjectedFormProps[FormData, P, ErrorType]]
  }
}

