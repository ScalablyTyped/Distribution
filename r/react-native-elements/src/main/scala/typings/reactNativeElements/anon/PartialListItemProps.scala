package typings.reactNativeElements.anon

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.SwitchProperties
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.BadgeProps
import typings.reactNativeElements.mod.ButtonGroupProps
import typings.reactNativeElements.mod.CheckBoxProps
import typings.reactNativeElements.mod.InputProps
import typings.reactNativeElements.mod.ScaleProps
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.button
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typings.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.ListItemProps> */
@js.native
trait PartialListItemProps extends js.Object {
  
  var Component: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var ViewComponent: js.UndefOr[ComponentType[js.Object]] = js.native
  
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
  
  var badge: js.UndefOr[BadgeProps] = js.native
  
  var bottomDivider: js.UndefOr[Boolean] = js.native
  
  var buttonGroup: js.UndefOr[ButtonGroupProps] = js.native
  
  var checkBox: js.UndefOr[CheckBoxProps] = js.native
  
  var checkmark: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.native
  
  var chevron: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var delayLongPress: js.UndefOr[Double] = js.native
  
  var delayPressIn: js.UndefOr[Double] = js.native
  
  var delayPressOut: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean | Null] = js.native
  
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  var hitSlop: js.UndefOr[Insets] = js.native
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  
  var input: js.UndefOr[InputProps] = js.native
  
  var leftAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.native
  
  var leftElement: js.UndefOr[ReactElement] = js.native
  
  var leftIcon: js.UndefOr[PartialIconProps | ReactElement] = js.native
  
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
  
  var pad: js.UndefOr[Double] = js.native
  
  var pressRetentionOffset: js.UndefOr[Insets] = js.native
  
  var rightAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.native
  
  var rightContentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var rightElement: js.UndefOr[ReactElement] = js.native
  
  var rightIcon: js.UndefOr[PartialIconProps | ReactElement] = js.native
  
  var rightSubtitle: js.UndefOr[String | ReactElement] = js.native
  
  var rightSubtitleProps: js.UndefOr[TextProperties] = js.native
  
  var rightSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var rightTitle: js.UndefOr[String | ReactElement] = js.native
  
  var rightTitleProps: js.UndefOr[TextProperties] = js.native
  
  var rightTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var scaleProps: js.UndefOr[ScaleProps] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var subtitle: js.UndefOr[String | ReactElement] = js.native
  
  var subtitleProps: js.UndefOr[TextProperties] = js.native
  
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var switch: js.UndefOr[SwitchProperties] = js.native
  
  var testID: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String | ReactElement] = js.native
  
  var titleProps: js.UndefOr[TextProperties] = js.native
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var topDivider: js.UndefOr[Boolean] = js.native
  
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  
  var underlayColor: js.UndefOr[ColorValue] = js.native
}
object PartialListItemProps {
  
  @scala.inline
  def apply(): PartialListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemProps]
  }
  
  @scala.inline
  implicit class PartialListItemPropsOps[Self <: PartialListItemProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ComponentType[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setViewComponent(value: ComponentType[js.Object]): Self = this.set("ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewComponent: Self = this.set("ViewComponent", js.undefined)
    
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
    def setBadge(value: BadgeProps): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setBottomDivider(value: Boolean): Self = this.set("bottomDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomDivider: Self = this.set("bottomDivider", js.undefined)
    
    @scala.inline
    def setButtonGroup(value: ButtonGroupProps): Self = this.set("buttonGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonGroup: Self = this.set("buttonGroup", js.undefined)
    
    @scala.inline
    def setCheckBox(value: CheckBoxProps): Self = this.set("checkBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBox: Self = this.set("checkBox", js.undefined)
    
    @scala.inline
    def setCheckmark(value: Boolean | PartialIconProps | ReactElement): Self = this.set("checkmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckmark: Self = this.set("checkmark", js.undefined)
    
    @scala.inline
    def setChevron(value: Boolean | PartialIconProps | ReactElement): Self = this.set("chevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChevron: Self = this.set("chevron", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    
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
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setInput(value: InputProps): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLeftAvatar(value: PartialAvatarProps | ReactElement): Self = this.set("leftAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAvatar: Self = this.set("leftAvatar", js.undefined)
    
    @scala.inline
    def setLeftElement(value: ReactElement): Self = this.set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElement: Self = this.set("leftElement", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: PartialIconProps | ReactElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    
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
    def setPad(value: Double): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setRightAvatar(value: PartialAvatarProps | ReactElement): Self = this.set("rightAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAvatar: Self = this.set("rightAvatar", js.undefined)
    
    @scala.inline
    def setRightContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("rightContentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightContentContainerStyle: Self = this.set("rightContentContainerStyle", js.undefined)
    
    @scala.inline
    def setRightContentContainerStyleNull: Self = this.set("rightContentContainerStyle", null)
    
    @scala.inline
    def setRightElement(value: ReactElement): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setRightIcon(value: PartialIconProps | ReactElement): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    
    @scala.inline
    def setRightSubtitle(value: String | ReactElement): Self = this.set("rightSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitle: Self = this.set("rightSubtitle", js.undefined)
    
    @scala.inline
    def setRightSubtitleProps(value: TextProperties): Self = this.set("rightSubtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitleProps: Self = this.set("rightSubtitleProps", js.undefined)
    
    @scala.inline
    def setRightSubtitleStyle(value: StyleProp[TextStyle]): Self = this.set("rightSubtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitleStyle: Self = this.set("rightSubtitleStyle", js.undefined)
    
    @scala.inline
    def setRightSubtitleStyleNull: Self = this.set("rightSubtitleStyle", null)
    
    @scala.inline
    def setRightTitle(value: String | ReactElement): Self = this.set("rightTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitle: Self = this.set("rightTitle", js.undefined)
    
    @scala.inline
    def setRightTitleProps(value: TextProperties): Self = this.set("rightTitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitleProps: Self = this.set("rightTitleProps", js.undefined)
    
    @scala.inline
    def setRightTitleStyle(value: StyleProp[TextStyle]): Self = this.set("rightTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitleStyle: Self = this.set("rightTitleStyle", js.undefined)
    
    @scala.inline
    def setRightTitleStyleNull: Self = this.set("rightTitleStyle", null)
    
    @scala.inline
    def setScaleProps(value: ScaleProps): Self = this.set("scaleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleProps: Self = this.set("scaleProps", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSubtitle(value: String | ReactElement): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setSubtitleProps(value: TextProperties): Self = this.set("subtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleProps: Self = this.set("subtitleProps", js.undefined)
    
    @scala.inline
    def setSubtitleStyle(value: StyleProp[TextStyle]): Self = this.set("subtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleStyle: Self = this.set("subtitleStyle", js.undefined)
    
    @scala.inline
    def setSubtitleStyleNull: Self = this.set("subtitleStyle", null)
    
    @scala.inline
    def setSwitch(value: SwitchProperties): Self = this.set("switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitch: Self = this.set("switch", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleProps(value: TextProperties): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    
    @scala.inline
    def setTopDivider(value: Boolean): Self = this.set("topDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopDivider: Self = this.set("topDivider", js.undefined)
    
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
    def setUnderlayColor(value: ColorValue): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
}
