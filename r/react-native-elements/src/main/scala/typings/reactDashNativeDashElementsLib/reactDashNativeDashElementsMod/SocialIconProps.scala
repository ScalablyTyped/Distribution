package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialIconProps extends js.Object {
  /**
    * Component Type of button
    *
    * @default TouchableHighlight
    */
  var Component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Creates button
    *
    * @default false
    */
  var button: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable button
    *
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify different font family
    *
    * @default System font bold (iOS), Sans Serif Black (android)
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify text styling
    */
  var fontStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Specify font weight of title if set as a button with a title
    *
    * @default bold (ios), black(android)
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Icon color
    */
  var iconColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Icon size
    *
    * @default 24
    */
  var iconSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Extra styling for icon component
    */
  var iconStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Reverses icon color scheme, setting background to white and icon to primary color
    *
    * @default false
    */
  var light: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows loading indicator
    *
    * @default false
    */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default none	function	onLongPress method
    */
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * onPress method
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Adds a drop shadow, set to false to remove
    *
    * @default true
    */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Button styling
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Title if made into a button
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Social media type
    */
  var `type`: SocialMediaType
  /**
    * Specify underlayColor for TouchableHighlight
    *
    * @default 'white' if `light` prop is true, otherwise defaults to icon color.
    */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
}

object SocialIconProps {
  @scala.inline
  def apply(
    `type`: SocialMediaType,
    Component: reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = null,
    button: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: java.lang.String = null,
    fontStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    fontWeight: java.lang.String = null,
    iconColor: java.lang.String = null,
    iconSize: scala.Int | scala.Double = null,
    iconStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    light: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onLongPress: js.Function0[scala.Unit] = null,
    onPress: js.Function0[scala.Unit] = null,
    raised: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    title: java.lang.String = null,
    underlayColor: java.lang.String = null
  ): SocialIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[SocialIconProps]
  }
}

