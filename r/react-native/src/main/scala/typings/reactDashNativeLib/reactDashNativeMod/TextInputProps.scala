package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputProps
  extends ViewProps
     with TextInputIOSProps
     with TextInputAndroidProps {
  /**
    * Specifies whether fonts should scale to respect Text Size accessibility settings.
    * The default is `true`.
    */
  var allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Can tell TextInput to automatically capitalize certain characters.
    *      characters: all characters,
    *      words: first letter of each word
    *      sentences: first letter of each sentence (default)
    *      none: don't auto capitalize anything
    *
    * https://facebook.github.io/react-native/docs/textinput.html#autocapitalize
    */
  var autoCapitalize: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.sentences | reactDashNativeLib.reactDashNativeLibStrings.words | reactDashNativeLib.reactDashNativeLibStrings.characters
  ] = js.undefined
  /**
    * If false, disables auto-correct.
    * The default value is true.
    */
  var autoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, focuses the input on componentDidMount.
    * The default value is false.
    */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the text field will blur when submitted.
    * The default value is true.
    */
  var blurOnSubmit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, caret is hidden. The default value is false.
    */
  var caretHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, context menu is hidden. The default value is false.
    */
  var contextMenuHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provides an initial value that will change when the user starts typing.
    * Useful for simple use-cases where you don't want to deal with listening to events
    * and updating the value prop to keep the controlled state in sync.
    */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If false, text is not editable. The default value is true.
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to connect to an InputAccessoryView. Not part of react-natives documentation, but present in examples and
    * code.
    * See https://facebook.github.io/react-native/docs/inputaccessoryview.html for more information.
    */
  var inputAccessoryViewID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * enum("default", 'numeric', 'email-address', "ascii-capable", 'numbers-and-punctuation', 'url', 'number-pad', 'phone-pad', 'name-phone-pad',
    * 'decimal-pad', 'twitter', 'web-search', 'visible-password')
    * Determines which keyboard to open, e.g.numeric.
    * The following values work across platforms: - default - numeric - email-address - phone-pad
    * The following values work on iOS: - ascii-capable - numbers-and-punctuation - url - number-pad - name-phone-pad - decimal-pad - twitter - web-search
    * The following values work on Android: - visible-password
    */
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.undefined
  /**
    * Limits the maximum number of characters that can be entered.
    * Use this instead of implementing the logic in JS to avoid flicker.
    */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, the text input can be multiple lines. The default value is false.
    */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback that is called when the text input is blurred
    */
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], scala.Unit]] = js.undefined
  /**
    * Callback that is called when the text input's text changes.
    */
  var onChange: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputChangeEventData], scala.Unit]] = js.undefined
  /**
    * Callback that is called when the text input's text changes.
    * Changed text is passed as an argument to the callback handler.
    */
  var onChangeText: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Callback that is called when the text input's content size changes.
    * This will be called with
    * `{ nativeEvent: { contentSize: { width, height } } }`.
    *
    * Only called for multiline text inputs.
    */
  var onContentSizeChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData], scala.Unit]
  ] = js.undefined
  /**
    * Callback that is called when text input ends.
    */
  var onEndEditing: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputEndEditingEventData], scala.Unit]
  ] = js.undefined
  /**
    * Callback that is called when the text input is focused
    */
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], scala.Unit]] = js.undefined
  /**
    * Callback that is called when a key is pressed.
    * This will be called with
    *  `{ nativeEvent: { key: keyValue } }`
    * where keyValue is 'Enter' or 'Backspace' for respective keys and the typed-in character otherwise including ' ' for space.
    *
    * Fires before onChange callbacks.
    * Note: on Android only the inputs from soft keyboard are handled, not the hardware keyboard inputs.
    */
  var onKeyPress: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputKeyPressEventData], scala.Unit]
  ] = js.undefined
  /**
    * Invoked on content scroll with
    *  `{ nativeEvent: { contentOffset: { x, y } } }`.
    *
    * May also contain other properties from ScrollEvent but on Android contentSize is not provided for performance reasons.
    */
  var onScroll: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputScrollEventData], scala.Unit]] = js.undefined
  /**
    * Callback that is called when the text input selection is changed.
    */
  var onSelectionChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData], scala.Unit]
  ] = js.undefined
  /**
    * Callback that is called when the text input's submit button is pressed.
    */
  var onSubmitEditing: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData], scala.Unit]
  ] = js.undefined
  /**
    * The string that will be rendered before text input has been entered
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text color of the placeholder string
    */
  var placeholderTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * enum('default', 'go', 'google', 'join', 'next', 'route', 'search', 'send', 'yahoo', 'done', 'emergency-call')
    * Determines how the return key should look.
    */
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.undefined
  /**
    * If true, the text input obscures the text entered so that sensitive text like passwords stay secure.
    * The default value is false.
    */
  var secureTextEntry: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, all text will automatically be selected on focus
    */
  var selectTextOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The start and end of the text input's selection. Set start and end to
    * the same value to position the cursor.
    */
  var selection: js.UndefOr[reactDashNativeLib.Anon_Start] = js.undefined
  /**
    * The highlight (and cursor on ios) color of the text input
    */
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styles
    */
  @JSName("style")
  var style_TextInputProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * The value to show for the text input. TextInput is a controlled component,
    * which means the native value will be forced to match this value prop if provided.
    * For most uses this works great, but in some cases this may cause flickering - one common cause is preventing edits by keeping value the same.
    * In addition to simply setting the same value, either set editable={false},
    * or set/update maxLength to prevent unwanted edits without flicker.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

