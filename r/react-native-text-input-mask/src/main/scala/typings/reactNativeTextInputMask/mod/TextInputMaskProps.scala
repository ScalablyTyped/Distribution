package typings.reactNativeTextInputMask.mod

import typings.react.mod.RefObject
import typings.reactNative.mod.KeyboardTypeOptions
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ReturnKeyTypeOptions
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInput
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputMaskProps
  extends ViewProps
     with TextInputIOSProps
     with TextInputAndroidProps {
  // Export standard TextInputProps from here on.
  // Workaround for not being able to override onChangeText
  // Copied from React-Native types version: 0.55
  /**
    * Specifies whether fonts should scale to respect Text Size accessibility settings.
    * The default is `true`.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  /**
    * Can tell TextInput to automatically capitalize certain characters.
    *      characters: all characters,
    *      words: first letter of each word
    *      sentences: first letter of each sentence (default)
    *      none: don't auto capitalize anything
    *
    * https://facebook.github.io/react-native/docs/textinput.html#autocapitalize
    */
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.native
  /**
    * If false, disables auto-correct.
    * The default value is true.
    */
  var autoCorrect: js.UndefOr[Boolean] = js.native
  /**
    * If true, focuses the input on componentDidMount.
    * The default value is false.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * If true, the text field will blur when submitted.
    * The default value is true.
    */
  var blurOnSubmit: js.UndefOr[Boolean] = js.native
  /**
    * If true, caret is hidden. The default value is false.
    */
  var caretHidden: js.UndefOr[Boolean] = js.native
  /**
    * Provides an initial value that will change when the user starts typing.
    * Useful for simple use-cases where you don't want to deal with listening to events
    * and updating the value prop to keep the controlled state in sync.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * If false, text is not editable. The default value is true.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * Used to connect to an InputAccessoryView. Not part of react-natives documentation, but present in examples and
    * code.
    * See https://facebook.github.io/react-native/docs/inputaccessoryview.html for more information.
    */
  var inputAccessoryViewID: js.UndefOr[String] = js.native
  /**
    * enum("default", 'numeric', 'email-address', "ascii-capable", 'numbers-and-punctuation', 'url', 'number-pad', 'phone-pad', 'name-phone-pad',
    * 'decimal-pad', 'twitter', 'web-search', 'visible-password')
    * Determines which keyboard to open, e.g.numeric.
    * The following values work across platforms: - default - numeric - email-address - phone-pad
    * The following values work on iOS: - ascii-capable - numbers-and-punctuation - url - number-pad - name-phone-pad - decimal-pad - twitter - web-search
    * The following values work on Android: - visible-password
    */
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.native
  var mask: js.UndefOr[String] = js.native
  var maskDefaultValue: js.UndefOr[Boolean] = js.native
  /**
    * Limits the maximum number of characters that can be entered.
    * Use this instead of implementing the logic in JS to avoid flicker.
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * If true, the text input can be multiple lines. The default value is false.
    */
  var multiline: js.UndefOr[Boolean] = js.native
  /**
    * Callback that is called when the text input is blurred
    */
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.native
  /**
    * Callback that is called when the text input's text changes.
    */
  var onChange: js.UndefOr[js.Function1[/* event */ NativeEvent, Unit]] = js.native
  var onChangeText: onChangeTextCallback = js.native
  /**
    * Callback that is called when the text input's content size changes.
    * This will be called with
    * `{ nativeEvent: { contentSize: { width, height } } }`.
    *
    * Only called for multiline text inputs.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* event */ NativeEventContentSizeHeight, Unit]] = js.native
  /**
    * Callback that is called when text input ends.
    */
  var onEndEditing: js.UndefOr[js.Function1[/* event */ NativeEventText, Unit]] = js.native
  /**
    * Callback that is called when the text input is focused
    */
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]] = js.native
  /**
    * Callback that is called when a key is pressed.
    * This will be called with
    *  `{ nativeEvent: { key: keyValue } }`
    * where keyValue is 'Enter' or 'Backspace' for respective keys and the typed-in character otherwise including ' ' for space.
    *
    * Fires before onChange callbacks.
    * Note: on Android only the inputs from soft keyboard are handled, not the hardware keyboard inputs.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputKeyPressEventData], Unit]] = js.native
  /**
    * Invoked on content scroll with
    *  `{ nativeEvent: { contentOffset: { x, y } } }`.
    *
    * May also contain other properties from ScrollEvent but on Android contentSize is not provided for performance reasons.
    */
  var onScroll: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputScrollEventData], Unit]] = js.native
  /**
    * Callback that is called when the text input selection is changed.
    */
  var onSelectionChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData], Unit]
  ] = js.native
  /**
    * Callback that is called when the text input's submit button is pressed.
    */
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ NativeEventText, Unit]] = js.native
  /**
    * The string that will be rendered before text input has been entered
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * The text color of the placeholder string
    */
  var placeholderTextColor: js.UndefOr[String] = js.native
  var refInput: js.UndefOr[RefObject[TextInput]] = js.native
  /**
    * enum('default', 'go', 'google', 'join', 'next', 'route', 'search', 'send', 'yahoo', 'done', 'emergency-call')
    * Determines how the return key should look.
    */
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.native
  /**
    * If true, the text input obscures the text entered so that sensitive text like passwords stay secure.
    * The default value is false.
    */
  var secureTextEntry: js.UndefOr[Boolean] = js.native
  /**
    * If true, all text will automatically be selected on focus
    */
  var selectTextOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * The start and end of the text input's selection. Set start and end to
    * the same value to position the cursor.
    */
  var selection: js.UndefOr[End] = js.native
  /**
    * The highlight (and cursor on ios) color of the text input
    */
  var selectionColor: js.UndefOr[String] = js.native
  /**
    * Styles
    */
  @JSName("style")
  var style_TextInputMaskProps: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * The value to show for the text input. TextInput is a controlled component,
    * which means the native value will be forced to match this value prop if provided.
    * For most uses this works great, but in some cases this may cause flickering - one common cause is preventing edits by keeping value the same.
    * In addition to simply setting the same value, either set editable={false},
    * or set/update maxLength to prevent unwanted edits without flicker.
    */
  var value: js.UndefOr[String] = js.native
}

