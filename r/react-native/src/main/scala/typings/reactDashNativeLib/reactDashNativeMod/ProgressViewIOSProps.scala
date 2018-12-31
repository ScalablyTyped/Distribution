package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressViewIOSProps extends ViewProps {
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /**
    * A stretchable image to display as the progress bar.
    */
  var progressImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.undefined
  /**
    * The tint color of the progress bar itself.
    */
  var progressTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The progress bar style.
    */
  var progressViewStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.bar
  ] = js.undefined
  /**
    * A stretchable image to display behind the progress bar.
    */
  var trackImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.undefined
  /**
    * The tint color of the progress bar track.
    */
  var trackTintColor: js.UndefOr[java.lang.String] = js.undefined
}

