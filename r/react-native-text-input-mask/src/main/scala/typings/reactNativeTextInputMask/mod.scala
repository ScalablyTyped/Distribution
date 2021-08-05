package typings.reactNativeTextInputMask

import typings.react.mod.Component
import typings.reactNative.mod.KeyboardTypeOptions
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ReturnKeyTypeOptions
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputAndroidProps
import typings.reactNative.mod.TextInputFocusEventData
import typings.reactNative.mod.TextInputIOSProps
import typings.reactNative.mod.TextInputKeyPressEventData
import typings.reactNative.mod.TextInputScrollEventData
import typings.reactNative.mod.TextInputSelectionChangeEventData
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNativeTextInputMask.anon.End
import typings.reactNativeTextInputMask.anon.NativeEvent
import typings.reactNativeTextInputMask.anon.NativeEventContentSizeHeight
import typings.reactNativeTextInputMask.anon.NativeEventText
import typings.reactNativeTextInputMask.reactNativeTextInputMaskStrings.characters
import typings.reactNativeTextInputMask.reactNativeTextInputMaskStrings.none
import typings.reactNativeTextInputMask.reactNativeTextInputMaskStrings.sentences
import typings.reactNativeTextInputMask.reactNativeTextInputMaskStrings.words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-text-input-mask", JSImport.Default)
  @js.native
  class default ()
    extends Component[TextInputMaskProps, js.Object, js.Any]
  
  type TextInputMask = Component[TextInputMaskProps, js.Object, js.Any]
  
  trait TextInputMaskProps
    extends StObject
       with ViewProps
       with TextInputIOSProps
       with TextInputAndroidProps {
    
    // Export standard TextInputProps from here on.
    // Workaround for not being able to override onChangeText
    // Copied from React-Native types version: 0.55
    /**
      * Specifies whether fonts should scale to respect Text Size accessibility settings.
      * The default is `true`.
      */
    var allowFontScaling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can tell TextInput to automatically capitalize certain characters.
      *      characters: all characters,
      *      words: first letter of each word
      *      sentences: first letter of each sentence (default)
      *      none: don't auto capitalize anything
      *
      * https://facebook.github.io/react-native/docs/textinput.html#autocapitalize
      */
    var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.undefined
    
    /**
      * If false, disables auto-correct.
      * The default value is true.
      */
    var autoCorrect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, focuses the input on componentDidMount.
      * The default value is false.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the text field will blur when submitted.
      * The default value is true.
      */
    var blurOnSubmit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, caret is hidden. The default value is false.
      */
    var caretHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provides an initial value that will change when the user starts typing.
      * Useful for simple use-cases where you don't want to deal with listening to events
      * and updating the value prop to keep the controlled state in sync.
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * If false, text is not editable. The default value is true.
      */
    var editable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to connect to an InputAccessoryView. Not part of react-natives documentation, but present in examples and
      * code.
      * See https://facebook.github.io/react-native/docs/inputaccessoryview.html for more information.
      */
    var inputAccessoryViewID: js.UndefOr[String] = js.undefined
    
    /**
      * enum("default", 'numeric', 'email-address', "ascii-capable", 'numbers-and-punctuation', 'url', 'number-pad', 'phone-pad', 'name-phone-pad',
      * 'decimal-pad', 'twitter', 'web-search', 'visible-password')
      * Determines which keyboard to open, e.g.numeric.
      * The following values work across platforms: - default - numeric - email-address - phone-pad
      * The following values work on iOS: - ascii-capable - numbers-and-punctuation - url - number-pad - name-phone-pad - decimal-pad - twitter - web-search
      * The following values work on Android: - visible-password
      */
    var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var maskDefaultValue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limits the maximum number of characters that can be entered.
      * Use this instead of implementing the logic in JS to avoid flicker.
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, the text input can be multiple lines. The default value is false.
      */
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that is called when the text input is blurred
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.undefined
    
    /**
      * Callback that is called when the text input's text changes.
      */
    var onChange: js.UndefOr[js.Function1[/* event */ NativeEvent, Unit]] = js.undefined
    
    var onChangeText: onChangeTextCallback
    
    /**
      * Callback that is called when the text input's content size changes.
      * This will be called with
      * `{ nativeEvent: { contentSize: { width, height } } }`.
      *
      * Only called for multiline text inputs.
      */
    var onContentSizeChange: js.UndefOr[js.Function1[/* event */ NativeEventContentSizeHeight, Unit]] = js.undefined
    
    /**
      * Callback that is called when text input ends.
      */
    var onEndEditing: js.UndefOr[js.Function1[/* event */ NativeEventText, Unit]] = js.undefined
    
    /**
      * Callback that is called when the text input is focused
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.undefined
    
    /**
      * Callback that is called when a key is pressed.
      * This will be called with
      *  `{ nativeEvent: { key: keyValue } }`
      * where keyValue is 'Enter' or 'Backspace' for respective keys and the typed-in character otherwise including ' ' for space.
      *
      * Fires before onChange callbacks.
      * Note: on Android only the inputs from soft keyboard are handled, not the hardware keyboard inputs.
      */
    var onKeyPress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputKeyPressEventData], Unit]] = js.undefined
    
    /**
      * Invoked on content scroll with
      *  `{ nativeEvent: { contentOffset: { x, y } } }`.
      *
      * May also contain other properties from ScrollEvent but on Android contentSize is not provided for performance reasons.
      */
    var onScroll: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputScrollEventData], Unit]] = js.undefined
    
    /**
      * Callback that is called when the text input selection is changed.
      */
    var onSelectionChange: js.UndefOr[
        js.Function1[/* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData], Unit]
      ] = js.undefined
    
    /**
      * Callback that is called when the text input's submit button is pressed.
      */
    var onSubmitEditing: js.UndefOr[js.Function1[/* event */ NativeEventText, Unit]] = js.undefined
    
    /**
      * The string that will be rendered before text input has been entered
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * The text color of the placeholder string
      */
    var placeholderTextColor: js.UndefOr[String] = js.undefined
    
    var refInput: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.undefined
    
    /**
      * enum('default', 'go', 'google', 'join', 'next', 'route', 'search', 'send', 'yahoo', 'done', 'emergency-call')
      * Determines how the return key should look.
      */
    var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.undefined
    
    /**
      * If true, the text input obscures the text entered so that sensitive text like passwords stay secure.
      * The default value is false.
      */
    var secureTextEntry: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, all text will automatically be selected on focus
      */
    var selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The start and end of the text input's selection. Set start and end to
      * the same value to position the cursor.
      */
    var selection: js.UndefOr[End] = js.undefined
    
    /**
      * The highlight (and cursor on ios) color of the text input
      */
    var selectionColor: js.UndefOr[String] = js.undefined
    
    /**
      * Styles
      */
    @JSName("style")
    var style_TextInputMaskProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * The value to show for the text input. TextInput is a controlled component,
      * which means the native value will be forced to match this value prop if provided.
      * For most uses this works great, but in some cases this may cause flickering - one common cause is preventing edits by keeping value the same.
      * In addition to simply setting the same value, either set editable={false},
      * or set/update maxLength to prevent unwanted edits without flicker.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object TextInputMaskProps {
    
    inline def apply(onChangeText: (/* formatted */ String, /* extracted */ js.UndefOr[String]) => Unit): TextInputMaskProps = {
      val __obj = js.Dynamic.literal(onChangeText = js.Any.fromFunction2(onChangeText))
      __obj.asInstanceOf[TextInputMaskProps]
    }
    
    extension [Self <: TextInputMaskProps](x: Self) {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      inline def setAutoCapitalize(value: none | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      inline def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBlurOnSubmit(value: Boolean): Self = StObject.set(x, "blurOnSubmit", value.asInstanceOf[js.Any])
      
      inline def setBlurOnSubmitUndefined: Self = StObject.set(x, "blurOnSubmit", js.undefined)
      
      inline def setCaretHidden(value: Boolean): Self = StObject.set(x, "caretHidden", value.asInstanceOf[js.Any])
      
      inline def setCaretHiddenUndefined: Self = StObject.set(x, "caretHidden", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setInputAccessoryViewID(value: String): Self = StObject.set(x, "inputAccessoryViewID", value.asInstanceOf[js.Any])
      
      inline def setInputAccessoryViewIDUndefined: Self = StObject.set(x, "inputAccessoryViewID", js.undefined)
      
      inline def setKeyboardType(value: KeyboardTypeOptions): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
      
      inline def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskDefaultValue(value: Boolean): Self = StObject.set(x, "maskDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setMaskDefaultValueUndefined: Self = StObject.set(x, "maskDefaultValue", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* event */ NativeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeText(value: (/* formatted */ String, /* extracted */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnContentSizeChange(value: /* event */ NativeEventContentSizeHeight => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction1(value))
      
      inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
      
      inline def setOnEndEditing(value: /* event */ NativeEventText => Unit): Self = StObject.set(x, "onEndEditing", js.Any.fromFunction1(value))
      
      inline def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
      
      inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyPress(value: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnScroll(value: /* e */ NativeSyntheticEvent[TextInputScrollEventData] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSelectionChange(value: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData] => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnSubmitEditing(value: /* event */ NativeEventText => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction1(value))
      
      inline def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextColor(value: String): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRefInput(value: /* ref */ js.Any => Unit): Self = StObject.set(x, "refInput", js.Any.fromFunction1(value))
      
      inline def setRefInputUndefined: Self = StObject.set(x, "refInput", js.undefined)
      
      inline def setReturnKeyType(value: ReturnKeyTypeOptions): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
      
      inline def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
      
      inline def setSecureTextEntry(value: Boolean): Self = StObject.set(x, "secureTextEntry", value.asInstanceOf[js.Any])
      
      inline def setSecureTextEntryUndefined: Self = StObject.set(x, "secureTextEntry", js.undefined)
      
      inline def setSelectTextOnFocus(value: Boolean): Self = StObject.set(x, "selectTextOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectTextOnFocusUndefined: Self = StObject.set(x, "selectTextOnFocus", js.undefined)
      
      inline def setSelection(value: End): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type onChangeTextCallback = js.Function2[/* formatted */ String, /* extracted */ js.UndefOr[String], Unit]
}
