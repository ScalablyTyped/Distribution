package typings.reactMdForm

import typings.reactMdForm.reactMdFormStrings.badInput
import typings.reactMdForm.reactMdFormStrings.customError
import typings.reactMdForm.reactMdFormStrings.patternMismatch
import typings.reactMdForm.reactMdFormStrings.rangeOverflow
import typings.reactMdForm.reactMdFormStrings.rangeUnderflow
import typings.reactMdForm.reactMdFormStrings.stepMismatch
import typings.reactMdForm.reactMdFormStrings.tooLong
import typings.reactMdForm.reactMdFormStrings.tooShort
import typings.reactMdForm.reactMdFormStrings.typeMismatch
import typings.reactMdForm.reactMdFormStrings.valid
import typings.reactMdForm.reactMdFormStrings.valueMissing
import typings.std.ValidityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextFieldGetErrorMessageMod {
  
  @JSImport("@react-md/form/types/text-field/getErrorMessage", "RECOMMENDED_NUMBER_STATE_KEYS")
  @js.native
  val RECOMMENDED_NUMBER_STATE_KEYS: js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ] = js.native
  
  @JSImport("@react-md/form/types/text-field/getErrorMessage", "RECOMMENDED_STATE_KEYS")
  @js.native
  val RECOMMENDED_STATE_KEYS: js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ] = js.native
  
  @JSImport("@react-md/form/types/text-field/getErrorMessage", "defaultGetErrorMessage")
  @js.native
  val defaultGetErrorMessage: GetErrorMessage = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.reactMdForm.reactMdFormStrings.recommended
    - typings.reactMdForm.reactMdFormStrings.`number-recommended`
    - typings.reactMdForm.reactMdFormStrings.badInput
    - typings.reactMdForm.reactMdFormStrings.customError
    - typings.reactMdForm.reactMdFormStrings.patternMismatch
    - typings.reactMdForm.reactMdFormStrings.rangeOverflow
    - typings.reactMdForm.reactMdFormStrings.rangeUnderflow
    - typings.reactMdForm.reactMdFormStrings.stepMismatch
    - typings.reactMdForm.reactMdFormStrings.tooLong
    - typings.reactMdForm.reactMdFormStrings.tooShort
    - typings.reactMdForm.reactMdFormStrings.typeMismatch
    - typings.reactMdForm.reactMdFormStrings.valid
    - typings.reactMdForm.reactMdFormStrings.valueMissing
    - js.Array[
  typings.reactMdForm.reactMdFormStrings.badInput | typings.reactMdForm.reactMdFormStrings.customError | typings.reactMdForm.reactMdFormStrings.patternMismatch | typings.reactMdForm.reactMdFormStrings.rangeOverflow | typings.reactMdForm.reactMdFormStrings.rangeUnderflow | typings.reactMdForm.reactMdFormStrings.stepMismatch | typings.reactMdForm.reactMdFormStrings.tooLong | typings.reactMdForm.reactMdFormStrings.tooShort | typings.reactMdForm.reactMdFormStrings.typeMismatch | typings.reactMdForm.reactMdFormStrings.valid | typings.reactMdForm.reactMdFormStrings.valueMissing]
  */
  type ChangeValidationBehavior = _ChangeValidationBehavior | (js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ]) | Boolean
  
  trait ErrorMessageOptions
    extends StObject
       with TextConstraints {
    
    /**
      * Boolean if this is triggered from a blur event instead of a change event.
      */
    var isBlurEvent: Boolean
    
    /**
      * The change event validation behavior that is specified in the hook.
      */
    var validateOnChange: ChangeValidationBehavior
    
    /**
      * The browser defined validation message based on the validity state. This
      * will be the empty string when there are no errors.
      */
    var validationMessage: String
    
    /**
      * The current input or textarea's validity state.
      */
    var validity: ValidityState
    
    /**
      * The current `TextField` or `TextArea` value.
      */
    var value: String
  }
  object ErrorMessageOptions {
    
    inline def apply(
      isBlurEvent: Boolean,
      validateOnChange: ChangeValidationBehavior,
      validationMessage: String,
      validity: ValidityState,
      value: String
    ): ErrorMessageOptions = {
      val __obj = js.Dynamic.literal(isBlurEvent = isBlurEvent.asInstanceOf[js.Any], validateOnChange = validateOnChange.asInstanceOf[js.Any], validationMessage = validationMessage.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorMessageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorMessageOptions] (val x: Self) extends AnyVal {
      
      inline def setIsBlurEvent(value: Boolean): Self = StObject.set(x, "isBlurEvent", value.asInstanceOf[js.Any])
      
      inline def setValidateOnChange(value: ChangeValidationBehavior): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
      
      inline def setValidateOnChangeVarargs(
        value: (badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing)*
      ): Self = StObject.set(x, "validateOnChange", js.Array(value*))
      
      inline def setValidationMessage(value: String): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      inline def setValidity(value: ValidityState): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type GetErrorMessage = js.Function1[/* options */ ErrorMessageOptions, String]
  
  /* Inlined std.Pick<react.react.InputHTMLAttributes<std.HTMLInputElement>, 'pattern' | 'required' | 'minLength' | 'maxLength'> */
  trait TextConstraints extends StObject {
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object TextConstraints {
    
    inline def apply(): TextConstraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextConstraints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextConstraints] (val x: Self) extends AnyVal {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait _ChangeValidationBehavior extends StObject
}
