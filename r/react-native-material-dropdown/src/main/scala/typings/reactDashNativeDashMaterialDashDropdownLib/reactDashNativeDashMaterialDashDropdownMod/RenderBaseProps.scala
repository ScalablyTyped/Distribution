package typings
package reactDashNativeDashMaterialDashDropdownLib.reactDashNativeDashMaterialDashDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderBaseProps extends DropDownProps {
  /** Title of dropdown */
  var title: java.lang.String
}

object RenderBaseProps {
  @scala.inline
  def apply(
    data: js.Array[DropDownData],
    title: java.lang.String,
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
    hasTVPreferredFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: DropDownInsets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    itemColor: java.lang.String = null,
    itemCount: scala.Int | scala.Double = null,
    itemPadding: scala.Int | scala.Double = null,
    itemTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    label: java.lang.String = null,
    labelExtractor: (/* item */ DropDownData, /* index */ scala.Double) => java.lang.String = null,
    onAccessibilityTap: () => scala.Unit = null,
    onBlur: () => scala.Unit = null,
    onChangeText: (/* value */ java.lang.String, /* index */ scala.Double, /* data */ DropDownData) => scala.Unit = null,
    onFocus: () => scala.Unit = null,
    onLayout: /* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent => scala.Unit = null,
    onLongPress: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onMagicTap: () => scala.Unit = null,
    onPress: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onPressIn: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onPressOut: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    overlayStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    pickerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    pressRetentionOffset: reactDashNativeLib.reactDashNativeMod.Insets = null,
    propsExtractor: (/* item */ DropDownData, /* index */ scala.Double) => stdLib.Partial[RenderBaseProps] = null,
    renderAccessory: () => reactLib.reactMod.Global.JSXNs.Element = null,
    renderBase: /* props */ RenderBaseProps => reactLib.reactMod.Global.JSXNs.Element = null,
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
    tvParallaxProperties: reactDashNativeLib.reactDashNativeMod.TVParallaxProperties = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String | scala.Double = null,
    valueExtractor: (/* item */ DropDownData, /* index */ scala.Double) => java.lang.String = null
  ): RenderBaseProps = {
    val __obj = js.Dynamic.literal(data = data, title = title)
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
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor)
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemPadding != null) __obj.updateDynamic("itemPadding")(itemPadding.asInstanceOf[js.Any])
    if (itemTextStyle != null) __obj.updateDynamic("itemTextStyle")(itemTextStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelExtractor != null) __obj.updateDynamic("labelExtractor")(js.Any.fromFunction2(labelExtractor))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction3(onChangeText))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (pickerStyle != null) __obj.updateDynamic("pickerStyle")(pickerStyle.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset)
    if (propsExtractor != null) __obj.updateDynamic("propsExtractor")(js.Any.fromFunction2(propsExtractor))
    if (renderAccessory != null) __obj.updateDynamic("renderAccessory")(js.Any.fromFunction0(renderAccessory))
    if (renderBase != null) __obj.updateDynamic("renderBase")(js.Any.fromFunction1(renderBase))
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
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueExtractor != null) __obj.updateDynamic("valueExtractor")(js.Any.fromFunction2(valueExtractor))
    __obj.asInstanceOf[RenderBaseProps]
  }
}

