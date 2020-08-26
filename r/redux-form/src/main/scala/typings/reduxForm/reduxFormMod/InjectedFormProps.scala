package typings.reduxForm.reduxFormMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedFormProps[FormData, P, ErrorType] extends js.Object {
  var anyTouched: Boolean = js.native
  var array: InjectedArrayProps = js.native
  var asyncValidating: String | Boolean = js.native
  var dirty: Boolean = js.native
  var error: ErrorType = js.native
  var form: String = js.native
  var handleSubmit: SubmitHandler[FormData, P, ErrorType] = js.native
  var initialValues: Partial[FormData] = js.native
  var initialized: Boolean = js.native
  var invalid: Boolean = js.native
  var pristine: Boolean = js.native
  var submitFailed: Boolean = js.native
  var submitSucceeded: Boolean = js.native
  var submitting: Boolean = js.native
  var valid: Boolean = js.native
  var warning: js.Any = js.native
  def asyncValidate(): Unit = js.native
  def autofill(field: String, value: js.Any): Unit = js.native
  def blur(field: String, value: js.Any): Unit = js.native
  def change(field: String, value: js.Any): Unit = js.native
  def clearAsyncError(field: String): Unit = js.native
  def clearSubmit(): Unit = js.native
  def destroy(): Unit = js.native
  def initialize(data: Partial[FormData]): Unit = js.native
  def reset(): Unit = js.native
  def touch(field: String*): Unit = js.native
  def untouch(field: String*): Unit = js.native
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
    clearSubmit: () => Unit,
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
    reset: () => Unit,
    submitFailed: Boolean,
    submitSucceeded: Boolean,
    submitting: Boolean,
    touch: /* repeated */ String => Unit,
    untouch: /* repeated */ String => Unit,
    valid: Boolean,
    warning: js.Any
  ): InjectedFormProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(anyTouched = anyTouched.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], asyncValidate = js.Any.fromFunction0(asyncValidate), asyncValidating = asyncValidating.asInstanceOf[js.Any], autofill = js.Any.fromFunction2(autofill), blur = js.Any.fromFunction2(blur), change = js.Any.fromFunction2(change), clearAsyncError = js.Any.fromFunction1(clearAsyncError), clearSubmit = js.Any.fromFunction0(clearSubmit), destroy = js.Any.fromFunction0(destroy), dirty = dirty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], handleSubmit = handleSubmit.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), initialized = initialized.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), submitFailed = submitFailed.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touch = js.Any.fromFunction1(touch), untouch = js.Any.fromFunction1(untouch), valid = valid.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedFormProps[FormData, P, ErrorType]]
  }
  @scala.inline
  implicit class InjectedFormPropsOps[Self <: InjectedFormProps[_, _, _], FormData, P, ErrorType] (val x: Self with (InjectedFormProps[FormData, P, ErrorType])) extends AnyVal {
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
    def setAnyTouched(value: Boolean): Self = this.set("anyTouched", value.asInstanceOf[js.Any])
    @scala.inline
    def setArray(value: InjectedArrayProps): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncValidate(value: () => Unit): Self = this.set("asyncValidate", js.Any.fromFunction0(value))
    @scala.inline
    def setAsyncValidating(value: String | Boolean): Self = this.set("asyncValidating", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofill(value: (String, js.Any) => Unit): Self = this.set("autofill", js.Any.fromFunction2(value))
    @scala.inline
    def setBlur(value: (String, js.Any) => Unit): Self = this.set("blur", js.Any.fromFunction2(value))
    @scala.inline
    def setChange(value: (String, js.Any) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def setClearAsyncError(value: String => Unit): Self = this.set("clearAsyncError", js.Any.fromFunction1(value))
    @scala.inline
    def setClearSubmit(value: () => Unit): Self = this.set("clearSubmit", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorType): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandleSubmit(value: SubmitHandler[FormData, P, ErrorType]): Self = this.set("handleSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialValues(value: Partial[FormData]): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialize(value: Partial[FormData] => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setInitialized(value: Boolean): Self = this.set("initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPristine(value: Boolean): Self = this.set("pristine", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSubmitFailed(value: Boolean): Self = this.set("submitFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitSucceeded(value: Boolean): Self = this.set("submitSucceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitting(value: Boolean): Self = this.set("submitting", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouch(value: /* repeated */ String => Unit): Self = this.set("touch", js.Any.fromFunction1(value))
    @scala.inline
    def setUntouch(value: /* repeated */ String => Unit): Self = this.set("untouch", js.Any.fromFunction1(value))
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: js.Any): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

