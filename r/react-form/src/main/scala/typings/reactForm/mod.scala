package typings.reactForm

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.SyntheticEvent
import typings.reactForm.anon.IsTouched
import typings.reactForm.anon.TypeofComponent
import typings.reactForm.reactFormBooleans.`false`
import typings.std.Element
import typings.std.Event
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitFormProps(props: Any): js.Tuple3[String, UseFieldOptions[Any, Any, Any, Any, Any, Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitFormProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, UseFieldOptions[Any, Any, Any, Any, Any, Any], Any]]
  
  inline def useField[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */, InputPropsType /* <: UseFieldInstancePropsType[ValueType] */](
    fieldPath: String,
    props: UseFieldOptions[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType]
  ): UseFieldInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType] = (^.asInstanceOf[js.Dynamic].applyDynamic("useField")(fieldPath.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[UseFieldInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType]]
  
  inline def useForm[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */](props: UseFormOptions[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType]): UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")(props.asInstanceOf[js.Any]).asInstanceOf[UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType]]
  
  inline def useFormContext(): UseFormInstance[Any, Any, Any, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormContext")().asInstanceOf[UseFormInstance[Any, Any, Any, Any, Any]]
  
  @js.native
  trait FieldScopeSpecificMethods[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */] extends StObject {
    
    def insertFieldValue(fieldPath: String, insertIndex: Double, value: ValueType): Unit = js.native
    
    def pushFieldValue(fieldPath: String, newValue: ValueType): Unit = js.native
    
    def removeFieldValue(fieldPath: String, removalIndex: Double): Unit = js.native
    
    def setFieldMeta(fieldPath: String, updater: js.Function1[/* prev */ FieldMetaType, FieldMetaType]): Unit = js.native
    def setFieldMeta(fieldPath: String, updater: Partial[FieldMetaType]): Unit = js.native
    
    def setFieldValue(fieldPath: String, updater: ValueType, options: IsTouched): Unit = js.native
    def setFieldValue(fieldPath: String, updater: js.Function1[/* prev */ ValueType, ValueType], options: IsTouched): Unit = js.native
    
    def swapFieldValues(fieldPath: String, firstIndex: Double, secondIndex: Double): Unit = js.native
  }
  
  @js.native
  trait UseFieldInstance[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */, InputPropsType /* <: UseFieldInstancePropsType[ValueType] */]
    extends StObject
       with FieldScopeSpecificMethods[ValueType, ErrorType, EventType, FieldMetaType] {
    
    var FieldScope: TypeofComponent & (Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
        Component[js.Object, js.Object, js.Object]
      ]) = js.native
    
    def debounce(f: js.Function0[Unit], wait: Double): js.Promise[Unit] | Unit = js.native
    
    var fieldName: String = js.native
    
    var form: UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType] = js.native
    
    def getInputProps(): InputPropsType = js.native
    def getInputProps(props: Partial[InputPropsType]): InputPropsType = js.native
    
    def insertValue(insertIndex: Double, value: ValueType): Unit = js.native
    
    var meta: FieldMetaType = js.native
    
    def pushValue(newValue: ValueType): Unit = js.native
    
    def removeValue(removalIndex: Double): Unit = js.native
    
    def runValidation(): Unit = js.native
    
    def setMeta(updater: js.Function1[/* prev */ FieldMetaType, FieldMetaType]): Unit = js.native
    def setMeta(updater: Partial[FieldMetaType]): Unit = js.native
    
    def setValue(updater: ValueType): Unit = js.native
    def setValue(updater: ValueType, options: IsTouched): Unit = js.native
    def setValue(updater: js.Function1[/* prev */ ValueType, ValueType]): Unit = js.native
    def setValue(updater: js.Function1[/* prev */ ValueType, ValueType], options: IsTouched): Unit = js.native
    
    def swapValues(firstIndex: Double, secondIndex: Double): Unit = js.native
    
    var value: ValueType = js.native
  }
  
  trait UseFieldInstanceMeta[ErrorType] extends StObject {
    
    var error: ErrorType | Null
    
    var isTouched: Boolean
    
    var isValidating: Boolean
  }
  object UseFieldInstanceMeta {
    
    inline def apply[ErrorType](isTouched: Boolean, isValidating: Boolean): UseFieldInstanceMeta[ErrorType] = {
      val __obj = js.Dynamic.literal(isTouched = isTouched.asInstanceOf[js.Any], isValidating = isValidating.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[UseFieldInstanceMeta[ErrorType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseFieldInstanceMeta[?], ErrorType] (val x: Self & UseFieldInstanceMeta[ErrorType]) extends AnyVal {
      
      inline def setError(value: ErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setIsTouched(value: Boolean): Self = StObject.set(x, "isTouched", value.asInstanceOf[js.Any])
      
      inline def setIsValidating(value: Boolean): Self = StObject.set(x, "isValidating", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseFieldInstancePropsType[ValueType] extends StObject {
    
    var onBlur: FormEventHandler[Element]
    
    var onChange: ChangeEventHandler[Element]
    
    var value: ValueType
  }
  object UseFieldInstancePropsType {
    
    inline def apply[ValueType](onBlur: FormEvent[Element] => Unit, onChange: ChangeEvent[Element] => Unit, value: ValueType): UseFieldInstancePropsType[ValueType] = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseFieldInstancePropsType[ValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseFieldInstancePropsType[?], ValueType] (val x: Self & UseFieldInstancePropsType[ValueType]) extends AnyVal {
      
      inline def setOnBlur(value: FormEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: ChangeEvent[Element] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseFieldOptions[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */, InputPropsType /* <: UseFieldInstancePropsType[ValueType] */] extends StObject {
    
    var defaultError: js.UndefOr[ErrorType] = js.undefined
    
    var defaultIsTouched: js.UndefOr[Boolean] = js.undefined
    
    var defaultMeta: js.UndefOr[FieldMetaType] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType] = js.undefined
    
    var filterValue: js.UndefOr[
        js.Function2[
          /* value */ ValueType, 
          /* instance */ UseFieldInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType], 
          ValueType
        ]
      ] = js.undefined
    
    var validate: js.UndefOr[
        js.Function2[
          /* value */ ValueType, 
          /* instance */ UseFieldInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType], 
          js.Promise[ValidateResult] | ValidateResult | Unit
        ]
      ] = js.undefined
    
    var validatePristine: js.UndefOr[Boolean] = js.undefined
  }
  object UseFieldOptions {
    
    inline def apply[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */, InputPropsType /* <: UseFieldInstancePropsType[ValueType] */](): UseFieldOptions[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFieldOptions[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseFieldOptions[?, ?, ?, ?, ?, ?], ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */, InputPropsType /* <: UseFieldInstancePropsType[ValueType] */] (val x: Self & (UseFieldOptions[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType])) extends AnyVal {
      
      inline def setDefaultError(value: ErrorType): Self = StObject.set(x, "defaultError", value.asInstanceOf[js.Any])
      
      inline def setDefaultErrorUndefined: Self = StObject.set(x, "defaultError", js.undefined)
      
      inline def setDefaultIsTouched(value: Boolean): Self = StObject.set(x, "defaultIsTouched", value.asInstanceOf[js.Any])
      
      inline def setDefaultIsTouchedUndefined: Self = StObject.set(x, "defaultIsTouched", js.undefined)
      
      inline def setDefaultMeta(value: FieldMetaType): Self = StObject.set(x, "defaultMeta", value.asInstanceOf[js.Any])
      
      inline def setDefaultMetaUndefined: Self = StObject.set(x, "defaultMeta", js.undefined)
      
      inline def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setFilterValue(
        value: (/* value */ ValueType, /* instance */ UseFieldInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType]) => ValueType
      ): Self = StObject.set(x, "filterValue", js.Any.fromFunction2(value))
      
      inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      inline def setValidate(
        value: (/* value */ ValueType, /* instance */ UseFieldInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType, InputPropsType]) => js.Promise[ValidateResult] | ValidateResult | Unit
      ): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidatePristine(value: Boolean): Self = StObject.set(x, "validatePristine", value.asInstanceOf[js.Any])
      
      inline def setValidatePristineUndefined: Self = StObject.set(x, "validatePristine", js.undefined)
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */]
    extends StObject
       with FieldScopeSpecificMethods[ValueType, ErrorType, EventType, FieldMetaType] {
    
    var Form: TypeofComponent & (Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
        Component[js.Object, js.Object, js.Object]
      ]) = js.native
    
    def debounce(f: js.Function0[Unit], wait: Double): js.Promise[Unit] | Unit = js.native
    
    var formContext: UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType] = js.native
    
    def getFieldMeta(fieldPath: String): FieldMetaType = js.native
    
    def getFieldValue(fieldPath: String): ValueType = js.native
    
    def handleSubmit(event: SyntheticEvent[EventType, Event]): Unit = js.native
    
    var meta: FormMetaType = js.native
    
    def reset(): Unit = js.native
    
    def runValidation(): Unit = js.native
    
    def setMeta(updater: js.Function1[/* prev */ FormMetaType, FormMetaType]): Unit = js.native
    def setMeta(updater: Partial[FormMetaType]): Unit = js.native
    
    def setValues(updater: js.Function1[/* previousValues */ UseFormValues[ValueType], UseFormValues[ValueType]]): Unit = js.native
    def setValues(updater: UseFormValues[ValueType]): Unit = js.native
    
    var values: UseFormValues[ValueType] = js.native
  }
  
  trait UseFormInstanceMeta[ErrorType] extends StObject {
    
    var canSubmit: Boolean
    
    var error: ErrorType
    
    var fieldsAreValid: Boolean
    
    var fieldsAreValidating: Boolean
    
    var isSubmitted: Boolean
    
    var isSubmitting: Boolean
    
    var isTouched: Boolean
    
    var isValid: Boolean
    
    var submissionAttempts: Double
  }
  object UseFormInstanceMeta {
    
    inline def apply[ErrorType](
      canSubmit: Boolean,
      error: ErrorType,
      fieldsAreValid: Boolean,
      fieldsAreValidating: Boolean,
      isSubmitted: Boolean,
      isSubmitting: Boolean,
      isTouched: Boolean,
      isValid: Boolean,
      submissionAttempts: Double
    ): UseFormInstanceMeta[ErrorType] = {
      val __obj = js.Dynamic.literal(canSubmit = canSubmit.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fieldsAreValid = fieldsAreValid.asInstanceOf[js.Any], fieldsAreValidating = fieldsAreValidating.asInstanceOf[js.Any], isSubmitted = isSubmitted.asInstanceOf[js.Any], isSubmitting = isSubmitting.asInstanceOf[js.Any], isTouched = isTouched.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], submissionAttempts = submissionAttempts.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseFormInstanceMeta[ErrorType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseFormInstanceMeta[?], ErrorType] (val x: Self & UseFormInstanceMeta[ErrorType]) extends AnyVal {
      
      inline def setCanSubmit(value: Boolean): Self = StObject.set(x, "canSubmit", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFieldsAreValid(value: Boolean): Self = StObject.set(x, "fieldsAreValid", value.asInstanceOf[js.Any])
      
      inline def setFieldsAreValidating(value: Boolean): Self = StObject.set(x, "fieldsAreValidating", value.asInstanceOf[js.Any])
      
      inline def setIsSubmitted(value: Boolean): Self = StObject.set(x, "isSubmitted", value.asInstanceOf[js.Any])
      
      inline def setIsSubmitting(value: Boolean): Self = StObject.set(x, "isSubmitting", value.asInstanceOf[js.Any])
      
      inline def setIsTouched(value: Boolean): Self = StObject.set(x, "isTouched", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setSubmissionAttempts(value: Double): Self = StObject.set(x, "submissionAttempts", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseFormOptions[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */] extends StObject {
    
    var debugForm: js.UndefOr[Boolean] = js.undefined
    
    var defaultValues: js.UndefOr[UseFormValues[ValueType]] = js.undefined
    
    var onSubmit: js.UndefOr[
        js.Function2[
          /* values */ UseFormValues[ValueType], 
          /* instance */ UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType], 
          js.Promise[Unit] | Unit
        ]
      ] = js.undefined
    
    var validate: js.UndefOr[
        js.Function2[
          /* values */ UseFormValues[ValueType], 
          /* instance */ UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType], 
          js.Promise[ValidateResult] | ValidateResult | Unit
        ]
      ] = js.undefined
    
    var validatePristine: js.UndefOr[Boolean] = js.undefined
  }
  object UseFormOptions {
    
    inline def apply[ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */](): UseFormOptions[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseFormOptions[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseFormOptions[?, ?, ?, ?, ?], ValueType, ErrorType, EventType, FieldMetaType /* <: UseFieldInstanceMeta[ErrorType] */, FormMetaType /* <: UseFormInstanceMeta[ErrorType] */] (val x: Self & (UseFormOptions[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType])) extends AnyVal {
      
      inline def setDebugForm(value: Boolean): Self = StObject.set(x, "debugForm", value.asInstanceOf[js.Any])
      
      inline def setDebugFormUndefined: Self = StObject.set(x, "debugForm", js.undefined)
      
      inline def setDefaultValues(value: UseFormValues[ValueType]): Self = StObject.set(x, "defaultValues", value.asInstanceOf[js.Any])
      
      inline def setDefaultValuesUndefined: Self = StObject.set(x, "defaultValues", js.undefined)
      
      inline def setOnSubmit(
        value: (/* values */ UseFormValues[ValueType], /* instance */ UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType]) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setValidate(
        value: (/* values */ UseFormValues[ValueType], /* instance */ UseFormInstance[ValueType, ErrorType, EventType, FieldMetaType, FormMetaType]) => js.Promise[ValidateResult] | ValidateResult | Unit
      ): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidatePristine(value: Boolean): Self = StObject.set(x, "validatePristine", value.asInstanceOf[js.Any])
      
      inline def setValidatePristineUndefined: Self = StObject.set(x, "validatePristine", js.undefined)
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type UseFormValues[ValueType] = Record[String, ValueType]
  
  type ValidateResult = js.UndefOr[String | `false`]
}
