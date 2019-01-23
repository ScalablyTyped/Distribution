package typings
package reactDashNativeDashMaterialDashDropdownLib.reactDashNativeDashMaterialDashDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownProps
  extends reactDashNativeLib.reactDashNativeMod.TouchableWithoutFeedbackProps {
  /** Enable RTL layout */
  var absoluteRTLLayout: js.UndefOr[scala.Boolean] = js.undefined
  /** Animation duration (default: 225) */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /** Set base color (default: rgba(0, 0, 0, .38)) */
  var baseColor: js.UndefOr[java.lang.String] = js.undefined
  /** Set container styles */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /** Dropdown data items */
  var data: js.Array[DropDownData]
  /** Set disabled item color */
  var disabledItemColor: js.UndefOr[java.lang.String] = js.undefined
  /** Provide Dropdown margins */
  var dropdownMargins: js.UndefOr[DropDownMargins] = js.undefined
  /** Provide Dropdown top-left position */
  var dropdownOffset: js.UndefOr[DropDownOffset] = js.undefined
  /** Provide dropdown position (dynamic if undefined) */
  var dropdownPosition: js.UndefOr[scala.Double] = js.undefined
  /** Set font size of dropdown items (default: 16) */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /** Hitslop insets (default: { top: 6, right: 4, bottom: 6, left: 4 }) */
  @JSName("hitSlop")
  var hitSlop_DropDownProps: js.UndefOr[DropDownInsets] = js.undefined
  /** Set Item color (default: rgba(0, 0, 0, .54)) */
  var itemColor: js.UndefOr[java.lang.String] = js.undefined
  /** Set Item count (default: 4) */
  var itemCount: js.UndefOr[scala.Double] = js.undefined
  /** Set Item padding (default: 8) */
  var itemPadding: js.UndefOr[scala.Double] = js.undefined
  /** Set Item text style. */
  var itemTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /** Label to be shown for dropdown */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Label extractor function. Extract label from item. */
  var labelExtractor: js.UndefOr[
    js.Function2[/* item */ DropDownData, /* index */ scala.Double, java.lang.String]
  ] = js.undefined
  /** Event: When focus lost from dropdown */
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Event: When change selected item */
  var onChangeText: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* index */ scala.Double, 
      /* data */ DropDownData, 
      scala.Unit
    ]
  ] = js.undefined
  /** Event: When dropdown opens */
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Set overlay styles */
  var overlayStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /** Set picker styles */
  var pickerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /** Props extractor function. Extract props from item. */
  var propsExtractor: js.UndefOr[
    js.Function2[/* item */ DropDownData, /* index */ scala.Double, stdLib.Partial[this.type]]
  ] = js.undefined
  /** Render text field accessory */
  var renderAccessory: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /** Render base component */
  var renderBase: js.UndefOr[
    js.Function1[/* props */ RenderBaseProps, reactLib.reactMod.Global.JSXNs.Element]
  ] = js.undefined
  /** Whether ripple be centered or not (default: false) */
  var rippleCentered: js.UndefOr[scala.Boolean] = js.undefined
  /** Provide Ripple color */
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  /** Ripple duration (defailt: 400) */
  var rippleDuration: js.UndefOr[scala.Double] = js.undefined
  /** Ripple insets  */
  var rippleInsets: js.UndefOr[DropDownInsets] = js.undefined
  /** Ripple opacity (default: 0.54) */
  var rippleOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Whether ripple rendered in sequential order (default: false)  */
  var rippleSequential: js.UndefOr[scala.Boolean] = js.undefined
  /** Set selected item color */
  var selectedItemColor: js.UndefOr[java.lang.String] = js.undefined
  /** Shade opacity (default: 0.12) */
  var shadeOpacity: js.UndefOr[scala.Double] = js.undefined
  /** Specify which orientations are supported. (default: ['portrait', 'portrait-upside-down', 'landscape', 'landscape-left', 'landscape-right']) */
  var supportedOrientations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Set Text color (default: rgba(0, 0, 0, .87)) */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  /** Use native driver (default: false) */
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  /** Selected value */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Value extractor function. Extract value from item. */
  var valueExtractor: js.UndefOr[
    js.Function2[/* item */ DropDownData, /* index */ scala.Double, java.lang.String]
  ] = js.undefined
}

