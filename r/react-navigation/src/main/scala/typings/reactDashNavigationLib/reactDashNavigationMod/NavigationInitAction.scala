package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashNavigationLib.reactDashNavigationMod.NavigationAction because Already inherited */ trait NavigationInitAction
  extends NavigationStackAction
     with NavigationInitActionPayload
     with NavigationTabAction {
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/INIT`
}

object NavigationInitAction {
  @scala.inline
  def apply(
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/INIT`,
    params: NavigationParams = null
  ): NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationInitAction]
  }
}

