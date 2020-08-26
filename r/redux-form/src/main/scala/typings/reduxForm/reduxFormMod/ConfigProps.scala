package typings.reduxForm.reduxFormMod

import typings.redux.mod.Dispatch
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reducerMod.FormStateMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigProps[FormData, P, ErrorType] extends js.Object {
  var asyncBlurFields: js.UndefOr[js.Array[String]] = js.native
  var asyncChangeFields: js.UndefOr[js.Array[String]] = js.native
  var asyncValidate: js.UndefOr[
    js.Function4[
      /* values */ FormData, 
      /* dispatch */ Dispatch[_], 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      /* blurredField */ String, 
      js.Promise[_]
    ]
  ] = js.native
  var destroyOnUnmount: js.UndefOr[Boolean] = js.native
  var enableReinitialize: js.UndefOr[Boolean] = js.native
  var forceUnregisterOnUnmount: js.UndefOr[Boolean] = js.native
  var form: String = js.native
  var getFormState: js.UndefOr[GetFormState] = js.native
  var immutableProps: js.UndefOr[js.Array[String]] = js.native
  var initialValues: js.UndefOr[Partial[FormData]] = js.native
  var keepDirtyOnReinitialize: js.UndefOr[Boolean] = js.native
  var keepValues: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function4[
      /* values */ Partial[FormData], 
      /* dispatch */ Dispatch[_], 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      /* previousValues */ Partial[FormData], 
      Unit
    ]
  ] = js.native
  var onSubmit: js.UndefOr[
    (FormSubmitHandler[FormData, P, ErrorType]) | (SubmitHandler[FormData, P, ErrorType])
  ] = js.native
  var onSubmitFail: js.UndefOr[
    js.Function4[
      /* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], 
      /* dispatch */ Dispatch[_], 
      /* submitError */ js.Any, 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      Unit
    ]
  ] = js.native
  var onSubmitSuccess: js.UndefOr[
    js.Function3[
      /* result */ js.Any, 
      /* dispatch */ Dispatch[_], 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      Unit
    ]
  ] = js.native
  var persistentSubmitErrors: js.UndefOr[Boolean] = js.native
  var propNamespace: js.UndefOr[String] = js.native
  var pure: js.UndefOr[Boolean] = js.native
  var shouldAsyncValidate: js.UndefOr[js.Function1[/* params */ AsyncValidateCallback[FormData, ErrorType], Boolean]] = js.native
  var shouldError: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
  var shouldValidate: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
  var shouldWarn: js.UndefOr[js.Function1[/* params */ ValidateCallback[FormData, P, ErrorType], Boolean]] = js.native
  var submitAsSideEffect: js.UndefOr[Boolean] = js.native
  var touchOnBlur: js.UndefOr[Boolean] = js.native
  var touchOnChange: js.UndefOr[Boolean] = js.native
  var updateUnregisteredFields: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      FormErrors[FormData, ErrorType]
    ]
  ] = js.native
  var warn: js.UndefOr[
    js.Function2[
      /* values */ FormData, 
      /* props */ DecoratedFormProps[FormData, P, ErrorType], 
      FormWarnings[FormData, Unit]
    ]
  ] = js.native
}

