package typings.reactNativeMaterialDropdown.anon

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaterialDropdown.mod.DropDownData
import typings.reactNativeMaterialDropdown.mod.DropDownInsets
import typings.reactNativeMaterialDropdown.mod.DropDownMargins
import typings.reactNativeMaterialDropdown.mod.DropDownOffset
import typings.reactNativeMaterialDropdown.mod.DropDownProps
import typings.reactNativeMaterialDropdown.mod.RenderBaseProps
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.`no-hide-descendants`
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.assertive
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.auto
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.button
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.no
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.none
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.polite
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.radiobutton_checked
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.radiobutton_unchecked
import typings.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.yes
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-material-dropdown.react-native-material-dropdown.DropDownProps> */
trait PartialDropDownPropsAbsoluteRTLLayout extends js.Object {
  var absoluteRTLLayout: js.UndefOr[Boolean] = js.undefined
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  var accessibilityHint: js.UndefOr[String] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var baseColor: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var data: js.UndefOr[js.Array[DropDownData]] = js.undefined
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var delayPressOut: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledItemColor: js.UndefOr[String] = js.undefined
  var dropdownMargins: js.UndefOr[DropDownMargins] = js.undefined
  var dropdownOffset: js.UndefOr[DropDownOffset] = js.undefined
  var dropdownPosition: js.UndefOr[Double] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[DropDownInsets] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var itemColor: js.UndefOr[String] = js.undefined
  var itemCount: js.UndefOr[Double] = js.undefined
  var itemPadding: js.UndefOr[Double] = js.undefined
  var itemTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.undefined
  var labelFontSize: js.UndefOr[Double] = js.undefined
  var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChangeText: js.UndefOr[
    js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[this.type], Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  var propsExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, Partial[DropDownProps]]] = js.undefined
  var renderAccessory: js.UndefOr[js.Function0[Element]] = js.undefined
  var renderBase: js.UndefOr[js.Function1[/* props */ RenderBaseProps, Element]] = js.undefined
  var rippleCentered: js.UndefOr[Boolean] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
  var rippleDuration: js.UndefOr[Double] = js.undefined
  var rippleInsets: js.UndefOr[DropDownInsets] = js.undefined
  var rippleOpacity: js.UndefOr[Double] = js.undefined
  var rippleSequential: js.UndefOr[Boolean] = js.undefined
  var selectedItemColor: js.UndefOr[String] = js.undefined
  var shadeOpacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[String]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var valueExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.undefined
}

