package typings.reactDashToolbox.componentsLayoutNavDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavDrawerTheme extends js.Object {
  /**
    * Added to the root class when it is clipped.
    */
  var clipped: js.UndefOr[String] = js.undefined
  /**
    * Added to the root class when it is pinned.
    */
  var pinned: js.UndefOr[String] = js.undefined
}

object NavDrawerTheme {
  @scala.inline
  def apply(clipped: String = null, pinned: String = null): NavDrawerTheme = {
    val __obj = js.Dynamic.literal()
    if (clipped != null) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavDrawerTheme]
  }
}

