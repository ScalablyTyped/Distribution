package typings.reactDashForm.reactDashFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactType
import typings.react.reactMod.SyntheticEvent
import typings.reactDashForm.Anon_FormApi
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashForm.reactDashFormMod.FormApi because var conflicts: errors, touched, values. Inlined warnings, successes, submits, submitted, asyncValidations, validating, validationFailures, validationFailed, submitForm, setValue, setAllValues, setError, setWarning, setSuccess, setTouched, setAllTouched, addValue, removeValue, swapValues, resetAll, getFormState, setFormState */ trait FormFunctionProps
  extends FormProps
     with FormState {
  var asyncValidations: Double
  var submits: Double
  var submitted: Boolean
  var successes: FormErrors
  var validating: StringDictionary[Boolean]
  var validationFailed: StringDictionary[Boolean]
  var validationFailures: Double
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
  def submitForm(event: SyntheticEvent[_, Event]): Unit
  def swapValues(name: String, index1: Double, index2: Double): Unit
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
    warnings: FormErrors,
    asyncValidators: StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]] = null,
    component: ReactType[Anon_FormApi] = null,
    defaultValues: FormValues = null,
    dirty: js.UndefOr[Boolean] = js.undefined,
    dontPreventDefault: js.UndefOr[Boolean] = js.undefined,
    dontValidateOnMount: js.UndefOr[Boolean] = js.undefined,
    formDidUpdate: /* formState */ FormState => Unit = null,
    getApi: /* formApi */ FormApi => Unit = null,
    onSubmit: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[_, Event], /* formApi */ FormApi) => Unit = null,
    onSubmitFailure: (/* errors */ FormErrors, /* formApi */ FormApi) => Unit = null,
    preSubmit: (/* values */ FormValues, /* formApi */ FormApi) => FormValues = null,
    preValidate: /* values */ FormValues => FormValues = null,
    render: /* formApi */ FormApi => RenderReturn = null,
    validateError: /* values */ FormValues => FormErrors = null,
    validateOnSubmit: js.UndefOr[Boolean] = js.undefined,
    validateSuccess: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors = null,
    validateWarning: /* values */ FormValues => FormErrors = null
  ): FormFunctionProps = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), asyncValidations = asyncValidations.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getFormState = js.Any.fromFunction0(getFormState), nestedErrors = nestedErrors.asInstanceOf[js.Any], removeValue = js.Any.fromFunction2(removeValue), resetAll = js.Any.fromFunction0(resetAll), setAllTouched = js.Any.fromFunction1(setAllTouched), setAllValues = js.Any.fromFunction1(setAllValues), setError = js.Any.fromFunction2(setError), setFormState = js.Any.fromFunction1(setFormState), setSuccess = js.Any.fromFunction2(setSuccess), setTouched = js.Any.fromFunction2(setTouched), setValue = js.Any.fromFunction2(setValue), setWarning = js.Any.fromFunction2(setWarning), submitForm = js.Any.fromFunction1(submitForm), submits = submits.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], swapValues = js.Any.fromFunction3(swapValues), touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validationFailed = validationFailed.asInstanceOf[js.Any], validationFailures = validationFailures.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (!js.isUndefined(dontPreventDefault)) __obj.updateDynamic("dontPreventDefault")(dontPreventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(dontValidateOnMount)) __obj.updateDynamic("dontValidateOnMount")(dontValidateOnMount.asInstanceOf[js.Any])
    if (formDidUpdate != null) __obj.updateDynamic("formDidUpdate")(js.Any.fromFunction1(formDidUpdate))
    if (getApi != null) __obj.updateDynamic("getApi")(js.Any.fromFunction1(getApi))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3(onSubmit))
    if (onSubmitFailure != null) __obj.updateDynamic("onSubmitFailure")(js.Any.fromFunction2(onSubmitFailure))
    if (preSubmit != null) __obj.updateDynamic("preSubmit")(js.Any.fromFunction2(preSubmit))
    if (preValidate != null) __obj.updateDynamic("preValidate")(js.Any.fromFunction1(preValidate))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (validateError != null) __obj.updateDynamic("validateError")(js.Any.fromFunction1(validateError))
    if (!js.isUndefined(validateOnSubmit)) __obj.updateDynamic("validateOnSubmit")(validateOnSubmit.asInstanceOf[js.Any])
    if (validateSuccess != null) __obj.updateDynamic("validateSuccess")(js.Any.fromFunction2(validateSuccess))
    if (validateWarning != null) __obj.updateDynamic("validateWarning")(js.Any.fromFunction1(validateWarning))
    __obj.asInstanceOf[FormFunctionProps]
  }
}

