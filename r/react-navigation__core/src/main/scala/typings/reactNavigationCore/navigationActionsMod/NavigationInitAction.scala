package typings.reactNavigationCore.navigationActionsMod

import typings.reactNavigationCore.reactNavigationCoreStrings.NavigationSlashINIT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationInitAction extends NavigationInitActionPayload {
  var `type`: NavigationSlashINIT
}

object NavigationInitAction {
  @scala.inline
  def apply(`type`: NavigationSlashINIT, params: NavigationParams = null): NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInitAction]
  }
}

