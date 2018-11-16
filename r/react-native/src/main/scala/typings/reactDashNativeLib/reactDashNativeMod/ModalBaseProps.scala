package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModalBaseProps extends js.Object {
  // Only `animated` is documented. The JS code says `animated` is
  // deprecated and `animationType` is preferred.
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The `animationType` prop controls how the modal animates.
       *
       * - `slide` slides in from the bottom
       * - `fade` fades into view
       * - `none` appears without an animation
       */
  var animationType: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.slide | reactDashNativeLib.reactDashNativeLibStrings.fade
  ] = js.undefined
  /**
       * The `onRequestClose` prop allows passing a function that will be called once the modal has been dismissed.
       * _On the Android platform, this is a required function._
       */
  var onRequestClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * The `onShow` prop allows passing a function that will be called once the modal has been shown.
       */
  var onShow: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], scala.Unit]] = js.undefined
  /**
       * The `transparent` prop determines whether your modal will fill the entire view.
       * Setting this to `true` will render the modal over a transparent background.
       */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The `visible` prop determines whether your modal is visible.
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

