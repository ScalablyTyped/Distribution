package typings
package reactDashNativeDashMaterialDashDropdownLib.reactDashNativeDashMaterialDashDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownProps
  extends reactDashNativeLib.reactDashNativeMod.TouchableWithoutFeedbackProps {
  /** Enable RTL layout */
  var absoluteRTLLayout: js.UndefOr[scala.Boolean] = js.undefined
  /** Animation duration (default: 225) */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /** Set base color (default: rgba(0, 0, 0, .38)) */
  var baseColor: js.UndefOr[java.lang.String] = js.undefined
  /** Set container styles */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /** Dropdown data items */
  var data: js.Array[DropDownData]
  /** Set disabled item color */
  var disabledItemColor: js.UndefOr[java.lang.String] = js.undefined
  /** Provide Dropdown margins */
  var dropdownMargins: js.UndefOr[DropDownMargins] = js.undefined
  /** Provide Dropdown top-left position */
  var dropdownOffset: js.UndefOr[DropDownOffset] = js.undefined
  /** Provide dropdown position (dynamic if undefined) */
  var dropdownPosition: js.UndefOr[scala.Double] = js.undefined
  /** Set font size of dropdown items (default: 16) */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /** Hitslop insets (default: { top: 6, right: 4, bottom: 6, left: 4 }) */
  @JSName("hitSlop")
  var hitSlop_DropDownProps: js.UndefOr[DropDownInsets] = js.undefined
  /** Set Item color (default: rgba(0, 0, 0, .54)) */
  var itemColor: js.UndefOr[java.lang.String] = js.undefined
  /** Set Item count (default: 4) */
  var itemCount: js.UndefOr[scala.Double] = js.undefined
  /** Set Item padding (default: 8) */
  var itemPadding: js.UndefOr[scala.Double] = js.undefined
  /** Set Item text style. */
  var itemTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /** Label to be shown for dropdown */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Label extractor function. Extract label from item. */
  var labelExtractor: js.UndefOr[
    js.Function2[/* item */ DropDownData, /* index */ scala.Double, java.lang.String]
  ] = js.undefined
  /** Event: When focus lost from dropdown */
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Event: When change selected item */
  var onChangeText: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* index */ scala.Double, 
      /* data */ DropDownData, 
      scala.Unit
    ]
  ] = js.undefined
  /** Event: When dropdown opens */
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Set overlay styles */
  var overlayStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /** Set picker styles */
  var pickerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /** Props extractor function. Extract props from item. */
  var propsExtractor: js.UndefOr[
    js.Function2[/* item */ DropDownData, /* index */ scala.Double, stdLib.Partial[this.type]]
  ] = js.undefined
  /** Render text field accessory */
  var renderAccessory: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /** Render base component */
  var renderBase: js.UndefOr[
    js.Function1[/* props */ RenderBaseProps, reactLib.reactMod.Global.JSXNs.Element]
  ] = js.undefined
  /** Whether ripple be centered or not (default: false) */
  var rippleCentered: js.UndefOr[scala.Boolean] = js.undefined
  /** Provide Ripple color */
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  /** Ripple duration (defailt: 400) */
  var rippleDuration: js.UndefOr[scala.Double] = js.undefined
  /** Ripple insets  */
  var rippleInsets: js.UndefOr[DropDownInsets] = js.undefined
  /** Ripple opacity (default: 0.54) */
  var rippleOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Whether ripple rendered in sequential order (default: false)  */
  var rippleSequential: js.UndefOr[scala.Boolean] = js.undefined
  /** Set selected item color */
  var selectedItemColor: js.UndefOr[java.lang.String] = js.undefined
  /** Shade opacity (default: 0.12) */
  var shadeOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Specify which orientations are supported. (default: ['portrait', 'portrait-upside-down', 'landscape', 'landscape-left', 'landscape-right']) */
  var supportedOrientations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Set Text color (default: rgba(0, 0, 0, .87)) */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  /** Use native driver (default: false) */
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  /** Selected value */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Value extractor function. Extract value from item. */
  var valueExtractor: js.UndefOr[
    js.Function2[/* item */ DropDownData, /* index */ scala.Double, java.lang.String]
  ] = js.undefined
}

