package typings.reactForm

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactType
import typings.react.mod.SyntheticEvent
import typings.reactForm.mod.FormApi
import typings.reactForm.mod.FormErrors
import typings.reactForm.mod.FormState
import typings.reactForm.mod.FormValue
import typings.reactForm.mod.FormValues
import typings.reactForm.mod.RenderReturn
import typings.reactForm.mod.ValidateValuesFunction
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Partial<react-form.react-form.FormProps>> */
trait ReadonlyPartialFormProps extends js.Object {
  val asyncValidators: js.UndefOr[StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]] = js.undefined
  val component: js.UndefOr[ReactType[AnonFormApi]] = js.undefined
  val defaultValues: js.UndefOr[FormValues] = js.undefined
  val dontPreventDefault: js.UndefOr[Boolean] = js.undefined
  val dontValidateOnMount: js.UndefOr[Boolean] = js.undefined
  val formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, Unit]] = js.undefined
  val getApi: js.UndefOr[js.Function1[/* formApi */ FormApi, Unit]] = js.undefined
  val onSubmit: js.UndefOr[
    js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ SyntheticEvent[_, Event_], 
      /* formApi */ FormApi, 
      Unit
    ]
  ] = js.undefined
  val onSubmitFailure: js.UndefOr[js.Function2[/* errors */ FormErrors, /* formApi */ FormApi, Unit]] = js.undefined
  val preSubmit: js.UndefOr[js.Function2[/* values */ FormValues, /* formApi */ FormApi, FormValues]] = js.undefined
  val preValidate: js.UndefOr[js.Function1[/* values */ FormValues, FormValues]] = js.undefined
  val render: js.UndefOr[js.Function1[/* formApi */ FormApi, RenderReturn]] = js.undefined
  val validateError: js.UndefOr[ValidateValuesFunction] = js.undefined
  val validateOnSubmit: js.UndefOr[Boolean] = js.undefined
  val validateSuccess: js.UndefOr[js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors]] = js.undefined
  val validateWarning: js.UndefOr[ValidateValuesFunction] = js.undefined
}

object ReadonlyPartialFormProps {
  @scala.inline
  def apply(
    asyncValidators: StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]] = null,
    component: ReactType[AnonFormApi] = null,
    defaultValues: FormValues = null,
    dontPreventDefault: js.UndefOr[Boolean] = js.undefined,
    dontValidateOnMount: js.UndefOr[Boolean] = js.undefined,
    formDidUpdate: /* formState */ FormState => Unit = null,
    getApi: /* formApi */ FormApi => Unit = null,
    onSubmit: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[_, Event_], /* formApi */ FormApi) => Unit = null,
    onSubmitFailure: (/* errors */ FormErrors, /* formApi */ FormApi) => Unit = null,
    preSubmit: (/* values */ FormValues, /* formApi */ FormApi) => FormValues = null,
    preValidate: /* values */ FormValues => FormValues = null,
    render: /* formApi */ FormApi => RenderReturn = null,
    validateError: /* values */ FormValues => FormErrors = null,
    validateOnSubmit: js.UndefOr[Boolean] = js.undefined,
    validateSuccess: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors = null,
    validateWarning: /* values */ FormValues => FormErrors = null
  ): ReadonlyPartialFormProps = {
    val __obj = js.Dynamic.literal()
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ReadonlyPartialFormProps]
  }
}

