package typings.reactNativeElements

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.SocialMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.SocialIconProps> */
trait PartialSocialIconProps extends js.Object {
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  var button: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var iconSize: js.UndefOr[Double] = js.undefined
  var iconStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var light: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var raised: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[SocialMediaType] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object PartialSocialIconProps {
  @scala.inline
  def apply(
    Component: ComponentClass[js.Object, ComponentState] = null,
    button: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontStyle: StyleProp[TextStyle] = null,
    fontWeight: String = null,
    iconColor: String = null,
    iconSize: Int | Double = null,
    iconStyle: StyleProp[ViewStyle] = null,
    light: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    raised: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    title: String = null,
    `type`: SocialMediaType = null,
    underlayColor: String = null
  ): PartialSocialIconProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSocialIconProps]
  }
}

