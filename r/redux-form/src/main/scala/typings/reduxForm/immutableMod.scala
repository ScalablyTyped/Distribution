package typings.reduxForm

import typings.react.mod.Component
import typings.react.mod.StatelessComponent
import typings.reduxForm.actionsMod.FormAction
import typings.reduxForm.anon.PartialInitializeOptions
import typings.reduxForm.fieldMod.BaseFieldProps
import typings.reduxForm.fieldMod.GenericFieldHTMLAttributes
import typings.reduxForm.formMod.FormProps
import typings.reduxForm.formNameMod.FormNameProps
import typings.reduxForm.formSectionMod.FormSectionProps
import typings.reduxForm.mod.FieldType
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reducerMod.FormReducer
import typings.reduxForm.reducerMod.FormStateMap
import typings.reduxForm.reduxFormMod.ConfigProps
import typings.reduxForm.reduxFormMod.FormDecorator
import typings.reduxForm.selectorsMod.BooleanSelector
import typings.reduxForm.selectorsMod.DataSelector
import typings.reduxForm.selectorsMod.ErrorSelector
import typings.reduxForm.selectorsMod.FormOrFieldsBooleanSelector
import typings.reduxForm.selectorsMod.NamesSelector
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/immutable", JSImport.Namespace)
@js.native
object immutableMod extends js.Object {
  @js.native
  class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] ()
    extends typings.reduxForm.fieldMod.Field[P]
  
  @js.native
  class FieldArray[P, FieldValue] ()
    extends typings.reduxForm.fieldArrayMod.FieldArray[P, FieldValue]
  
  @js.native
  class Fields[P] ()
    extends typings.reduxForm.fieldsMod.Fields[P]
  
  @js.native
  class Form[FormData, P, ErrorType] ()
    extends Component[FormProps[FormData, P, ErrorType], js.Object, js.Any]
  
  @js.native
  class FormSection[P] ()
    extends Component[FormSectionProps[P] with P, js.Object, js.Any]
  
  @js.native
  class SubmissionError[FormData, ErrorType] protected ()
    extends typings.reduxForm.mod.SubmissionError[FormData, ErrorType] {
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
  def arrayInsert(form: String, field: String, index: Double, value: js.Any): FormAction = js.native
  def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = js.native
  def arrayPop(form: String, field: String): FormAction = js.native
  def arrayPush(form: String, field: String, value: js.Any): FormAction = js.native
  def arrayRemove(form: String, field: String, index: Double): FormAction = js.native
  def arrayRemoveAll(form: String, field: String): FormAction = js.native
  def arrayShift(form: String, field: String): FormAction = js.native
  def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: js.Any): FormAction = js.native
  def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = js.native
  def arrayUnshift(form: String, field: String, value: js.Any): FormAction = js.native
  def autofill(form: String, field: String, value: js.Any): FormAction = js.native
  def blur(form: String, field: String, value: js.Any): FormAction = js.native
  def blur(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def change(form: String, field: String, value: js.Any): FormAction = js.native
  def change(
    form: String,
    field: String,
    value: js.Any,
    touch: js.UndefOr[scala.Nothing],
    persistentSubmitErrors: Boolean
  ): FormAction = js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
  def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = js.native
  def clearSubmitErrors(form: String): FormAction = js.native
  def destroy(form: String*): FormAction = js.native
  def focus(form: String, field: String): FormAction = js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  def initialize(form: String, data: js.Any): FormAction = js.native
  def initialize(
    form: String,
    data: js.Any,
    keepDirty: js.UndefOr[scala.Nothing],
    options: PartialInitializeOptions
  ): FormAction = js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  def initialize(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, ErrorType] = js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ErrorType] = js.native
  def registerField(form: String, name: String, `type`: FieldType): FormAction = js.native
  def reset(form: String): FormAction = js.native
  def resetSection(form: String, sections: String*): FormAction = js.native
  def setSubmitFailed(form: String, fields: String*): FormAction = js.native
  def startAsyncValidation(form: String): FormAction = js.native
  def startSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
  def touch(form: String, fields: String*): FormAction = js.native
  def unregisterField(form: String, name: String): FormAction = js.native
  def untouch(form: String, fields: String*): FormAction = js.native
  def updateSyncErrors[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
  def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}

