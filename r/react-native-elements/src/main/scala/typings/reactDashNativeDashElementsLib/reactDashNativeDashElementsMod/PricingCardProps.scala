package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PricingCardProps extends js.Object {
  /**
       * {title, icon, buttonStyle}
       * Button information
       */
  var button: ButtonInformation
  /**
       * Specify button font family
       *
       * System font (iOS)
       * Sans Serif (android)
       */
  var buttonFont: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Color scheme for button & title
       */
  var color: java.lang.String
  /**
       * Outer component styling
       */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Pricing information
       */
  var info: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Specify pricing information font family
       *
       * System font bold (iOS)
       * Sans Serif Bold (android)
       */
  var infoFont: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Function to be run when button is pressed
       */
  var onButtonPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Price
       */
  var price: java.lang.String
  /**
       * Specify pricing font family
       *
       * System font (font weight 700) (iOS)
       * Sans Serif Bold (android)
       */
  var pricingFont: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Title
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Specify title font family
       *
       * System font (font weight 800) (iOS)
       * Sans Serif Black (android)
       */
  var titleFont: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Inner wrapper component styling
       */
  var wrapperStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

