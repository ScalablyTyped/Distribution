package typings.reactNativeMaterialDropdown

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-native-material-dropdown.react-native-material-dropdown.DropDownProps> */
  trait PartialDropDownProps extends StObject {
    
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
    
    var labelExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.undefined
    
    var labelFontSize: js.UndefOr[Double] = js.undefined
    
    var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChangeText: js.UndefOr[
        js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData], Unit]
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
    
    var propsExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, Partial[this.type]]] = js.undefined
    
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
    
    var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
    
    var valueExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.undefined
  }
  object PartialDropDownProps {
    
    inline def apply(): PartialDropDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDropDownProps]
    }
    
    extension [Self <: PartialDropDownProps](x: Self) {
      
      inline def setAbsoluteRTLLayout(value: Boolean): Self = StObject.set(x, "absoluteRTLLayout", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteRTLLayoutUndefined: Self = StObject.set(x, "absoluteRTLLayout", js.undefined)
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      inline def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      inline def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      inline def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setData(value: js.Array[DropDownData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: DropDownData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemColor(value: String): Self = StObject.set(x, "disabledItemColor", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemColorUndefined: Self = StObject.set(x, "disabledItemColor", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownMargins(value: DropDownMargins): Self = StObject.set(x, "dropdownMargins", value.asInstanceOf[js.Any])
      
      inline def setDropdownMarginsUndefined: Self = StObject.set(x, "dropdownMargins", js.undefined)
      
      inline def setDropdownOffset(value: DropDownOffset): Self = StObject.set(x, "dropdownOffset", value.asInstanceOf[js.Any])
      
      inline def setDropdownOffsetUndefined: Self = StObject.set(x, "dropdownOffset", js.undefined)
      
      inline def setDropdownPosition(value: Double): Self = StObject.set(x, "dropdownPosition", value.asInstanceOf[js.Any])
      
      inline def setDropdownPositionUndefined: Self = StObject.set(x, "dropdownPosition", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: DropDownInsets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      inline def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      inline def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      inline def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      inline def setItemTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemTextStyle", value.asInstanceOf[js.Any])
      
      inline def setItemTextStyleNull: Self = StObject.set(x, "itemTextStyle", null)
      
      inline def setItemTextStyleUndefined: Self = StObject.set(x, "itemTextStyle", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = StObject.set(x, "labelExtractor", js.Any.fromFunction2(value))
      
      inline def setLabelExtractorUndefined: Self = StObject.set(x, "labelExtractor", js.undefined)
      
      inline def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelTextStyleNull: Self = StObject.set(x, "labelTextStyle", null)
      
      inline def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChangeText(value: (/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData]) => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction3(value))
      
      inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerStyle", value.asInstanceOf[js.Any])
      
      inline def setPickerStyleNull: Self = StObject.set(x, "pickerStyle", null)
      
      inline def setPickerStyleUndefined: Self = StObject.set(x, "pickerStyle", js.undefined)
      
      inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      inline def setPropsExtractor(value: (/* item */ DropDownData, /* index */ Double) => Partial[PartialDropDownProps]): Self = StObject.set(x, "propsExtractor", js.Any.fromFunction2(value))
      
      inline def setPropsExtractorUndefined: Self = StObject.set(x, "propsExtractor", js.undefined)
      
      inline def setRenderAccessory(value: () => Element): Self = StObject.set(x, "renderAccessory", js.Any.fromFunction0(value))
      
      inline def setRenderAccessoryUndefined: Self = StObject.set(x, "renderAccessory", js.undefined)
      
      inline def setRenderBase(value: /* props */ RenderBaseProps => Element): Self = StObject.set(x, "renderBase", js.Any.fromFunction1(value))
      
      inline def setRenderBaseUndefined: Self = StObject.set(x, "renderBase", js.undefined)
      
      inline def setRippleCentered(value: Boolean): Self = StObject.set(x, "rippleCentered", value.asInstanceOf[js.Any])
      
      inline def setRippleCenteredUndefined: Self = StObject.set(x, "rippleCentered", js.undefined)
      
      inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
      
      inline def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
      
      inline def setRippleInsets(value: DropDownInsets): Self = StObject.set(x, "rippleInsets", value.asInstanceOf[js.Any])
      
      inline def setRippleInsetsUndefined: Self = StObject.set(x, "rippleInsets", js.undefined)
      
      inline def setRippleOpacity(value: Double): Self = StObject.set(x, "rippleOpacity", value.asInstanceOf[js.Any])
      
      inline def setRippleOpacityUndefined: Self = StObject.set(x, "rippleOpacity", js.undefined)
      
      inline def setRippleSequential(value: Boolean): Self = StObject.set(x, "rippleSequential", value.asInstanceOf[js.Any])
      
      inline def setRippleSequentialUndefined: Self = StObject.set(x, "rippleSequential", js.undefined)
      
      inline def setSelectedItemColor(value: String): Self = StObject.set(x, "selectedItemColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemColorUndefined: Self = StObject.set(x, "selectedItemColor", js.undefined)
      
      inline def setShadeOpacity(value: Double): Self = StObject.set(x, "shadeOpacity", value.asInstanceOf[js.Any])
      
      inline def setShadeOpacityUndefined: Self = StObject.set(x, "shadeOpacity", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSupportedOrientations(value: js.Array[String]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      inline def setSupportedOrientationsVarargs(value: String*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
      
      inline def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
      
      inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
      
      inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = StObject.set(x, "valueExtractor", js.Any.fromFunction2(value))
      
      inline def setValueExtractorUndefined: Self = StObject.set(x, "valueExtractor", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-native-material-dropdown.react-native-material-dropdown.DropDownProps> */
  trait PartialDropDownPropsAbsoluteRTLLayout extends StObject {
    
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
    
    var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
    
    var valueExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.undefined
  }
  object PartialDropDownPropsAbsoluteRTLLayout {
    
    inline def apply(): PartialDropDownPropsAbsoluteRTLLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDropDownPropsAbsoluteRTLLayout]
    }
    
    extension [Self <: PartialDropDownPropsAbsoluteRTLLayout](x: Self) {
      
      inline def setAbsoluteRTLLayout(value: Boolean): Self = StObject.set(x, "absoluteRTLLayout", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteRTLLayoutUndefined: Self = StObject.set(x, "absoluteRTLLayout", js.undefined)
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      inline def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      inline def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      inline def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setData(value: js.Array[DropDownData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: DropDownData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemColor(value: String): Self = StObject.set(x, "disabledItemColor", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemColorUndefined: Self = StObject.set(x, "disabledItemColor", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownMargins(value: DropDownMargins): Self = StObject.set(x, "dropdownMargins", value.asInstanceOf[js.Any])
      
      inline def setDropdownMarginsUndefined: Self = StObject.set(x, "dropdownMargins", js.undefined)
      
      inline def setDropdownOffset(value: DropDownOffset): Self = StObject.set(x, "dropdownOffset", value.asInstanceOf[js.Any])
      
      inline def setDropdownOffsetUndefined: Self = StObject.set(x, "dropdownOffset", js.undefined)
      
      inline def setDropdownPosition(value: Double): Self = StObject.set(x, "dropdownPosition", value.asInstanceOf[js.Any])
      
      inline def setDropdownPositionUndefined: Self = StObject.set(x, "dropdownPosition", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: DropDownInsets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      inline def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      inline def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      inline def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      inline def setItemTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemTextStyle", value.asInstanceOf[js.Any])
      
      inline def setItemTextStyleNull: Self = StObject.set(x, "itemTextStyle", null)
      
      inline def setItemTextStyleUndefined: Self = StObject.set(x, "itemTextStyle", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => String): Self = StObject.set(x, "labelExtractor", js.Any.fromFunction2(value))
      
      inline def setLabelExtractorUndefined: Self = StObject.set(x, "labelExtractor", js.undefined)
      
      inline def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelTextStyleNull: Self = StObject.set(x, "labelTextStyle", null)
      
      inline def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChangeText(
        value: (/* value */ String, /* index */ Double, /* data */ js.Array[PartialDropDownPropsAbsoluteRTLLayout]) => Unit
      ): Self = StObject.set(x, "onChangeText", js.Any.fromFunction3(value))
      
      inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerStyle", value.asInstanceOf[js.Any])
      
      inline def setPickerStyleNull: Self = StObject.set(x, "pickerStyle", null)
      
      inline def setPickerStyleUndefined: Self = StObject.set(x, "pickerStyle", js.undefined)
      
      inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      inline def setPropsExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => Partial[DropDownProps]): Self = StObject.set(x, "propsExtractor", js.Any.fromFunction2(value))
      
      inline def setPropsExtractorUndefined: Self = StObject.set(x, "propsExtractor", js.undefined)
      
      inline def setRenderAccessory(value: () => Element): Self = StObject.set(x, "renderAccessory", js.Any.fromFunction0(value))
      
      inline def setRenderAccessoryUndefined: Self = StObject.set(x, "renderAccessory", js.undefined)
      
      inline def setRenderBase(value: /* props */ RenderBaseProps => Element): Self = StObject.set(x, "renderBase", js.Any.fromFunction1(value))
      
      inline def setRenderBaseUndefined: Self = StObject.set(x, "renderBase", js.undefined)
      
      inline def setRippleCentered(value: Boolean): Self = StObject.set(x, "rippleCentered", value.asInstanceOf[js.Any])
      
      inline def setRippleCenteredUndefined: Self = StObject.set(x, "rippleCentered", js.undefined)
      
      inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
      
      inline def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
      
      inline def setRippleInsets(value: DropDownInsets): Self = StObject.set(x, "rippleInsets", value.asInstanceOf[js.Any])
      
      inline def setRippleInsetsUndefined: Self = StObject.set(x, "rippleInsets", js.undefined)
      
      inline def setRippleOpacity(value: Double): Self = StObject.set(x, "rippleOpacity", value.asInstanceOf[js.Any])
      
      inline def setRippleOpacityUndefined: Self = StObject.set(x, "rippleOpacity", js.undefined)
      
      inline def setRippleSequential(value: Boolean): Self = StObject.set(x, "rippleSequential", value.asInstanceOf[js.Any])
      
      inline def setRippleSequentialUndefined: Self = StObject.set(x, "rippleSequential", js.undefined)
      
      inline def setSelectedItemColor(value: String): Self = StObject.set(x, "selectedItemColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemColorUndefined: Self = StObject.set(x, "selectedItemColor", js.undefined)
      
      inline def setShadeOpacity(value: Double): Self = StObject.set(x, "shadeOpacity", value.asInstanceOf[js.Any])
      
      inline def setShadeOpacityUndefined: Self = StObject.set(x, "shadeOpacity", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSupportedOrientations(value: js.Array[String]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      inline def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      inline def setSupportedOrientationsVarargs(value: String*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
      
      inline def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
      
      inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
      
      inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => String): Self = StObject.set(x, "valueExtractor", js.Any.fromFunction2(value))
      
      inline def setValueExtractorUndefined: Self = StObject.set(x, "valueExtractor", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
