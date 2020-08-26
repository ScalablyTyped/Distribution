package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.IconType
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.balanced
import typings.reactNativeElements.reactNativeElementsStrings.button
import typings.reactNativeElements.reactNativeElementsStrings.clip
import typings.reactNativeElements.reactNativeElementsStrings.head
import typings.reactNativeElements.reactNativeElementsStrings.highQuality
import typings.reactNativeElements.reactNativeElementsStrings.middle
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typings.reactNativeElements.reactNativeElementsStrings.simple
import typings.reactNativeElements.reactNativeElementsStrings.tail
import typings.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.IconProps>> */
@js.native
trait RecursivePartialPartialIcAccessibilityActions extends js.Object {
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]] = js.native
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.native
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.native
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.native
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.native
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var adjustsFontSizeToFit: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var allowFontScaling: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var background: js.UndefOr[RecursivePartial[js.UndefOr[BackgroundPropType]]] = js.native
  var backgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var borderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var brand: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var color: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var delayLongPress: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var delayPressIn: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var delayPressOut: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var ellipsizeMode: js.UndefOr[RecursivePartial[js.UndefOr[head | middle | tail | clip]]] = js.native
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  var iconStyle: js.UndefOr[RecursivePartial[js.UndefOr[TextStyle]]] = js.native
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  var lineBreakMode: js.UndefOr[RecursivePartial[js.UndefOr[head | middle | tail | clip]]] = js.native
  var maxFontSizeMultiplier: js.UndefOr[RecursivePartial[js.UndefOr[Double | Null]]] = js.native
  var minimumFontScale: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var name: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var nativeID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var numberOfLines: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]
  ] = js.native
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onBlur: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
  ] = js.native
  var onFocus: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
  ] = js.native
  var onHideUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  var onLongPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.native
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.native
  var onPressIn: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.native
  var onPressOut: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.native
  var onShowUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var pressRetentionOffset: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  var raised: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var reverse: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var reverseColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var selectable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  var size: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var solid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var style: js.UndefOr[RecursivePartial[js.UndefOr[ViewStyle | TextStyle]]] = js.native
  var suppressHighlighting: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var textBreakStrategy: js.UndefOr[RecursivePartial[js.UndefOr[simple | highQuality | balanced]]] = js.native
  var touchSoundDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.native
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[IconType]]] = js.native
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  var useForeground: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
}

object RecursivePartialPartialIcAccessibilityActions {
  @scala.inline
  def apply(): RecursivePartialPartialIcAccessibilityActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialIcAccessibilityActions]
  }
  @scala.inline
  implicit class RecursivePartialPartialIcAccessibilityActionsOps[Self <: RecursivePartialPartialIcAccessibilityActions] (val x: Self) extends AnyVal {
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
    def setComponent(value: RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    @scala.inline
    def setActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    @scala.inline
    def setAdjustsFontSizeToFit(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustsFontSizeToFit: Self = this.set("adjustsFontSizeToFit", js.undefined)
    @scala.inline
    def setAllowFontScaling(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    @scala.inline
    def setBackground(value: RecursivePartial[js.UndefOr[BackgroundPropType]]): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBackgroundColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBrand(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    @scala.inline
    def setColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setDelayLongPress(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    @scala.inline
    def setDelayPressIn(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    @scala.inline
    def setDelayPressOut(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    @scala.inline
    def setEllipsizeMode(value: RecursivePartial[js.UndefOr[head | middle | tail | clip]]): Self = this.set("ellipsizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsizeMode: Self = this.set("ellipsizeMode", js.undefined)
    @scala.inline
    def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    @scala.inline
    def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setIconStyle(value: RecursivePartial[js.UndefOr[TextStyle]]): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    @scala.inline
    def setLineBreakMode(value: RecursivePartial[js.UndefOr[head | middle | tail | clip]]): Self = this.set("lineBreakMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineBreakMode: Self = this.set("lineBreakMode", js.undefined)
    @scala.inline
    def setMaxFontSizeMultiplier(value: RecursivePartial[js.UndefOr[Double | Null]]): Self = this.set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFontSizeMultiplier: Self = this.set("maxFontSizeMultiplier", js.undefined)
    @scala.inline
    def setMinimumFontScale(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("minimumFontScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFontScale: Self = this.set("minimumFontScale", js.undefined)
    @scala.inline
    def setName(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNativeID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    @scala.inline
    def setNumberOfLines(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    @scala.inline
    def setOnAccessibilityAction(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]): Self = this.set("onAccessibilityAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityTap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    @scala.inline
    def setOnBlur(
      value: RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
    ): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnFocus(
      value: RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
    ): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnHideUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onHideUnderlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = this.set("onLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    @scala.inline
    def setOnLongPress(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = this.set("onLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onMagicTap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    @scala.inline
    def setOnPress(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = this.set("onPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnPressIn(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = this.set("onPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    @scala.inline
    def setOnPressOut(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = this.set("onPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    @scala.inline
    def setOnShowUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onShowUnderlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    @scala.inline
    def setPressRetentionOffset(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    @scala.inline
    def setRaised(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    @scala.inline
    def setReverse(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setReverseColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("reverseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseColor: Self = this.set("reverseColor", js.undefined)
    @scala.inline
    def setSelectable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelectionColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    @scala.inline
    def setSize(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSolid(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("solid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolid: Self = this.set("solid", js.undefined)
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[ViewStyle | TextStyle]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuppressHighlighting(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("suppressHighlighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHighlighting: Self = this.set("suppressHighlighting", js.undefined)
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setTextBreakStrategy(value: RecursivePartial[js.UndefOr[simple | highQuality | balanced]]): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
    @scala.inline
    def setTouchSoundDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = this.set("touchSoundDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchSoundDisabled: Self = this.set("touchSoundDisabled", js.undefined)
    @scala.inline
    def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    @scala.inline
    def setType(value: RecursivePartial[js.UndefOr[IconType]]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnderlayColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
    @scala.inline
    def setUseForeground(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("useForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseForeground: Self = this.set("useForeground", js.undefined)
  }
  
}

