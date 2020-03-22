package typings.reactNativeElements

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.mod.SocialMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.SocialIconProps>> */
trait RecursivePartialPartialSo extends js.Object {
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]] = js.undefined
  var button: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var fontFamily: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var fontStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var fontWeight: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var iconColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var iconSize: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var iconStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var light: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var loading: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var onLongPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var raised: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[SocialMediaType]]] = js.undefined
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
}

object RecursivePartialPartialSo {
  @scala.inline
  def apply(
    Component: RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]] = null,
    button: RecursivePartial[js.UndefOr[Boolean]] = null,
    disabled: RecursivePartial[js.UndefOr[Boolean]] = null,
    fontFamily: RecursivePartial[js.UndefOr[String]] = null,
    fontStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    fontWeight: RecursivePartial[js.UndefOr[String]] = null,
    iconColor: RecursivePartial[js.UndefOr[String]] = null,
    iconSize: RecursivePartial[js.UndefOr[Double]] = null,
    iconStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    light: RecursivePartial[js.UndefOr[Boolean]] = null,
    loading: RecursivePartial[js.UndefOr[Boolean]] = null,
    onLongPress: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onPress: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    raised: RecursivePartial[js.UndefOr[Boolean]] = null,
    style: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    title: RecursivePartial[js.UndefOr[String]] = null,
    `type`: RecursivePartial[js.UndefOr[SocialMediaType]] = null,
    underlayColor: RecursivePartial[js.UndefOr[String]] = null
  ): RecursivePartialPartialSo = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(onPress.asInstanceOf[js.Any])
    if (raised != null) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialSo]
  }
}

