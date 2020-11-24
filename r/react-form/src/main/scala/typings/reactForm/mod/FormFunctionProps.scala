package typings.reactForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactForm.mod.FormApi because var conflicts: errors, touched, values. Inlined warnings, successes, submits, submitted, asyncValidations, validating, validationFailures, validationFailed, submitForm, setValue, setAllValues, setError, setWarning, setSuccess, setTouched, setAllTouched, addValue, removeValue, swapValues, resetAll, getFormState, setFormState */ @js.native
trait FormFunctionProps
  extends FormProps
     with FormState {
  
  def addValue(name: String, value: js.Any): Unit = js.native
  
  var asyncValidations: Double = js.native
  
  def getFormState(): FormState = js.native
  
  def removeValue(name: String, index: Double): Unit = js.native
  
  def resetAll(): Unit = js.native
  
  def setAllTouched(touches: StringDictionary[Boolean]): Unit = js.native
  
  def setAllValues(values: FormValues): Unit = js.native
  
  def setError(field: String, error: String): Unit = js.native
  
  def setFormState(state: FormState): Unit = js.native
  
  def setSuccess(field: String, success: String): Unit = js.native
  
  def setTouched(field: String, touched: Boolean): Unit = js.native
  
  def setValue(fieldName: String, value: js.Any): Unit = js.native
  
  def setWarning(field: String, warning: String): Unit = js.native
  
  // Methods
  def submitForm(event: SyntheticEvent[_, Event]): Unit = js.native
  
  var submits: Double = js.native
  
  var submitted: Boolean = js.native
  
  var successes: FormErrors = js.native
  
  def swapValues(name: String, index1: Double, index2: Double): Unit = js.native
  
  var validating: StringDictionary[Boolean] = js.native
  
  var validationFailed: StringDictionary[Boolean] = js.native
  
  var validationFailures: Double = js.native
  
  var warnings: FormErrors = js.native
}
object FormFunctionProps {
  
  @scala.inline
  def apply(
    addValue: (String, js.Any) => Unit,
    asyncValidations: Double,
    errors: FormErrors,
    getFormState: () => FormState,
    nestedErrors: NestedErrors,
    removeValue: (String, Double) => Unit,
    resetAll: () => Unit,
    setAllTouched: StringDictionary[Boolean] => Unit,
    setAllValues: FormValues => Unit,
    setError: (String, String) => Unit,
    setFormState: FormState => Unit,
    setSuccess: (String, String) => Unit,
    setTouched: (String, Boolean) => Unit,
    setValue: (String, js.Any) => Unit,
    setWarning: (String, String) => Unit,
    submitForm: SyntheticEvent[_, Event] => Unit,
    submits: Double,
    submitted: Boolean,
    successes: FormErrors,
    swapValues: (String, Double, Double) => Unit,
    touched: Touched,
    validating: StringDictionary[Boolean],
    validationFailed: StringDictionary[Boolean],
    validationFailures: Double,
    values: FormValues,
    warnings: FormErrors
  ): FormFunctionProps = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), asyncValidations = asyncValidations.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getFormState = js.Any.fromFunction0(getFormState), nestedErrors = nestedErrors.asInstanceOf[js.Any], removeValue = js.Any.fromFunction2(removeValue), resetAll = js.Any.fromFunction0(resetAll), setAllTouched = js.Any.fromFunction1(setAllTouched), setAllValues = js.Any.fromFunction1(setAllValues), setError = js.Any.fromFunction2(setError), setFormState = js.Any.fromFunction1(setFormState), setSuccess = js.Any.fromFunction2(setSuccess), setTouched = js.Any.fromFunction2(setTouched), setValue = js.Any.fromFunction2(setValue), setWarning = js.Any.fromFunction2(setWarning), submitForm = js.Any.fromFunction1(submitForm), submits = submits.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], swapValues = js.Any.fromFunction3(swapValues), touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validationFailed = validationFailed.asInstanceOf[js.Any], validationFailures = validationFailures.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFunctionProps]
  }
  
  @scala.inline
  implicit class FormFunctionPropsOps[Self <: FormFunctionProps] (val x: Self) extends AnyVal {
    
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
    def setAddValue(value: (String, js.Any) => Unit): Self = this.set("addValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAsyncValidations(value: Double): Self = this.set("asyncValidations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFormState(value: () => FormState): Self = this.set("getFormState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveValue(value: (String, Double) => Unit): Self = this.set("removeValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResetAll(value: () => Unit): Self = this.set("resetAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAllTouched(value: StringDictionary[Boolean] => Unit): Self = this.set("setAllTouched", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllValues(value: FormValues => Unit): Self = this.set("setAllValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetError(value: (String, String) => Unit): Self = this.set("setError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFormState(value: FormState => Unit): Self = this.set("setFormState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSuccess(value: (String, String) => Unit): Self = this.set("setSuccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTouched(value: (String, Boolean) => Unit): Self = this.set("setTouched", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: (String, js.Any) => Unit): Self = this.set("setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetWarning(value: (String, String) => Unit): Self = this.set("setWarning", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubmitForm(value: SyntheticEvent[_, Event] => Unit): Self = this.set("submitForm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmits(value: Double): Self = this.set("submits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitted(value: Boolean): Self = this.set("submitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccesses(value: FormErrors): Self = this.set("successes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwapValues(value: (String, Double, Double) => Unit): Self = this.set("swapValues", js.Any.fromFunction3(value))
    
    @scala.inline
    def setValidating(value: StringDictionary[Boolean]): Self = this.set("validating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationFailed(value: StringDictionary[Boolean]): Self = this.set("validationFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationFailures(value: Double): Self = this.set("validationFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: FormErrors): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
}
