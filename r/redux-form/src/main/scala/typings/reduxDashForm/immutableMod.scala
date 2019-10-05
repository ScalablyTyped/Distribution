package typings.reduxDashForm

import typings.react.reactMod.StatelessComponent
import typings.reduxDashForm.libActionsMod.FormAction
import typings.reduxDashForm.libFieldMod.BaseFieldProps
import typings.reduxDashForm.libFieldMod.GenericFieldHTMLAttributes
import typings.reduxDashForm.libFormNameMod.FormNameProps
import typings.reduxDashForm.libReducerMod.FormReducer
import typings.reduxDashForm.libReducerMod.FormStateMap
import typings.reduxDashForm.libReduxFormMod.ConfigProps
import typings.reduxDashForm.libReduxFormMod.FormDecorator
import typings.reduxDashForm.libSelectorsMod.BooleanSelector
import typings.reduxDashForm.libSelectorsMod.DataSelector
import typings.reduxDashForm.libSelectorsMod.ErrorSelector
import typings.reduxDashForm.libSelectorsMod.FormOrFieldsBooleanSelector
import typings.reduxDashForm.libSelectorsMod.NamesSelector
import typings.reduxDashForm.reduxDashFormMod.FormErrors
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/immutable", JSImport.Namespace)
@js.native
object immutableMod extends js.Object {
  @js.native
  class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] ()
    extends typings.reduxDashForm.reduxDashFormMod.Field[P]
  
  @js.native
  class FieldArray[P, FieldValue] ()
    extends typings.reduxDashForm.reduxDashFormMod.FieldArray[P, FieldValue]
  
  @js.native
  class Fields[P] ()
    extends typings.reduxDashForm.reduxDashFormMod.Fields[P]
  
  @js.native
  class Form[FormData, P, ErrorType] ()
    extends typings.reduxDashForm.reduxDashFormMod.Form[FormData, P, ErrorType]
  
  @js.native
  class FormSection[P] ()
    extends typings.reduxDashForm.reduxDashFormMod.FormSection[P]
  
  @js.native
  class SubmissionError[FormData, ErrorType] protected ()
    extends typings.reduxDashForm.reduxDashFormMod.SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  val FormName: StatelessComponent[FormNameProps] = js.native
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormInitialValues: DataSelector[js.Object, js.Object] = js.native
  val getFormMeta: DataSelector[js.Object, js.Object] = js.native
  val getFormNames: NamesSelector[js.Object] = js.native
  val getFormSubmitErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormSyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormSyncWarnings: ErrorSelector[js.Object, js.Object, String] = js.native
  val getFormValues: DataSelector[js.Object, js.Object] = js.native
  val hasSubmitFailed: BooleanSelector[js.Object] = js.native
  val hasSubmitSucceeded: BooleanSelector[js.Object] = js.native
  val isAsyncValidating: BooleanSelector[js.Object] = js.native
  val isDirty: FormOrFieldsBooleanSelector[js.Object] = js.native
  val isInvalid: BooleanSelector[js.Object] = js.native
  val isPristine: FormOrFieldsBooleanSelector[js.Object] = js.native
  val isSubmitting: BooleanSelector[js.Object] = js.native
  val isValid: BooleanSelector[js.Object] = js.native
  val reducer: FormReducer = js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, Partial[ConfigProps[FormData, P, ErrorType]], ErrorType] = js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ConfigProps[FormData, P, ErrorType], ErrorType] = js.native
  def startSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
}

