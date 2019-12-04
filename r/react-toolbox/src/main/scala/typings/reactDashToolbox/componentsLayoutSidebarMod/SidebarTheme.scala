package typings.reactDashToolbox.componentsLayoutSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarTheme extends js.Object {
  /**
    * Added to the root class when it is clipped.
    */
  var clipped: js.UndefOr[String] = js.undefined
  /**
    * Added to the root class if sidebar is pinned.
    */
  var pinned: js.UndefOr[String] = js.undefined
}

object SidebarTheme {
  @scala.inline
  def apply(clipped: String = null, pinned: String = null): SidebarTheme = {
    val __obj = js.Dynamic.literal()
    if (clipped != null) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarTheme]
  }
}

