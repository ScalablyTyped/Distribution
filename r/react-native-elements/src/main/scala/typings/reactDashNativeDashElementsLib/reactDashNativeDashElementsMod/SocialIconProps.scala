package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SocialIconProps extends js.Object {
  /**
       * Creates button
       *
       * @default false
       */
  var button: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Component Type of button
       *
       * @default TouchableHighlight
       */
  var component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
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
}