object PartialDropDownPropsAbsoluteRTLLayout {
  @scala.inline
  def apply(
    absoluteRTLLayout: js.UndefOr[Boolean] = js.undefined,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    baseColor: String = null,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    data: js.Array[DropDownData] = null,
    delayLongPress: js.UndefOr[Double] = js.undefined,
    delayPressIn: js.UndefOr[Double] = js.undefined,
    delayPressOut: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledItemColor: String = null,
    dropdownMargins: DropDownMargins = null,
    dropdownOffset: DropDownOffset = null,
    dropdownPosition: js.UndefOr[Double] = js.undefined,
    fontSize: js.UndefOr[Double] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: DropDownInsets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    inputContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    itemColor: String = null,
    itemCount: js.UndefOr[Double] = js.undefined,
    itemPadding: js.UndefOr[Double] = js.undefined,
    itemTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    label: String = null,
    labelExtractor: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => String = null,
    labelFontSize: js.UndefOr[Double] = js.undefined,
    labelTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onBlur: () => Unit = null,
    onChangeText: (/* value */ String, /* index */ Double, /* data */ js.Array[PartialDropDownPropsAbsoluteRTLLayout]) => Unit = null,
    onFocus: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    onPressIn: /* event */ GestureResponderEvent => Unit = null,
    onPressOut: /* event */ GestureResponderEvent => Unit = null,
    overlayStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    pickerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    pressRetentionOffset: Insets = null,
    propsExtractor: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => Partial[DropDownProps] = null,
    renderAccessory: () => Element = null,
    renderBase: /* props */ RenderBaseProps => Element = null,
    rippleCentered: js.UndefOr[Boolean] = js.undefined,
    rippleColor: String = null,
    rippleDuration: js.UndefOr[Double] = js.undefined,
    rippleInsets: DropDownInsets = null,
    rippleOpacity: js.UndefOr[Double] = js.undefined,
    rippleSequential: js.UndefOr[Boolean] = js.undefined,
    selectedItemColor: String = null,
    shadeOpacity: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    supportedOrientations: js.Array[String] = null,
    testID: String = null,
    textColor: String = null,
    tvParallaxProperties: TVParallaxProperties = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    value: String | Double = null,
    valueExtractor: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => String = null
  ): PartialDropDownPropsAbsoluteRTLLayout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absoluteRTLLayout)) __obj.updateDynamic("absoluteRTLLayout")(absoluteRTLLayout.get.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.get.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.get.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (baseColor != null) __obj.updateDynamic("baseColor")(baseColor.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(delayLongPress)) __obj.updateDynamic("delayLongPress")(delayLongPress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayPressIn)) __obj.updateDynamic("delayPressIn")(delayPressIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayPressOut)) __obj.updateDynamic("delayPressOut")(delayPressOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (disabledItemColor != null) __obj.updateDynamic("disabledItemColor")(disabledItemColor.asInstanceOf[js.Any])
    if (dropdownMargins != null) __obj.updateDynamic("dropdownMargins")(dropdownMargins.asInstanceOf[js.Any])
    if (dropdownOffset != null) __obj.updateDynamic("dropdownOffset")(dropdownOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownPosition)) __obj.updateDynamic("dropdownPosition")(dropdownPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(inputContainerStyle)) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor.asInstanceOf[js.Any])
    if (!js.isUndefined(itemCount)) __obj.updateDynamic("itemCount")(itemCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemPadding)) __obj.updateDynamic("itemPadding")(itemPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemTextStyle)) __obj.updateDynamic("itemTextStyle")(itemTextStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelExtractor != null) __obj.updateDynamic("labelExtractor")(js.Any.fromFunction2(labelExtractor))
    if (!js.isUndefined(labelFontSize)) __obj.updateDynamic("labelFontSize")(labelFontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelTextStyle)) __obj.updateDynamic("labelTextStyle")(labelTextStyle.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
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
    if (!js.isUndefined(overlayStyle)) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(pickerStyle)) __obj.updateDynamic("pickerStyle")(pickerStyle.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (propsExtractor != null) __obj.updateDynamic("propsExtractor")(js.Any.fromFunction2(propsExtractor))
    if (renderAccessory != null) __obj.updateDynamic("renderAccessory")(js.Any.fromFunction0(renderAccessory))
    if (renderBase != null) __obj.updateDynamic("renderBase")(js.Any.fromFunction1(renderBase))
    if (!js.isUndefined(rippleCentered)) __obj.updateDynamic("rippleCentered")(rippleCentered.get.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleDuration)) __obj.updateDynamic("rippleDuration")(rippleDuration.get.asInstanceOf[js.Any])
    if (rippleInsets != null) __obj.updateDynamic("rippleInsets")(rippleInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleOpacity)) __obj.updateDynamic("rippleOpacity")(rippleOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rippleSequential)) __obj.updateDynamic("rippleSequential")(rippleSequential.get.asInstanceOf[js.Any])
    if (selectedItemColor != null) __obj.updateDynamic("selectedItemColor")(selectedItemColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadeOpacity)) __obj.updateDynamic("shadeOpacity")(shadeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueExtractor != null) __obj.updateDynamic("valueExtractor")(js.Any.fromFunction2(valueExtractor))
    __obj.asInstanceOf[PartialDropDownPropsAbsoluteRTLLayout]
  }
}

