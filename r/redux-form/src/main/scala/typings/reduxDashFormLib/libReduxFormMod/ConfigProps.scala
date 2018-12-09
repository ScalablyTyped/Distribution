package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfigProps[FormData, P, ErrorType] extends js.Object {
  var asyncBlurFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var asyncChangeFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var asyncValidate: js.UndefOr[
    js.Function4[
      /* values */ FormData, 
      /* dispatch */ reduxLib.reduxMod.Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      /* blurredField */ java.lang.String, 
      js.Promise[_]
    ]
  ] = js.undefined
  var destroyOnUnmount: js.UndefOr[scala.Boolean] = js.undefined
  var enableReinitialize: js.UndefOr[scala.Boolean] = js.undefined
  var forceUnregisterOnUnmount: js.UndefOr[scala.Boolean] = js.undefined
  var form: java.lang.String
  var getFormState: js.UndefOr[GetFormState] = js.undefined
  var immutableProps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var initialValues: js.UndefOr[stdLib.Partial[FormData]] = js.undefined
  var keepDirtyOnReinitialize: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* values */ stdLib.Partial[FormData], 
      /* dispatch */ reduxLib.reduxMod.Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      /* previousValues */ stdLib.Partial[FormData], 
      scala.Unit
    ]
  ] = js.undefined
  var onSubmit: js.UndefOr[
    (FormSubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType]) | (SubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType])
  ] = js.undefined
  var onSubmitFail: js.UndefOr[
    js.Function4[
      /* errors */ js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]], 
      /* dispatch */ reduxLib.reduxMod.Dispatch[_], 
      /* submitError */ js.Any, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      scala.Unit
    ]
  ] = js.undefined
  var onSubmitSuccess: js.UndefOr[
    js.Function3[
      /* result */ js.Any, 
      /* dispatch */ reduxLib.reduxMod.Dispatch[_], 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      scala.Unit
    ]
  ] = js.undefined
  var persistentSubmitErrors: js.UndefOr[scala.Boolean] = js.undefined
  var propNamespace: js.UndefOr[java.lang.String] = js.undefined
  var pure: js.UndefOr[scala.Boolean] = js.undefined
  var shouldAsyncValidate: js.UndefOr[
    js.Function1[/* params */ AsyncValidateCallback[FormData, ErrorType], scala.Boolean]
  ] = js.undefined
  var shouldError: js.UndefOr[
    js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], scala.Boolean]
  ] = js.undefined
  var shouldValidate: js.UndefOr[
    js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], scala.Boolean]
  ] = js.undefined
  var shouldWarn: js.UndefOr[
    js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], scala.Boolean]
  ] = js.undefined
  var touchOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  var touchOnChange: js.UndefOr[scala.Boolean] = js.undefined
  var updateUnregisteredFields: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]
    ]
  ] = js.undefined
  var warn: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), 
      reduxDashFormLib.reduxDashFormMod.FormWarnings[FormData, scala.Unit]
    ]
  ] = js.undefined
}

