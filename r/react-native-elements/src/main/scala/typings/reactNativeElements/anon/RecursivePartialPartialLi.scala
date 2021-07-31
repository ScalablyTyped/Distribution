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
import typings.reactNativeElements.mod.RecursivePartial
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ListItemProps>> */
trait RecursivePartialPartialLi extends StObject {
  
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ComponentType[js.Object]]]] = js.undefined
  
  var ViewComponent: js.UndefOr[RecursivePartial[js.UndefOr[ComponentType[js.Object]]]] = js.undefined
  
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.undefined
  
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.undefined
  
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.undefined
  
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.undefined
  
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.undefined
  
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var badge: js.UndefOr[RecursivePartial[js.UndefOr[BadgeProps]]] = js.undefined
  
  var bottomDivider: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var buttonGroup: js.UndefOr[RecursivePartial[js.UndefOr[ButtonGroupProps]]] = js.undefined
  
  var checkBox: js.UndefOr[RecursivePartial[js.UndefOr[CheckBoxProps]]] = js.undefined
  
  var checkmark: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]] = js.undefined
  
  var chevron: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]] = js.undefined
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var contentContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var delayLongPress: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var delayPressIn: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var delayPressOut: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.undefined
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  
  var input: js.UndefOr[RecursivePartial[js.UndefOr[InputProps]]] = js.undefined
  
  var leftAvatar: js.UndefOr[RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]]] = js.undefined
  
  var leftElement: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.undefined
  
  var leftIcon: js.UndefOr[RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onBlur: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
  ] = js.undefined
  
  var onFocus: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
  ] = js.undefined
  
  var onHideUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  
  var onLongPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onPressIn: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onPressOut: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onShowUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var pad: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var pressRetentionOffset: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.undefined
  
  var rightAvatar: js.UndefOr[RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]]] = js.undefined
  
  var rightContentContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var rightElement: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.undefined
  
  var rightIcon: js.UndefOr[RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]] = js.undefined
  
  var rightSubtitle: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.undefined
  
  var rightSubtitleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.undefined
  
  var rightSubtitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var rightTitle: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.undefined
  
  var rightTitleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.undefined
  
  var rightTitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var scaleProps: js.UndefOr[RecursivePartial[js.UndefOr[ScaleProps]]] = js.undefined
  
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var subtitle: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.undefined
  
  var subtitleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.undefined
  
  var subtitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var switch: js.UndefOr[RecursivePartial[js.UndefOr[SwitchProperties]]] = js.undefined
  
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.undefined
  
  var titleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.undefined
  
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var topDivider: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var touchSoundDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.undefined
  
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
}
object RecursivePartialPartialLi {
  
  @scala.inline
  def apply(): RecursivePartialPartialLi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialLi]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialLiMutableBuilder[Self <: RecursivePartialPartialLi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setBadge(value: RecursivePartial[js.UndefOr[BadgeProps]]): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setBottomDivider(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "bottomDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomDividerUndefined: Self = StObject.set(x, "bottomDivider", js.undefined)
    
    @scala.inline
    def setButtonGroup(value: RecursivePartial[js.UndefOr[ButtonGroupProps]]): Self = StObject.set(x, "buttonGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonGroupUndefined: Self = StObject.set(x, "buttonGroup", js.undefined)
    
    @scala.inline
    def setCheckBox(value: RecursivePartial[js.UndefOr[CheckBoxProps]]): Self = StObject.set(x, "checkBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBoxUndefined: Self = StObject.set(x, "checkBox", js.undefined)
    
    @scala.inline
    def setCheckmark(value: RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]): Self = StObject.set(x, "checkmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckmarkUndefined: Self = StObject.set(x, "checkmark", js.undefined)
    
    @scala.inline
    def setChevron(value: RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]): Self = StObject.set(x, "chevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChevronUndefined: Self = StObject.set(x, "chevron", js.undefined)
    
    @scala.inline
    def setComponent(value: RecursivePartial[js.UndefOr[ComponentType[js.Object]]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setInput(value: RecursivePartial[js.UndefOr[InputProps]]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLeftAvatar(value: RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]]): Self = StObject.set(x, "leftAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftAvatarUndefined: Self = StObject.set(x, "leftAvatar", js.undefined)
    
    @scala.inline
    def setLeftElement(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(
      value: RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(
      value: RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]]
    ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnHideUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onHideUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPress(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressIn(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnShowUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onShowUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
    
    @scala.inline
    def setPad(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: RecursivePartial[js.UndefOr[Insets]]): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setRightAvatar(value: RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]]): Self = StObject.set(x, "rightAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightAvatarUndefined: Self = StObject.set(x, "rightAvatar", js.undefined)
    
    @scala.inline
    def setRightContentContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "rightContentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightContentContainerStyleUndefined: Self = StObject.set(x, "rightContentContainerStyle", js.undefined)
    
    @scala.inline
    def setRightElement(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    @scala.inline
    def setRightIcon(value: RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    @scala.inline
    def setRightSubtitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = StObject.set(x, "rightSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSubtitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = StObject.set(x, "rightSubtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSubtitlePropsUndefined: Self = StObject.set(x, "rightSubtitleProps", js.undefined)
    
    @scala.inline
    def setRightSubtitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "rightSubtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSubtitleStyleUndefined: Self = StObject.set(x, "rightSubtitleStyle", js.undefined)
    
    @scala.inline
    def setRightSubtitleUndefined: Self = StObject.set(x, "rightSubtitle", js.undefined)
    
    @scala.inline
    def setRightTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = StObject.set(x, "rightTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = StObject.set(x, "rightTitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTitlePropsUndefined: Self = StObject.set(x, "rightTitleProps", js.undefined)
    
    @scala.inline
    def setRightTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "rightTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTitleStyleUndefined: Self = StObject.set(x, "rightTitleStyle", js.undefined)
    
    @scala.inline
    def setRightTitleUndefined: Self = StObject.set(x, "rightTitle", js.undefined)
    
    @scala.inline
    def setScaleProps(value: RecursivePartial[js.UndefOr[ScaleProps]]): Self = StObject.set(x, "scaleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalePropsUndefined: Self = StObject.set(x, "scaleProps", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubtitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = StObject.set(x, "subtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitlePropsUndefined: Self = StObject.set(x, "subtitleProps", js.undefined)
    
    @scala.inline
    def setSubtitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setSwitch(value: RecursivePartial[js.UndefOr[SwitchProperties]]): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchUndefined: Self = StObject.set(x, "switch", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTopDivider(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "topDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopDividerUndefined: Self = StObject.set(x, "topDivider", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    @scala.inline
    def setViewComponent(value: RecursivePartial[js.UndefOr[ComponentType[js.Object]]]): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
  }
}
