package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialIconProps extends js.Object {
  /**
    * Component Type of button
    *
    * @default TouchableHighlight
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  /**
    * Creates button
    *
    * @default false
    */
  var button: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable button
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify different font family
    *
    * @default System font bold (iOS), Sans Serif Black (android)
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * Specify text styling
    */
  var fontStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Specify font weight of title if set as a button with a title
    *
    * @default bold (ios), black(android)
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
    * Icon color
    */
  var iconColor: js.UndefOr[String] = js.undefined
  /**
    * Icon size
    *
    * @default 24
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  /**
    * Extra styling for icon component
    */
  var iconStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Reverses icon color scheme, setting background to white and icon to primary color
    *
    * @default false
    */
  var light: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows loading indicator
    *
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  /**
    * @default none	function	onLongPress method
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * onPress method
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Adds a drop shadow, set to false to remove
    *
    * @default true
    */
  var raised: js.UndefOr[Boolean] = js.undefined
  /**
    * Button styling
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Title if made into a button
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Social media type
    */
  var `type`: SocialMediaType
  /**
    * Specify underlayColor for TouchableHighlight
    *
    * @default 'white' if `light` prop is true, otherwise defaults to icon color.
    */
  var underlayColor: js.UndefOr[String] = js.undefined
}

object SocialIconProps {
  @scala.inline
  def apply(
    `type`: SocialMediaType,
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
    underlayColor: String = null
  ): SocialIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialIconProps]
  }
}

