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

object ConfigProps {
  @scala.inline
  def apply[FormData, P, ErrorType](
    form: java.lang.String,
    asyncBlurFields: js.Array[java.lang.String] = null,
    asyncChangeFields: js.Array[java.lang.String] = null,
    asyncValidate: (/* values */ FormData, /* dispatch */ reduxLib.reduxMod.Dispatch[_], /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), /* blurredField */ java.lang.String) => js.Promise[_] = null,
    destroyOnUnmount: js.UndefOr[scala.Boolean] = js.undefined,
    enableReinitialize: js.UndefOr[scala.Boolean] = js.undefined,
    forceUnregisterOnUnmount: js.UndefOr[scala.Boolean] = js.undefined,
    getFormState: GetFormState = null,
    immutableProps: js.Array[java.lang.String] = null,
    initialValues: stdLib.Partial[FormData] = null,
    keepDirtyOnReinitialize: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* values */ stdLib.Partial[FormData], /* dispatch */ reduxLib.reduxMod.Dispatch[_], /* props */ P with (InjectedFormProps[FormData, P, ErrorType]), /* previousValues */ stdLib.Partial[FormData]) => scala.Unit = null,
    onSubmit: (FormSubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType]) | (SubmitHandler[FormData, P with (InjectedFormProps[FormData, P, ErrorType]), ErrorType]) = null,
    onSubmitFail: (/* errors */ js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]], /* dispatch */ reduxLib.reduxMod.Dispatch[_], /* submitError */ js.Any, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => scala.Unit = null,
    onSubmitSuccess: (/* result */ js.Any, /* dispatch */ reduxLib.reduxMod.Dispatch[_], /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => scala.Unit = null,
    persistentSubmitErrors: js.UndefOr[scala.Boolean] = js.undefined,
    propNamespace: java.lang.String = null,
    pure: js.UndefOr[scala.Boolean] = js.undefined,
    shouldAsyncValidate: /* params */ AsyncValidateCallback[FormData, ErrorType] => scala.Boolean = null,
    shouldError: /* params */ ValidateCallback[FormData, P, ErrorType] => scala.Boolean = null,
    shouldValidate: /* params */ ValidateCallback[FormData, P, ErrorType] => scala.Boolean = null,
    shouldWarn: /* params */ ValidateCallback[FormData, P, ErrorType] => scala.Boolean = null,
    touchOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    touchOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    updateUnregisteredFields: js.UndefOr[scala.Boolean] = js.undefined,
    validate: (/* values */ FormData, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType] = null,
    warn: (/* values */ FormData, /* props */ P with (InjectedFormProps[FormData, P, ErrorType])) => reduxDashFormLib.reduxDashFormMod.FormWarnings[FormData, scala.Unit] = null
  ): ConfigProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(form = form)
    if (asyncBlurFields != null) __obj.updateDynamic("asyncBlurFields")(asyncBlurFields)
    if (asyncChangeFields != null) __obj.updateDynamic("asyncChangeFields")(asyncChangeFields)
    if (asyncValidate != null) __obj.updateDynamic("asyncValidate")(js.Any.fromFunction4(asyncValidate))
    if (!js.isUndefined(destroyOnUnmount)) __obj.updateDynamic("destroyOnUnmount")(destroyOnUnmount)
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize)
    if (!js.isUndefined(forceUnregisterOnUnmount)) __obj.updateDynamic("forceUnregisterOnUnmount")(forceUnregisterOnUnmount)
    if (getFormState != null) __obj.updateDynamic("getFormState")(getFormState)
    if (immutableProps != null) __obj.updateDynamic("immutableProps")(immutableProps)
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues)
    if (!js.isUndefined(keepDirtyOnReinitialize)) __obj.updateDynamic("keepDirtyOnReinitialize")(keepDirtyOnReinitialize)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit.asInstanceOf[js.Any])
    if (onSubmitFail != null) __obj.updateDynamic("onSubmitFail")(js.Any.fromFunction4(onSubmitFail))
    if (onSubmitSuccess != null) __obj.updateDynamic("onSubmitSuccess")(js.Any.fromFunction3(onSubmitSuccess))
    if (!js.isUndefined(persistentSubmitErrors)) __obj.updateDynamic("persistentSubmitErrors")(persistentSubmitErrors)
    if (propNamespace != null) __obj.updateDynamic("propNamespace")(propNamespace)
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    if (shouldAsyncValidate != null) __obj.updateDynamic("shouldAsyncValidate")(js.Any.fromFunction1(shouldAsyncValidate))
    if (shouldError != null) __obj.updateDynamic("shouldError")(js.Any.fromFunction1(shouldError))
    if (shouldValidate != null) __obj.updateDynamic("shouldValidate")(js.Any.fromFunction1(shouldValidate))
    if (shouldWarn != null) __obj.updateDynamic("shouldWarn")(js.Any.fromFunction1(shouldWarn))
    if (!js.isUndefined(touchOnBlur)) __obj.updateDynamic("touchOnBlur")(touchOnBlur)
    if (!js.isUndefined(touchOnChange)) __obj.updateDynamic("touchOnChange")(touchOnChange)
    if (!js.isUndefined(updateUnregisteredFields)) __obj.updateDynamic("updateUnregisteredFields")(updateUnregisteredFields)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2(warn))
    __obj.asInstanceOf[ConfigProps[FormData, P, ErrorType]]
  }
}

