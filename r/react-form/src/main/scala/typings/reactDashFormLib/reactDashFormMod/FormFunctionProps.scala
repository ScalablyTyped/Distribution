package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFormLib.reactDashFormMod.FormApi because var conflicts: errors, touched, values. Inlined warnings, successes, submits, submitted, asyncValidations, validating, validationFailures, validationFailed, submitForm, setValue, setAllValues, setError, setWarning, setSuccess, setTouched, setAllTouched, addValue, removeValue, swapValues, resetAll, getFormState, setFormState */ trait FormFunctionProps
  extends FormProps
     with FormState {
  var asyncValidations: scala.Double
  var submits: scala.Double
  var submitted: scala.Boolean
  var successes: FormErrors
  var validating: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var validationFailed: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var validationFailures: scala.Double
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
  def submitForm(event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event]): scala.Unit
  def swapValues(name: java.lang.String, index1: scala.Double, index2: scala.Double): scala.Unit
}

object FormFunctionProps {
  @scala.inline
  def apply(
    addValue: (java.lang.String, js.Any) => scala.Unit,
    asyncValidations: scala.Double,
    errors: FormErrors,
    getFormState: () => FormState,
    nestedErrors: NestedErrors,
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
    submitForm: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event] => scala.Unit,
    submits: scala.Double,
    submitted: scala.Boolean,
    successes: FormErrors,
    swapValues: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    touched: Touched,
    validating: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    validationFailed: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    validationFailures: scala.Double,
    values: FormValues,
    warnings: FormErrors,
    asyncValidators: org.scalablytyped.runtime.StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[reactDashFormLib.Anon_FormApi] = null,
    defaultValues: FormValues = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
    dontPreventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    dontValidateOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    formDidUpdate: /* formState */ FormState => scala.Unit = null,
    getApi: /* formApi */ FormApi => scala.Unit = null,
    onSubmit: (/* values */ FormValues, /* submissionEvent */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], /* formApi */ FormApi) => scala.Unit = null,
    onSubmitFailure: (/* errors */ FormErrors, /* formApi */ FormApi) => scala.Unit = null,
    preSubmit: (/* values */ FormValues, /* formApi */ FormApi) => FormValues = null,
    preValidate: /* values */ FormValues => FormValues = null,
    render: /* formApi */ FormApi => RenderReturn = null,
    validateError: ValidateValuesFunction = null,
    validateOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    validateSuccess: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors = null,
    validateWarning: ValidateValuesFunction = null
  ): FormFunctionProps = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), asyncValidations = asyncValidations, errors = errors, getFormState = js.Any.fromFunction0(getFormState), nestedErrors = nestedErrors, removeValue = js.Any.fromFunction2(removeValue), resetAll = js.Any.fromFunction0(resetAll), setAllTouched = js.Any.fromFunction1(setAllTouched), setAllValues = js.Any.fromFunction1(setAllValues), setError = js.Any.fromFunction2(setError), setFormState = js.Any.fromFunction1(setFormState), setSuccess = js.Any.fromFunction2(setSuccess), setTouched = js.Any.fromFunction2(setTouched), setValue = js.Any.fromFunction2(setValue), setWarning = js.Any.fromFunction2(setWarning), submitForm = js.Any.fromFunction1(submitForm), submits = submits, submitted = submitted, successes = successes, swapValues = js.Any.fromFunction3(swapValues), touched = touched, validating = validating, validationFailed = validationFailed, validationFailures = validationFailures, values = values, warnings = warnings)
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues)
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    if (!js.isUndefined(dontPreventDefault)) __obj.updateDynamic("dontPreventDefault")(dontPreventDefault)
    if (!js.isUndefined(dontValidateOnMount)) __obj.updateDynamic("dontValidateOnMount")(dontValidateOnMount)
    if (formDidUpdate != null) __obj.updateDynamic("formDidUpdate")(js.Any.fromFunction1(formDidUpdate))
    if (getApi != null) __obj.updateDynamic("getApi")(js.Any.fromFunction1(getApi))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3(onSubmit))
    if (onSubmitFailure != null) __obj.updateDynamic("onSubmitFailure")(js.Any.fromFunction2(onSubmitFailure))
    if (preSubmit != null) __obj.updateDynamic("preSubmit")(js.Any.fromFunction2(preSubmit))
    if (preValidate != null) __obj.updateDynamic("preValidate")(js.Any.fromFunction1(preValidate))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (validateError != null) __obj.updateDynamic("validateError")(validateError)
    if (!js.isUndefined(validateOnSubmit)) __obj.updateDynamic("validateOnSubmit")(validateOnSubmit)
    if (validateSuccess != null) __obj.updateDynamic("validateSuccess")(js.Any.fromFunction2(validateSuccess))
    if (validateWarning != null) __obj.updateDynamic("validateWarning")(validateWarning)
    __obj.asInstanceOf[FormFunctionProps]
  }
}

