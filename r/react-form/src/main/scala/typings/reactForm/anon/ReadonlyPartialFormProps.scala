package typings.reactForm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactType
import typings.react.mod.SyntheticEvent
import typings.reactForm.mod.FormErrors
import typings.reactForm.mod.FormState
import typings.reactForm.mod.FormValue
import typings.reactForm.mod.FormValues
import typings.reactForm.mod.RenderReturn
import typings.reactForm.mod.ValidateValuesFunction
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Partial<react-form.react-form.FormProps>> */
@js.native
trait ReadonlyPartialFormProps extends js.Object {
  val asyncValidators: js.UndefOr[StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]] = js.native
  val component: js.UndefOr[ReactType[FormApi]] = js.native
  val defaultValues: js.UndefOr[FormValues] = js.native
  val dontPreventDefault: js.UndefOr[Boolean] = js.native
  val dontValidateOnMount: js.UndefOr[Boolean] = js.native
  val formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, Unit]] = js.native
  val getApi: js.UndefOr[js.Function1[/* formApi */ typings.reactForm.mod.FormApi, Unit]] = js.native
  val onSubmit: js.UndefOr[
    js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ SyntheticEvent[_, Event], 
      /* formApi */ typings.reactForm.mod.FormApi, 
      Unit
    ]
  ] = js.native
  val onSubmitFailure: js.UndefOr[
    js.Function2[/* errors */ FormErrors, /* formApi */ typings.reactForm.mod.FormApi, Unit]
  ] = js.native
  val preSubmit: js.UndefOr[
    js.Function2[/* values */ FormValues, /* formApi */ typings.reactForm.mod.FormApi, FormValues]
  ] = js.native
  val preValidate: js.UndefOr[js.Function1[/* values */ FormValues, FormValues]] = js.native
  val render: js.UndefOr[js.Function1[/* formApi */ typings.reactForm.mod.FormApi, RenderReturn]] = js.native
  val validateError: js.UndefOr[ValidateValuesFunction] = js.native
  val validateOnSubmit: js.UndefOr[Boolean] = js.native
  val validateSuccess: js.UndefOr[js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors]] = js.native
  val validateWarning: js.UndefOr[ValidateValuesFunction] = js.native
}

object ReadonlyPartialFormProps {
  @scala.inline
  def apply(): ReadonlyPartialFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPartialFormProps]
  }
  @scala.inline
  implicit class ReadonlyPartialFormPropsOps[Self <: ReadonlyPartialFormProps] (val x: Self) extends AnyVal {
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
    def setAsyncValidators(value: StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]): Self = this.set("asyncValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncValidators: Self = this.set("asyncValidators", js.undefined)
    @scala.inline
    def setComponent(value: ReactType[FormApi]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setDefaultValues(value: FormValues): Self = this.set("defaultValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValues: Self = this.set("defaultValues", js.undefined)
    @scala.inline
    def setDontPreventDefault(value: Boolean): Self = this.set("dontPreventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontPreventDefault: Self = this.set("dontPreventDefault", js.undefined)
    @scala.inline
    def setDontValidateOnMount(value: Boolean): Self = this.set("dontValidateOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontValidateOnMount: Self = this.set("dontValidateOnMount", js.undefined)
    @scala.inline
    def setFormDidUpdate(value: /* formState */ FormState => Unit): Self = this.set("formDidUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormDidUpdate: Self = this.set("formDidUpdate", js.undefined)
    @scala.inline
    def setGetApi(value: /* formApi */ typings.reactForm.mod.FormApi => Unit): Self = this.set("getApi", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetApi: Self = this.set("getApi", js.undefined)
    @scala.inline
    def setOnSubmit(
      value: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[_, Event], /* formApi */ typings.reactForm.mod.FormApi) => Unit
    ): Self = this.set("onSubmit", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSubmitFailure(value: (/* errors */ FormErrors, /* formApi */ typings.reactForm.mod.FormApi) => Unit): Self = this.set("onSubmitFailure", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSubmitFailure: Self = this.set("onSubmitFailure", js.undefined)
    @scala.inline
    def setPreSubmit(value: (/* values */ FormValues, /* formApi */ typings.reactForm.mod.FormApi) => FormValues): Self = this.set("preSubmit", js.Any.fromFunction2(value))
    @scala.inline
    def deletePreSubmit: Self = this.set("preSubmit", js.undefined)
    @scala.inline
    def setPreValidate(value: /* values */ FormValues => FormValues): Self = this.set("preValidate", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreValidate: Self = this.set("preValidate", js.undefined)
    @scala.inline
    def setRender(value: /* formApi */ typings.reactForm.mod.FormApi => RenderReturn): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setValidateError(value: /* values */ FormValues => FormErrors): Self = this.set("validateError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidateError: Self = this.set("validateError", js.undefined)
    @scala.inline
    def setValidateOnSubmit(value: Boolean): Self = this.set("validateOnSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnSubmit: Self = this.set("validateOnSubmit", js.undefined)
    @scala.inline
    def setValidateSuccess(value: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors): Self = this.set("validateSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidateSuccess: Self = this.set("validateSuccess", js.undefined)
    @scala.inline
    def setValidateWarning(value: /* values */ FormValues => FormErrors): Self = this.set("validateWarning", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidateWarning: Self = this.set("validateWarning", js.undefined)
  }
  
}

