package typings
package reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutSplitView extends js.Object {
  /**
    * Set detail layout (the larger screen, flexes)
    */
  var detail: js.UndefOr[Layout[js.Object]] = js.undefined
  /**
    * Set ID of the stack so you can use Navigation.mergeOptions to
    * update options
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set master layout (the smaller screen, sidebar)
    */
  var master: js.UndefOr[Layout[js.Object]] = js.undefined
  /**
    * Configure split view
    */
  var options: js.UndefOr[reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options] = js.undefined
}

