package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashINIT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashNavigation.reactDashNavigationMod._NavigationAction because Already inherited */ trait NavigationInitAction
  extends NavigationStackAction
     with NavigationInitActionPayload
     with NavigationTabAction {
  var key: js.UndefOr[String] = js.undefined
  var `type`: NavigationSlashINIT
}

object NavigationInitAction {
  @scala.inline
  def apply(`type`: NavigationSlashINIT, key: String = null, params: NavigationParams = null): NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInitAction]
  }
}

