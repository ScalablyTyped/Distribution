package typings.reduxForm.reduxFormMod

import typings.redux.mod.Dispatch
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reducerMod.FormStateMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProps[FormData, P, ErrorType] extends js.Object {
  var asyncBlurFields: js.UndefOr[js.Array[String]] = js.undefined
  var asyncChangeFields: js.UndefOr[js.Array[String]] = js.undefined
  var asyncValidate: js.UndefOr[
    js.Function4[
      /* values */ FormData, 
      /* dispatch */ Dispatch[_], 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      /* blurredField */ String, 
      js.Promise[_]
    ]
  ] = js.undefined
  var destroyOnUnmount: js.UndefOr[Boolean] = js.undefined
  var enableReinitialize: js.UndefOr[Boolean] = js.undefined
  var forceUnregisterOnUnmount: js.UndefOr[Boolean] = js.undefined
  var form: String
  var getFormState: js.UndefOr[GetFormState] = js.undefined
  var immutableProps: js.UndefOr[js.Array[String]] = js.undefined
  var initialValues: js.UndefOr[Partial[FormData]] = js.undefined
  var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.undefined
  var keepValues: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* values */ Partial[FormData], 
      /* dispatch */ Dispatch[_], 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      /* previousValues */ Partial[FormData], 
      Unit
    ]
  ] = js.undefined
  var onSubmit: js.UndefOr[
    (FormSubmitHandler[FormData, P, ErrorType]) | (SubmitHandler[FormData, P, ErrorType])
  ] = js.undefined
  var onSubmitFail: js.UndefOr[
    js.Function4[
      /* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], 
      /* dispatch */ Dispatch[_], 
      /* submitError */ js.Any, 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      Unit
    ]
  ] = js.undefined
  var onSubmitSuccess: js.UndefOr[
    js.Function3[
      /* result */ js.Any, 
      /* dispatch */ Dispatch[_], 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      Unit
    ]
  ] = js.undefined
  var persistentSubmitErrors: js.UndefOr[Boolean] = js.undefined
  var propNamespace: js.UndefOr[String] = js.undefined
  var pure: js.UndefOr[Boolean] = js.undefined
  var shouldAsyncValidate: js.UndefOr[js.Function1[/* params */ AsyncValidateCallback[FormData, ErrorType], Boolean]] = js.undefined
  var shouldError: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
  var shouldValidate: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
  var shouldWarn: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.undefined
  var submitAsSideEffect: js.UndefOr[Boolean] = js.undefined
  var touchOnBlur: js.UndefOr[Boolean] = js.undefined
  var touchOnChange: js.UndefOr[Boolean] = js.undefined
  var updateUnregisteredFields: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      FormErrors[FormData, ErrorType]
    ]
  ] = js.undefined
  var warn: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      FormWarnings[FormData, Unit]
    ]
  ] = js.undefined
}

object ConfigProps {
  @scala.inline
  def apply[FormData, P, ErrorType](
    form: String,
    asyncBlurFields: js.Array[String] = null,
    asyncChangeFields: js.Array[String] = null,
    asyncValidate: (/* values */ FormData, /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType], /* blurredField */ String) => js.Promise[_] = null,
    destroyOnUnmount: js.UndefOr[Boolean] = js.undefined,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    forceUnregisterOnUnmount: js.UndefOr[Boolean] = js.undefined,
    getFormState: /* state */ js.Any => FormStateMap = null,
    immutableProps: js.Array[String] = null,
    initialValues: Partial[FormData] = null,
    keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.undefined,
    keepValues: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* values */ Partial[FormData], /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType], /* previousValues */ Partial[FormData]) => Unit = null,
    onSubmit: (FormSubmitHandler[FormData, P, ErrorType]) | (SubmitHandler[FormData, P, ErrorType]) = null,
    onSubmitFail: (/* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], /* dispatch */ Dispatch[_], /* submitError */ js.Any, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit = null,
    onSubmitSuccess: (/* result */ js.Any, /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit = null,
    persistentSubmitErrors: js.UndefOr[Boolean] = js.undefined,
    propNamespace: String = null,
    pure: js.UndefOr[Boolean] = js.undefined,
    shouldAsyncValidate: /* params */ AsyncValidateCallback[FormData, ErrorType] => Boolean = null,
    shouldError: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean = null,
    shouldValidate: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean = null,
    shouldWarn: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean = null,
    submitAsSideEffect: js.UndefOr[Boolean] = js.undefined,
    touchOnBlur: js.UndefOr[Boolean] = js.undefined,
    touchOnChange: js.UndefOr[Boolean] = js.undefined,
    updateUnregisteredFields: js.UndefOr[Boolean] = js.undefined,
    validate: (/* values */ FormData, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => FormErrors[FormData, ErrorType] = null,
    warn: (/* values */ FormData, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => FormWarnings[FormData, Unit] = null
  ): ConfigProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    if (asyncBlurFields != null) __obj.updateDynamic("asyncBlurFields")(asyncBlurFields.asInstanceOf[js.Any])
    if (asyncChangeFields != null) __obj.updateDynamic("asyncChangeFields")(asyncChangeFields.asInstanceOf[js.Any])
    if (asyncValidate != null) __obj.updateDynamic("asyncValidate")(js.Any.fromFunction4(asyncValidate))
    if (!js.isUndefined(destroyOnUnmount)) __obj.updateDynamic("destroyOnUnmount")(destroyOnUnmount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUnregisterOnUnmount)) __obj.updateDynamic("forceUnregisterOnUnmount")(forceUnregisterOnUnmount.get.asInstanceOf[js.Any])
    if (getFormState != null) __obj.updateDynamic("getFormState")(js.Any.fromFunction1(getFormState))
    if (immutableProps != null) __obj.updateDynamic("immutableProps")(immutableProps.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDirtyOnReinitialize)) __obj.updateDynamic("keepDirtyOnReinitialize")(keepDirtyOnReinitialize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepValues)) __obj.updateDynamic("keepValues")(keepValues.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit.asInstanceOf[js.Any])
    if (onSubmitFail != null) __obj.updateDynamic("onSubmitFail")(js.Any.fromFunction4(onSubmitFail))
    if (onSubmitSuccess != null) __obj.updateDynamic("onSubmitSuccess")(js.Any.fromFunction3(onSubmitSuccess))
    if (!js.isUndefined(persistentSubmitErrors)) __obj.updateDynamic("persistentSubmitErrors")(persistentSubmitErrors.get.asInstanceOf[js.Any])
    if (propNamespace != null) __obj.updateDynamic("propNamespace")(propNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    if (shouldAsyncValidate != null) __obj.updateDynamic("shouldAsyncValidate")(js.Any.fromFunction1(shouldAsyncValidate))
    if (shouldError != null) __obj.updateDynamic("shouldError")(js.Any.fromFunction1(shouldError))
    if (shouldValidate != null) __obj.updateDynamic("shouldValidate")(js.Any.fromFunction1(shouldValidate))
    if (shouldWarn != null) __obj.updateDynamic("shouldWarn")(js.Any.fromFunction1(shouldWarn))
    if (!js.isUndefined(submitAsSideEffect)) __obj.updateDynamic("submitAsSideEffect")(submitAsSideEffect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchOnBlur)) __obj.updateDynamic("touchOnBlur")(touchOnBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchOnChange)) __obj.updateDynamic("touchOnChange")(touchOnChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateUnregisteredFields)) __obj.updateDynamic("updateUnregisteredFields")(updateUnregisteredFields.get.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2(warn))
    __obj.asInstanceOf[ConfigProps[FormData, P, ErrorType]]
  }
}

