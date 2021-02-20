package typings.reduxForm

import typings.react.mod.StatelessComponent
import typings.reduxForm.actionsMod.FormAction
import typings.reduxForm.anon.PartialInitializeOptions
import typings.reduxForm.fieldArrayMod.BaseFieldArrayProps
import typings.reduxForm.fieldMod.BaseFieldProps
import typings.reduxForm.fieldMod.GenericFieldHTMLAttributes
import typings.reduxForm.fieldsMod.BaseFieldsProps
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immutableMod {
  
  @JSImport("redux-form/immutable", "Field")
  @js.native
  class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected ()
    extends typings.reduxForm.mod.Field[P] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
  }
  
  @JSImport("redux-form/immutable", "FieldArray")
  @js.native
  class FieldArray[P, FieldValue] protected ()
    extends typings.reduxForm.mod.FieldArray[P, FieldValue] {
    def this(props: BaseFieldArrayProps[P, FieldValue]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldArrayProps[P, FieldValue], context: js.Any) = this()
  }
  
  @JSImport("redux-form/immutable", "Fields")
  @js.native
  class Fields[P] protected ()
    extends typings.reduxForm.mod.Fields[P] {
    def this(props: BaseFieldsProps[P] with P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldsProps[P] with P, context: js.Any) = this()
  }
  
  @JSImport("redux-form/immutable", "Form")
  @js.native
  class Form[FormData, P, ErrorType] protected ()
    extends typings.reduxForm.mod.Form[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: js.Any) = this()
  }
  
  @JSImport("redux-form/immutable", "FormName")
  @js.native
  val FormName: StatelessComponent[FormNameProps] = js.native
  
  @JSImport("redux-form/immutable", "FormSection")
  @js.native
  class FormSection[P] protected ()
    extends typings.reduxForm.mod.FormSection[P] {
    def this(props: FormSectionProps[P] with P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] with P, context: js.Any) = this()
  }
  
  @JSImport("redux-form/immutable", "SubmissionError")
  @js.native
  class SubmissionError[FormData, ErrorType] protected ()
    extends typings.reduxForm.mod.SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  @JSImport("redux-form/immutable", "arrayInsert")
  @js.native
  def arrayInsert(form: String, field: String, index: Double, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arrayMove")
  @js.native
  def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arrayPop")
  @js.native
  def arrayPop(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arrayPush")
  @js.native
  def arrayPush(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arrayRemove")
  @js.native
  def arrayRemove(form: String, field: String, index: Double): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arrayRemoveAll")
  @js.native
  def arrayRemoveAll(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arrayShift")
  @js.native
  def arrayShift(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arraySplice")
  @js.native
  def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arraySwap")
  @js.native
  def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = js.native
  
  @JSImport("redux-form/immutable", "arrayUnshift")
  @js.native
  def arrayUnshift(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/immutable", "autofill")
  @js.native
  def autofill(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/immutable", "blur")
  @js.native
  def blur(form: String, field: String, value: js.Any): FormAction = js.native
  @JSImport("redux-form/immutable", "blur")
  @js.native
  def blur(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  
  @JSImport("redux-form/immutable", "change")
  @js.native
  def change(form: String, field: String, value: js.Any): FormAction = js.native
  @JSImport("redux-form/immutable", "change")
  @js.native
  def change(
    form: String,
    field: String,
    value: js.Any,
    touch: js.UndefOr[scala.Nothing],
    persistentSubmitErrors: Boolean
  ): FormAction = js.native
  @JSImport("redux-form/immutable", "change")
  @js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  @JSImport("redux-form/immutable", "change")
  @js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
  
  @JSImport("redux-form/immutable", "clearFields")
  @js.native
  def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/immutable", "clearSubmitErrors")
  @js.native
  def clearSubmitErrors(form: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "destroy")
  @js.native
  def destroy(form: String*): FormAction = js.native
  
  @JSImport("redux-form/immutable", "focus")
  @js.native
  def focus(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "formValueSelector")
  @js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  @JSImport("redux-form/immutable", "formValueSelector")
  @js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  
  @JSImport("redux-form/immutable", "getFormAsyncErrors")
  @js.native
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/immutable", "getFormInitialValues")
  @js.native
  val getFormInitialValues: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form/immutable", "getFormMeta")
  @js.native
  val getFormMeta: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form/immutable", "getFormNames")
  @js.native
  val getFormNames: NamesSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "getFormSubmitErrors")
  @js.native
  val getFormSubmitErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/immutable", "getFormSyncErrors")
  @js.native
  val getFormSyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/immutable", "getFormSyncWarnings")
  @js.native
  val getFormSyncWarnings: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form/immutable", "getFormValues")
  @js.native
  val getFormValues: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form/immutable", "hasSubmitFailed")
  @js.native
  val hasSubmitFailed: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "hasSubmitSucceeded")
  @js.native
  val hasSubmitSucceeded: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "initialize")
  @js.native
  def initialize(form: String, data: js.Any): FormAction = js.native
  @JSImport("redux-form/immutable", "initialize")
  @js.native
  def initialize(
    form: String,
    data: js.Any,
    keepDirty: js.UndefOr[scala.Nothing],
    options: PartialInitializeOptions
  ): FormAction = js.native
  @JSImport("redux-form/immutable", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  @JSImport("redux-form/immutable", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  @JSImport("redux-form/immutable", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
  
  @JSImport("redux-form/immutable", "isAsyncValidating")
  @js.native
  val isAsyncValidating: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "isDirty")
  @js.native
  val isDirty: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "isInvalid")
  @js.native
  val isInvalid: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "isPristine")
  @js.native
  val isPristine: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "isSubmitting")
  @js.native
  val isSubmitting: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "isValid")
  @js.native
  val isValid: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form/immutable", "reducer")
  @js.native
  val reducer: FormReducer = js.native
  
  @JSImport("redux-form/immutable", "reduxForm")
  @js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, ErrorType] = js.native
  @JSImport("redux-form/immutable", "reduxForm")
  @js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ErrorType] = js.native
  
  @JSImport("redux-form/immutable", "registerField")
  @js.native
  def registerField(form: String, name: String, `type`: FieldType): FormAction = js.native
  
  @JSImport("redux-form/immutable", "reset")
  @js.native
  def reset(form: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "resetSection")
  @js.native
  def resetSection(form: String, sections: String*): FormAction = js.native
  
  @JSImport("redux-form/immutable", "setSubmitFailed")
  @js.native
  def setSubmitFailed(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/immutable", "startAsyncValidation")
  @js.native
  def startAsyncValidation(form: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "startSubmit")
  @js.native
  def startSubmit(form: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "stopSubmit")
  @js.native
  def stopSubmit(form: String): FormAction = js.native
  @JSImport("redux-form/immutable", "stopSubmit")
  @js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
  
  @JSImport("redux-form/immutable", "touch")
  @js.native
  def touch(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/immutable", "unregisterField")
  @js.native
  def unregisterField(form: String, name: String): FormAction = js.native
  
  @JSImport("redux-form/immutable", "untouch")
  @js.native
  def untouch(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/immutable", "updateSyncErrors")
  @js.native
  def updateSyncErrors[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
  
  @JSImport("redux-form/immutable", "updateSyncWarnings")
  @js.native
  def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}
