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
@js.native
trait PartialDropDownPropsAbsoluteRTLLayout extends js.Object {
  var absoluteRTLLayout: js.UndefOr[Boolean] = js.native
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  var accessibilityHint: js.UndefOr[String] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  var accessibilityLabel: js.UndefOr[String] = js.native
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  var accessible: js.UndefOr[Boolean] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var baseColor: js.UndefOr[String] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var data: js.UndefOr[js.Array[DropDownData]] = js.native
  var delayLongPress: js.UndefOr[Double] = js.native
  var delayPressIn: js.UndefOr[Double] = js.native
  var delayPressOut: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledItemColor: js.UndefOr[String] = js.native
  var dropdownMargins: js.UndefOr[DropDownMargins] = js.native
  var dropdownOffset: js.UndefOr[DropDownOffset] = js.native
  var dropdownPosition: js.UndefOr[Double] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[DropDownInsets] = js.native
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var itemColor: js.UndefOr[String] = js.native
  var itemCount: js.UndefOr[Double] = js.native
  var itemPadding: js.UndefOr[Double] = js.native
  var itemTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var label: js.UndefOr[String] = js.native
  var labelExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.native
  var labelFontSize: js.UndefOr[Double] = js.native
  var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.native
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  var onChangeText: js.UndefOr[
    js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[this.type], Unit]
  ] = js.native
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var pressRetentionOffset: js.UndefOr[Insets] = js.native
  var propsExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, Partial[DropDownProps]]] = js.native
  var renderAccessory: js.UndefOr[js.Function0[Element]] = js.native
  var renderBase: js.UndefOr[js.Function1[/* props */ RenderBaseProps, Element]] = js.native
  var rippleCentered: js.UndefOr[Boolean] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var rippleDuration: js.UndefOr[Double] = js.native
  var rippleInsets: js.UndefOr[DropDownInsets] = js.native
  var rippleOpacity: js.UndefOr[Double] = js.native
  var rippleSequential: js.UndefOr[Boolean] = js.native
  var selectedItemColor: js.UndefOr[String] = js.native
  var shadeOpacity: js.UndefOr[Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var supportedOrientations: js.UndefOr[js.Array[String]] = js.native
  var testID: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String | Double] = js.native
  var valueExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.native
}

