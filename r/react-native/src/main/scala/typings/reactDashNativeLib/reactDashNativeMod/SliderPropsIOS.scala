package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SliderPropsIOS extends ViewProps {
  /**
       * Assigns a maximum track image. Only static images are supported.
       * The leftmost pixel of the image will be stretched to fill the track.
       */
  var maximumTrackImage: js.UndefOr[ImageURISource] = js.undefined
  /**
       * Assigns a minimum track image. Only static images are supported.
       * The rightmost pixel of the image will be stretched to fill the track.
       */
  var minimumTrackImage: js.UndefOr[ImageURISource] = js.undefined
  /**
       * Sets an image for the thumb. Only static images are supported.
       */
  var thumbImage: js.UndefOr[ImageURISource] = js.undefined
  /**
       * Assigns a single image for the track. Only static images
       * are supported. The center pixel of the image will be stretched
       * to fill the track.
       */
  var trackImage: js.UndefOr[ImageURISource] = js.undefined
}

