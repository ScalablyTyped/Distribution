package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedFormProps[FormData, P, ErrorType] extends js.Object {
  var anyTouched: scala.Boolean
  var array: InjectedArrayProps
  var asyncValidating: java.lang.String | scala.Boolean
  var dirty: scala.Boolean
  var error: ErrorType
  var form: java.lang.String
  var handleSubmit: SubmitHandler[FormData, P, ErrorType]
  var initialValues: stdLib.Partial[FormData]
  var initialized: scala.Boolean
  var invalid: scala.Boolean
  var pristine: scala.Boolean
  var registeredFields: org.scalablytyped.runtime.StringDictionary[RegisteredField]
  var submitFailed: scala.Boolean
  var submitSucceeded: scala.Boolean
  var submitting: scala.Boolean
  var valid: scala.Boolean
  var warning: js.Any
  def asyncValidate(): scala.Unit
  def autofill[F /* <: java.lang.String */](field: F, value: /* import warning: ImportType.apply Failed type conversion: FormData[F] */ js.Any): scala.Unit
  def blur[F /* <: java.lang.String */](field: F, value: /* import warning: ImportType.apply Failed type conversion: FormData[F] */ js.Any): scala.Unit
  def change[F /* <: java.lang.String */](field: F, value: /* import warning: ImportType.apply Failed type conversion: FormData[F] */ js.Any): scala.Unit
  def clearAsyncError(field: java.lang.String): scala.Unit
  def destroy(): scala.Unit
  def initialize(data: stdLib.Partial[FormData]): scala.Unit
  def reset(): scala.Unit
  def touch(field: java.lang.String*): scala.Unit
  def untouch(field: java.lang.String*): scala.Unit
}

object InjectedFormProps {
  @scala.inline
  def apply[FormData, P, ErrorType](
    anyTouched: scala.Boolean,
    array: InjectedArrayProps,
    asyncValidate: () => scala.Unit,
    asyncValidating: java.lang.String | scala.Boolean,
    autofill: (js.Any, /* import warning: ImportType.apply Failed type conversion: FormData[F] */ js.Any) => scala.Unit,
    blur: (js.Any, /* import warning: ImportType.apply Failed type conversion: FormData[F] */ js.Any) => scala.Unit,
    change: (js.Any, /* import warning: ImportType.apply Failed type conversion: FormData[F] */ js.Any) => scala.Unit,
    clearAsyncError: java.lang.String => scala.Unit,
    destroy: () => scala.Unit,
    dirty: scala.Boolean,
    error: ErrorType,
    form: java.lang.String,
    handleSubmit: SubmitHandler[FormData, P, ErrorType],
    initialValues: stdLib.Partial[FormData],
    initialize: stdLib.Partial[FormData] => scala.Unit,
    initialized: scala.Boolean,
    invalid: scala.Boolean,
    pristine: scala.Boolean,
    registeredFields: org.scalablytyped.runtime.StringDictionary[RegisteredField],
    reset: () => scala.Unit,
    submitFailed: scala.Boolean,
    submitSucceeded: scala.Boolean,
    submitting: scala.Boolean,
    touch: /* repeated */ java.lang.String => scala.Unit,
    untouch: /* repeated */ java.lang.String => scala.Unit,
    valid: scala.Boolean,
    warning: js.Any
  ): InjectedFormProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(anyTouched = anyTouched, array = array, asyncValidate = js.Any.fromFunction0(asyncValidate), asyncValidating = asyncValidating.asInstanceOf[js.Any], autofill = js.Any.fromFunction2(autofill), blur = js.Any.fromFunction2(blur), change = js.Any.fromFunction2(change), clearAsyncError = js.Any.fromFunction1(clearAsyncError), destroy = js.Any.fromFunction0(destroy), dirty = dirty, error = error.asInstanceOf[js.Any], form = form, handleSubmit = handleSubmit, initialValues = initialValues, initialize = js.Any.fromFunction1(initialize), initialized = initialized, invalid = invalid, pristine = pristine, registeredFields = registeredFields, reset = js.Any.fromFunction0(reset), submitFailed = submitFailed, submitSucceeded = submitSucceeded, submitting = submitting, touch = js.Any.fromFunction1(touch), untouch = js.Any.fromFunction1(untouch), valid = valid, warning = warning)
  
    __obj.asInstanceOf[InjectedFormProps[FormData, P, ErrorType]]
  }
}

