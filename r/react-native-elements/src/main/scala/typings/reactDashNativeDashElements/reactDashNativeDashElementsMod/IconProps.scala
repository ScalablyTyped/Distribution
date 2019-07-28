package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  /**
    * View if no onPress method is defined, TouchableHighlight if onPress method is defined	React Native component	update React Native Component
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  /**
    * Color of icon
    *
    * @default 'black'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Add styling to container holding icon
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Disables the Icon
    *
    * Only works if `onPress` passed in
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Styles for the Icon when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Additional styling to icon
    */
  var iconStyle: js.UndefOr[StyleProp[TextStyle | ViewStyle]] = js.undefined
  /**
    * Name of icon
    */
  var name: String
  /**
    * onLongPress method for button
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * onPress method for button
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Adds box shadow to button
    *
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.undefined
  /**
    * Reverses color scheme
    *
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify reverse icon color
    *
    * @default 'white'
    */
  var reverseColor: js.UndefOr[String] = js.undefined
  /**
    * Size of icon
    * @default 26
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * Type (defaults to material, options are material-community, zocial, font-awesome, octicon, ionicon, foundation, evilicon, simple-line-icon, or entypo)
    * @default 'material'
    */
  var `type`: js.UndefOr[IconType] = js.undefined
  /**
    * UnderlayColor for press event
    */
  var underlayColor: js.UndefOr[String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    name: String,
    Component: ComponentClass[js.Object, ComponentState] = null,
    color: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: StyleProp[ViewStyle] = null,
    iconStyle: StyleProp[TextStyle | ViewStyle] = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    raised: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    reverseColor: String = null,
    size: Int | Double = null,
    `type`: IconType = null,
    underlayColor: String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (color != null) __obj.updateDynamic("color")(color)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (reverseColor != null) __obj.updateDynamic("reverseColor")(reverseColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[IconProps]
  }
}

