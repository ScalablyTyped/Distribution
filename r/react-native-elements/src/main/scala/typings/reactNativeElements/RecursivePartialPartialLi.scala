package typings.reactNativeElements

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ListItemProps>> */
trait RecursivePartialPartialLi extends js.Object {
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
  var accessibilityStates: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]]] = js.undefined
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.undefined
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
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
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
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.undefined
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
}

object RecursivePartialPartialLi {
  @scala.inline
  def apply(
    Component: RecursivePartial[js.UndefOr[ComponentType[js.Object]]] = null,
    ViewComponent: RecursivePartial[js.UndefOr[ComponentType[js.Object]]] = null,
    accessibilityActions: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]] = null,
    accessibilityComponentType: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]] = null,
    accessibilityElementsHidden: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessibilityHint: RecursivePartial[js.UndefOr[String]] = null,
    accessibilityIgnoresInvertColors: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessibilityLabel: RecursivePartial[js.UndefOr[String]] = null,
    accessibilityLiveRegion: RecursivePartial[js.UndefOr[none | polite | assertive]] = null,
    accessibilityRole: RecursivePartial[js.UndefOr[AccessibilityRole]] = null,
    accessibilityState: RecursivePartial[js.UndefOr[AccessibilityState]] = null,
    accessibilityStates: RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]] = null,
    accessibilityTraits: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]] = null,
    accessibilityViewIsModal: RecursivePartial[js.UndefOr[Boolean]] = null,
    accessible: RecursivePartial[js.UndefOr[Boolean]] = null,
    activeOpacity: RecursivePartial[js.UndefOr[Double]] = null,
    badge: RecursivePartial[js.UndefOr[BadgeProps]] = null,
    bottomDivider: RecursivePartial[js.UndefOr[Boolean]] = null,
    buttonGroup: RecursivePartial[js.UndefOr[ButtonGroupProps]] = null,
    checkBox: RecursivePartial[js.UndefOr[CheckBoxProps]] = null,
    checkmark: RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]] = null,
    chevron: RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    contentContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    delayLongPress: RecursivePartial[js.UndefOr[Double]] = null,
    delayPressIn: RecursivePartial[js.UndefOr[Double]] = null,
    delayPressOut: RecursivePartial[js.UndefOr[Double]] = null,
    disabled: RecursivePartial[js.UndefOr[Boolean]] = null,
    disabledStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    hasTVPreferredFocus: RecursivePartial[js.UndefOr[Boolean]] = null,
    hitSlop: RecursivePartial[js.UndefOr[Insets]] = null,
    importantForAccessibility: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]] = null,
    input: RecursivePartial[js.UndefOr[InputProps]] = null,
    leftAvatar: RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]] = null,
    leftElement: RecursivePartial[js.UndefOr[ReactElement]] = null,
    leftIcon: RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]] = null,
    onAccessibilityAction: RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]] = null,
    onAccessibilityTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onBlur: RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]] = null,
    onFocus: RecursivePartial[js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]]] = null,
    onHideUnderlay: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onLayout: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]] = null,
    onLongPress: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onMagicTap: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onPress: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onPressIn: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onPressOut: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onShowUnderlay: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    pad: RecursivePartial[js.UndefOr[Double]] = null,
    pressRetentionOffset: RecursivePartial[js.UndefOr[Insets]] = null,
    rightAvatar: RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]] = null,
    rightContentContainerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    rightElement: RecursivePartial[js.UndefOr[ReactElement]] = null,
    rightIcon: RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]] = null,
    rightSubtitle: RecursivePartial[js.UndefOr[String | ReactElement]] = null,
    rightSubtitleProps: RecursivePartial[js.UndefOr[TextProperties]] = null,
    rightSubtitleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    rightTitle: RecursivePartial[js.UndefOr[String | ReactElement]] = null,
    rightTitleProps: RecursivePartial[js.UndefOr[TextProperties]] = null,
    rightTitleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    scaleProps: RecursivePartial[js.UndefOr[ScaleProps]] = null,
    style: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    subtitle: RecursivePartial[js.UndefOr[String | ReactElement]] = null,
    subtitleProps: RecursivePartial[js.UndefOr[TextProperties]] = null,
    subtitleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    switch: RecursivePartial[js.UndefOr[SwitchProperties]] = null,
    testID: RecursivePartial[js.UndefOr[String]] = null,
    title: RecursivePartial[js.UndefOr[String | ReactElement]] = null,
    titleProps: RecursivePartial[js.UndefOr[TextProperties]] = null,
    titleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    topDivider: RecursivePartial[js.UndefOr[Boolean]] = null,
    tvParallaxProperties: RecursivePartial[js.UndefOr[TVParallaxProperties]] = null,
    underlayColor: RecursivePartial[js.UndefOr[String]] = null
  ): RecursivePartialPartialLi = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (ViewComponent != null) __obj.updateDynamic("ViewComponent")(ViewComponent.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (accessibilityElementsHidden != null) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (accessibilityIgnoresInvertColors != null) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityViewIsModal != null) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (accessible != null) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (bottomDivider != null) __obj.updateDynamic("bottomDivider")(bottomDivider.asInstanceOf[js.Any])
    if (buttonGroup != null) __obj.updateDynamic("buttonGroup")(buttonGroup.asInstanceOf[js.Any])
    if (checkBox != null) __obj.updateDynamic("checkBox")(checkBox.asInstanceOf[js.Any])
    if (checkmark != null) __obj.updateDynamic("checkmark")(checkmark.asInstanceOf[js.Any])
    if (chevron != null) __obj.updateDynamic("chevron")(chevron.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (hasTVPreferredFocus != null) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onHideUnderlay != null) __obj.updateDynamic("onHideUnderlay")(onHideUnderlay.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress.asInstanceOf[js.Any])
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(onPress.asInstanceOf[js.Any])
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(onPressIn.asInstanceOf[js.Any])
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(onPressOut.asInstanceOf[js.Any])
    if (onShowUnderlay != null) __obj.updateDynamic("onShowUnderlay")(onShowUnderlay.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (rightAvatar != null) __obj.updateDynamic("rightAvatar")(rightAvatar.asInstanceOf[js.Any])
    if (rightContentContainerStyle != null) __obj.updateDynamic("rightContentContainerStyle")(rightContentContainerStyle.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (rightSubtitle != null) __obj.updateDynamic("rightSubtitle")(rightSubtitle.asInstanceOf[js.Any])
    if (rightSubtitleProps != null) __obj.updateDynamic("rightSubtitleProps")(rightSubtitleProps.asInstanceOf[js.Any])
    if (rightSubtitleStyle != null) __obj.updateDynamic("rightSubtitleStyle")(rightSubtitleStyle.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    if (rightTitleProps != null) __obj.updateDynamic("rightTitleProps")(rightTitleProps.asInstanceOf[js.Any])
    if (rightTitleStyle != null) __obj.updateDynamic("rightTitleStyle")(rightTitleStyle.asInstanceOf[js.Any])
    if (scaleProps != null) __obj.updateDynamic("scaleProps")(scaleProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleProps != null) __obj.updateDynamic("subtitleProps")(subtitleProps.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (switch != null) __obj.updateDynamic("switch")(switch.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (topDivider != null) __obj.updateDynamic("topDivider")(topDivider.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialLi]
  }
}

