package typings.reactForm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactType
import typings.react.mod.SyntheticEvent
import typings.reactForm.mod.FormErrors
import typings.reactForm.mod.FormFunctionProps
import typings.reactForm.mod.FormState
import typings.reactForm.mod.FormValue
import typings.reactForm.mod.FormValues
import typings.reactForm.mod.RenderReturn
import typings.reactForm.mod.ValidateValuesFunction
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-form.react-form.FormProps & {  children ? :(props : react-form.react-form.FormFunctionProps): react-form.react-form.RenderReturn | react-form.react-form.RenderReturn} */
trait FormPropschildrenpropsFor extends js.Object {
  var asyncValidators: js.UndefOr[StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]] = js.undefined
  var children: js.UndefOr[(js.Function1[/* props */ FormFunctionProps, RenderReturn]) | RenderReturn] = js.undefined
  var component: js.UndefOr[ReactType[FormApi]] = js.undefined
  var defaultValues: js.UndefOr[FormValues] = js.undefined
  var dontPreventDefault: js.UndefOr[Boolean] = js.undefined
  var dontValidateOnMount: js.UndefOr[Boolean] = js.undefined
  var formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, Unit]] = js.undefined
  var getApi: js.UndefOr[js.Function1[/* formApi */ typings.reactForm.mod.FormApi, Unit]] = js.undefined
  var onSubmit: js.UndefOr[
    js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ SyntheticEvent[_, Event], 
      /* formApi */ typings.reactForm.mod.FormApi, 
      Unit
    ]
  ] = js.undefined
  var onSubmitFailure: js.UndefOr[
    js.Function2[/* errors */ FormErrors, /* formApi */ typings.reactForm.mod.FormApi, Unit]
  ] = js.undefined
  var preSubmit: js.UndefOr[
    js.Function2[/* values */ FormValues, /* formApi */ typings.reactForm.mod.FormApi, FormValues]
  ] = js.undefined
  var preValidate: js.UndefOr[js.Function1[/* values */ FormValues, FormValues]] = js.undefined
  var render: js.UndefOr[js.Function1[/* formApi */ typings.reactForm.mod.FormApi, RenderReturn]] = js.undefined
  var validateError: js.UndefOr[ValidateValuesFunction] = js.undefined
  var validateOnSubmit: js.UndefOr[Boolean] = js.undefined
  var validateSuccess: js.UndefOr[js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors]] = js.undefined
  var validateWarning: js.UndefOr[ValidateValuesFunction] = js.undefined
}

object FormPropschildrenpropsFor {
  @scala.inline
  def apply(
    asyncValidators: StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]] = null,
    children: js.UndefOr[
      Null | (js.Function1[/* props */ FormFunctionProps, RenderReturn]) | RenderReturn
    ] = js.undefined,
    component: ReactType[FormApi] = null,
    defaultValues: FormValues = null,
    dontPreventDefault: js.UndefOr[Boolean] = js.undefined,
    dontValidateOnMount: js.UndefOr[Boolean] = js.undefined,
    formDidUpdate: /* formState */ FormState => Unit = null,
    getApi: /* formApi */ typings.reactForm.mod.FormApi => Unit = null,
    onSubmit: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[_, Event], /* formApi */ typings.reactForm.mod.FormApi) => Unit = null,
    onSubmitFailure: (/* errors */ FormErrors, /* formApi */ typings.reactForm.mod.FormApi) => Unit = null,
    preSubmit: (/* values */ FormValues, /* formApi */ typings.reactForm.mod.FormApi) => FormValues = null,
    preValidate: /* values */ FormValues => FormValues = null,
    render: /* formApi */ typings.reactForm.mod.FormApi => RenderReturn = null,
    validateError: /* values */ FormValues => FormErrors = null,
    validateOnSubmit: js.UndefOr[Boolean] = js.undefined,
    validateSuccess: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors = null,
    validateWarning: /* values */ FormValues => FormErrors = null
  ): FormPropschildrenpropsFor = {
    val __obj = js.Dynamic.literal()
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues.asInstanceOf[js.Any])
    if (!js.isUndefined(dontPreventDefault)) __obj.updateDynamic("dontPreventDefault")(dontPreventDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dontValidateOnMount)) __obj.updateDynamic("dontValidateOnMount")(dontValidateOnMount.get.asInstanceOf[js.Any])
    if (formDidUpdate != null) __obj.updateDynamic("formDidUpdate")(js.Any.fromFunction1(formDidUpdate))
    if (getApi != null) __obj.updateDynamic("getApi")(js.Any.fromFunction1(getApi))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3(onSubmit))
    if (onSubmitFailure != null) __obj.updateDynamic("onSubmitFailure")(js.Any.fromFunction2(onSubmitFailure))
    if (preSubmit != null) __obj.updateDynamic("preSubmit")(js.Any.fromFunction2(preSubmit))
    if (preValidate != null) __obj.updateDynamic("preValidate")(js.Any.fromFunction1(preValidate))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (validateError != null) __obj.updateDynamic("validateError")(js.Any.fromFunction1(validateError))
    if (!js.isUndefined(validateOnSubmit)) __obj.updateDynamic("validateOnSubmit")(validateOnSubmit.get.asInstanceOf[js.Any])
    if (validateSuccess != null) __obj.updateDynamic("validateSuccess")(js.Any.fromFunction2(validateSuccess))
    if (validateWarning != null) __obj.updateDynamic("validateWarning")(js.Any.fromFunction1(validateWarning))
    __obj.asInstanceOf[FormPropschildrenpropsFor]
  }
}

