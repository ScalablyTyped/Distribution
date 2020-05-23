package typings.reactNativeElements.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
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
import typings.reactNative.mod.TouchableHighlightProps
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.yes
import typings.reactNativeElements.anon.PartialAvatarProps
import typings.reactNativeElements.anon.PartialIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends TouchableHighlightProps {
  var Component: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var ViewComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var badge: js.UndefOr[BadgeProps] = js.undefined
  var bottomDivider: js.UndefOr[Boolean] = js.undefined
  var buttonGroup: js.UndefOr[ButtonGroupProps] = js.undefined
  var checkBox: js.UndefOr[CheckBoxProps] = js.undefined
  var checkmark: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.undefined
  var chevron: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var input: js.UndefOr[InputProps] = js.undefined
  var leftAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.undefined
  var leftElement: js.UndefOr[ReactElement] = js.undefined
  var leftIcon: js.UndefOr[PartialIconProps | ReactElement] = js.undefined
  var pad: js.UndefOr[Double] = js.undefined
  var rightAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.undefined
  var rightContentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var rightElement: js.UndefOr[ReactElement] = js.undefined
  var rightIcon: js.UndefOr[PartialIconProps | ReactElement] = js.undefined
  var rightSubtitle: js.UndefOr[String | ReactElement] = js.undefined
  var rightSubtitleProps: js.UndefOr[TextProperties] = js.undefined
  var rightSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var rightTitle: js.UndefOr[String | ReactElement] = js.undefined
  var rightTitleProps: js.UndefOr[TextProperties] = js.undefined
  var rightTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var scaleProps: js.UndefOr[ScaleProps] = js.undefined
  var subtitle: js.UndefOr[String | ReactElement] = js.undefined
  var subtitleProps: js.UndefOr[TextProperties] = js.undefined
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var switch: js.UndefOr[SwitchProperties] = js.undefined
  var title: js.UndefOr[String | ReactElement] = js.undefined
  var titleProps: js.UndefOr[TextProperties] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var topDivider: js.UndefOr[Boolean] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    Component: ComponentType[js.Object] = null,
    ViewComponent: ComponentType[js.Object] = null,
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
    activeOpacity: js.UndefOr[Double] = js.undefined,
    badge: BadgeProps = null,
    bottomDivider: js.UndefOr[Boolean] = js.undefined,
    buttonGroup: ButtonGroupProps = null,
    checkBox: CheckBoxProps = null,
    checkmark: Boolean | PartialIconProps | ReactElement = null,
    chevron: Boolean | PartialIconProps | ReactElement = null,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    contentContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    delayLongPress: js.UndefOr[Double] = js.undefined,
    delayPressIn: js.UndefOr[Double] = js.undefined,
    delayPressOut: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    input: InputProps = null,
    leftAvatar: PartialAvatarProps | ReactElement = null,
    leftElement: ReactElement = null,
    leftIcon: PartialIconProps | ReactElement = null,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onBlur: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit = null,
    onFocus: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit = null,
    onHideUnderlay: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    onPressIn: /* event */ GestureResponderEvent => Unit = null,
    onPressOut: /* event */ GestureResponderEvent => Unit = null,
    onShowUnderlay: () => Unit = null,
    pad: js.UndefOr[Double] = js.undefined,
    pressRetentionOffset: Insets = null,
    rightAvatar: PartialAvatarProps | ReactElement = null,
    rightContentContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    rightElement: ReactElement = null,
    rightIcon: PartialIconProps | ReactElement = null,
    rightSubtitle: String | ReactElement = null,
    rightSubtitleProps: TextProperties = null,
    rightSubtitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    rightTitle: String | ReactElement = null,
    rightTitleProps: TextProperties = null,
    rightTitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    scaleProps: ScaleProps = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    subtitle: String | ReactElement = null,
    subtitleProps: TextProperties = null,
    subtitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    switch: SwitchProperties = null,
    testID: String = null,
    title: String | ReactElement = null,
    titleProps: TextProperties = null,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    topDivider: js.UndefOr[Boolean] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null,
    underlayColor: String = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (ViewComponent != null) __obj.updateDynamic("ViewComponent")(ViewComponent.asInstanceOf[js.Any])
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
    if (!js.isUndefined(activeOpacity)) __obj.updateDynamic("activeOpacity")(activeOpacity.get.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomDivider)) __obj.updateDynamic("bottomDivider")(bottomDivider.get.asInstanceOf[js.Any])
    if (buttonGroup != null) __obj.updateDynamic("buttonGroup")(buttonGroup.asInstanceOf[js.Any])
    if (checkBox != null) __obj.updateDynamic("checkBox")(checkBox.asInstanceOf[js.Any])
    if (checkmark != null) __obj.updateDynamic("checkmark")(checkmark.asInstanceOf[js.Any])
    if (chevron != null) __obj.updateDynamic("chevron")(chevron.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(contentContainerStyle)) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(delayLongPress)) __obj.updateDynamic("delayLongPress")(delayLongPress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayPressIn)) __obj.updateDynamic("delayPressIn")(delayPressIn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayPressOut)) __obj.updateDynamic("delayPressOut")(delayPressOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledStyle)) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onHideUnderlay != null) __obj.updateDynamic("onHideUnderlay")(js.Any.fromFunction0(onHideUnderlay))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    if (onShowUnderlay != null) __obj.updateDynamic("onShowUnderlay")(js.Any.fromFunction0(onShowUnderlay))
    if (!js.isUndefined(pad)) __obj.updateDynamic("pad")(pad.get.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset.asInstanceOf[js.Any])
    if (rightAvatar != null) __obj.updateDynamic("rightAvatar")(rightAvatar.asInstanceOf[js.Any])
    if (!js.isUndefined(rightContentContainerStyle)) __obj.updateDynamic("rightContentContainerStyle")(rightContentContainerStyle.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (rightSubtitle != null) __obj.updateDynamic("rightSubtitle")(rightSubtitle.asInstanceOf[js.Any])
    if (rightSubtitleProps != null) __obj.updateDynamic("rightSubtitleProps")(rightSubtitleProps.asInstanceOf[js.Any])
    if (!js.isUndefined(rightSubtitleStyle)) __obj.updateDynamic("rightSubtitleStyle")(rightSubtitleStyle.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    if (rightTitleProps != null) __obj.updateDynamic("rightTitleProps")(rightTitleProps.asInstanceOf[js.Any])
    if (!js.isUndefined(rightTitleStyle)) __obj.updateDynamic("rightTitleStyle")(rightTitleStyle.asInstanceOf[js.Any])
    if (scaleProps != null) __obj.updateDynamic("scaleProps")(scaleProps.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleProps != null) __obj.updateDynamic("subtitleProps")(subtitleProps.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitleStyle)) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (switch != null) __obj.updateDynamic("switch")(switch.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(topDivider)) __obj.updateDynamic("topDivider")(topDivider.get.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

