package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  /**
    * Color of icon
    *
    * @default 'black'
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * View if no onPress method is defined, TouchableHighlight if onPress method is defined	React Native component	update React Native Component
    */
  var component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Add styling to container holding icon
    */
  var containerStyle: js.UndefOr[
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

