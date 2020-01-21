package typings.reactForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormApi extends js.Object {
  var asyncValidations: Double
  var errors: FormErrors
  var submits: Double
  var submitted: Boolean
  var successes: FormErrors
  var touched: Touched
  var validating: StringDictionary[Boolean]
  var validationFailed: StringDictionary[Boolean]
  var validationFailures: Double
  // State
  var values: FormValues
  var warnings: FormErrors
  def addValue(name: String, value: js.Any): Unit
  def getFormState(): FormState
  def removeValue(name: String, index: Double): Unit
  def resetAll(): Unit
  def setAllTouched(touches: StringDictionary[Boolean]): Unit
  def setAllValues(values: FormValues): Unit
  def setError(field: String, error: String): Unit
  def setFormState(state: FormState): Unit
  def setSuccess(field: String, success: String): Unit
  def setTouched(field: String, touched: Boolean): Unit
  def setValue(fieldName: String, value: js.Any): Unit
  def setWarning(field: String, warning: String): Unit
  // Methods
  def submitForm(event: SyntheticEvent[_, Event_]): Unit
  def swapValues(name: String, index1: Double, index2: Double): Unit
}

object FormApi {
  @scala.inline
  def apply(
    addValue: (String, js.Any) => Unit,
    asyncValidations: Double,
    errors: FormErrors,
    getFormState: () => FormState,
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
    submitForm: SyntheticEvent[_, Event_] => Unit,
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
  ): FormApi = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), asyncValidations = asyncValidations.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getFormState = js.Any.fromFunction0(getFormState), removeValue = js.Any.fromFunction2(removeValue), resetAll = js.Any.fromFunction0(resetAll), setAllTouched = js.Any.fromFunction1(setAllTouched), setAllValues = js.Any.fromFunction1(setAllValues), setError = js.Any.fromFunction2(setError), setFormState = js.Any.fromFunction1(setFormState), setSuccess = js.Any.fromFunction2(setSuccess), setTouched = js.Any.fromFunction2(setTouched), setValue = js.Any.fromFunction2(setValue), setWarning = js.Any.fromFunction2(setWarning), submitForm = js.Any.fromFunction1(submitForm), submits = submits.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], swapValues = js.Any.fromFunction3(swapValues), touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validationFailed = validationFailed.asInstanceOf[js.Any], validationFailures = validationFailures.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormApi]
  }
}

