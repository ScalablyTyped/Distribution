package typings.reactMdForm

import typings.react.mod.Dispatch
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.reactMdForm.anon.TextFieldHookOptionsdisab
import typings.reactMdForm.anon.TextFieldHookOptionsdisabCounter
import typings.reactMdForm.anon.TextFieldHookOptionsdisabDefaultValue
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
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTextFieldUseTextFieldMod {
  
  @JSImport("@react-md/form/types/text-field/useTextField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTextField(options: TextFieldHookOptionsdisab): js.Tuple3[String, ProvidedTextFieldProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldProps, TextFieldHookControls]]
  inline def useTextField(options: TextFieldHookOptionsdisabCounter): js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls]]
  inline def useTextField(options: TextFieldHookOptionsdisabDefaultValue): js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls]]
  
  type ErrorChangeHandler = js.Function2[/* id */ String, /* error */ Boolean, Unit]
  
  /* Inlined parent std.Pick<@react-md/form.@react-md/form/types/FormMessage.FormMessageProps, 'id' | 'theme' | 'children'> */
  /* Inlined parent std.Required<std.Pick<@react-md/form.@react-md/form/types/text-field/TextField.TextFieldProps, 'error'>> */
  /* Inlined parent std.Partial<std.Pick<@react-md/form.@react-md/form/types/FormMessage.FormMessageInputLengthCounterProps, 'length' | 'maxLength'>> */
  trait ProvidedFormMessageProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var error: Boolean
    
    var id: String
    
    var length: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[FormTheme] = js.undefined
  }
  object ProvidedFormMessageProps {
    
    inline def apply(error: Boolean, id: String): ProvidedFormMessageProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedFormMessageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedFormMessageProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ProvidedTextFieldMessageProps
    extends StObject
       with ProvidedTextFieldProps {
    
    /**
      * These props will be defined as long as the `disableMessage` prop is not
      * `true` from the `useTextField` hook.
      */
    var messageProps: ProvidedFormMessageProps
  }
  object ProvidedTextFieldMessageProps {
    
    inline def apply(
      error: Boolean,
      id: String,
      messageProps: ProvidedFormMessageProps,
      onBlur: FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit,
      onChange: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      value: String
    ): ProvidedTextFieldMessageProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageProps = messageProps.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedTextFieldMessageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedTextFieldMessageProps] (val x: Self) extends AnyVal {
      
      inline def setMessageProps(value: ProvidedFormMessageProps): Self = StObject.set(x, "messageProps", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @react-md/form.@react-md/form/types/text-field/getErrorMessage.TextConstraints */
  /* Inlined parent std.Required<@react-md/form.@react-md/form/types/text-field/useTextField.TextFieldChangeHandlers> */
  /* Inlined parent std.Required<std.Pick<@react-md/form.@react-md/form/types/text-field/TextField.TextFieldProps, 'id' | 'value' | 'error'>> */
  /* Inlined parent std.Pick<@react-md/form.@react-md/form/types/text-field/TextField.TextFieldProps, 'aria-describedby' | 'theme' | 'rightChildren'> */
  trait ProvidedTextFieldProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var error: Boolean
    
    var id: String
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var onBlur: FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var onChange: FormEventHandler[HTMLInputElement | HTMLTextAreaElement]
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var rightChildren: js.UndefOr[ReactNode] = js.undefined
    
    var theme: js.UndefOr[FormTheme] = js.undefined
    
    var value: String
  }
  object ProvidedTextFieldProps {
    
    inline def apply(
      error: Boolean,
      id: String,
      onBlur: FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit,
      onChange: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      value: String
    ): ProvidedTextFieldProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedTextFieldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedTextFieldProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRightChildren(value: ReactNode): Self = StObject.set(x, "rightChildren", value.asInstanceOf[js.Any])
      
      inline def setRightChildrenUndefined: Self = StObject.set(x, "rightChildren", js.undefined)
      
      inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLInputElement | std.HTMLTextAreaElement>, 'onBlur' | 'onChange'> */
  trait TextFieldChangeHandlers extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
  }
  object TextFieldChangeHandlers {
    
    inline def apply(): TextFieldChangeHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldChangeHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextFieldChangeHandlers] (val x: Self) extends AnyVal {
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait TextFieldHookControls extends StObject {
    
    /**
      * Resets the state back to:
      * ```ts
      * {
      *   value: "",
      *   error: false,
      *   errorMessage: "",
      * }
      * ```
      */
    def reset(): Unit
    
    var setState: Dispatch[SetStateAction[TextFieldHookState]]
  }
  object TextFieldHookControls {
    
    inline def apply(reset: () => Unit, setState: SetStateAction[TextFieldHookState] => Unit): TextFieldHookControls = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[TextFieldHookControls]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextFieldHookControls] (val x: Self) extends AnyVal {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSetState(value: SetStateAction[TextFieldHookState] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent @react-md/form.@react-md/form/types/text-field/getErrorMessage.TextConstraints */
  /* Inlined parent @react-md/form.@react-md/form/types/text-field/useTextField.TextFieldChangeHandlers */
  /* Inlined parent std.Pick<@react-md/form.@react-md/form/types/text-field/TextField.TextFieldProps, 'id' | 'theme'> */
  trait TextFieldHookOptions extends StObject {
    
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
  object TextFieldHookOptions {
    
    inline def apply(id: String): TextFieldHookOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextFieldHookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextFieldHookOptions] (val x: Self) extends AnyVal {
      
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
  
  type TextFieldHookReturnType = js.Tuple3[
    String, 
    ProvidedTextFieldProps | ProvidedTextFieldMessageProps, 
    TextFieldHookControls
  ]
  
  trait TextFieldHookState extends StObject {
    
    /**
      * Boolean if the `TextField` or `TextArea` are in an errored state.
      *
      * Note: This can be `true` while the `errorMessage` is an empty string since
      * it's sometimes useful to show there's an error while the user is typing
      * without reporting the full error message.
      */
    var error: Boolean
    
    /**
      * The current error message that will be an empty string when there are no
      * errors for the `TextField` or `TextArea` component or the message is hidden
      * during change events.
      */
    var errorMessage: String
    
    /**
      * The current value for the `TextField` or `TextArea`.
      */
    var value: String
  }
  object TextFieldHookState {
    
    inline def apply(error: Boolean, errorMessage: String, value: String): TextFieldHookState = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextFieldHookState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextFieldHookState] (val x: Self) extends AnyVal {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