object DropDownProps {
  @scala.inline
  def apply(
    data: js.Array[DropDownData],
    absoluteRTLLayout: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: reactDashNativeLib.reactDashNativeMod.AccessibilityRole = null,
    accessibilityStates: js.Array[reactDashNativeLib.reactDashNativeMod.AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    baseColor: java.lang.String = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledItemColor: java.lang.String = null,
    dropdownMargins: DropDownMargins = null,
    dropdownOffset: DropDownOffset = null,
    dropdownPosition: scala.Int | scala.Double = null,
    fontSize: scala.Int | scala.Double = null,
    hitSlop: DropDownInsets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    itemColor: java.lang.String = null,
    itemCount: scala.Int | scala.Double = null,
    itemPadding: scala.Int | scala.Double = null,
    itemTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    label: java.lang.String = null,
    labelExtractor: js.Function2[/* item */ DropDownData, /* index */ scala.Double, java.lang.String] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onBlur: js.Function0[scala.Unit] = null,
    onChangeText: js.Function3[
      /* value */ java.lang.String, 
      /* index */ scala.Double, 
      /* data */ DropDownData, 
      scala.Unit
    ] = null,
    onFocus: js.Function0[scala.Unit] = null,
    onLayout: js.Function1[/* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent, scala.Unit] = null,
    onLongPress: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onPress: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onPressIn: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onPressOut: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    overlayStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    pickerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    pressRetentionOffset: reactDashNativeLib.reactDashNativeMod.Insets = null,
    propsExtractor: js.Function2[/* item */ DropDownData, /* index */ scala.Double, stdLib.Partial[DropDownProps]] = null,
    renderAccessory: js.Function0[reactLib.reactMod.Global.JSXNs.Element] = null,
    renderBase: js.Function1[/* props */ RenderBaseProps, reactLib.reactMod.Global.JSXNs.Element] = null,
    rippleCentered: js.UndefOr[scala.Boolean] = js.undefined,
    rippleColor: java.lang.String = null,
    rippleDuration: scala.Int | scala.Double = null,
    rippleInsets: DropDownInsets = null,
    rippleOpacity: scala.Int | scala.Double = null,
    rippleSequential: js.UndefOr[scala.Boolean] = js.undefined,
    selectedItemColor: java.lang.String = null,
    shadeOpacity: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    supportedOrientations: js.Array[java.lang.String] = null,
    testID: java.lang.String = null,
    textColor: java.lang.String = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String | scala.Double = null,
    valueExtractor: js.Function2[/* item */ DropDownData, /* index */ scala.Double, java.lang.String] = null
  ): DropDownProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(absoluteRTLLayout)) __obj.updateDynamic("absoluteRTLLayout")(absoluteRTLLayout)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (baseColor != null) __obj.updateDynamic("baseColor")(baseColor)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledItemColor != null) __obj.updateDynamic("disabledItemColor")(disabledItemColor)
    if (dropdownMargins != null) __obj.updateDynamic("dropdownMargins")(dropdownMargins)
    if (dropdownOffset != null) __obj.updateDynamic("dropdownOffset")(dropdownOffset)
    if (dropdownPosition != null) __obj.updateDynamic("dropdownPosition")(dropdownPosition.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor)
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemPadding != null) __obj.updateDynamic("itemPadding")(itemPadding.asInstanceOf[js.Any])
    if (itemTextStyle != null) __obj.updateDynamic("itemTextStyle")(itemTextStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelExtractor != null) __obj.updateDynamic("labelExtractor")(labelExtractor)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(onChangeText)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(onPressIn)
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(onPressOut)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (pickerStyle != null) __obj.updateDynamic("pickerStyle")(pickerStyle.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset)
    if (propsExtractor != null) __obj.updateDynamic("propsExtractor")(propsExtractor)
    if (renderAccessory != null) __obj.updateDynamic("renderAccessory")(renderAccessory)
    if (renderBase != null) __obj.updateDynamic("renderBase")(renderBase)
    if (!js.isUndefined(rippleCentered)) __obj.updateDynamic("rippleCentered")(rippleCentered)
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (rippleDuration != null) __obj.updateDynamic("rippleDuration")(rippleDuration.asInstanceOf[js.Any])
    if (rippleInsets != null) __obj.updateDynamic("rippleInsets")(rippleInsets)
    if (rippleOpacity != null) __obj.updateDynamic("rippleOpacity")(rippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleSequential)) __obj.updateDynamic("rippleSequential")(rippleSequential)
    if (selectedItemColor != null) __obj.updateDynamic("selectedItemColor")(selectedItemColor)
    if (shadeOpacity != null) __obj.updateDynamic("shadeOpacity")(shadeOpacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueExtractor != null) __obj.updateDynamic("valueExtractor")(valueExtractor)
    __obj.asInstanceOf[DropDownProps]
  }
}