object PartialDropDownPropsAbsoluteRTLLayout {
  @scala.inline
  def apply(): PartialDropDownPropsAbsoluteRTLLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDropDownPropsAbsoluteRTLLayout]
  }
  @scala.inline
  implicit class PartialDropDownPropsAbsoluteRTLLayoutOps[Self <: PartialDropDownPropsAbsoluteRTLLayout] (val x: Self) extends AnyVal {
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
    def setAbsoluteRTLLayout(value: Boolean): Self = this.set("absoluteRTLLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteRTLLayout: Self = this.set("absoluteRTLLayout", js.undefined)
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setBaseColor(value: String): Self = this.set("baseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseColor: Self = this.set("baseColor", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDataVarargs(value: DropDownData*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[DropDownData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDelayLongPress(value: Double): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    @scala.inline
    def setDelayPressIn(value: Double): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    @scala.inline
    def setDelayPressOut(value: Double): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledItemColor(value: String): Self = this.set("disabledItemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledItemColor: Self = this.set("disabledItemColor", js.undefined)
    @scala.inline
    def setDropdownMargins(value: DropDownMargins): Self = this.set("dropdownMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMargins: Self = this.set("dropdownMargins", js.undefined)
    @scala.inline
    def setDropdownOffset(value: DropDownOffset): Self = this.set("dropdownOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownOffset: Self = this.set("dropdownOffset", js.undefined)
    @scala.inline
    def setDropdownPosition(value: Double): Self = this.set("dropdownPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownPosition: Self = this.set("dropdownPosition", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    @scala.inline
    def setHitSlop(value: DropDownInsets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    @scala.inline
    def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("inputContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputContainerStyle: Self = this.set("inputContainerStyle", js.undefined)
    @scala.inline
    def setInputContainerStyleNull: Self = this.set("inputContainerStyle", null)
    @scala.inline
    def setItemColor(value: String): Self = this.set("itemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemColor: Self = this.set("itemColor", js.undefined)
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    @scala.inline
    def setItemPadding(value: Double): Self = this.set("itemPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemPadding: Self = this.set("itemPadding", js.undefined)
    @scala.inline
    def setItemTextStyle(value: StyleProp[TextStyle]): Self = this.set("itemTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTextStyle: Self = this.set("itemTextStyle", js.undefined)
    @scala.inline
    def setItemTextStyleNull: Self = this.set("itemTextStyle", null)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => String): Self = this.set("labelExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLabelExtractor: Self = this.set("labelExtractor", js.undefined)
    @scala.inline
    def setLabelFontSize(value: Double): Self = this.set("labelFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFontSize: Self = this.set("labelFontSize", js.undefined)
    @scala.inline
    def setLabelTextStyle(value: StyleProp[TextStyle]): Self = this.set("labelTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTextStyle: Self = this.set("labelTextStyle", js.undefined)
    @scala.inline
    def setLabelTextStyleNull: Self = this.set("labelTextStyle", null)
    @scala.inline
    def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChangeText(
      value: (/* value */ String, /* index */ Double, /* data */ js.Array[PartialDropDownPropsAbsoluteRTLLayout]) => Unit
    ): Self = this.set("onChangeText", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChangeText: Self = this.set("onChangeText", js.undefined)
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    @scala.inline
    def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    @scala.inline
    def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPressOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewStyle]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setOverlayStyleNull: Self = this.set("overlayStyle", null)
    @scala.inline
    def setPickerStyle(value: StyleProp[ViewStyle]): Self = this.set("pickerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerStyle: Self = this.set("pickerStyle", js.undefined)
    @scala.inline
    def setPickerStyleNull: Self = this.set("pickerStyle", null)
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    @scala.inline
    def setPropsExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => Partial[DropDownProps]): Self = this.set("propsExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deletePropsExtractor: Self = this.set("propsExtractor", js.undefined)
    @scala.inline
    def setRenderAccessory(value: () => Element): Self = this.set("renderAccessory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderAccessory: Self = this.set("renderAccessory", js.undefined)
    @scala.inline
    def setRenderBase(value: /* props */ RenderBaseProps => Element): Self = this.set("renderBase", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderBase: Self = this.set("renderBase", js.undefined)
    @scala.inline
    def setRippleCentered(value: Boolean): Self = this.set("rippleCentered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleCentered: Self = this.set("rippleCentered", js.undefined)
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    @scala.inline
    def setRippleDuration(value: Double): Self = this.set("rippleDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleDuration: Self = this.set("rippleDuration", js.undefined)
    @scala.inline
    def setRippleInsets(value: DropDownInsets): Self = this.set("rippleInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleInsets: Self = this.set("rippleInsets", js.undefined)
    @scala.inline
    def setRippleOpacity(value: Double): Self = this.set("rippleOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleOpacity: Self = this.set("rippleOpacity", js.undefined)
    @scala.inline
    def setRippleSequential(value: Boolean): Self = this.set("rippleSequential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleSequential: Self = this.set("rippleSequential", js.undefined)
    @scala.inline
    def setSelectedItemColor(value: String): Self = this.set("selectedItemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemColor: Self = this.set("selectedItemColor", js.undefined)
    @scala.inline
    def setShadeOpacity(value: Double): Self = this.set("shadeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadeOpacity: Self = this.set("shadeOpacity", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setSupportedOrientationsVarargs(value: String*): Self = this.set("supportedOrientations", js.Array(value :_*))
    @scala.inline
    def setSupportedOrientations(value: js.Array[String]): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOrientations: Self = this.set("supportedOrientations", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTouchSoundDisabled(value: Boolean): Self = this.set("touchSoundDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchSoundDisabled: Self = this.set("touchSoundDisabled", js.undefined)
    @scala.inline
    def setTouchSoundDisabledNull: Self = this.set("touchSoundDisabled", null)
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => String): Self = this.set("valueExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValueExtractor: Self = this.set("valueExtractor", js.undefined)
  }
  
}

