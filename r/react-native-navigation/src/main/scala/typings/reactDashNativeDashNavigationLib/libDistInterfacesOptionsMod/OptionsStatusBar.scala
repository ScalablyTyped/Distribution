package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsStatusBar extends js.Object {
  /**
    * Set the background color of the status bar
    * #### (Android specific)
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * Draw screen behind the status bar
    * #### (Android specific)
    */
  var drawBehind: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the text color of the status bar
    * @default 'light'
    */
  var style: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.light | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.dark
  ] = js.undefined
  /**
    * Set the status bar visibility
    * @default true
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