object TextInputMaskProps {
  @scala.inline
  def apply(onChangeText: (/* formatted */ String, /* extracted */ js.UndefOr[String]) => Unit): TextInputMaskProps = {
    val __obj = js.Dynamic.literal(onChangeText = js.Any.fromFunction2(onChangeText))
    __obj.asInstanceOf[TextInputMaskProps]
  }
  @scala.inline
  implicit class TextInputMaskPropsOps[Self <: TextInputMaskProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnChangeText(value: (/* formatted */ String, /* extracted */ js.UndefOr[String]) => Unit): Self = this.set("onChangeText", js.Any.fromFunction2(value))
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: none | sentences | words | characters): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBlurOnSubmit(value: Boolean): Self = this.set("blurOnSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurOnSubmit: Self = this.set("blurOnSubmit", js.undefined)
    @scala.inline
    def setCaretHidden(value: Boolean): Self = this.set("caretHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaretHidden: Self = this.set("caretHidden", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setInputAccessoryViewID(value: String): Self = this.set("inputAccessoryViewID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputAccessoryViewID: Self = this.set("inputAccessoryViewID", js.undefined)
    @scala.inline
    def setKeyboardType(value: KeyboardTypeOptions): Self = this.set("keyboardType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardType: Self = this.set("keyboardType", js.undefined)
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskDefaultValue(value: Boolean): Self = this.set("maskDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskDefaultValue: Self = this.set("maskDefaultValue", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setOnBlur(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* event */ NativeEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnContentSizeChange(value: /* event */ NativeEventContentSizeHeight => Unit): Self = this.set("onContentSizeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContentSizeChange: Self = this.set("onContentSizeChange", js.undefined)
    @scala.inline
    def setOnEndEditing(value: /* event */ NativeEventText => Unit): Self = this.set("onEndEditing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEndEditing: Self = this.set("onEndEditing", js.undefined)
    @scala.inline
    def setOnFocus(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyPress(value: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnScroll(value: /* e */ NativeSyntheticEvent[TextInputScrollEventData] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnSelectionChange(value: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData] => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    @scala.inline
    def setOnSubmitEditing(value: /* event */ NativeEventText => Unit): Self = this.set("onSubmitEditing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmitEditing: Self = this.set("onSubmitEditing", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderTextColor(value: String): Self = this.set("placeholderTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderTextColor: Self = this.set("placeholderTextColor", js.undefined)
    @scala.inline
    def setRefInput(value: RefObject[TextInput]): Self = this.set("refInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefInput: Self = this.set("refInput", js.undefined)
    @scala.inline
    def setReturnKeyType(value: ReturnKeyTypeOptions): Self = this.set("returnKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnKeyType: Self = this.set("returnKeyType", js.undefined)
    @scala.inline
    def setSecureTextEntry(value: Boolean): Self = this.set("secureTextEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureTextEntry: Self = this.set("secureTextEntry", js.undefined)
    @scala.inline
    def setSelectTextOnFocus(value: Boolean): Self = this.set("selectTextOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectTextOnFocus: Self = this.set("selectTextOnFocus", js.undefined)
    @scala.inline
    def setSelection(value: End): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionColor(value: String): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

