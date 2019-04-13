package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends js.Object {
  var asyncValidators: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[reactDashFormLib.Anon_FormApi]] = js.undefined
  var defaultValues: js.UndefOr[FormValues] = js.undefined
  var dontPreventDefault: js.UndefOr[scala.Boolean] = js.undefined
  var dontValidateOnMount: js.UndefOr[scala.Boolean] = js.undefined
  var formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, scala.Unit]] = js.undefined
  var getApi: js.UndefOr[js.Function1[/* formApi */ FormApi, scala.Unit]] = js.undefined
  var onSubmit: js.UndefOr[
    js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ reactLib.reactMod.SyntheticEvent[_, reactLib.Event], 
      /* formApi */ FormApi, 
      scala.Unit
    ]
  ] = js.undefined
  var onSubmitFailure: js.UndefOr[js.Function2[/* errors */ FormErrors, /* formApi */ FormApi, scala.Unit]] = js.undefined
  var preSubmit: js.UndefOr[js.Function2[/* values */ FormValues, /* formApi */ FormApi, FormValues]] = js.undefined
  var preValidate: js.UndefOr[js.Function1[/* values */ FormValues, FormValues]] = js.undefined
  var render: js.UndefOr[js.Function1[/* formApi */ FormApi, RenderReturn]] = js.undefined
  var validateError: js.UndefOr[ValidateValuesFunction] = js.undefined
  var validateOnSubmit: js.UndefOr[scala.Boolean] = js.undefined
  var validateSuccess: js.UndefOr[js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors]] = js.undefined
  var validateWarning: js.UndefOr[ValidateValuesFunction] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    asyncValidators: org.scalablytyped.runtime.StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]] = null,
    component: reactLib.reactMod.ReactType[reactDashFormLib.Anon_FormApi] = null,
    defaultValues: FormValues = null,
    dontPreventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    dontValidateOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    formDidUpdate: /* formState */ FormState => scala.Unit = null,
    getApi: /* formApi */ FormApi => scala.Unit = null,
    onSubmit: (/* values */ FormValues, /* submissionEvent */ reactLib.reactMod.SyntheticEvent[_, reactLib.Event], /* formApi */ FormApi) => scala.Unit = null,
    onSubmitFailure: (/* errors */ FormErrors, /* formApi */ FormApi) => scala.Unit = null,
    preSubmit: (/* values */ FormValues, /* formApi */ FormApi) => FormValues = null,
    preValidate: /* values */ FormValues => FormValues = null,
    render: /* formApi */ FormApi => RenderReturn = null,
    validateError: ValidateValuesFunction = null,
    validateOnSubmit: js.UndefOr[scala.Boolean] = js.undefined,
    validateSuccess: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors = null,
    validateWarning: ValidateValuesFunction = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues)
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
    __obj.asInstanceOf[FormProps]
  }
}

