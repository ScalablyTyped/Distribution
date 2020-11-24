package typings.reactForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactType
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProps extends js.Object {
  
  var asyncValidators: js.UndefOr[StringDictionary[js.Function1[/* value */ FormValue, js.Promise[_]]]] = js.native
  
  var component: js.UndefOr[ReactType[typings.reactForm.anon.FormApi]] = js.native
  
  var defaultValues: js.UndefOr[FormValues] = js.native
  
  var dontPreventDefault: js.UndefOr[Boolean] = js.native
  
  var dontValidateOnMount: js.UndefOr[Boolean] = js.native
  
  var formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, Unit]] = js.native
  
  var getApi: js.UndefOr[js.Function1[/* formApi */ FormApi, Unit]] = js.native
  
  var onSubmit: js.UndefOr[
    js.Function3[
      /* values */ FormValues, 
      /* submissionEvent */ SyntheticEvent[_, Event], 
      /* formApi */ FormApi, 
      Unit
    ]
  ] = js.native
  
  var onSubmitFailure: js.UndefOr[js.Function2[/* errors */ FormErrors, /* formApi */ FormApi, Unit]] = js.native
  
  var preSubmit: js.UndefOr[js.Function2[/* values */ FormValues, /* formApi */ FormApi, FormValues]] = js.native
  
  var preValidate: js.UndefOr[js.Function1[/* values */ FormValues, FormValues]] = js.native
  
  var render: js.UndefOr[js.Function1[/* formApi */ FormApi, RenderReturn]] = js.native
  
  var validateError: js.UndefOr[ValidateValuesFunction] = js.native
  
  var validateOnSubmit: js.UndefOr[Boolean] = js.native
  
  var validateSuccess: js.UndefOr[js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors]] = js.native
  
  var validateWarning: js.UndefOr[ValidateValuesFunction] = js.native
}
object FormProps {
  
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ReactType[typings.reactForm.anon.FormApi]): Self = this.set("component", value.asInstanceOf[js.Any])
    
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
    def setGetApi(value: /* formApi */ FormApi => Unit): Self = this.set("getApi", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetApi: Self = this.set("getApi", js.undefined)
    
    @scala.inline
    def setOnSubmit(
      value: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[_, Event], /* formApi */ FormApi) => Unit
    ): Self = this.set("onSubmit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSubmitFailure(value: (/* errors */ FormErrors, /* formApi */ FormApi) => Unit): Self = this.set("onSubmitFailure", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSubmitFailure: Self = this.set("onSubmitFailure", js.undefined)
    
    @scala.inline
    def setPreSubmit(value: (/* values */ FormValues, /* formApi */ FormApi) => FormValues): Self = this.set("preSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePreSubmit: Self = this.set("preSubmit", js.undefined)
    
    @scala.inline
    def setPreValidate(value: /* values */ FormValues => FormValues): Self = this.set("preValidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreValidate: Self = this.set("preValidate", js.undefined)
    
    @scala.inline
    def setRender(value: /* formApi */ FormApi => RenderReturn): Self = this.set("render", js.Any.fromFunction1(value))
    
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
