package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ButtonGroupProps extends js.Object {
  /**
       * Determines what the opacity of the wrapped view should be when touch is active.
       */
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
       * inherited styling	specify styling for button
       */
  var buttonStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Array of buttons for component, if returning a component, must be an object with { element: componentName }
       */
  var buttons: js.Array[java.lang.String] | js.Array[ElementObject]
  /**
       * Choose other button component such as TouchableOpacity
       *
       * @default TouchableHighlight
       */
  var component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
       * Border radius for the container
       */
  var containerBorderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
       * Specify styling for main button container
       */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Disables the currently selected button if true
       *
       * @default false
       */
  var disableSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * inherited styling	object { width, color }	update the styling of the interior border of the list of buttons
       */
  var innerBorderStyle: js.UndefOr[InnerBorderStyleProperty] = js.undefined
  /**
       * Styling for the final border edge
       */
  var lastBorderStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[
      reactDashNativeLib.reactDashNativeMod.TextStyle | reactDashNativeLib.reactDashNativeMod.ViewStyle
    ]
  ] = js.undefined
  /**
       *
       * Called immediately after the underlay is hidden
       */
  var onHideUnderlay: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Called immediately after the underlay is shown
       */
  var onShowUnderlay: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Specify color for selected state of button
       *
       * @default 'white'
       */
  var selectedBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Current selected index of array of buttons
       */
  var selectedIndex: scala.Double
  /**
       * Specify specific styling for text in the selected state
       */
  var selectedTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
       * Animate the touchable to a new opacity.
       */
  var setOpacityTo: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
       * Specify specific styling for text
       */
  var textStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
       * Specify underlayColor for TouchableHighlight
       *
       * @default 'white'
       */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Method to update Button Group Index
       */
  def onPress(selectedIndex: scala.Double): scala.Unit
}

