package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxProps extends js.Object {
  /**
    *  Specify React Native component for main button
    */
  var Component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Aligns checkbox to center
    *
    *  @default false
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Flag for checking the icon
    *
    * @default false
    */
  var checked: scala.Boolean
  /**
    * Default checked color
    *
    * @default 'green'
    */
  var checkedColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'check-square-o'
    */
  var checkedIcon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.undefined
  /**
    * Specify a custom checked message
    */
  var checkedTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style of main container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Specify different font family
    * @default 'System font bold (iOS)'
    * @default 'Sans Serif Bold (android)'
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Moves icon to right of text.
    *
    * @default false
    */
  var iconRight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Icon family, can be one of the following
    * (required only if specifying an icon that is not from font-awesome)
    */
  var iconType: js.UndefOr[IconType] = js.undefined
  /**
    * onPress function for checkbox
    */
  var onIconPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * onLongPress function for checkbox
    */
  var onLongIconPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * onLongPress function for checkbox
    */
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * onPress function for container
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Aligns checkbox to right
    *
    * @default false
    */
  var right: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Size of the checkbox
    *
    * @default 24
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * style of text
    */
  var textStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Title of checkbox
    */
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.undefined
  /**
    * Default unchecked color
    * @default '#bfbfbf'
    */
  var uncheckedColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'square-o'
    */
  var uncheckedIcon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.undefined
  /**
    * Style of container that wraps the check box and text
    */
  var wrapperStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

