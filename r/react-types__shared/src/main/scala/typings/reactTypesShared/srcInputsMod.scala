package typings.reactTypesShared

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInputsMod {
  
  trait HelpTextProps extends StObject {
    
    /** A description for the field. Provides a hint such as specific requirements for what to choose. */
    var description: js.UndefOr[ReactNode] = js.undefined
    
    /** An error message for the field. */
    var errorMessage: js.UndefOr[ReactNode] = js.undefined
  }
  object HelpTextProps {
    
    inline def apply(): HelpTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpTextProps]
    }
    
    extension [Self <: HelpTextProps](x: Self) {
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setErrorMessage(value: ReactNode): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    }
  }
  
  trait InputBase extends StObject {
    
    /** Whether the input is disabled. */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the input can be selected but not changed by the user. */
    var isReadOnly: js.UndefOr[Boolean] = js.undefined
  }
  object InputBase {
    
    inline def apply(): InputBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputBase]
    }
    
    extension [Self <: InputBase](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
      
      inline def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
    }
  }
  
  trait RangeInputBase[T] extends StObject {
    
    /** The largest value allowed for the input. */
    var maxValue: js.UndefOr[T] = js.undefined
    
    /** The smallest value allowed for the input. */
    var minValue: js.UndefOr[T] = js.undefined
    
    /** The amount that the input value changes with each increment or decrement "tick". */
    var step: js.UndefOr[T] = js.undefined
  }
  object RangeInputBase {
    
    inline def apply[T](): RangeInputBase[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeInputBase[T]]
    }
    
    extension [Self <: RangeInputBase[?], T](x: Self & RangeInputBase[T]) {
      
      inline def setMaxValue(value: T): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: T): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setStep(value: T): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait RangeValue[T] extends StObject {
    
    /** The end value of the range. */
    var end: T
    
    /** The start value of the range. */
    var start: T
  }
  object RangeValue {
    
    inline def apply[T](end: T, start: T): RangeValue[T] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeValue[T]]
    }
    
    extension [Self <: RangeValue[?], T](x: Self & RangeValue[T]) {
      
      inline def setEnd(value: T): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: T): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpectrumHelpTextProps
    extends StObject
       with HelpTextProps
       with Validation {
    
    /** Whether the description is displayed with lighter text. */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether an error icon is rendered. */
    var showErrorIcon: js.UndefOr[Boolean] = js.undefined
  }
  object SpectrumHelpTextProps {
    
    inline def apply(): SpectrumHelpTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpectrumHelpTextProps]
    }
    
    extension [Self <: SpectrumHelpTextProps](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setShowErrorIcon(value: Boolean): Self = StObject.set(x, "showErrorIcon", value.asInstanceOf[js.Any])
      
      inline def setShowErrorIconUndefined: Self = StObject.set(x, "showErrorIcon", js.undefined)
    }
  }
  
  trait SpectrumTextInputBase extends StObject {
    
    /**
      * Temporary text that occupies the text input when it is empty.
      * Please use help text instead.
      * @deprecated
      **/
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object SpectrumTextInputBase {
    
    inline def apply(): SpectrumTextInputBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpectrumTextInputBase]
    }
    
    extension [Self <: SpectrumTextInputBase](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  trait TextInputBase extends StObject {
    
    /** Temporary text that occupies the text input when it is empty. */
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object TextInputBase {
    
    inline def apply(): TextInputBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputBase]
    }
    
    extension [Self <: TextInputBase](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  trait Validation extends StObject {
    
    /**
      * Whether user input is required on the input before form submission.
      * Often paired with the `necessityIndicator` prop to add a visual indicator to the input.
      */
    var isRequired: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the input should display its "valid" or "invalid" visual styling. */
    var validationState: js.UndefOr[ValidationState] = js.undefined
  }
  object Validation {
    
    inline def apply(): Validation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Validation]
    }
    
    extension [Self <: Validation](x: Self) {
      
      inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      inline def setValidationState(value: ValidationState): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.valid
    - typings.reactTypesShared.reactTypesSharedStrings.invalid
  */
  trait ValidationState extends StObject
  object ValidationState {
    
    inline def invalid: typings.reactTypesShared.reactTypesSharedStrings.invalid = "invalid".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.invalid]
    
    inline def valid: typings.reactTypesShared.reactTypesSharedStrings.valid = "valid".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.valid]
  }
  
  trait ValueBase[T, C] extends StObject {
    
    /** The default value (uncontrolled). */
    var defaultValue: js.UndefOr[T] = js.undefined
    
    /** Handler that is called when the value changes. */
    var onChange: js.UndefOr[js.Function1[/* value */ C, Unit]] = js.undefined
    
    /** The current value (controlled). */
    var value: js.UndefOr[T] = js.undefined
  }
  object ValueBase {
    
    inline def apply[T, C](): ValueBase[T, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueBase[T, C]]
    }
    
    extension [Self <: ValueBase[?, ?], T, C](x: Self & (ValueBase[T, C])) {
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: /* value */ C => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
