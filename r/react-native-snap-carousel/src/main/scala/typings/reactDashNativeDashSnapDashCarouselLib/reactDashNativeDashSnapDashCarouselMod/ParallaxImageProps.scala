package typings
package reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParallaxImageProps
  extends reactDashNativeLib.reactDashNativeMod.ImageProps
     with AdditionalParallaxProps {
  /**
       * Optional style for image's container
       */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * On screen dimensions of the image
       */
  var dimensions: js.UndefOr[reactDashNativeDashSnapDashCarouselLib.Anon_Height] = js.undefined
  /**
       * Speed of parallax effect. A higher value appears more 'zoomed in'
       */
  var parallaxFactor: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether to display a loading spinner
       */
  var showSpinner: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Color of the loading spinner if displayed
       */
  var spinnerColor: js.UndefOr[java.lang.String] = js.undefined
}

