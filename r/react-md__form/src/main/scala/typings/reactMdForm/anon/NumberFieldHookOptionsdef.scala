package typings.reactMdForm.anon

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.ReactNode
import typings.reactMdForm.formThemeProviderMod.FormTheme
import typings.reactMdForm.getErrorIconMod.GetErrorIcon
import typings.reactMdForm.getErrorMessageMod.ChangeValidationBehavior
import typings.reactMdForm.getErrorMessageMod.ErrorMessageOptions
import typings.reactMdForm.getErrorMessageMod.GetErrorMessage
import typings.reactMdForm.isErroredMod.IsErrored
import typings.reactMdForm.isErroredMod.IsErroredOptions
import typings.reactMdForm.reactMdFormBooleans.`true`
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
import typings.reactMdForm.useNumberFieldMod.FixNumberOnBlur
import typings.reactMdForm.useTextFieldMod.ErrorChangeHandler
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-md/form.@react-md/form/types/text-field/useNumberField.NumberFieldHookOptions & {  defaultValue :number | (): number,   disableMessage :true} */
trait NumberFieldHookOptionsdef extends StObject {
  
  var counter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default **number** value to use which can be a `number` or `undefined`.
    * When this value is set to a `number` (or a function that returns a
    * `number`), the returned value will never be `undefined`.
    */
  var defaultValue: (js.UndefOr[Double | js.Function0[js.UndefOr[Double]]]) & (Double | js.Function0[Double])
  
  var disableMaxLength: js.UndefOr[Boolean] = js.undefined
  
  var disableMessage: js.UndefOr[Boolean] & `true`
  
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
object NumberFieldHookOptionsdef {
  
  inline def apply(
    defaultValue: (js.UndefOr[Double | js.Function0[js.UndefOr[Double]]]) & (Double | js.Function0[Double]),
    disableMessage: js.UndefOr[Boolean] & `true`,
    id: String
  ): NumberFieldHookOptionsdef = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disableMessage = disableMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFieldHookOptionsdef]
  }
  
  extension [Self <: NumberFieldHookOptionsdef](x: Self) {
    
    inline def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDefaultValue(value: (js.UndefOr[Double | js.Function0[js.UndefOr[Double]]]) & (Double | js.Function0[Double])): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDisableMaxLength(value: Boolean): Self = StObject.set(x, "disableMaxLength", value.asInstanceOf[js.Any])
    
    inline def setDisableMaxLengthUndefined: Self = StObject.set(x, "disableMaxLength", js.undefined)
    
    inline def setDisableMessage(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "disableMessage", value.asInstanceOf[js.Any])
    
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
