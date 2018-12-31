package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarIOSProps extends ViewProps {
  /**
    * Background color of the tab bar
    */
  var barTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies tab bar item positioning. Available values are:
    * - fill - distributes items across the entire width of the tab bar
    * - center - centers item in the available tab bar space
    * - auto (default) - distributes items dynamically according to the
    * user interface idiom. In a horizontally compact environment (e.g. iPhone 5)
    * this value defaults to `fill`, in a horizontally regular one (e.g. iPad)
    * it defaults to center.
    */
  var itemPositioning: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.fill | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.auto
  ] = js.undefined
  /**
    * Color of the currently selected tab icon
    */
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Boolean value that indicates whether the tab bar is translucent
    */
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Color of unselected tab icons. Available since iOS 10.
    */
  var unselectedItemTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Color of text on unselected tabs
    */
  var unselectedTintColor: js.UndefOr[java.lang.String] = js.undefined
}

