package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FormProps extends js.Object {
  var asyncValidators: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[reactDashFormLib.Anon_FormApi]] = js.undefined
  var defaultValues: js.UndefOr[FormValues] = js.undefined
  var dontPreventDefault: js.UndefOr[scala.Boolean] = js.undefined
  var dontValidateOnMount: js.UndefOr[scala.Boolean] = js.undefined
  var formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, scala.Unit]] = js.undefined
  var getApi: js.UndefOr[js.Function1[/* formApi */ FormApi, scala.Unit]] = js.undefined
  var onSubmit: js.UndefOr[
    js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ reactLib.reactMod.ReactNs.SyntheticEvent[_], 
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

