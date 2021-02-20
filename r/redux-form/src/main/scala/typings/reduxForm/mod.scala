package typings.reduxForm

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-form", "Field")
  @js.native
  class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected ()
    extends typings.reduxForm.fieldMod.Field[P] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
  }
  
  @JSImport("redux-form", "FieldArray")
  @js.native
  class FieldArray[P, FieldValue] protected ()
    extends typings.reduxForm.fieldArrayMod.FieldArray[P, FieldValue] {
    def this(props: BaseFieldArrayProps[P, FieldValue]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldArrayProps[P, FieldValue], context: js.Any) = this()
  }
  
  @JSImport("redux-form", "Fields")
  @js.native
  class Fields[P] protected ()
    extends typings.reduxForm.fieldsMod.Fields[P] {
    def this(props: BaseFieldsProps[P] with P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldsProps[P] with P, context: js.Any) = this()
  }
  
  @JSImport("redux-form", "Form")
  @js.native
  class Form[FormData, P, ErrorType] protected ()
    extends typings.reduxForm.formMod.Form[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: js.Any) = this()
  }
  
  @JSImport("redux-form", "FormName")
  @js.native
  val FormName: StatelessComponent[FormNameProps] = js.native
  
  @JSImport("redux-form", "FormSection")
  @js.native
  class FormSection[P] protected ()
    extends typings.reduxForm.formSectionMod.FormSection[P] {
    def this(props: FormSectionProps[P] with P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] with P, context: js.Any) = this()
  }
  
  @JSImport("redux-form", "GenericForm")
  @js.native
  class GenericForm[FormData, P, ErrorType] protected ()
    extends typings.reduxForm.formMod.GenericForm[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: js.Any) = this()
  }
  
  @JSImport("redux-form", "ReduxFormContext")
  @js.native
  val ReduxFormContext: Context[FormContext] = js.native
  
  @JSImport("redux-form", "SubmissionError")
  @js.native
  class SubmissionError[FormData, ErrorType] protected ()
    extends typings.reduxForm.submissionErrorMod.SubmissionError[FormData, ErrorType] {
    def this(errors: FormErrors[FormData, ErrorType]) = this()
  }
  
  @JSImport("redux-form", "actionTypes")
  @js.native
  val actionTypes: ActionTypes_ = js.native
  
  @JSImport("redux-form", "arrayInsert")
  @js.native
  def arrayInsert(form: String, field: String, index: Double, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form", "arrayMove")
  @js.native
  def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = js.native
  
  @JSImport("redux-form", "arrayPop")
  @js.native
  def arrayPop(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form", "arrayPush")
  @js.native
  def arrayPush(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form", "arrayRemove")
  @js.native
  def arrayRemove(form: String, field: String, index: Double): FormAction = js.native
  
  @JSImport("redux-form", "arrayRemoveAll")
  @js.native
  def arrayRemoveAll(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form", "arrayShift")
  @js.native
  def arrayShift(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form", "arraySplice")
  @js.native
  def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form", "arraySwap")
  @js.native
  def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = js.native
  
  @JSImport("redux-form", "arrayUnshift")
  @js.native
  def arrayUnshift(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form", "autofill")
  @js.native
  def autofill(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form", "blur")
  @js.native
  def blur(form: String, field: String, value: js.Any): FormAction = js.native
  @JSImport("redux-form", "blur")
  @js.native
  def blur(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  
  @JSImport("redux-form", "change")
  @js.native
  def change(form: String, field: String, value: js.Any): FormAction = js.native
  @JSImport("redux-form", "change")
  @js.native
  def change(
    form: String,
    field: String,
    value: js.Any,
    touch: js.UndefOr[scala.Nothing],
    persistentSubmitErrors: Boolean
  ): FormAction = js.native
  @JSImport("redux-form", "change")
  @js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  @JSImport("redux-form", "change")
  @js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
  
  @JSImport("redux-form", "clearAsyncError")
  @js.native
  def clearAsyncError(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form", "clearFields")
  @js.native
  def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = js.native
  
  @JSImport("redux-form", "clearSubmit")
  @js.native
  def clearSubmit(form: String): FormAction = js.native
  
  @JSImport("redux-form", "clearSubmitErrors")
  @js.native
  def clearSubmitErrors(form: String): FormAction = js.native
  
  @JSImport("redux-form", "destroy")
  @js.native
  def destroy(form: String*): FormAction = js.native
  
  @JSImport("redux-form", "focus")
  @js.native
  def focus(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form", "formValueSelector")
  @js.native
  def formValueSelector[State](form: String): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  @JSImport("redux-form", "formValueSelector")
  @js.native
  def formValueSelector[State](form: String, getFormState: js.Function1[/* state */ State, FormStateMap]): js.Function2[/* state */ State, /* repeated */ String, _] = js.native
  
  @JSImport("redux-form", "formValues")
  @js.native
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P with typings.reduxForm.reduxFormStrings.formValues with TopLevel[js.Any]], 
    ComponentClass[
      P with typings.reduxForm.reduxFormStrings.formValues with TopLevel[js.Any], 
      ComponentState
    ]
  ] = js.native
  @JSImport("redux-form", "formValues")
  @js.native
  def formValues[FormData, K /* <: /* keyof FormData */ append | delete | get | getAll | has | set | forEach | entries | keys | values */, P](names: K*): js.Function1[
    /* component */ ComponentType[P with (Pick[FormData, K])], 
    ComponentClass[P with (Pick[FormData, K]), ComponentState]
  ] = js.native
  
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
  
  @JSImport("redux-form", "initialize")
  @js.native
  def initialize(form: String, data: js.Any): FormAction = js.native
  @JSImport("redux-form", "initialize")
  @js.native
  def initialize(
    form: String,
    data: js.Any,
    keepDirty: js.UndefOr[scala.Nothing],
    options: PartialInitializeOptions
  ): FormAction = js.native
  @JSImport("redux-form", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  @JSImport("redux-form", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  @JSImport("redux-form", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
  
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
  
  @JSImport("redux-form", "reduxForm")
  @js.native
  def reduxForm[FormData, P, ErrorType](config: ConfigProps[FormData, P, ErrorType]): FormDecorator[FormData, P, ErrorType] = js.native
  @JSImport("redux-form", "reduxForm")
  @js.native
  def reduxForm[FormData, P, ErrorType](config: Partial[ConfigProps[FormData, P, ErrorType]]): FormDecorator[FormData, P, ErrorType] = js.native
  
  @JSImport("redux-form", "registerField")
  @js.native
  def registerField(form: String, name: String, `type`: FieldType): FormAction = js.native
  
  @JSImport("redux-form", "reset")
  @js.native
  def reset(form: String): FormAction = js.native
  
  @JSImport("redux-form", "resetSection")
  @js.native
  def resetSection(form: String, sections: String*): FormAction = js.native
  
  @JSImport("redux-form", "setSubmitFailed")
  @js.native
  def setSubmitFailed(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form", "setSubmitSucceeded")
  @js.native
  def setSubmitSucceeded(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form", "startAsyncValidation")
  @js.native
  def startAsyncValidation(form: String): FormAction = js.native
  
  @JSImport("redux-form", "startSubmit")
  @js.native
  def startSubmit(form: String): FormAction = js.native
  
  @JSImport("redux-form", "stopAsyncValidation")
  @js.native
  def stopAsyncValidation(form: String): FormAction = js.native
  @JSImport("redux-form", "stopAsyncValidation")
  @js.native
  def stopAsyncValidation(form: String, errors: FormErrors[_, _]): FormAction = js.native
  
  @JSImport("redux-form", "stopSubmit")
  @js.native
  def stopSubmit(form: String): FormAction = js.native
  @JSImport("redux-form", "stopSubmit")
  @js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
  
  @JSImport("redux-form", "submit")
  @js.native
  def submit(form: String): FormAction = js.native
  
  @JSImport("redux-form", "touch")
  @js.native
  def touch(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form", "unregisterField")
  @js.native
  def unregisterField(form: String, name: String): FormAction = js.native
  
  @JSImport("redux-form", "untouch")
  @js.native
  def untouch(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form", "updateSyncErrors")
  @js.native
  def updateSyncErrors[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
  
  @JSImport("redux-form", "updateSyncWarnings")
  @js.native
  def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
  
  @js.native
  trait ErrorOther[T] extends StObject {
    
    var _error: js.UndefOr[T] = js.native
  }
  object ErrorOther {
    
    @scala.inline
    def apply[T](): ErrorOther[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorOther[T]]
    }
    
    @scala.inline
    implicit class ErrorOtherMutableBuilder[Self <: ErrorOther[_], T] (val x: Self with ErrorOther[T]) extends AnyVal {
      
      @scala.inline
      def set_error(value: T): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_errorUndefined: Self = StObject.set(x, "_error", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxForm.reduxFormStrings.Field
    - typings.reduxForm.reduxFormStrings.FieldArray
  */
  trait FieldType extends StObject
  object FieldType {
    
    @scala.inline
    def Field: typings.reduxForm.reduxFormStrings.Field = "Field".asInstanceOf[typings.reduxForm.reduxFormStrings.Field]
    
    @scala.inline
    def FieldArray: typings.reduxForm.reduxFormStrings.FieldArray = "FieldArray".asInstanceOf[typings.reduxForm.reduxFormStrings.FieldArray]
  }
  
  /* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | T} & redux-form.redux-form.ErrorOther<T> */
  @js.native
  trait FormErrors[FormData, T] extends StObject {
    
    var _error: js.UndefOr[T] = js.native
    
    var append: js.UndefOr[ReactElement | T] = js.native
    
    var delete: js.UndefOr[ReactElement | T] = js.native
    
    var entries: js.UndefOr[ReactElement | T] = js.native
    
    var forEach: js.UndefOr[ReactElement | T] = js.native
    
    var get: js.UndefOr[ReactElement | T] = js.native
    
    var getAll: js.UndefOr[ReactElement | T] = js.native
    
    var has: js.UndefOr[ReactElement | T] = js.native
    
    var keys: js.UndefOr[ReactElement | T] = js.native
    
    var set: js.UndefOr[ReactElement | T] = js.native
    
    var values: js.UndefOr[ReactElement | T] = js.native
  }
  object FormErrors {
    
    @scala.inline
    def apply[FormData, T](): FormErrors[FormData, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormErrors[FormData, T]]
    }
    
    @scala.inline
    implicit class FormErrorsMutableBuilder[Self <: FormErrors[_, _], FormData, T] (val x: Self with (FormErrors[FormData, T])) extends AnyVal {
      
      @scala.inline
      def setAppend(value: ReactElement | T): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setDelete(value: ReactElement | T): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setEntries(value: ReactElement | T): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      @scala.inline
      def setForEach(value: ReactElement | T): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      @scala.inline
      def setGet(value: ReactElement | T): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAll(value: ReactElement | T): Self = StObject.set(x, "getAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAllUndefined: Self = StObject.set(x, "getAll", js.undefined)
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setHas(value: ReactElement | T): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      @scala.inline
      def setKeys(value: ReactElement | T): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setSet(value: ReactElement | T): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setValues(value: ReactElement | T): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def set_error(value: T): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_errorUndefined: Self = StObject.set(x, "_error", js.undefined)
    }
  }
  
  /* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>} */
  @js.native
  trait FormWarnings[FormData, T] extends StObject {
    
    var append: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var delete: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var entries: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var forEach: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var get: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var getAll: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var has: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var keys: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var set: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
    
    var values: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  }
  object FormWarnings {
    
    @scala.inline
    def apply[FormData, T](): FormWarnings[FormData, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormWarnings[FormData, T]]
    }
    
    @scala.inline
    implicit class FormWarningsMutableBuilder[Self <: FormWarnings[_, _], FormData, T] (val x: Self with (FormWarnings[FormData, T])) extends AnyVal {
      
      @scala.inline
      def setAppend(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setDelete(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setEntries(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      @scala.inline
      def setForEach(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      @scala.inline
      def setGet(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAll(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "getAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAllUndefined: Self = StObject.set(x, "getAll", js.undefined)
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setHas(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      @scala.inline
      def setKeys(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setSet(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setValues(value: ReactElement | String | WarningOther[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  @js.native
  trait RegisteredFieldState extends StObject {
    
    var name: String = js.native
    
    var `type`: FieldType = js.native
  }
  object RegisteredFieldState {
    
    @scala.inline
    def apply(name: String, `type`: FieldType): RegisteredFieldState = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredFieldState]
    }
    
    @scala.inline
    implicit class RegisteredFieldStateMutableBuilder[Self <: RegisteredFieldState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WarningOther[T] extends StObject {
    
    var _warning: js.UndefOr[T] = js.native
  }
  object WarningOther {
    
    @scala.inline
    def apply[T](): WarningOther[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WarningOther[T]]
    }
    
    @scala.inline
    implicit class WarningOtherMutableBuilder[Self <: WarningOther[_], T] (val x: Self with WarningOther[T]) extends AnyVal {
      
      @scala.inline
      def set_warning(value: T): Self = StObject.set(x, "_warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_warningUndefined: Self = StObject.set(x, "_warning", js.undefined)
    }
  }
}
