package typings.reactMdForm

import typings.react.mod.Dispatch
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.reactMdForm.anon.NumberFieldHookOptionsdef
import typings.reactMdForm.anon.NumberFieldHookOptionsdefCounter
import typings.reactMdForm.anon.NumberFieldHookOptionsdefDefaultValue
import typings.reactMdForm.anon.NumberFieldHookOptionsdis
import typings.reactMdForm.anon.NumberFieldHookOptionsdisCounter
import typings.reactMdForm.anon.NumberFieldHookOptionsdisDefaultValue
import typings.reactMdForm.reactMdFormStrings.badInput
import typings.reactMdForm.reactMdFormStrings.customError
import typings.reactMdForm.reactMdFormStrings.number
import typings.reactMdForm.reactMdFormStrings.patternMismatch
import typings.reactMdForm.reactMdFormStrings.rangeOverflow
import typings.reactMdForm.reactMdFormStrings.rangeUnderflow
import typings.reactMdForm.reactMdFormStrings.stepMismatch
import typings.reactMdForm.reactMdFormStrings.tooLong
import typings.reactMdForm.reactMdFormStrings.tooShort
import typings.reactMdForm.reactMdFormStrings.typeMismatch
import typings.reactMdForm.reactMdFormStrings.valid
import typings.reactMdForm.reactMdFormStrings.valueMissing
import typings.reactMdForm.typesFormThemeProviderMod.FormTheme
import typings.reactMdForm.typesTextFieldGetErrorIconMod.GetErrorIcon
import typings.reactMdForm.typesTextFieldGetErrorMessageMod.ChangeValidationBehavior
import typings.reactMdForm.typesTextFieldGetErrorMessageMod.ErrorMessageOptions
import typings.reactMdForm.typesTextFieldGetErrorMessageMod.GetErrorMessage
import typings.reactMdForm.typesTextFieldIsErroredMod.IsErrored
import typings.reactMdForm.typesTextFieldIsErroredMod.IsErroredOptions
import typings.reactMdForm.typesTextFieldUseTextFieldMod.ErrorChangeHandler
import typings.reactMdForm.typesTextFieldUseTextFieldMod.ProvidedFormMessageProps
import typings.reactMdForm.typesTextFieldUseTextFieldMod.ProvidedTextFieldProps
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextFieldUseNumberFieldMod {
  
  @JSImport("@react-md/form/types/text-field/useNumberField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useNumberField(options: NumberFieldHookOptionsdef): js.Tuple3[Double, ProvidedNumberFieldProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdefCounter): js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdefDefaultValue): js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdis): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdisCounter): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdisDefaultValue): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.reactMdForm.reactMdFormStrings.min
    - typings.reactMdForm.reactMdFormStrings.max
  */
  type FixNumberOnBlur = _FixNumberOnBlur | Boolean
  
  trait NumberFieldConstraints extends StObject {
    
    /**
      * An optional max value for the number field.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional min value for the number field.
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional step amount to use.
      *
      * Note: The `min` and `max` values must be divisible by this value when any
      * are defined.
      */
    var step: js.UndefOr[Double] = js.undefined
  }
  object NumberFieldConstraints {
    
    inline def apply(): NumberFieldConstraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberFieldConstraints]
    }
    
    extension [Self <: NumberFieldConstraints](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait NumberFieldHookControls extends StObject {
    
    /**
      * Resets the `number` value to the `defaultValue` and clears any error
      * states.
      */
    def reset(): Unit
    
    var setNumber: Dispatch[SetStateAction[js.UndefOr[Double]]]
  }
  object NumberFieldHookControls {
    
    inline def apply(reset: () => Unit, setNumber: SetStateAction[js.UndefOr[Double]] => Unit): NumberFieldHookControls = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setNumber = js.Any.fromFunction1(setNumber))
      __obj.asInstanceOf[NumberFieldHookControls]
    }
    
    extension [Self <: NumberFieldHookControls](x: Self) {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSetNumber(value: SetStateAction[js.UndefOr[Double]] => Unit): Self = StObject.set(x, "setNumber", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent std.Omit<@react-md/form.@react-md/form/types/text-field/useTextField.TextFieldHookOptions, 'defaultValue'> */
  /* Inlined parent @react-md/form.@react-md/form/types/text-field/useNumberField.NumberFieldConstraints */
  trait NumberFieldHookOptions extends StObject {
    
    var counter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default **number** value to use which can be a `number` or `undefined`.
      * When this value is set to a `number` (or a function that returns a
      * `number`), the returned value will never be `undefined`.
      */
    var defaultValue: js.UndefOr[Double | js.Function0[js.UndefOr[Double]]] = js.undefined
    
    var disableMaxLength: js.UndefOr[Boolean] = js.undefined
    
    var disableMessage: js.UndefOr[Boolean] = js.undefined
    
    var errorIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @see {@link FixNumberOnBlur}
      */
    var fixOnBlur: js.UndefOr[FixNumberOnBlur] = js.undefined
    
    var getErrorIcon: js.UndefOr[GetErrorIcon] = js.undefined
    
    var getErrorMessage: js.UndefOr[GetErrorMessage] = js.undefined
    
    var helpText: js.UndefOr[ReactNode] = js.undefined
    
    var id: String
    
    var isErrored: js.UndefOr[IsErrored] = js.undefined
    
    /**
      * An optional max value for the number field.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional min value for the number field.
      */
    var min: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var onErrorChange: js.UndefOr[ErrorChangeHandler] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional step amount to use.
      *
      * Note: The `min` and `max` values must be divisible by this value when any
      * are defined.
      */
    var step: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[FormTheme] = js.undefined
    
    /**
      * Boolean if the `number` value should be updated as the user types instead
      * of only once the text field has been blurred.
      */
    var updateOnChange: js.UndefOr[Boolean] = js.undefined
    
    var validateOnChange: js.UndefOr[ChangeValidationBehavior] = js.undefined
  }
  object NumberFieldHookOptions {
    
    inline def apply(id: String): NumberFieldHookOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFieldHookOptions]
    }
    
    extension [Self <: NumberFieldHookOptions](x: Self) {
      
      inline def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setDefaultValue(value: Double | js.Function0[js.UndefOr[Double]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueFunction0(value: () => js.UndefOr[Double]): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisableMaxLength(value: Boolean): Self = StObject.set(x, "disableMaxLength", value.asInstanceOf[js.Any])
      
      inline def setDisableMaxLengthUndefined: Self = StObject.set(x, "disableMaxLength", js.undefined)
      
      inline def setDisableMessage(value: Boolean): Self = StObject.set(x, "disableMessage", value.asInstanceOf[js.Any])
      
      inline def setDisableMessageUndefined: Self = StObject.set(x, "disableMessage", js.undefined)
      
      inline def setErrorIcon(value: ReactNode): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      inline def setErrorIconUndefined: Self = StObject.set(x, "errorIcon", js.undefined)
      
      inline def setFixOnBlur(value: FixNumberOnBlur): Self = StObject.set(x, "fixOnBlur", value.asInstanceOf[js.Any])
      
      inline def setFixOnBlurUndefined: Self = StObject.set(x, "fixOnBlur", js.undefined)
      
      inline def setGetErrorIcon(value: (/* errorMessage */ String, /* error */ Boolean, /* errorIcon */ ReactNode) => ReactNode): Self = StObject.set(x, "getErrorIcon", js.Any.fromFunction3(value))
      
      inline def setGetErrorIconUndefined: Self = StObject.set(x, "getErrorIcon", js.undefined)
      
      inline def setGetErrorMessage(value: /* options */ ErrorMessageOptions => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction1(value))
      
      inline def setGetErrorMessageUndefined: Self = StObject.set(x, "getErrorMessage", js.undefined)
      
      inline def setHelpText(value: ReactNode): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
      
      inline def setHelpTextUndefined: Self = StObject.set(x, "helpText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsErrored(value: /* options */ IsErroredOptions => Boolean): Self = StObject.set(x, "isErrored", js.Any.fromFunction1(value))
      
      inline def setIsErroredUndefined: Self = StObject.set(x, "isErrored", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnErrorChange(value: (/* id */ String, /* error */ Boolean) => Unit): Self = StObject.set(x, "onErrorChange", js.Any.fromFunction2(value))
      
      inline def setOnErrorChangeUndefined: Self = StObject.set(x, "onErrorChange", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUpdateOnChange(value: Boolean): Self = StObject.set(x, "updateOnChange", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnChangeUndefined: Self = StObject.set(x, "updateOnChange", js.undefined)
      
      inline def setValidateOnChange(value: ChangeValidationBehavior): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
      
      inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
      
      inline def setValidateOnChangeVarargs(
        value: (badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing)*
      ): Self = StObject.set(x, "validateOnChange", js.Array(value*))
    }
  }
  
  type NumberFieldHookReturnType = js.Tuple3[
    js.UndefOr[Double], 
    ProvidedNumberFieldProps | ProvidedNumberFieldMessageProps, 
    NumberFieldHookControls
  ]
  
  /* Inlined parent @react-md/form.@react-md/form/types/text-field/useNumberField.ProvidedNumberFieldProps */
  /* Inlined parent std.Pick<@react-md/form.@react-md/form/types/text-field/useTextField.ProvidedTextFieldMessageProps, 'messageProps'> */
  trait ProvidedNumberFieldMessageProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var error: Boolean
    
    var id: String
    
    /**
      * An optional max value for the number field.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var messageProps: ProvidedFormMessageProps
    
    /**
      * An optional min value for the number field.
      */
    var min: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var onBlur: FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var onChange: FormEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var rightChildren: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional step amount to use.
      *
      * Note: The `min` and `max` values must be divisible by this value when any
      * are defined.
      */
    var step: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[FormTheme] = js.undefined
    
    /**
      * Always set the `TextField` type to `number`.
      */
    var `type`: number
    
    var value: String
  }
  object ProvidedNumberFieldMessageProps {
    
    inline def apply(
      error: Boolean,
      id: String,
      messageProps: ProvidedFormMessageProps,
      onBlur: FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit,
      onChange: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      value: String
    ): ProvidedNumberFieldMessageProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageProps = messageProps.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("number")
      __obj.asInstanceOf[ProvidedNumberFieldMessageProps]
    }
    
    extension [Self <: ProvidedNumberFieldMessageProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMessageProps(value: ProvidedFormMessageProps): Self = StObject.set(x, "messageProps", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRightChildren(value: ReactNode): Self = StObject.set(x, "rightChildren", value.asInstanceOf[js.Any])
      
      inline def setRightChildrenUndefined: Self = StObject.set(x, "rightChildren", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvidedNumberFieldProps
    extends StObject
       with NumberFieldConstraints
       with ProvidedTextFieldProps {
    
    /**
      * Always set the `TextField` type to `number`.
      */
    var `type`: number
  }
  object ProvidedNumberFieldProps {
    
    inline def apply(
      error: Boolean,
      id: String,
      onBlur: FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit,
      onChange: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      value: String
    ): ProvidedNumberFieldProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("number")
      __obj.asInstanceOf[ProvidedNumberFieldProps]
    }
    
    extension [Self <: ProvidedNumberFieldProps](x: Self) {
      
      inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait _FixNumberOnBlur extends StObject
}
