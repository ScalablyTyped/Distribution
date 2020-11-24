package typings.reduxForm.reduxFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reducerMod.FieldState
import typings.reduxForm.reducerMod.RegisteredFieldState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined redux-form.redux-form/lib/reducer.FormState & {  asyncErrors :redux-form.redux-form.FormErrors<FormData, ErrorType> | undefined,   asyncValidating :boolean,   dirty :boolean,   error :any | undefined,   initialized :boolean,   invalid :boolean,   pristine :boolean,   submitSucceeded :boolean,   syncErrors :redux-form.redux-form.FormErrors<FormData, ErrorType> | undefined,   syncWarnings :redux-form.redux-form.FormWarnings<any, any> | undefined,   triggerSubmit :boolean | undefined,   valid :boolean,   validExceptSubmit :boolean,   warning :any | undefined} */
@js.native
trait DecoratedFormState[FormData, ErrorType] extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var anyTouched: js.UndefOr[Boolean] = js.native
  
  var asyncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.native
  
  var asyncValidating: Boolean = js.native
  
  var dirty: Boolean = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var fields: js.UndefOr[StringDictionary[FieldState]] = js.native
  
  var initialized: Boolean = js.native
  
  var invalid: Boolean = js.native
  
  var pristine: Boolean = js.native
  
  var registeredFields: js.Array[RegisteredFieldState] = js.native
  
  var submitErrors: js.UndefOr[StringDictionary[String]] = js.native
  
  var submitFailed: js.UndefOr[Boolean] = js.native
  
  var submitSucceeded: Boolean = js.native
  
  var submitting: js.UndefOr[Boolean] = js.native
  
  var syncErrors: js.UndefOr[FormErrors[FormData, ErrorType]] = js.native
  
  var syncWarnings: js.UndefOr[FormWarnings[_, _]] = js.native
  
  var triggerSubmit: js.UndefOr[Boolean] = js.native
  
  var valid: Boolean = js.native
  
  var validExceptSubmit: Boolean = js.native
  
  var values: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var warning: js.UndefOr[js.Any] = js.native
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
    validExceptSubmit: Boolean
  ): DecoratedFormState[FormData, ErrorType] = {
    val __obj = js.Dynamic.literal(asyncValidating = asyncValidating.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], registeredFields = registeredFields.asInstanceOf[js.Any], submitSucceeded = submitSucceeded.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validExceptSubmit = validExceptSubmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedFormState[FormData, ErrorType]]
  }
  
  @scala.inline
  implicit class DecoratedFormStateOps[Self <: DecoratedFormState[_, _], FormData, ErrorType] (val x: Self with (DecoratedFormState[FormData, ErrorType])) extends AnyVal {
    
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
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialized(value: Boolean): Self = this.set("initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPristine(value: Boolean): Self = this.set("pristine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredFieldsVarargs(value: RegisteredFieldState*): Self = this.set("registeredFields", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredFields(value: js.Array[RegisteredFieldState]): Self = this.set("registeredFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitSucceeded(value: Boolean): Self = this.set("submitSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidExceptSubmit(value: Boolean): Self = this.set("validExceptSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAnyTouched(value: Boolean): Self = this.set("anyTouched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyTouched: Self = this.set("anyTouched", js.undefined)
    
    @scala.inline
    def setAsyncErrors(value: FormErrors[FormData, ErrorType]): Self = this.set("asyncErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncErrors: Self = this.set("asyncErrors", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFields(value: StringDictionary[FieldState]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setSubmitErrors(value: StringDictionary[String]): Self = this.set("submitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitErrors: Self = this.set("submitErrors", js.undefined)
    
    @scala.inline
    def setSubmitFailed(value: Boolean): Self = this.set("submitFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitFailed: Self = this.set("submitFailed", js.undefined)
    
    @scala.inline
    def setSubmitting(value: Boolean): Self = this.set("submitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitting: Self = this.set("submitting", js.undefined)
    
    @scala.inline
    def setSyncErrors(value: FormErrors[FormData, ErrorType]): Self = this.set("syncErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncErrors: Self = this.set("syncErrors", js.undefined)
    
    @scala.inline
    def setSyncWarnings(value: FormWarnings[_, _]): Self = this.set("syncWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncWarnings: Self = this.set("syncWarnings", js.undefined)
    
    @scala.inline
    def setTriggerSubmit(value: Boolean): Self = this.set("triggerSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerSubmit: Self = this.set("triggerSubmit", js.undefined)
    
    @scala.inline
    def setValues(value: StringDictionary[js.Any]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setWarning(value: js.Any): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
