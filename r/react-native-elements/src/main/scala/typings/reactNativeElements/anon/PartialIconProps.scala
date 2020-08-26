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

/* Inlined std.Partial<react-native-elements.react-native-elements.IconProps> */
@js.native
trait PartialIconProps extends js.Object {
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
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
  var activeOpacity: js.UndefOr[Double] = js.native
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.native
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[BackgroundPropType] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var brand: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var delayLongPress: js.UndefOr[Double] = js.native
  var delayPressIn: js.UndefOr[Double] = js.native
  var delayPressOut: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean | Null] = js.native
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[Insets] = js.native
  var iconStyle: js.UndefOr[TextStyle] = js.native
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.native
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
  var minimumFontScale: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var nativeID: js.UndefOr[String] = js.native
  var numberOfLines: js.UndefOr[Double] = js.native
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.native
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.native
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  var pressRetentionOffset: js.UndefOr[Insets] = js.native
  var raised: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var reverseColor: js.UndefOr[String] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selectionColor: js.UndefOr[ColorValue] = js.native
  var size: js.UndefOr[Double] = js.native
  var solid: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[ViewStyle | TextStyle] = js.native
  var suppressHighlighting: js.UndefOr[Boolean] = js.native
  var testID: js.UndefOr[String] = js.native
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  var `type`: js.UndefOr[IconType] = js.native
  var underlayColor: js.UndefOr[ColorValue] = js.native
  var useForeground: js.UndefOr[Boolean] = js.native
}

object PartialIconProps {
  @scala.inline
  def apply(): PartialIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIconProps]
  }
  @scala.inline
  implicit class PartialIconPropsOps[Self <: PartialIconProps] (val x: Self) extends AnyVal {
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
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    @scala.inline
    def setAdjustsFontSizeToFit(value: Boolean): Self = this.set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustsFontSizeToFit: Self = this.set("adjustsFontSizeToFit", js.undefined)
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    @scala.inline
    def setBackground(value: BackgroundPropType): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBrand(value: Boolean): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
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
    def setDisabledNull: Self = this.set("disabled", null)
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    @scala.inline
    def setDisabledStyleNull: Self = this.set("disabledStyle", null)
    @scala.inline
    def setEllipsizeMode(value: head | middle | tail | clip): Self = this.set("ellipsizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsizeMode: Self = this.set("ellipsizeMode", js.undefined)
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    @scala.inline
    def setIconStyle(value: TextStyle): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    @scala.inline
    def setLineBreakMode(value: head | middle | tail | clip): Self = this.set("lineBreakMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineBreakMode: Self = this.set("lineBreakMode", js.undefined)
    @scala.inline
    def setMaxFontSizeMultiplier(value: Double): Self = this.set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFontSizeMultiplier: Self = this.set("maxFontSizeMultiplier", js.undefined)
    @scala.inline
    def setMaxFontSizeMultiplierNull: Self = this.set("maxFontSizeMultiplier", null)
    @scala.inline
    def setMinimumFontScale(value: Double): Self = this.set("minimumFontScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFontScale: Self = this.set("minimumFontScale", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    @scala.inline
    def setNumberOfLines(value: Double): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
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
    def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnHideUnderlay(value: () => Unit): Self = this.set("onHideUnderlay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
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
    def setOnShowUnderlay(value: () => Unit): Self = this.set("onShowUnderlay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setReverseColor(value: String): Self = this.set("reverseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseColor: Self = this.set("reverseColor", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSolid(value: Boolean): Self = this.set("solid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolid: Self = this.set("solid", js.undefined)
    @scala.inline
    def setStyle(value: ViewStyle | TextStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuppressHighlighting(value: Boolean): Self = this.set("suppressHighlighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHighlighting: Self = this.set("suppressHighlighting", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
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
    def setType(value: IconType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnderlayColor(value: ColorValue): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
    @scala.inline
    def setUseForeground(value: Boolean): Self = this.set("useForeground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseForeground: Self = this.set("useForeground", js.undefined)
  }
  
}

