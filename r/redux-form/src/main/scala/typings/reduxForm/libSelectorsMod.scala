package typings.reduxForm

import typings.reduxForm.libReduxFormMod.GetFormState
import typings.reduxForm.mod.FormErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorsMod {
  
  @JSImport("redux-form/lib/selectors", "getFormAsyncErrors")
  @js.native
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/lib/selectors", "getFormError")
  @js.native
  val getFormError: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/lib/selectors", "getFormInitialValues")
  @js.native
  val getFormInitialValues: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "getFormMeta")
  @js.native
  val getFormMeta: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "getFormNames")
  @js.native
  val getFormNames: NamesSelector[js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "getFormSubmitErrors")
  @js.native
  val getFormSubmitErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/lib/selectors", "getFormSyncErrors")
  @js.native
  val getFormSyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/lib/selectors", "getFormSyncWarnings")
  @js.native
  val getFormSyncWarnings: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/lib/selectors", "getFormValues")
  @js.native
  val getFormValues: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "hasSubmitFailed")
  @js.native
  val hasSubmitFailed: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "hasSubmitSucceeded")
  @js.native
  val hasSubmitSucceeded: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "isAsyncValidating")
  @js.native
  val isAsyncValidating: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "isDirty")
  @js.native
  val isDirty: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "isInvalid")
  @js.native
  val isInvalid: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "isPristine")
  @js.native
  val isPristine: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "isSubmitting")
  @js.native
  val isSubmitting: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/lib/selectors", "isValid")
  @js.native
  val isValid: BooleanSelector[js.Object] = js.native
  
  type BooleanSelector[State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, Boolean]
  ]
  
  type DataSelector[FormData, State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, FormData]
  ]
  
  type ErrorSelector[FormData, State, ErrorType] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, FormErrors[FormData, ErrorType]]
  ]
  
  type FormOrFieldsBooleanSelector[State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function2[/* state */ State, /* repeated */ String, Boolean]
  ]
  
  type NamesSelector[State] = js.Function1[
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, js.Array[String]]
  ]
}
