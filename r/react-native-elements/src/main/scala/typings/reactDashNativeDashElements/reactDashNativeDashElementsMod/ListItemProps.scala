package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends js.Object {
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
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var input: js.UndefOr[InputProps] = js.undefined
  var leftAvatar: js.UndefOr[Partial[AvatarProps] | ReactElement] = js.undefined
  var leftElement: js.UndefOr[ReactElement] = js.undefined
  var leftIcon: js.UndefOr[Partial[IconProps] | ReactElement] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
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
    badge: BadgeProps = null,
    bottomDivider: js.UndefOr[Boolean] = js.undefined,
    buttonGroup: ButtonGroupProps = null,
    checkBox: CheckBoxProps = null,
    checkmark: Boolean | Partial[IconProps] | ReactElement = null,
    chevron: Boolean | Partial[IconProps] | ReactElement = null,
    containerStyle: StyleProp[ViewStyle] = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: StyleProp[ViewStyle] = null,
    input: InputProps = null,
    leftAvatar: Partial[AvatarProps] | ReactElement = null,
    leftElement: ReactElement = null,
    leftIcon: Partial[IconProps] | ReactElement = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    pad: Int | Double = null,
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
    subtitle: String | ReactElement = null,
    subtitleProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null,
    subtitleStyle: StyleProp[TextStyle] = null,
    switch: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SwitchProperties */ js.Any = null,
    title: String | ReactElement = null,
    titleProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any = null,
    titleStyle: StyleProp[TextStyle] = null,
    topDivider: js.UndefOr[Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (ViewComponent != null) __obj.updateDynamic("ViewComponent")(ViewComponent.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (!js.isUndefined(bottomDivider)) __obj.updateDynamic("bottomDivider")(bottomDivider)
    if (buttonGroup != null) __obj.updateDynamic("buttonGroup")(buttonGroup)
    if (checkBox != null) __obj.updateDynamic("checkBox")(checkBox)
    if (checkmark != null) __obj.updateDynamic("checkmark")(checkmark.asInstanceOf[js.Any])
    if (chevron != null) __obj.updateDynamic("chevron")(chevron.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input)
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
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
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleProps != null) __obj.updateDynamic("subtitleProps")(subtitleProps)
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (switch != null) __obj.updateDynamic("switch")(switch)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(topDivider)) __obj.updateDynamic("topDivider")(topDivider)
    __obj.asInstanceOf[ListItemProps]
  }
}

