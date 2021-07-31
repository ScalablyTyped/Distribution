package typings.reactNativeElements.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.anon.Start
import typings.reactNative.mod.AccessibilityProps
import typings.reactNative.mod.ActivityIndicatorProperties
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderHandlers
import typings.reactNative.mod.Insets
import typings.reactNative.mod.KeyboardTypeOptions
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ReturnKeyTypeOptions
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputAndroidProps
import typings.reactNative.mod.TextInputChangeEventData
import typings.reactNative.mod.TextInputContentSizeChangeEventData
import typings.reactNative.mod.TextInputEndEditingEventData
import typings.reactNative.mod.TextInputIOSProps
import typings.reactNative.mod.TextInputKeyPressEventData
import typings.reactNative.mod.TextInputScrollEventData
import typings.reactNative.mod.TextInputSelectionChangeEventData
import typings.reactNative.mod.TextInputSubmitEditingEventData
import typings.reactNative.mod.TextInputTextInputEventData
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.Touchable
import typings.reactNative.mod.ViewPropsAndroid
import typings.reactNative.mod.ViewPropsIOS
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.characters
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.sentences
import typings.reactNative.reactNativeStrings.words
import typings.reactNativeElements.anon.PartialTouchableOpacityPr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- typings.reactNative.mod.ViewProps because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- typings.reactNative.mod.TextInputProps because Inheritance from two classes. Inlined 
- typings.reactNative.mod.ViewProps because Inheritance from two classes. Inlined pointerEvents, hitSlop, style, onLayout, removeClippedSubviews, nativeID, testID
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typings.reactNativeElements.mod.InputProps because Inheritance from two classes. Inlined 
- typings.reactNative.mod.TextInputProps because Inheritance from two classes. Inlined onTextInput, placeholderTextColor, selectionColor, keyboardType, multiline, maxFontSizeMultiplier, style_TextInputProps, defaultValue, blurOnSubmit, onScroll, onContentSizeChange, secureTextEntry, returnKeyType, onSubmitEditing, selectTextOnFocus, onEndEditing, autoCapitalize, placeholder, maxLength, onKeyPress, allowFontScaling, value, contextMenuHidden, editable, inputAccessoryViewID, autoFocus, onChange, onSelectionChange, selection, caretHidden, autoCorrect
- typings.reactNativeElements.mod.SearchBarBase because Inheritance from two classes. Inlined 
- typings.reactNativeElements.mod.InputProps because Inheritance from two classes. Inlined disabled, disabledInputStyle, leftIcon, rightIcon, InputComponent, errorStyle, errorMessage, errorProps, labelStyle, label, labelProps, renderErrorMessage
- typings.reactNativeElements.mod.SearchBarPlatform because Inheritance from two classes. Inlined onCancel
- typings.reactNativeElements.mod.SearchBarBase because Inheritance from two classes. Inlined containerStyle, inputContainerStyle, clearIcon, searchIcon, inputStyle, loadingProps, showLoading, leftIconContainerStyle, rightIconContainerStyle, onClear, onFocus, onBlur, onChangeText
- typings.reactNativeElements.mod.SearchBarAndroid because Inheritance from two classes. Inlined cancelIcon
- typings.reactNativeElements.mod.SearchBarIOS because Inheritance from two classes. Inlined cancelButtonProps, cancelButtonTitle, showCancel
- typings.reactNativeElements.mod.SearchBarDefault because Inheritance from two classes. Inlined lightTheme, round */ trait SearchBarProps
  extends StObject
     with SearchBarWrapper
     with TextInputIOSProps
     with TextInputAndroidProps
     with ViewPropsAndroid
     with ViewPropsIOS
     with GestureResponderHandlers
     with Touchable
     with AccessibilityProps {
  
  /**
    * Renders component in place of the React Native `TextInput` (optional)
    */
  var InputComponent: js.UndefOr[ComponentType[js.Any]] = js.undefined
  
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
    * https://reactnative.dev/docs/textinput#autocapitalize
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
    * Props passed to cancel button
    */
  var cancelButtonProps: js.UndefOr[PartialTouchableOpacityPr] = js.undefined
  
  /**
    * title of cancel button on iOS.  Default: 'Cancel'.
    */
  var cancelButtonTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Override the cancel Icon props or use a custom component. Use null or false to hide the icon.
    */
  var cancelIcon: js.UndefOr[IconNode] = js.undefined
  
  /**
    * If true, caret is hidden. The default value is false.
    */
  var caretHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Override the clear Icon props or use a custom component. Use null or false to hide the icon.
    */
  var clearIcon: js.UndefOr[IconNode] = js.undefined
  
  /**
    * Styling for the searchbar container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * If true, context menu is hidden. The default value is false.
    */
  var contextMenuHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides an initial value that will change when the user starts typing.
    * Useful for simple use-cases where you don't want to deal with listening to events
    * and updating the value prop to keep the controlled state in sync.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * Disables the input field
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Style of the input field when disabled
    */
  var disabledInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * If false, text is not editable. The default value is true.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 	Adds error message (optional)
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * 	props to be passed to the React Native Text component used to display the error message (optional)
    */
  var errorProps: js.UndefOr[TextProps] = js.undefined
  
  /**
    * 	Add styling to error message (optional)
    */
  var errorStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * This defines how far a touch event can start away from the view.
    * Typical interface guidelines recommend touch targets that are at least
    * 30 - 40 points/density-independent pixels. If a Touchable view has
    * a height of 20 the touchable height can be extended to 40 with
    * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
    * NOTE The touch area never extends past the parent view bounds and
    * the Z-index of sibling views always takes precedence if a touch
    * hits two overlapping views.
    */
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  /**
    * Used to connect to an InputAccessoryView. Not part of react-natives documentation, but present in examples and
    * code.
    * See https://reactnative.dev/docs/inputaccessoryview for more information.
    */
  var inputAccessoryViewID: js.UndefOr[String] = js.undefined
  
  /**
    * Optional styling for the TextInput's container
    */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * TextInput styling
    */
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
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
    * 	Adds label (optional)
    */
  var label: js.UndefOr[String | ReactElement] = js.undefined
  
  /**
    *  props to be passed to the React Native Text component used to display the label (optional)
    */
  var labelProps: js.UndefOr[TextProps] = js.undefined
  
  /**
    * 	Add styling to label (optional)
    */
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Displays an icon to the left (optional)
    */
  var leftIcon: js.UndefOr[IconNode] = js.undefined
  
  /**
    * Container style for the left icon
    */
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Change theme to light theme
    *
    * @default false
    */
  var lightTheme: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional props to pass to the ActivityIndicator
    */
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.undefined
  
  /**
    * Specifies largest possible scale a font can reach when allowFontScaling is enabled. Possible values:
    * - null/undefined (default): inherit from the parent node or the global default (0)
    * - 0: no max, ignore parent/global default
    * - >= 1: sets the maxFontSizeMultiplier of this node to this value
    */
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
  
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
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.undefined
  
  /**
    * Callback fired when the input is blurred via the keyboard
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback fired when the cancel button is pressed
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback that is called when the text input's text changes.
    */
  var onChange: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputChangeEventData], Unit]] = js.undefined
  
  /**
    * Method to fire when text is changed
    */
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  /**
    * Callback fired when the clear button is pressed
    */
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback that is called when the text input's content size changes.
    * This will be called with
    * `{ nativeEvent: { contentSize: { width, height } } }`.
    *
    * Only called for multiline text inputs.
    */
  var onContentSizeChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData], Unit]
  ] = js.undefined
  
  /**
    * Callback that is called when text input ends.
    */
  var onEndEditing: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputEndEditingEventData], Unit]] = js.undefined
  
  /**
    * Callback fired when the input is focused
    */
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
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
  var onSubmitEditing: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData], Unit]
  ] = js.undefined
  
  /**
    * Callback that is called on new text input with the argument
    *  `{ nativeEvent: { text, previousText, range: { start, end } } }`.
    *
    * This prop requires multiline={true} to be set.
    */
  var onTextInput: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputTextInputEventData], Unit]] = js.undefined
  
  /**
    * The string that will be rendered before text input has been entered
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * The text color of the placeholder string
    */
  var placeholderTextColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    *
    * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
    *
    * .box-none {
    *   pointer-events: none;
    * }
    * .box-none * {
    *   pointer-events: all;
    * }
    *
    * box-only is the equivalent of
    *
    * .box-only {
    *   pointer-events: all;
    * }
    * .box-only * {
    *   pointer-events: none;
    * }
    *
    * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
    * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
    */
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  /**
    *
    * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
    * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
    * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
    */
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  displays error message
    */
  var renderErrorMessage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * enum('default', 'go', 'google', 'join', 'next', 'route', 'search', 'send', 'yahoo', 'done', 'emergency-call')
    * Determines how the return key should look.
    */
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.undefined
  
  /**
    * Displays an icon to the right (optional)
    */
  var rightIcon: js.UndefOr[IconNode] = js.undefined
  
  /**
    * Container style for the right icon
    */
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Change TextInput styling to rounded corners
    *
    * @default false
    */
  var round: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Override the search Icon props or use a custom component. Use null or false to hide the icon.
    */
  var searchIcon: js.UndefOr[IconNode] = js.undefined
  
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
  var selection: js.UndefOr[Start] = js.undefined
  
  /**
    * The highlight (and cursor on ios) color of the text input
    */
  var selectionColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * When `true` the cancel button will stay visible after blur events.
    */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If to show the loading indicator
    *
    * @default false
    */
  var showLoading: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Styles
    */
  @JSName("style")
  var style_TextInputProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * The value to show for the text input. TextInput is a controlled component,
    * which means the native value will be forced to match this value prop if provided.
    * For most uses this works great, but in some cases this may cause flickering - one common cause is preventing edits by keeping value the same.
    * In addition to simply setting the same value, either set editable={false},
    * or set/update maxLength to prevent unwanted edits without flicker.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SearchBarProps {
  
  @scala.inline
  def apply(): SearchBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarProps]
  }
  
  @scala.inline
  implicit class SearchBarPropsMutableBuilder[Self <: SearchBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: none | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBlurOnSubmit(value: Boolean): Self = StObject.set(x, "blurOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurOnSubmitUndefined: Self = StObject.set(x, "blurOnSubmit", js.undefined)
    
    @scala.inline
    def setCancelButtonProps(value: PartialTouchableOpacityPr): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
    
    @scala.inline
    def setCancelButtonTitle(value: String): Self = StObject.set(x, "cancelButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonTitleUndefined: Self = StObject.set(x, "cancelButtonTitle", js.undefined)
    
    @scala.inline
    def setCancelIcon(value: IconNode): Self = StObject.set(x, "cancelIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelIconUndefined: Self = StObject.set(x, "cancelIcon", js.undefined)
    
    @scala.inline
    def setCaretHidden(value: Boolean): Self = StObject.set(x, "caretHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaretHiddenUndefined: Self = StObject.set(x, "caretHidden", js.undefined)
    
    @scala.inline
    def setClearIcon(value: IconNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setContextMenuHidden(value: Boolean): Self = StObject.set(x, "contextMenuHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuHiddenUndefined: Self = StObject.set(x, "contextMenuHidden", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInputStyleNull: Self = StObject.set(x, "disabledInputStyle", null)
    
    @scala.inline
    def setDisabledInputStyleUndefined: Self = StObject.set(x, "disabledInputStyle", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorProps(value: TextProps): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStyleNull: Self = StObject.set(x, "errorStyle", null)
    
    @scala.inline
    def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setInputAccessoryViewID(value: String): Self = StObject.set(x, "inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAccessoryViewIDUndefined: Self = StObject.set(x, "inputAccessoryViewID", js.undefined)
    
    @scala.inline
    def setInputComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "InputComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputComponentUndefined: Self = StObject.set(x, "InputComponent", js.undefined)
    
    @scala.inline
    def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
    
    @scala.inline
    def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
    
    @scala.inline
    def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
    
    @scala.inline
    def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    @scala.inline
    def setKeyboardType(value: KeyboardTypeOptions): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
    
    @scala.inline
    def setLabel(value: String | ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelProps(value: TextProps): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: IconNode): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "leftIconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconContainerStyleNull: Self = StObject.set(x, "leftIconContainerStyle", null)
    
    @scala.inline
    def setLeftIconContainerStyleUndefined: Self = StObject.set(x, "leftIconContainerStyle", js.undefined)
    
    @scala.inline
    def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    @scala.inline
    def setLightTheme(value: Boolean): Self = StObject.set(x, "lightTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightThemeUndefined: Self = StObject.set(x, "lightTheme", js.undefined)
    
    @scala.inline
    def setLoadingProps(value: ActivityIndicatorProperties): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
    
    @scala.inline
    def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ NativeSyntheticEvent[TextInputChangeEventData] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData] => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnEndEditing(value: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData] => Unit): Self = StObject.set(x, "onEndEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* e */ NativeSyntheticEvent[TextInputScrollEventData] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData] => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnSubmitEditing(value: /* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData] => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
    
    @scala.inline
    def setOnTextInput(value: /* e */ NativeSyntheticEvent[TextInputTextInputEventData] => Unit): Self = StObject.set(x, "onTextInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTextInputUndefined: Self = StObject.set(x, "onTextInput", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderTextColor(value: ColorValue): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderErrorMessage(value: Boolean): Self = StObject.set(x, "renderErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderErrorMessageUndefined: Self = StObject.set(x, "renderErrorMessage", js.undefined)
    
    @scala.inline
    def setReturnKeyType(value: ReturnKeyTypeOptions): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
    
    @scala.inline
    def setRightIcon(value: IconNode): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightIconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconContainerStyleNull: Self = StObject.set(x, "rightIconContainerStyle", null)
    
    @scala.inline
    def setRightIconContainerStyleUndefined: Self = StObject.set(x, "rightIconContainerStyle", js.undefined)
    
    @scala.inline
    def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    @scala.inline
    def setSearchIcon(value: IconNode): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchIconUndefined: Self = StObject.set(x, "searchIcon", js.undefined)
    
    @scala.inline
    def setSecureTextEntry(value: Boolean): Self = StObject.set(x, "secureTextEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureTextEntryUndefined: Self = StObject.set(x, "secureTextEntry", js.undefined)
    
    @scala.inline
    def setSelectTextOnFocus(value: Boolean): Self = StObject.set(x, "selectTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectTextOnFocusUndefined: Self = StObject.set(x, "selectTextOnFocus", js.undefined)
    
    @scala.inline
    def setSelection(value: Start): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    @scala.inline
    def setShowLoading(value: Boolean): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLoadingUndefined: Self = StObject.set(x, "showLoading", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[TextStyle | ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
