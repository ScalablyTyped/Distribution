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
    addValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    asyncValidations: scala.Double,
    errors: FormErrors,
    getFormState: js.Function0[FormState],
    nestedErrors: NestedErrors,
    removeValue: js.Function2[java.lang.String, scala.Double, scala.Unit],
    resetAll: js.Function0[scala.Unit],
    setAllTouched: js.Function1[org.scalablytyped.runtime.StringDictionary[scala.Boolean], scala.Unit],
    setAllValues: js.Function1[FormValues, scala.Unit],
    setError: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setFormState: js.Function1[FormState, scala.Unit],
    setSuccess: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setTouched: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    setValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setWarning: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    submitForm: js.Function1[reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit],
    submits: scala.Double,
    submitted: scala.Boolean,
    successes: FormErrors,
    swapValues: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
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
    formDidUpdate: js.Function1[/* formState */ FormState, scala.Unit] = null,
    getApi: js.Function1[/* formApi */ FormApi, scala.Unit] = null,
    onSubmit: js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], 
      /* formApi */ FormApi, 
      scala.Unit
    ] = null,
    onSubmitFailure: js.Function2[/* errors */ FormErrors, /* formApi */ FormApi, scala.Unit] = null,
    preSubmit: js.Function2[/* values */ FormValues, /* formApi */ FormApi, FormValues] = null,
    preValidate: js.Function1[/* values */ FormValues, FormValues] = null,
    render: js.Function1[/* formApi */ FormApi, RenderReturn] = null,
    validateError: ValidateValuesFunction = null,
    validateOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    validateSuccess: js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors] = null,
    validateWarning: ValidateValuesFunction = null
  ): FormFunctionProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addValue")(addValue)
    __obj.updateDynamic("asyncValidations")(asyncValidations)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("getFormState")(getFormState)
    __obj.updateDynamic("nestedErrors")(nestedErrors)
    __obj.updateDynamic("removeValue")(removeValue)
    __obj.updateDynamic("resetAll")(resetAll)
    __obj.updateDynamic("setAllTouched")(setAllTouched)
    __obj.updateDynamic("setAllValues")(setAllValues)
    __obj.updateDynamic("setError")(setError)
    __obj.updateDynamic("setFormState")(setFormState)
    __obj.updateDynamic("setSuccess")(setSuccess)
    __obj.updateDynamic("setTouched")(setTouched)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("setWarning")(setWarning)
    __obj.updateDynamic("submitForm")(submitForm)
    __obj.updateDynamic("submits")(submits)
    __obj.updateDynamic("submitted")(submitted)
    __obj.updateDynamic("successes")(successes)
    __obj.updateDynamic("swapValues")(swapValues)
    __obj.updateDynamic("touched")(touched)
    __obj.updateDynamic("validating")(validating)
    __obj.updateDynamic("validationFailed")(validationFailed)
    __obj.updateDynamic("validationFailures")(validationFailures)
    __obj.updateDynamic("values")(values)
    __obj.updateDynamic("warnings")(warnings)
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues)
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    if (!js.isUndefined(dontPreventDefault)) __obj.updateDynamic("dontPreventDefault")(dontPreventDefault)
    if (!js.isUndefined(dontValidateOnMount)) __obj.updateDynamic("dontValidateOnMount")(dontValidateOnMount)
    if (formDidUpdate != null) __obj.updateDynamic("formDidUpdate")(formDidUpdate)
    if (getApi != null) __obj.updateDynamic("getApi")(getApi)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSubmitFailure != null) __obj.updateDynamic("onSubmitFailure")(onSubmitFailure)
    if (preSubmit != null) __obj.updateDynamic("preSubmit")(preSubmit)
    if (preValidate != null) __obj.updateDynamic("preValidate")(preValidate)
    if (render != null) __obj.updateDynamic("render")(render)
    if (validateError != null) __obj.updateDynamic("validateError")(validateError)
    if (!js.isUndefined(validateOnSubmit)) __obj.updateDynamic("validateOnSubmit")(validateOnSubmit)
    if (validateSuccess != null) __obj.updateDynamic("validateSuccess")(validateSuccess)
    if (validateWarning != null) __obj.updateDynamic("validateWarning")(validateWarning)
    __obj.asInstanceOf[FormFunctionProps]
  }
}

