package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  /**
    * View if no onPress method is defined, TouchableHighlight if onPress method is defined	React Native component	update React Native Component
    */
  var Component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Color of icon
    *
    * @default 'black'
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add styling to container holding icon
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Disables the Icon
    *
    * Only works if `onPress` passed in
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Styles for the Icon when disabled
    */
  var disabledStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Additional styling to icon
    */
  var iconStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[
      reactDashNativeLib.reactDashNativeMod.TextStyle | reactDashNativeLib.reactDashNativeMod.ViewStyle
    ]
  ] = js.undefined
  /**
    * Name of icon
    */
  var name: java.lang.String
  /**
    * onLongPress method for button
    */
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * onPress method for button
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Adds box shadow to button
    *
    * @default false
    */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Reverses color scheme
    *
    * @default false
    */
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify reverse icon color
    *
    * @default 'white'
    */
  var reverseColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Size of icon
    * @default 26
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * Type (defaults to material, options are material-community, zocial, font-awesome, octicon, ionicon, foundation, evilicon, simple-line-icon, or entypo)
    * @default 'material'
    */
  var `type`: js.UndefOr[IconType] = js.undefined
  /**
    * UnderlayColor for press event
    */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    Component: reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = null,
    color: java.lang.String = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    iconStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[
      reactDashNativeLib.reactDashNativeMod.TextStyle | reactDashNativeLib.reactDashNativeMod.ViewStyle
    ] = null,
    onLongPress: js.Function0[scala.Unit] = null,
    onPress: js.Function0[scala.Unit] = null,
    raised: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    reverseColor: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    `type`: IconType = null,
    underlayColor: java.lang.String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (color != null) __obj.updateDynamic("color")(color)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (reverseColor != null) __obj.updateDynamic("reverseColor")(reverseColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[IconProps]
  }
}

