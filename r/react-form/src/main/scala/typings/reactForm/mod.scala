package typings.reactForm

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ChildContextProvider
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactText
import typings.react.mod.ReactType
import typings.react.mod.SelectHTMLAttributes
import typings.react.mod.StatelessComponent
import typings.react.mod.SyntheticEvent
import typings.react.mod.TextareaHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.reactForm.anon.FieldPropsInputHTMLAttrib
import typings.reactForm.anon.FieldPropschildrenpropsFi
import typings.reactForm.anon.FormApiValidator
import typings.reactForm.anon.FormPropschildrenpropsFor
import typings.reactForm.anon.Label
import typings.reactForm.anon.ReadonlyPartialFormProps
import typings.reactForm.anon.StyledPropsInputHTMLAttri
import typings.reactForm.anon.StyledPropsInputHTMLAttriAbout
import typings.reactForm.anon.StyledPropschildrenpropsF
import typings.reactForm.reactFormBooleans.`false`
import typings.std.Event
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-form", "Checkbox")
  @js.native
  val Checkbox: StatelessComponent[FieldProps & InputHTMLAttributes[HTMLInputElement]] = js.native
  
  @JSImport("react-form", "Form")
  @js.native
  class Form protected ()
    extends Component[FormPropschildrenpropsFor, js.Object, js.Any]
       with ChildContextProvider[FormContext] {
    def this(props: FormPropschildrenpropsFor) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormPropschildrenpropsFor, context: js.Any) = this()
    
    @JSName("componentWillMount")
    def componentWillMount_MForm(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MForm(nextProps: ReadonlyPartialFormProps, nextContext: js.Any): Unit = js.native
    
    def componentWillUmount(): Unit = js.native
    
    /* CompleteClass */
    override def getChildContext(): FormContext = js.native
    
    def getDefaultState(): FormState = js.native
  }
  /* static members */
  object Form {
    
    @JSImport("react-form", "Form")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-form", "Form.childContextTypes")
    @js.native
    def childContextTypes: FormApiValidator = js.native
    @scala.inline
    def childContextTypes_=(x: FormApiValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-form", "Form.defaultProps")
    @js.native
    def defaultProps: FormProps = js.native
    @scala.inline
    def defaultProps_=(x: FormProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def FormField(component: ComponentType[js.Any]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("FormField")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
  
  @JSImport("react-form", "NestedForm")
  @js.native
  val NestedForm: StatelessComponent[FieldProps] = js.native
  
  @JSImport("react-form", "Radio")
  @js.native
  val Radio: StatelessComponent[FieldPropsInputHTMLAttrib] = js.native
  
  @JSImport("react-form", "RadioGroup")
  @js.native
  class RadioGroup protected ()
    extends Component[FieldPropschildrenpropsFi, js.Object, js.Any]
       with ChildContextProvider[RadioGroupContext] {
    def this(props: FieldPropschildrenpropsFi) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FieldPropschildrenpropsFi, context: js.Any) = this()
    
    /* CompleteClass */
    override def getChildContext(): RadioGroupContext = js.native
  }
  
  @JSImport("react-form", "Select")
  @js.native
  val Select: StatelessComponent[SelectProps] = js.native
  
  @JSImport("react-form", "StyledCheckbox")
  @js.native
  val StyledCheckbox: StatelessComponent[StyledPropsInputHTMLAttri] = js.native
  
  @JSImport("react-form", "StyledRadio")
  @js.native
  val StyledRadio: StatelessComponent[StyledPropsInputHTMLAttriAbout] = js.native
  
  @JSImport("react-form", "StyledRadioGroup")
  @js.native
  class StyledRadioGroup protected ()
    extends Component[StyledPropschildrenpropsF, js.Object, js.Any]
       with ChildContextProvider[RadioGroupContext] {
    def this(props: StyledPropschildrenpropsF) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StyledPropschildrenpropsF, context: js.Any) = this()
    
    /* CompleteClass */
    override def getChildContext(): RadioGroupContext = js.native
  }
  
  @JSImport("react-form", "StyledSelect")
  @js.native
  val StyledSelect: StatelessComponent[StyledProps & SelectProps & InputHTMLAttributes[HTMLSelectElement]] = js.native
  
  @JSImport("react-form", "StyledText")
  @js.native
  val StyledText: StatelessComponent[StyledProps & InputHTMLAttributes[HTMLInputElement]] = js.native
  
  @JSImport("react-form", "StyledTextArea")
  @js.native
  val StyledTextArea: StatelessComponent[StyledProps & TextareaHTMLAttributes[HTMLTextAreaElement]] = js.native
  
  @JSImport("react-form", "Text")
  @js.native
  val Text: StatelessComponent[FieldProps & InputHTMLAttributes[HTMLInputElement]] = js.native
  
  @JSImport("react-form", "TextArea")
  @js.native
  val TextArea: StatelessComponent[FieldProps & TextareaHTMLAttributes[HTMLTextAreaElement]] = js.native
  
  trait FieldApi extends StObject {
    
    def getError(): FormError
    
    def getFieldName(): String
    
    def getSuccess(): FormError
    
    def getTouched(): Boolean
    
    def getValue(): FormValue
    
    def getWarning(): FormError
    
    def setError(error: FormError): Unit
    
    def setSuccess(success: FormError): Unit
    
    def setTouched(touched: Boolean): Unit
    
    def setValue(value: FormValue): Unit
    
    def setWarning(warning: FormError): Unit
  }
  object FieldApi {
    
    @scala.inline
    def apply(
      getError: () => FormError,
      getFieldName: () => String,
      getSuccess: () => FormError,
      getTouched: () => Boolean,
      getValue: () => FormValue,
      getWarning: () => FormError,
      setError: FormError => Unit,
      setSuccess: FormError => Unit,
      setTouched: Boolean => Unit,
      setValue: FormValue => Unit,
      setWarning: FormError => Unit
    ): FieldApi = {
      val __obj = js.Dynamic.literal(getError = js.Any.fromFunction0(getError), getFieldName = js.Any.fromFunction0(getFieldName), getSuccess = js.Any.fromFunction0(getSuccess), getTouched = js.Any.fromFunction0(getTouched), getValue = js.Any.fromFunction0(getValue), getWarning = js.Any.fromFunction0(getWarning), setError = js.Any.fromFunction1(setError), setSuccess = js.Any.fromFunction1(setSuccess), setTouched = js.Any.fromFunction1(setTouched), setValue = js.Any.fromFunction1(setValue), setWarning = js.Any.fromFunction1(setWarning))
      __obj.asInstanceOf[FieldApi]
    }
    
    @scala.inline
    implicit class FieldApiMutableBuilder[Self <: FieldApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetError(value: () => FormError): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFieldName(value: () => String): Self = StObject.set(x, "getFieldName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSuccess(value: () => FormError): Self = StObject.set(x, "getSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTouched(value: () => Boolean): Self = StObject.set(x, "getTouched", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => FormValue): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWarning(value: () => FormError): Self = StObject.set(x, "getWarning", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetError(value: FormError => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSuccess(value: FormError => Unit): Self = StObject.set(x, "setSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTouched(value: Boolean => Unit): Self = StObject.set(x, "setTouched", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValue(value: FormValue => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWarning(value: FormError => Unit): Self = StObject.set(x, "setWarning", js.Any.fromFunction1(value))
    }
  }
  
  trait FieldProps extends StObject {
    
    var errorBefore: js.UndefOr[Boolean] = js.undefined
    
    var field: js.UndefOr[String | (js.Array[js.Array[ReactText] | ReactText | String])] = js.undefined
    
    var isForm: js.UndefOr[Boolean] = js.undefined
    
    var showErrors: js.UndefOr[Boolean] = js.undefined
  }
  object FieldProps {
    
    @scala.inline
    def apply(): FieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldProps]
    }
    
    @scala.inline
    implicit class FieldPropsMutableBuilder[Self <: FieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorBefore(value: Boolean): Self = StObject.set(x, "errorBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorBeforeUndefined: Self = StObject.set(x, "errorBefore", js.undefined)
      
      @scala.inline
      def setField(value: String | (js.Array[js.Array[ReactText] | ReactText | String])): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFieldVarargs(value: (js.Array[ReactText] | ReactText | String)*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setIsForm(value: Boolean): Self = StObject.set(x, "isForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFormUndefined: Self = StObject.set(x, "isForm", js.undefined)
      
      @scala.inline
      def setShowErrors(value: Boolean): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
    }
  }
  
  trait FormApi extends StObject {
    
    def addValue(name: String, value: js.Any): Unit
    
    var asyncValidations: Double
    
    var errors: FormErrors
    
    def getFormState(): FormState
    
    def removeValue(name: String, index: Double): Unit
    
    def resetAll(): Unit
    
    def setAllTouched(touches: StringDictionary[Boolean]): Unit
    
    def setAllValues(values: FormValues): Unit
    
    def setError(field: String, error: String): Unit
    
    def setFormState(state: FormState): Unit
    
    def setSuccess(field: String, success: String): Unit
    
    def setTouched(field: String, touched: Boolean): Unit
    
    def setValue(fieldName: String, value: js.Any): Unit
    
    def setWarning(field: String, warning: String): Unit
    
    // Methods
    def submitForm(event: SyntheticEvent[js.Any, Event]): Unit
    
    var submits: Double
    
    var submitted: Boolean
    
    var successes: FormErrors
    
    def swapValues(name: String, index1: Double, index2: Double): Unit
    
    var touched: Touched
    
    var validating: StringDictionary[Boolean]
    
    var validationFailed: StringDictionary[Boolean]
    
    var validationFailures: Double
    
    // State
    var values: FormValues
    
    var warnings: FormErrors
  }
  object FormApi {
    
    @scala.inline
    def apply(
      addValue: (String, js.Any) => Unit,
      asyncValidations: Double,
      errors: FormErrors,
      getFormState: () => FormState,
      removeValue: (String, Double) => Unit,
      resetAll: () => Unit,
      setAllTouched: StringDictionary[Boolean] => Unit,
      setAllValues: FormValues => Unit,
      setError: (String, String) => Unit,
      setFormState: FormState => Unit,
      setSuccess: (String, String) => Unit,
      setTouched: (String, Boolean) => Unit,
      setValue: (String, js.Any) => Unit,
      setWarning: (String, String) => Unit,
      submitForm: SyntheticEvent[js.Any, Event] => Unit,
      submits: Double,
      submitted: Boolean,
      successes: FormErrors,
      swapValues: (String, Double, Double) => Unit,
      touched: Touched,
      validating: StringDictionary[Boolean],
      validationFailed: StringDictionary[Boolean],
      validationFailures: Double,
      values: FormValues,
      warnings: FormErrors
    ): FormApi = {
      val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), asyncValidations = asyncValidations.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getFormState = js.Any.fromFunction0(getFormState), removeValue = js.Any.fromFunction2(removeValue), resetAll = js.Any.fromFunction0(resetAll), setAllTouched = js.Any.fromFunction1(setAllTouched), setAllValues = js.Any.fromFunction1(setAllValues), setError = js.Any.fromFunction2(setError), setFormState = js.Any.fromFunction1(setFormState), setSuccess = js.Any.fromFunction2(setSuccess), setTouched = js.Any.fromFunction2(setTouched), setValue = js.Any.fromFunction2(setValue), setWarning = js.Any.fromFunction2(setWarning), submitForm = js.Any.fromFunction1(submitForm), submits = submits.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], swapValues = js.Any.fromFunction3(swapValues), touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validationFailed = validationFailed.asInstanceOf[js.Any], validationFailures = validationFailures.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormApi]
    }
    
    @scala.inline
    implicit class FormApiMutableBuilder[Self <: FormApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "addValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAsyncValidations(value: Double): Self = StObject.set(x, "asyncValidations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: FormErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFormState(value: () => FormState): Self = StObject.set(x, "getFormState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveValue(value: (String, Double) => Unit): Self = StObject.set(x, "removeValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResetAll(value: () => Unit): Self = StObject.set(x, "resetAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetAllTouched(value: StringDictionary[Boolean] => Unit): Self = StObject.set(x, "setAllTouched", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAllValues(value: FormValues => Unit): Self = StObject.set(x, "setAllValues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetError(value: (String, String) => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetFormState(value: FormState => Unit): Self = StObject.set(x, "setFormState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSuccess(value: (String, String) => Unit): Self = StObject.set(x, "setSuccess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetTouched(value: (String, Boolean) => Unit): Self = StObject.set(x, "setTouched", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetWarning(value: (String, String) => Unit): Self = StObject.set(x, "setWarning", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmitForm(value: SyntheticEvent[js.Any, Event] => Unit): Self = StObject.set(x, "submitForm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmits(value: Double): Self = StObject.set(x, "submits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitted(value: Boolean): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccesses(value: FormErrors): Self = StObject.set(x, "successes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwapValues(value: (String, Double, Double) => Unit): Self = StObject.set(x, "swapValues", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTouched(value: Touched): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidating(value: StringDictionary[Boolean]): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationFailed(value: StringDictionary[Boolean]): Self = StObject.set(x, "validationFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationFailures(value: Double): Self = StObject.set(x, "validationFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: FormValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: FormErrors): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormContext extends StObject {
    
    var formApi: FormApi
  }
  object FormContext {
    
    @scala.inline
    def apply(formApi: FormApi): FormContext = {
      val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormContext]
    }
    
    @scala.inline
    implicit class FormContextMutableBuilder[Self <: FormContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormApi(value: FormApi): Self = StObject.set(x, "formApi", value.asInstanceOf[js.Any])
    }
  }
  
  type FormError = js.UndefOr[String]
  
  type FormErrors = StringDictionary[FormError]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactForm.mod.FormApi because var conflicts: errors, touched, values. Inlined warnings, successes, submits, submitted, asyncValidations, validating, validationFailures, validationFailed, submitForm, setValue, setAllValues, setError, setWarning, setSuccess, setTouched, setAllTouched, addValue, removeValue, swapValues, resetAll, getFormState, setFormState */ trait FormFunctionProps
    extends StObject
       with FormProps
       with FormState {
    
    def addValue(name: String, value: js.Any): Unit
    
    var asyncValidations: Double
    
    def getFormState(): FormState
    
    def removeValue(name: String, index: Double): Unit
    
    def resetAll(): Unit
    
    def setAllTouched(touches: StringDictionary[Boolean]): Unit
    
    def setAllValues(values: FormValues): Unit
    
    def setError(field: String, error: String): Unit
    
    def setFormState(state: FormState): Unit
    
    def setSuccess(field: String, success: String): Unit
    
    def setTouched(field: String, touched: Boolean): Unit
    
    def setValue(fieldName: String, value: js.Any): Unit
    
    def setWarning(field: String, warning: String): Unit
    
    // Methods
    def submitForm(event: SyntheticEvent[js.Any, Event]): Unit
    
    var submits: Double
    
    var submitted: Boolean
    
    var successes: FormErrors
    
    def swapValues(name: String, index1: Double, index2: Double): Unit
    
    var validating: StringDictionary[Boolean]
    
    var validationFailed: StringDictionary[Boolean]
    
    var validationFailures: Double
    
    var warnings: FormErrors
  }
  object FormFunctionProps {
    
    @scala.inline
    def apply(
      addValue: (String, js.Any) => Unit,
      asyncValidations: Double,
      errors: FormErrors,
      getFormState: () => FormState,
      nestedErrors: NestedErrors,
      removeValue: (String, Double) => Unit,
      resetAll: () => Unit,
      setAllTouched: StringDictionary[Boolean] => Unit,
      setAllValues: FormValues => Unit,
      setError: (String, String) => Unit,
      setFormState: FormState => Unit,
      setSuccess: (String, String) => Unit,
      setTouched: (String, Boolean) => Unit,
      setValue: (String, js.Any) => Unit,
      setWarning: (String, String) => Unit,
      submitForm: SyntheticEvent[js.Any, Event] => Unit,
      submits: Double,
      submitted: Boolean,
      successes: FormErrors,
      swapValues: (String, Double, Double) => Unit,
      touched: Touched,
      validating: StringDictionary[Boolean],
      validationFailed: StringDictionary[Boolean],
      validationFailures: Double,
      values: FormValues,
      warnings: FormErrors
    ): FormFunctionProps = {
      val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), asyncValidations = asyncValidations.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getFormState = js.Any.fromFunction0(getFormState), nestedErrors = nestedErrors.asInstanceOf[js.Any], removeValue = js.Any.fromFunction2(removeValue), resetAll = js.Any.fromFunction0(resetAll), setAllTouched = js.Any.fromFunction1(setAllTouched), setAllValues = js.Any.fromFunction1(setAllValues), setError = js.Any.fromFunction2(setError), setFormState = js.Any.fromFunction1(setFormState), setSuccess = js.Any.fromFunction2(setSuccess), setTouched = js.Any.fromFunction2(setTouched), setValue = js.Any.fromFunction2(setValue), setWarning = js.Any.fromFunction2(setWarning), submitForm = js.Any.fromFunction1(submitForm), submits = submits.asInstanceOf[js.Any], submitted = submitted.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], swapValues = js.Any.fromFunction3(swapValues), touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], validationFailed = validationFailed.asInstanceOf[js.Any], validationFailures = validationFailures.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFunctionProps]
    }
    
    @scala.inline
    implicit class FormFunctionPropsMutableBuilder[Self <: FormFunctionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "addValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAsyncValidations(value: Double): Self = StObject.set(x, "asyncValidations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFormState(value: () => FormState): Self = StObject.set(x, "getFormState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveValue(value: (String, Double) => Unit): Self = StObject.set(x, "removeValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResetAll(value: () => Unit): Self = StObject.set(x, "resetAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetAllTouched(value: StringDictionary[Boolean] => Unit): Self = StObject.set(x, "setAllTouched", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAllValues(value: FormValues => Unit): Self = StObject.set(x, "setAllValues", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetError(value: (String, String) => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetFormState(value: FormState => Unit): Self = StObject.set(x, "setFormState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSuccess(value: (String, String) => Unit): Self = StObject.set(x, "setSuccess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetTouched(value: (String, Boolean) => Unit): Self = StObject.set(x, "setTouched", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetWarning(value: (String, String) => Unit): Self = StObject.set(x, "setWarning", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmitForm(value: SyntheticEvent[js.Any, Event] => Unit): Self = StObject.set(x, "submitForm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmits(value: Double): Self = StObject.set(x, "submits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitted(value: Boolean): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccesses(value: FormErrors): Self = StObject.set(x, "successes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwapValues(value: (String, Double, Double) => Unit): Self = StObject.set(x, "swapValues", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidating(value: StringDictionary[Boolean]): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationFailed(value: StringDictionary[Boolean]): Self = StObject.set(x, "validationFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationFailures(value: Double): Self = StObject.set(x, "validationFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: FormErrors): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormProps extends StObject {
    
    var asyncValidators: js.UndefOr[StringDictionary[js.Function1[/* value */ FormValue, js.Promise[js.Any]]]] = js.undefined
    
    var component: js.UndefOr[ReactType[typings.reactForm.anon.FormApi]] = js.undefined
    
    var defaultValues: js.UndefOr[FormValues] = js.undefined
    
    var dontPreventDefault: js.UndefOr[Boolean] = js.undefined
    
    var dontValidateOnMount: js.UndefOr[Boolean] = js.undefined
    
    var formDidUpdate: js.UndefOr[js.Function1[/* formState */ FormState, Unit]] = js.undefined
    
    var getApi: js.UndefOr[js.Function1[/* formApi */ FormApi, Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[
        js.Function3[
          /* values */ FormValues, 
          /* submissionEvent */ SyntheticEvent[js.Any, Event], 
          /* formApi */ FormApi, 
          Unit
        ]
      ] = js.undefined
    
    var onSubmitFailure: js.UndefOr[js.Function2[/* errors */ FormErrors, /* formApi */ FormApi, Unit]] = js.undefined
    
    var preSubmit: js.UndefOr[js.Function2[/* values */ FormValues, /* formApi */ FormApi, FormValues]] = js.undefined
    
    var preValidate: js.UndefOr[js.Function1[/* values */ FormValues, FormValues]] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* formApi */ FormApi, RenderReturn]] = js.undefined
    
    var validateError: js.UndefOr[ValidateValuesFunction] = js.undefined
    
    var validateOnSubmit: js.UndefOr[Boolean] = js.undefined
    
    var validateSuccess: js.UndefOr[js.Function2[/* values */ FormValues, /* errors */ FormErrors, FormErrors]] = js.undefined
    
    var validateWarning: js.UndefOr[ValidateValuesFunction] = js.undefined
  }
  object FormProps {
    
    @scala.inline
    def apply(): FormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps]
    }
    
    @scala.inline
    implicit class FormPropsMutableBuilder[Self <: FormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncValidators(value: StringDictionary[js.Function1[/* value */ FormValue, js.Promise[js.Any]]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
      
      @scala.inline
      def setComponent(value: ReactType[typings.reactForm.anon.FormApi]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDefaultValues(value: FormValues): Self = StObject.set(x, "defaultValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValuesUndefined: Self = StObject.set(x, "defaultValues", js.undefined)
      
      @scala.inline
      def setDontPreventDefault(value: Boolean): Self = StObject.set(x, "dontPreventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontPreventDefaultUndefined: Self = StObject.set(x, "dontPreventDefault", js.undefined)
      
      @scala.inline
      def setDontValidateOnMount(value: Boolean): Self = StObject.set(x, "dontValidateOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontValidateOnMountUndefined: Self = StObject.set(x, "dontValidateOnMount", js.undefined)
      
      @scala.inline
      def setFormDidUpdate(value: /* formState */ FormState => Unit): Self = StObject.set(x, "formDidUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormDidUpdateUndefined: Self = StObject.set(x, "formDidUpdate", js.undefined)
      
      @scala.inline
      def setGetApi(value: /* formApi */ FormApi => Unit): Self = StObject.set(x, "getApi", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetApiUndefined: Self = StObject.set(x, "getApi", js.undefined)
      
      @scala.inline
      def setOnSubmit(
        value: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[js.Any, Event], /* formApi */ FormApi) => Unit
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSubmitFailure(value: (/* errors */ FormErrors, /* formApi */ FormApi) => Unit): Self = StObject.set(x, "onSubmitFailure", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSubmitFailureUndefined: Self = StObject.set(x, "onSubmitFailure", js.undefined)
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setPreSubmit(value: (/* values */ FormValues, /* formApi */ FormApi) => FormValues): Self = StObject.set(x, "preSubmit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPreSubmitUndefined: Self = StObject.set(x, "preSubmit", js.undefined)
      
      @scala.inline
      def setPreValidate(value: /* values */ FormValues => FormValues): Self = StObject.set(x, "preValidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreValidateUndefined: Self = StObject.set(x, "preValidate", js.undefined)
      
      @scala.inline
      def setRender(value: /* formApi */ FormApi => RenderReturn): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setValidateError(value: /* values */ FormValues => FormErrors): Self = StObject.set(x, "validateError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateErrorUndefined: Self = StObject.set(x, "validateError", js.undefined)
      
      @scala.inline
      def setValidateOnSubmit(value: Boolean): Self = StObject.set(x, "validateOnSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOnSubmitUndefined: Self = StObject.set(x, "validateOnSubmit", js.undefined)
      
      @scala.inline
      def setValidateSuccess(value: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors): Self = StObject.set(x, "validateSuccess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateSuccessUndefined: Self = StObject.set(x, "validateSuccess", js.undefined)
      
      @scala.inline
      def setValidateWarning(value: /* values */ FormValues => FormErrors): Self = StObject.set(x, "validateWarning", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateWarningUndefined: Self = StObject.set(x, "validateWarning", js.undefined)
    }
  }
  
  trait FormState extends StObject {
    
    var dirty: js.UndefOr[Boolean] = js.undefined
    
    var errors: FormErrors
    
    var nestedErrors: NestedErrors
    
    var touched: Touched
    
    var values: FormValues
  }
  object FormState {
    
    @scala.inline
    def apply(errors: FormErrors, nestedErrors: NestedErrors, touched: Touched, values: FormValues): FormState = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormState]
    }
    
    @scala.inline
    implicit class FormStateMutableBuilder[Self <: FormState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      @scala.inline
      def setErrors(value: FormErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedErrors(value: NestedErrors): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouched(value: Touched): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: FormValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type FormValue = js.Any
  
  type FormValues = Nested[FormValue]
  
  trait Nested[T]
    extends StObject
       with /* key */ StringDictionary[T | Nested[T]]
  object Nested {
    
    @scala.inline
    def apply[T](): Nested[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Nested[T]]
    }
  }
  
  type NestedErrors = Nested[FormErrors]
  
  trait RadioGroupContext extends StObject {
    
    var group: FieldApi
  }
  object RadioGroupContext {
    
    @scala.inline
    def apply(group: FieldApi): RadioGroupContext = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupContext]
    }
    
    @scala.inline
    implicit class RadioGroupContextMutableBuilder[Self <: RadioGroupContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: FieldApi): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderReturn = Element | `false` | Null | js.Array[scala.Nothing]
  
  type SelectOptions = js.Array[Label]
  
  trait SelectProps
    extends StObject
       with FieldProps
       with SelectHTMLAttributes[HTMLSelectElement] {
    
    var options: SelectOptions
  }
  object SelectProps {
    
    @scala.inline
    def apply(options: SelectOptions): SelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
    
    @scala.inline
    implicit class SelectPropsMutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: SelectOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: Label*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  trait StyledProps
    extends StObject
       with FieldProps {
    
    var messageBefore: js.UndefOr[Boolean] = js.undefined
    
    var noMessage: js.UndefOr[Boolean] = js.undefined
    
    var touchValidation: js.UndefOr[Boolean] = js.undefined
  }
  object StyledProps {
    
    @scala.inline
    def apply(): StyledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledProps]
    }
    
    @scala.inline
    implicit class StyledPropsMutableBuilder[Self <: StyledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageBefore(value: Boolean): Self = StObject.set(x, "messageBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageBeforeUndefined: Self = StObject.set(x, "messageBefore", js.undefined)
      
      @scala.inline
      def setNoMessage(value: Boolean): Self = StObject.set(x, "noMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMessageUndefined: Self = StObject.set(x, "noMessage", js.undefined)
      
      @scala.inline
      def setTouchValidation(value: Boolean): Self = StObject.set(x, "touchValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchValidationUndefined: Self = StObject.set(x, "touchValidation", js.undefined)
    }
  }
  
  type Touched = Nested[Boolean]
  
  type ValidateValuesFunction = js.Function1[/* values */ FormValues, FormErrors]
}
