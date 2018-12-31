package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarPropsIOS extends js.Object {
  /**
    * Sets the color of the status bar text.
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.undefined
  /**
    * If the network activity indicator should be visible.
    */
  var networkActivityIndicatorVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The transition effect when showing and hiding the status bar using
    * the hidden prop. Defaults to 'fade'.
    */
  var showHideTransition: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.fade | reactDashNativeLib.reactDashNativeLibStrings.slide
  ] = js.undefined
}

