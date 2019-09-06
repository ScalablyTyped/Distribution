package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.AccessibilityRole
import typings.reactDashNative.reactDashNativeMod.AccessibilityState
import typings.reactDashNative.reactDashNativeMod.AccessibilityStates
import typings.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typings.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typings.reactDashNative.reactDashNativeMod.Insets
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typings.reactDashNative.reactDashNativeMod.TargetedEvent
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.TouchableHighlightProps
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typings.reactDashNative.reactDashNativeStrings.assertive
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.button
import typings.reactDashNative.reactDashNativeStrings.no
import typings.reactDashNative.reactDashNativeStrings.none
import typings.reactDashNative.reactDashNativeStrings.polite
import typings.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typings.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typings.reactDashNative.reactDashNativeStrings.yes
import typings.std.Partial
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
  var checkmark: js.UndefOr[Boolean | Partial[IconProps] | ReactElement] = js.undefined
  var chevron: js.UndefOr[Boolean | Partial[IconProps] | ReactElement] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var input: js.UndefOr[InputProps] = js.undefined
  var leftAvatar: js.UndefOr[Partial[AvatarProps] | ReactElement] = js.undefined
  var leftElement: js.UndefOr[ReactElement] = js.undefined
  var leftIcon: js.UndefOr[Partial[IconProps] | ReactElement] = js.undefined
  var pad: js.UndefOr[Double] = js.undefined
  var rightAvatar: js.UndefOr[Partial[AvatarProps] | ReactElement] = js.undefined
  var rightContentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var rightElement: js.UndefOr[ReactElement] = js.undefined
  var rightIcon: js.UndefOr[Partial[IconProps] | ReactElement] = js.undefined
  var rightSubtitle: js.UndefOr[String | ReactElement] = js.undefined
  var rightSubtitleProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  var rightSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var rightTitle: js.UndefOr[String | ReactElement] = js.undefined
  var rightTitleProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  var rightTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var scaleProps: js.UndefOr[ScaleProps] = js.undefined
  var subtitle: js.UndefOr[String | ReactElement] = js.undefined
  var subtitleProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var switch: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SwitchProperties */ js.Any
  ] = js.undefined
  var title: js.UndefOr[String | ReactElement] = js.undefined
  var titleProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var topDivider: js.UndefOr[Boolean] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    Component: ComponentType[js.Object] = null,
    ViewComponent: ComponentType[js.Object] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessible: js.UndefOr[Boolean] = js.undefined,
    activeOpacity: Int | Double = null,
    badge: BadgeProps = null,
    bottomDivider: js.UndefOr[Boolean] = js.undefined,
    buttonGroup: ButtonGroupProps = null,
    checkBox: CheckBoxProps = null,
    checkmark: Boolean | Partial[IconProps] | ReactElement = null,
    chevron: Boolean | Partial[IconProps] | ReactElement = null,
    containerStyle: StyleProp[ViewStyle] = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: StyleProp[ViewStyle] = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    input: InputProps = null,
    leftAvatar: Partial[AvatarProps] | ReactElement = null,
    leftElement: ReactElement = null,
    leftIcon: Partial[IconProps] | ReactElement = null,
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
    pad: Int | Double = null,
    pressRetentionOffset: Insets = null,
    rightAvatar: Partial[AvatarProps] | ReactElement = null,
    rightContentContainerStyle: StyleProp[ViewStyle] = null,
    rightElement: ReactElement = null,
    rightIcon: Partial[IconProps] | ReactElement = null,
    rightSubtitle: String | ReactElement = null,
    rightSubtitleProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null,
    rightSubtitleStyle: StyleProp[TextStyle] = null,
    rightTitle: String | ReactElement = null,
    rightTitleProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null,
    rightTitleStyle: StyleProp[TextStyle] = null,
    scaleProps: ScaleProps = null,
    style: StyleProp[ViewStyle] = null,
    subtitle: String | ReactElement = null,
    subtitleProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null,
    subtitleStyle: StyleProp[TextStyle] = null,
    switch: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SwitchProperties */ js.Any = null,
    testID: String = null,
    title: String | ReactElement = null,
    titleProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null,
    titleStyle: StyleProp[TextStyle] = null,
    topDivider: js.UndefOr[Boolean] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null,
    underlayColor: String = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (ViewComponent != null) __obj.updateDynamic("ViewComponent")(ViewComponent.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (!js.isUndefined(bottomDivider)) __obj.updateDynamic("bottomDivider")(bottomDivider)
    if (buttonGroup != null) __obj.updateDynamic("buttonGroup")(buttonGroup)
    if (checkBox != null) __obj.updateDynamic("checkBox")(checkBox)
    if (checkmark != null) __obj.updateDynamic("checkmark")(checkmark.asInstanceOf[js.Any])
    if (chevron != null) __obj.updateDynamic("chevron")(chevron.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input)
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
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
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset)
    if (rightAvatar != null) __obj.updateDynamic("rightAvatar")(rightAvatar.asInstanceOf[js.Any])
    if (rightContentContainerStyle != null) __obj.updateDynamic("rightContentContainerStyle")(rightContentContainerStyle.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (rightSubtitle != null) __obj.updateDynamic("rightSubtitle")(rightSubtitle.asInstanceOf[js.Any])
    if (rightSubtitleProps != null) __obj.updateDynamic("rightSubtitleProps")(rightSubtitleProps)
    if (rightSubtitleStyle != null) __obj.updateDynamic("rightSubtitleStyle")(rightSubtitleStyle.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    if (rightTitleProps != null) __obj.updateDynamic("rightTitleProps")(rightTitleProps)
    if (rightTitleStyle != null) __obj.updateDynamic("rightTitleStyle")(rightTitleStyle.asInstanceOf[js.Any])
    if (scaleProps != null) __obj.updateDynamic("scaleProps")(scaleProps)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleProps != null) __obj.updateDynamic("subtitleProps")(subtitleProps)
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (switch != null) __obj.updateDynamic("switch")(switch)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(topDivider)) __obj.updateDynamic("topDivider")(topDivider)
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[ListItemProps]
  }
}

