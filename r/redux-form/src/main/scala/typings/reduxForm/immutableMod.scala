package typings.reduxForm

import typings.react.mod.FunctionComponent
import typings.reduxForm.anon.PartialInitializeOptions
import typings.reduxForm.libActionsMod.FormAction
import typings.reduxForm.libFieldArrayMod.BaseFieldArrayProps
import typings.reduxForm.libFieldMod.BaseFieldProps
import typings.reduxForm.libFieldMod.GenericFieldHTMLAttributes
import typings.reduxForm.libFieldsMod.BaseFieldsProps
import typings.reduxForm.libFormMod.FormProps
import typings.reduxForm.libFormNameMod.FormNameProps
import typings.reduxForm.libFormSectionMod.FormSectionProps
import typings.reduxForm.libReducerMod.FormReducer
import typings.reduxForm.libReducerMod.FormStateMap
import typings.reduxForm.libReduxFormMod.ConfigProps
import typings.reduxForm.libReduxFormMod.FormDecorator
import typings.reduxForm.libSelectorsMod.BooleanSelector
import typings.reduxForm.libSelectorsMod.DataSelector
import typings.reduxForm.libSelectorsMod.ErrorSelector
import typings.reduxForm.libSelectorsMod.FormOrFieldsBooleanSelector
import typings.reduxForm.libSelectorsMod.NamesSelector
import typings.reduxForm.mod.FieldType
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immutableMod {
  
  @JSImport("redux-form/immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-form/immutable", "Field")
  @js.native
  open class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected ()
    extends typings.reduxForm.mod.Field[P] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: Any) = this()
  }
  
  @JSImport("redux-form/immutable", "FieldArray")
  @js.native
  open class FieldArray[P, FieldValue] protected ()
    extends typings.reduxForm.mod.FieldArray[P, FieldValue] {
    def this(props: BaseFieldArrayProps[P, FieldValue]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldArrayProps[P, FieldValue], context: Any) = this()
  }
  
  @JSImport("redux-form/immutable", "Fields")
  @js.native
  open class Fields[P] protected ()
    extends typings.reduxForm.mod.Fields[P] {
    def this(props: BaseFieldsProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldsProps[P] & P, context: Any) = this()
  }
  
  @JSImport("redux-form/immutable", "Form")
  @js.native
  open class Form[FormData, P, ErrorType] protected ()
    extends typings.reduxForm.mod.Form[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: Any) = this()
  }
  
  @JSImport("redux-form/immutable", "FormName")
  @js.native
  val FormName: FunctionComponent[FormNameProps] = js.native
  
  @JSImport("redux-form/immutable", "FormSection")
  @js.native
  open class FormSection[P] protected ()
    extends typings.reduxForm.mod.FormSection[P] {
    def this(props: FormSectionProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] & P, context: Any) = this()
  }
  
  @JSImport("redux-form/immutable", "SubmissionError")
  @js.native
  open class SubmissionError[FormData, ErrorType] protected ()
    extends typings.reduxForm.mod.SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  inline def arrayInsert(form: String, field: String, index: Double, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayInsert")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMove")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayPop(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPop")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayPush(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPush")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayRemove(form: String, field: String, index: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayRemoveAll(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemoveAll")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayShift(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayShift")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arraySplice")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeNum.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arraySwap")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], indexA.asInstanceOf[js.Any], indexB.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayUnshift(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnshift")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def autofill(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("autofill")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def blur(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def blur(form: String, field: String, value: Any, touch: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def change(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Unit, persistentSubmitErrors: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("clearFields")((scala.List(form.asInstanceOf[js.Any], keepTouched.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).`++`(fields.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FormAction]
  
  inline def clearSubmitErrors(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSubmitErrors")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def destroy(form: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(form.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FormAction]
  
  inline def focus(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValueSelector")(form.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, Any]]
  inline def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formValueSelector")(form.asInstanceOf[js.Any], getFormState.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, Any]]
  
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
  
  inline def initialize(form: String, data: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Unit, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
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
  
  inline def reduxForm[FormData, P, ErrorType](config: (ConfigProps[FormData, P, ErrorType]) | (Partial[ConfigProps[FormData, P, ErrorType]])): FormDecorator[FormData, P, ErrorType] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduxForm")(config.asInstanceOf[js.Any]).asInstanceOf[FormDecorator[FormData, P, ErrorType]]
  
  inline def registerField(form: String, name: String, `type`: FieldType): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("registerField")(form.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def reset(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def resetSection(form: String, sections: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSection")(scala.List(form.asInstanceOf[js.Any]).`++`(sections.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def setSubmitFailed(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setSubmitFailed")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def startAsyncValidation(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startAsyncValidation")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def startSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def stopSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("stopSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  inline def stopSubmit(form: String, errors: FormErrors[Any, Any]): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("stopSubmit")(form.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def touch(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("touch")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def unregisterField(form: String, name: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterField")(form.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def untouch(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("untouch")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def updateSyncErrors[T](form: String, syncErrors: FormErrors[Any, T], error: T): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSyncErrors")(form.asInstanceOf[js.Any], syncErrors.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[Any, T], warning: T): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSyncWarnings")(form.asInstanceOf[js.Any], syncWarnings.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[FormAction]
}
