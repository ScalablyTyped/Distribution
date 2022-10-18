package typings.reactMdForm.anon

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.ReactNode
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
import typings.reactMdForm.typesFormThemeProviderMod.FormTheme
import typings.reactMdForm.typesTextFieldGetErrorIconMod.GetErrorIcon
import typings.reactMdForm.typesTextFieldGetErrorMessageMod.ChangeValidationBehavior
import typings.reactMdForm.typesTextFieldGetErrorMessageMod.ErrorMessageOptions
import typings.reactMdForm.typesTextFieldGetErrorMessageMod.GetErrorMessage
import typings.reactMdForm.typesTextFieldIsErroredMod.IsErrored
import typings.reactMdForm.typesTextFieldIsErroredMod.IsErroredOptions
import typings.reactMdForm.typesTextFieldUseTextFieldMod.ErrorChangeHandler
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-md/form.@react-md/form/types/text-field/useTextField.TextFieldHookOptions & {  disableMessage :boolean | undefined} */
trait TextFieldHookOptionsdisabDefaultValue extends StObject {
  
  /**
    * Boolean if the `FormMessage` should also display a counter for the
    * remaining letters allowed based on the `maxLength`.
    *
    * This will still be considered false if the `maxLength` value is not
    * provided.
    */
  var counter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default value to use for the `TextField` or `TextArea` one initial
    * render. If you want to manually change the value to something else after
    * the initial render, either change the `key` for the component containing
    * this hook, or use the `setState` function returned from this hook.
    */
  var defaultValue: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  /**
    * Boolean if the `maxLength` prop should not be passed to the `TextField`
    * component since it will prevent any additional characters from being
    * entered in the text field which might feel like weird behavior to some
    * users. This should really only be used when the `counter` option is also
    * enabled and rendering along with a `FormMessage` component.
    */
  var disableMaxLength: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the `TextField` or `TextArea` will **not** be rendered along
    * with a `FormMessage` component. This will prevent the `aria-describedby`
    * prop from being returned when set to `true`.
    */
  var disableMessage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional error icon used in the {@link getErrorIcon} option.
    */
  var errorIcon: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * A function used to get the error icon to display at the right of the
    * `TextField` or `TextArea`. The default behavior will only show an icon when
    * the `error` state is `true` and an `errorIcon` option has been provided.
    */
  var getErrorIcon: js.UndefOr[GetErrorIcon] = js.undefined
  
  /**
    * A function to get and display an error message based on the `TextField` or
    * `TextArea` validity. See {@link defaultGetErrorMessage} for the default
    * implementation details.
    */
  var getErrorMessage: js.UndefOr[GetErrorMessage] = js.undefined
  
  /**
    * An optional help text to display in the `FormMessage` component when there
    * is not an error.
    */
  var helpText: js.UndefOr[ReactNode] = js.undefined
  
  var id: String
  
  /**
    * A function used to determine if the `TextField` or `TextArea` is an in
    * errored state. See {@link defaultIsErrored} for the default implementation
    * details.
    */
  var isErrored: js.UndefOr[IsErrored] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
  
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
  
  /**
    * An optional function that will be called whenever the `error` state is
    * changed. This can be used for more complex forms to `disable` the Submit
    * button or anything else if any field has an error.
    */
  var onErrorChange: js.UndefOr[ErrorChangeHandler] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[FormTheme] = js.undefined
  
  /**
    * Describes the validation behavior that should be done when the value within
    * the `TextField` changes. This can either be:
    *
    * - a boolean
    * - the string `"recommended"`
    * - a single key of the ValidityState that should trigger the validation
    * - a list of keys of the ValidityState that should trigger the validation
    */
  var validateOnChange: js.UndefOr[ChangeValidationBehavior] = js.undefined
}
object TextFieldHookOptionsdisabDefaultValue {
  
  inline def apply(id: String): TextFieldHookOptionsdisabDefaultValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldHookOptionsdisabDefaultValue]
  }
  
  extension [Self <: TextFieldHookOptionsdisabDefaultValue](x: Self) {
    
    inline def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDefaultValue(value: String | js.Function0[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueFunction0(value: () => String): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableMaxLength(value: Boolean): Self = StObject.set(x, "disableMaxLength", value.asInstanceOf[js.Any])
    
    inline def setDisableMaxLengthUndefined: Self = StObject.set(x, "disableMaxLength", js.undefined)
    
    inline def setDisableMessage(value: Boolean): Self = StObject.set(x, "disableMessage", value.asInstanceOf[js.Any])
    
    inline def setDisableMessageUndefined: Self = StObject.set(x, "disableMessage", js.undefined)
    
    inline def setErrorIcon(value: ReactNode): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
    
    inline def setErrorIconUndefined: Self = StObject.set(x, "errorIcon", js.undefined)
    
    inline def setGetErrorIcon(value: (/* errorMessage */ String, /* error */ Boolean, /* errorIcon */ ReactNode) => ReactNode): Self = StObject.set(x, "getErrorIcon", js.Any.fromFunction3(value))
    
    inline def setGetErrorIconUndefined: Self = StObject.set(x, "getErrorIcon", js.undefined)
    
    inline def setGetErrorMessage(value: /* options */ ErrorMessageOptions => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction1(value))
    
    inline def setGetErrorMessageUndefined: Self = StObject.set(x, "getErrorMessage", js.undefined)
    
    inline def setHelpText(value: ReactNode): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
    
    inline def setHelpTextUndefined: Self = StObject.set(x, "helpText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsErrored(value: /* options */ IsErroredOptions => Boolean): Self = StObject.set(x, "isErrored", js.Any.fromFunction1(value))
    
    inline def setIsErroredUndefined: Self = StObject.set(x, "isErrored", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
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
    
    inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setValidateOnChange(value: ChangeValidationBehavior): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    inline def setValidateOnChangeVarargs(
      value: (badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing)*
    ): Self = StObject.set(x, "validateOnChange", js.Array(value*))
  }
}
