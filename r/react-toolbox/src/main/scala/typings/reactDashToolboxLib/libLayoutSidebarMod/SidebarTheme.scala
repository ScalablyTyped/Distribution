package typings
package reactDashToolboxLib.libLayoutSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarTheme extends js.Object {
  /**
    * Added to the root class when it is clipped.
    */
  var clipped: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root class if sidebar is pinned.
    */
  var pinned: js.UndefOr[java.lang.String] = js.undefined
}

object SidebarTheme {
  @scala.inline
  def apply(clipped: java.lang.String = null, pinned: java.lang.String = null): SidebarTheme = {
    val __obj = js.Dynamic.literal()
    if (clipped != null) __obj.updateDynamic("clipped")(clipped)
    if (pinned != null) __obj.updateDynamic("pinned")(pinned)
    __obj.asInstanceOf[SidebarTheme]
  }
}

