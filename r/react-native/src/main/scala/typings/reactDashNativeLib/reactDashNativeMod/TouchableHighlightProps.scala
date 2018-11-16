package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TouchableHighlightProps extends TouchableWithoutFeedbackProps {
  /**
       * Determines what the opacity of the wrapped view should be when touch is active.
       */
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
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
       * The color of the underlay that will show through when the touch is active.
       */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
}

