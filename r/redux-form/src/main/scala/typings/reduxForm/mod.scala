package typings.reduxForm

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.reduxForm.actionTypesMod.ActionTypes_
import typings.reduxForm.actionsMod.FormAction
import typings.reduxForm.anon.PartialInitializeOptions
import typings.reduxForm.fieldArrayMod.BaseFieldArrayProps
import typings.reduxForm.fieldMod.BaseFieldProps
import typings.reduxForm.fieldMod.GenericFieldHTMLAttributes
import typings.reduxForm.fieldsMod.BaseFieldsProps
import typings.reduxForm.formMod.FormProps
import typings.reduxForm.formNameMod.FormNameProps
import typings.reduxForm.formSectionMod.FormSectionProps
import typings.reduxForm.reducerMod.FormReducer
import typings.reduxForm.reducerMod.FormStateMap
import typings.reduxForm.reduxFormMod.ConfigProps
import typings.reduxForm.reduxFormMod.FormContext
import typings.reduxForm.reduxFormMod.FormDecorator
import typings.reduxForm.reduxFormStrings.append
import typings.reduxForm.reduxFormStrings.delete
import typings.reduxForm.reduxFormStrings.entries
import typings.reduxForm.reduxFormStrings.forEach
import typings.reduxForm.reduxFormStrings.get
import typings.reduxForm.reduxFormStrings.getAll
import typings.reduxForm.reduxFormStrings.has
import typings.reduxForm.reduxFormStrings.keys
import typings.reduxForm.reduxFormStrings.set
import typings.reduxForm.reduxFormStrings.values
import typings.reduxForm.selectorsMod.BooleanSelector
import typings.reduxForm.selectorsMod.DataSelector
import typings.reduxForm.selectorsMod.ErrorSelector
import typings.reduxForm.selectorsMod.FormOrFieldsBooleanSelector
import typings.reduxForm.selectorsMod.NamesSelector
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-form", "Field")
  @js.native
  open class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected ()
    extends typings.reduxForm.fieldMod.Field[P] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: Any) = this()
  }
  
  @JSImport("redux-form", "FieldArray")
  @js.native
  open class FieldArray[P, FieldValue] protected ()
    extends typings.reduxForm.fieldArrayMod.FieldArray[P, FieldValue] {
    def this(props: BaseFieldArrayProps[P, FieldValue]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldArrayProps[P, FieldValue], context: Any) = this()
  }
  
  @JSImport("redux-form", "Fields")
  @js.native
  open class Fields[P] protected ()
    extends typings.reduxForm.fieldsMod.Fields[P] {
    def this(props: BaseFieldsProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldsProps[P] & P, context: Any) = this()
  }
  
  @JSImport("redux-form", "Form")
  @js.native
  open class Form[FormData, P, ErrorType] protected ()
    extends typings.reduxForm.formMod.Form[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: Any) = this()
  }
  
  @JSImport("redux-form", "FormName")
  @js.native
  val FormName: FunctionComponent[FormNameProps] = js.native
  
  @JSImport("redux-form", "FormSection")
  @js.native
  open class FormSection[P] protected ()
    extends typings.reduxForm.formSectionMod.FormSection[P] {
    def this(props: FormSectionProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] & P, context: Any) = this()
  }
  
  @JSImport("redux-form", "GenericForm")
  @js.native
  open class GenericForm[FormData, P, ErrorType] protected ()
    extends typings.reduxForm.formMod.GenericForm[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: Any) = this()
  }
  
  @JSImport("redux-form", "ReduxFormContext")
  @js.native
  val ReduxFormContext: Context[FormContext] = js.native
  
  @JSImport("redux-form", "SubmissionError")
  @js.native
  open class SubmissionError[FormData, ErrorType] protected ()
    extends typings.reduxForm.submissionErrorMod.SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  @JSImport("redux-form", "actionTypes")
  @js.native
  val actionTypes: ActionTypes_ = js.native
  
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
  
  inline def clearAsyncError(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("clearAsyncError")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("clearFields")((scala.List(form.asInstanceOf[js.Any], keepTouched.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).`++`(fields.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FormAction]
  
  inline def clearSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def clearSubmitErrors(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSubmitErrors")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def destroy(form: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(form.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FormAction]
  
  inline def focus(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValueSelector")(form.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, Any]]
  inline def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formValueSelector")(form.asInstanceOf[js.Any], getFormState.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* state */ State, /* repeated */ String, Any]]
  
  inline def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P & typings.reduxForm.reduxFormStrings.formValues & TopLevel[Any]], 
    ComponentClass[P & typings.reduxForm.reduxFormStrings.formValues & TopLevel[Any], ComponentState]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[P & typings.reduxForm.reduxFormStrings.formValues & TopLevel[Any]], 
    ComponentClass[P & typings.reduxForm.reduxFormStrings.formValues & TopLevel[Any], ComponentState]
  ]]
  inline def formValues[FormData, K /* <: /* keyof FormData */ append | delete | get | getAll | has | set | forEach | entries | keys | values */, P](names: K*): js.Function1[
    /* component */ ComponentType[P & (Pick[FormData, K])], 
    ComponentClass[P & (Pick[FormData, K]), ComponentState]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValues")(names.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[
    /* component */ ComponentType[P & (Pick[FormData, K])], 
    ComponentClass[P & (Pick[FormData, K]), ComponentState]
  ]]
  
  @JSImport("redux-form", "getFormAsyncErrors")
  @js.native
  val getFormAsyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormError")
  @js.native
  val getFormError: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormInitialValues")
  @js.native
  val getFormInitialValues: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form", "getFormMeta")
  @js.native
  val getFormMeta: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form", "getFormNames")
  @js.native
  val getFormNames: NamesSelector[js.Object] = js.native
  
  @JSImport("redux-form", "getFormSubmitErrors")
  @js.native
  val getFormSubmitErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormSyncErrors")
  @js.native
  val getFormSyncErrors: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormSyncWarnings")
  @js.native
  val getFormSyncWarnings: ErrorSelector[js.Object, js.Object, String] = js.native
  
  @JSImport("redux-form", "getFormValues")
  @js.native
  val getFormValues: DataSelector[js.Object, js.Object] = js.native
  
  @JSImport("redux-form", "hasSubmitFailed")
  @js.native
  val hasSubmitFailed: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "hasSubmitSucceeded")
  @js.native
  val hasSubmitSucceeded: BooleanSelector[js.Object] = js.native
  
  inline def initialize(form: String, data: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Unit, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  @JSImport("redux-form", "isAsyncValidating")
  @js.native
  val isAsyncValidating: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isDirty")
  @js.native
  val isDirty: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isInvalid")
  @js.native
  val isInvalid: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isPristine")
  @js.native
  val isPristine: FormOrFieldsBooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isSubmitting")
  @js.native
  val isSubmitting: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "isValid")
  @js.native
  val isValid: BooleanSelector[js.Object] = js.native
  
  @JSImport("redux-form", "reducer")
  @js.native
  val reducer: FormReducer = js.native
  
  inline def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, ErrorType] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduxForm")(config.asInstanceOf[js.Any]).asInstanceOf[FormDecorator[FormData, P, ErrorType]]
  inline def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ErrorType] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduxForm")(config.asInstanceOf[js.Any]).asInstanceOf[FormDecorator[FormData, P, ErrorType]]
  
  inline def registerField(form: String, name: String, `type`: FieldType): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("registerField")(form.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def reset(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def resetSection(form: String, sections: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSection")(scala.List(form.asInstanceOf[js.Any]).`++`(sections.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def setSubmitFailed(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setSubmitFailed")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def setSubmitSucceeded(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setSubmitSucceeded")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def startAsyncValidation(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startAsyncValidation")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def startSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def stopAsyncValidation(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAsyncValidation")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  inline def stopAsyncValidation(form: String, errors: FormErrors[Any, Any]): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("stopAsyncValidation")(form.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def stopSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("stopSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  inline def stopSubmit(form: String, errors: FormErrors[Any, Any]): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("stopSubmit")(form.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def submit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("submit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def touch(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("touch")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def unregisterField(form: String, name: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterField")(form.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def untouch(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("untouch")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def updateSyncErrors[T](form: String, syncErrors: FormErrors[Any, T], error: T): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSyncErrors")(form.asInstanceOf[js.Any], syncErrors.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[Any, T], warning: T): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSyncWarnings")(form.asInstanceOf[js.Any], syncWarnings.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  trait ErrorOther[T] extends StObject {
    
    var _error: js.UndefOr[T] = js.undefined
  }
  object ErrorOther {
    
    inline def apply[T](): ErrorOther[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorOther[T]]
    }
    
    extension [Self <: ErrorOther[?], T](x: Self & ErrorOther[T]) {
      
      inline def set_error(value: T): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
      
      inline def set_errorUndefined: Self = StObject.set(x, "_error", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxForm.reduxFormStrings.Field
    - typings.reduxForm.reduxFormStrings.FieldArray
  */
  trait FieldType extends StObject
  object FieldType {
    
    inline def Field: typings.reduxForm.reduxFormStrings.Field = "Field".asInstanceOf[typings.reduxForm.reduxFormStrings.Field]
    
    inline def FieldArray: typings.reduxForm.reduxFormStrings.FieldArray = "FieldArray".asInstanceOf[typings.reduxForm.reduxFormStrings.FieldArray]
  }
  
  /* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | T} & redux-form.redux-form.ErrorOther<T> */
  trait FormErrors[FormData, T] extends StObject {
    
    var _error: js.UndefOr[T] = js.undefined
    
    var append: js.UndefOr[ReactElement | T] = js.undefined
    
    var delete: js.UndefOr[ReactElement | T] = js.undefined
    
    var entries: js.UndefOr[ReactElement | T] = js.undefined
    
    var forEach: js.UndefOr[ReactElement | T] = js.undefined
    
    var get: js.UndefOr[ReactElement | T] = js.undefined
    
    var getAll: js.UndefOr[ReactElement | T] = js.undefined
    
    var has: js.UndefOr[ReactElement | T] = js.undefined
    
    var keys: js.UndefOr[ReactElement | T] = js.undefined
    
    var set: js.UndefOr[ReactElement | T] = js.undefined
    
    var values: js.UndefOr[ReactElement | T] = js.undefined
  }
  object FormErrors {
    
    inline def apply[FormData, T](): FormErrors[FormData, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormErrors[FormData, T]]
    }
    
    extension [Self <: FormErrors[?, ?], FormData, T](x: Self & (FormErrors[FormData, T])) {
      
      inline def setAppend(value: ReactElement | T): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setDelete(value: ReactElement | T): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setEntries(value: ReactElement | T): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setForEach(value: ReactElement | T): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setGet(value: ReactElement | T): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetAll(value: ReactElement | T): Self = StObject.set(x, "getAll", value.asInstanceOf[js.Any])
      
      inline def setGetAllUndefined: Self = StObject.set(x, "getAll", js.undefined)
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHas(value: ReactElement | T): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setKeys(value: ReactElement | T): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setSet(value: ReactElement | T): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setValues(value: ReactElement | T): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def set_error(value: T): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
      
      inline def set_errorUndefined: Self = StObject.set(x, "_error", js.undefined)
    }
  }
  
  /* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>} */
  trait FormWarnings[FormData, T] extends StObject {
    
    var append: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var delete: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var entries: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var forEach: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var get: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var getAll: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var has: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var keys: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var set: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
    
    var values: js.UndefOr[ReactElement | String | WarningOther[T]] = js.undefined
  }
  object FormWarnings {
    
    inline def apply[FormData, T](): FormWarnings[FormData, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormWarnings[FormData, T]]
    }
    
    extension [Self <: FormWarnings[?, ?], FormData, T](x: Self & (FormWarnings[FormData, T])) {
      
      inline def setAppend(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setDelete(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setEntries(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setForEach(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setGet(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetAll(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "getAll", value.asInstanceOf[js.Any])
      
      inline def setGetAllUndefined: Self = StObject.set(x, "getAll", js.undefined)
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHas(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setKeys(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setSet(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setValues(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  trait RegisteredFieldState extends StObject {
    
    var name: String
    
    var `type`: FieldType
  }
  object RegisteredFieldState {
    
    inline def apply(name: String, `type`: FieldType): RegisteredFieldState = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredFieldState]
    }
    
    extension [Self <: RegisteredFieldState](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait WarningOther[T] extends StObject {
    
    var _warning: js.UndefOr[T] = js.undefined
  }
  object WarningOther {
    
    inline def apply[T](): WarningOther[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WarningOther[T]]
    }
    
    extension [Self <: WarningOther[?], T](x: Self & WarningOther[T]) {
      
      inline def set_warning(value: T): Self = StObject.set(x, "_warning", value.asInstanceOf[js.Any])
      
      inline def set_warningUndefined: Self = StObject.set(x, "_warning", js.undefined)
    }
  }
}
