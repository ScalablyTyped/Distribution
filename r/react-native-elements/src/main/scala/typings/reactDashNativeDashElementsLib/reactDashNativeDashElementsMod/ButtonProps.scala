package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ButtonProps
  extends reactDashNativeLib.reactDashNativeMod.TouchableWithoutFeedbackProps {
  /**
       * Styling for loading spinner
       *
       * @default null
       */
  var activityIndicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Background color of button
       *
       * @default #397af8
       */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Adds border radius to button
       *  (Note: if you set this, don't forget to also set borderRadius to containerViewStyle prop, otherwise unexpected behaviour might occur)
       *
       * @default 0
       */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
       * Additional styling for button component
       *
       * @default null
       */
  var buttonStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Font color
       *
       * @default #fff
       */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Specify other component such as TouchableOpacity or other
       *
       * @default TouchableHighlight (iOS), TouchableNativeFeedback (android)
       */
  var component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
       * Styling for Component container
       *
       * @default null
       */
  var containerViewStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Disabled button styling
       *
       * @default null
       */
  var disabledStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Disabled button text styling
       *
       * @default null
       */
  var disabledTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
       * Specify different font family
       *
       * @default System font (iOS), Sans Serif (android)
       */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Font size
       *
       * @default 18
       */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Specify font weight for title
       *
       * @default null
       */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Icon configuration
       */
  var icon: js.UndefOr[ButtonIcon] = js.undefined
  /**
       * Specify other icon component instead of default. The component will have all values from the icon prop
       *
       * @default MaterialIcon
       * @see https://github.com/oblador/react-native-vector-icons#icon-component
       */
  var iconComponent: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
       * Icon configuration for icon on right side of title
       */
  var iconRight: js.UndefOr[ButtonIcon] = js.undefined
  /**
       * Makes button large
       *
       * @default false
       */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Display a loading spinner
       *
       * @default false
       */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Display the spinner to the right
       *
       * @default false
       */
  var loadingRight: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * onLongPress method
       */
  @JSName("onLongPress")
  var onLongPress_ButtonProps: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Flag to add raised button styling
       *
       * @default false
       */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Text styling
       *
       * @default null
       */
  var textStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
       * Button title
       */
  var title: java.lang.String
  /**
       * Underlay color for button press
       *
       * @default transparent
       */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * onPress method
       */
  @JSName("onPress")
  def onPress_MButtonProps(): scala.Unit
}

