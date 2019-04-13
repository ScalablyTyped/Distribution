package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormApi extends js.Object {
  var asyncValidations: scala.Double
  var errors: FormErrors
  var submits: scala.Double
  var submitted: scala.Boolean
  var successes: FormErrors
  var touched: Touched
  var validating: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var validationFailed: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var validationFailures: scala.Double
  // State
  var values: FormValues
  var warnings: FormErrors
  def addValue(name: java.lang.String, value: js.Any): scala.Unit
  def getFormState(): FormState
  def removeValue(name: java.lang.String, index: scala.Double): scala.Unit
  def resetAll(): scala.Unit
  def setAllTouched(touches: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): scala.Unit
  def setAllValues(values: FormValues): scala.Unit
  def setError(field: java.lang.String, error: java.lang.String): scala.Unit
  def setFormState(state: FormState): scala.Unit
  def setSuccess(field: java.lang.String, success: java.lang.String): scala.Unit
  def setTouched(field: java.lang.String, touched: scala.Boolean): scala.Unit
  def setValue(fieldName: java.lang.String, value: js.Any): scala.Unit
  def setWarning(field: java.lang.String, warning: java.lang.String): scala.Unit
  // Methods
  def submitForm(event: reactLib.reactMod.SyntheticEvent[_, reactLib.Event]): scala.Unit
  def swapValues(name: java.lang.String, index1: scala.Double, index2: scala.Double): scala.Unit
}

object FormApi {
  @scala.inline
  def apply(
    addValue: (java.lang.String, js.Any) => scala.Unit,
    asyncValidations: scala.Double,
    errors: FormErrors,
    getFormState: () => FormState,
    removeValue: (java.lang.String, scala.Double) => scala.Unit,
    resetAll: () => scala.Unit,
    setAllTouched: org.scalablytyped.runtime.StringDictionary[scala.Boolean] => scala.Unit,
    setAllValues: FormValues => scala.Unit,
    setError: (java.lang.String, java.lang.String) => scala.Unit,
    setFormState: FormState => scala.Unit,
    setSuccess: (java.lang.String, java.lang.String) => scala.Unit,
    setTouched: (java.lang.String, scala.Boolean) => scala.Unit,
    setValue: (java.lang.String, js.Any) => scala.Unit,
    setWarning: (java.lang.String, java.lang.String) => scala.Unit,
    submitForm: reactLib.reactMod.SyntheticEvent[_, reactLib.Event] => scala.Unit,
    submits: scala.Double,
    submitted: scala.Boolean,
    successes: FormErrors,
    swapValues: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    touched: Touched,
    validating: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    validationFailed: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    validationFailures: scala.Double,
    values: FormValues,
    warnings: FormErrors
  ): FormApi = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), asyncValidations = asyncValidations, errors = errors, getFormState = js.Any.fromFunction0(getFormState), removeValue = js.Any.fromFunction2(removeValue), resetAll = js.Any.fromFunction0(resetAll), setAllTouched = js.Any.fromFunction1(setAllTouched), setAllValues = js.Any.fromFunction1(setAllValues), setError = js.Any.fromFunction2(setError), setFormState = js.Any.fromFunction1(setFormState), setSuccess = js.Any.fromFunction2(setSuccess), setTouched = js.Any.fromFunction2(setTouched), setValue = js.Any.fromFunction2(setValue), setWarning = js.Any.fromFunction2(setWarning), submitForm = js.Any.fromFunction1(submitForm), submits = submits, submitted = submitted, successes = successes, swapValues = js.Any.fromFunction3(swapValues), touched = touched, validating = validating, validationFailed = validationFailed, validationFailures = validationFailures, values = values, warnings = warnings)
  
    __obj.asInstanceOf[FormApi]
  }
}

