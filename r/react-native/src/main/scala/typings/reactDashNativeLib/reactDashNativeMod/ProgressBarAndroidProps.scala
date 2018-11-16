package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProgressBarAndroidProps extends ViewProps {
  /**
       * Color of the progress bar.
       */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If the progress bar will show indeterminate progress.
       * Note that this can only be false if styleAttr is Horizontal.
       */
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The progress value (between 0 and 1).
       */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /**
       * Style of the ProgressBar. One of:
           Horizontal
           Normal (default)
           Small
           Large
           Inverse
           SmallInverse
           LargeInverse
       */
  var styleAttr: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.Horizontal | reactDashNativeLib.reactDashNativeLibStrings.Normal | reactDashNativeLib.reactDashNativeLibStrings.Small | reactDashNativeLib.reactDashNativeLibStrings.Large | reactDashNativeLib.reactDashNativeLibStrings.Inverse | reactDashNativeLib.reactDashNativeLibStrings.SmallInverse | reactDashNativeLib.reactDashNativeLibStrings.LargeInverse
  ] = js.undefined
}