object ConfigProps {
  @scala.inline
  def apply[FormData, P, ErrorType](form: String): ConfigProps[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigProps[FormData, P, ErrorType]]
  }
  @scala.inline
  implicit class ConfigPropsOps[Self <: ConfigProps[_, _, _], FormData, P, ErrorType] (val x: Self with (ConfigProps[FormData, P, ErrorType])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncBlurFieldsVarargs(value: String*): Self = this.set("asyncBlurFields", js.Array(value :_*))
    @scala.inline
    def setAsyncBlurFields(value: js.Array[String]): Self = this.set("asyncBlurFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncBlurFields: Self = this.set("asyncBlurFields", js.undefined)
    @scala.inline
    def setAsyncChangeFieldsVarargs(value: String*): Self = this.set("asyncChangeFields", js.Array(value :_*))
    @scala.inline
    def setAsyncChangeFields(value: js.Array[String]): Self = this.set("asyncChangeFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncChangeFields: Self = this.set("asyncChangeFields", js.undefined)
    @scala.inline
    def setAsyncValidate(
      value: (/* values */ FormData, /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType], /* blurredField */ String) => js.Promise[_]
    ): Self = this.set("asyncValidate", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAsyncValidate: Self = this.set("asyncValidate", js.undefined)
    @scala.inline
    def setDestroyOnUnmount(value: Boolean): Self = this.set("destroyOnUnmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyOnUnmount: Self = this.set("destroyOnUnmount", js.undefined)
    @scala.inline
    def setEnableReinitialize(value: Boolean): Self = this.set("enableReinitialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableReinitialize: Self = this.set("enableReinitialize", js.undefined)
    @scala.inline
    def setForceUnregisterOnUnmount(value: Boolean): Self = this.set("forceUnregisterOnUnmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceUnregisterOnUnmount: Self = this.set("forceUnregisterOnUnmount", js.undefined)
    @scala.inline
    def setGetFormState(value: /* state */ js.Any => FormStateMap): Self = this.set("getFormState", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFormState: Self = this.set("getFormState", js.undefined)
    @scala.inline
    def setImmutablePropsVarargs(value: String*): Self = this.set("immutableProps", js.Array(value :_*))
    @scala.inline
    def setImmutableProps(value: js.Array[String]): Self = this.set("immutableProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutableProps: Self = this.set("immutableProps", js.undefined)
    @scala.inline
    def setInitialValues(value: Partial[FormData]): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialValues: Self = this.set("initialValues", js.undefined)
    @scala.inline
    def setKeepDirtyOnReinitialize(value: Boolean): Self = this.set("keepDirtyOnReinitialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepDirtyOnReinitialize: Self = this.set("keepDirtyOnReinitialize", js.undefined)
    @scala.inline
    def setKeepValues(value: Boolean): Self = this.set("keepValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepValues: Self = this.set("keepValues", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* values */ Partial[FormData], /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType], /* previousValues */ Partial[FormData]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnSubmitFunction3(
      value: (FormData, /* dispatch */ Dispatch[js.Any], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
    ): Self = this.set("onSubmit", js.Any.fromFunction3(value))
    @scala.inline
    def setOnSubmit(value: (FormSubmitHandler[FormData, P, ErrorType]) | (SubmitHandler[FormData, P, ErrorType])): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSubmitFail(
      value: (/* errors */ js.UndefOr[FormErrors[FormData, ErrorType]], /* dispatch */ Dispatch[_], /* submitError */ js.Any, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit
    ): Self = this.set("onSubmitFail", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSubmitFail: Self = this.set("onSubmitFail", js.undefined)
    @scala.inline
    def setOnSubmitSuccess(
      value: (/* result */ js.Any, /* dispatch */ Dispatch[_], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit
    ): Self = this.set("onSubmitSuccess", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSubmitSuccess: Self = this.set("onSubmitSuccess", js.undefined)
    @scala.inline
    def setPersistentSubmitErrors(value: Boolean): Self = this.set("persistentSubmitErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentSubmitErrors: Self = this.set("persistentSubmitErrors", js.undefined)
    @scala.inline
    def setPropNamespace(value: String): Self = this.set("propNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropNamespace: Self = this.set("propNamespace", js.undefined)
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
    @scala.inline
    def setShouldAsyncValidate(value: /* params */ AsyncValidateCallback[FormData, ErrorType] => Boolean): Self = this.set("shouldAsyncValidate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldAsyncValidate: Self = this.set("shouldAsyncValidate", js.undefined)
    @scala.inline
    def setShouldError(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = this.set("shouldError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldError: Self = this.set("shouldError", js.undefined)
    @scala.inline
    def setShouldValidate(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = this.set("shouldValidate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldValidate: Self = this.set("shouldValidate", js.undefined)
    @scala.inline
    def setShouldWarn(value: /* params */ ValidateCallback[FormData, P, ErrorType] => Boolean): Self = this.set("shouldWarn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldWarn: Self = this.set("shouldWarn", js.undefined)
    @scala.inline
    def setSubmitAsSideEffect(value: Boolean): Self = this.set("submitAsSideEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitAsSideEffect: Self = this.set("submitAsSideEffect", js.undefined)
    @scala.inline
    def setTouchOnBlur(value: Boolean): Self = this.set("touchOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchOnBlur: Self = this.set("touchOnBlur", js.undefined)
    @scala.inline
    def setTouchOnChange(value: Boolean): Self = this.set("touchOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchOnChange: Self = this.set("touchOnChange", js.undefined)
    @scala.inline
    def setUpdateUnregisteredFields(value: Boolean): Self = this.set("updateUnregisteredFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateUnregisteredFields: Self = this.set("updateUnregisteredFields", js.undefined)
    @scala.inline
    def setValidate(
      value: (/* values */ FormData, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => FormErrors[FormData, ErrorType]
    ): Self = this.set("validate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setWarn(
      value: (/* values */ FormData, /* props */ DecoratedFormProps[FormData, P, ErrorType]) => FormWarnings[FormData, Unit]
    ): Self = this.set("warn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
  
}

