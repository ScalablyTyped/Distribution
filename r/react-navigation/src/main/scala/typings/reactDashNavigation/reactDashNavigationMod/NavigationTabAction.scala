package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashBACK
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashINIT
import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashNAVIGATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationInitAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationBackAction
*/
trait NavigationTabAction extends _NavigationAction

object NavigationTabAction {
  @scala.inline
  def NavigationInitAction(`type`: NavigationSlashINIT, key: String = null, params: NavigationParams = null): NavigationTabAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTabAction]
  }
  @scala.inline
  def NavigationNavigateAction(
    routeName: String,
    `type`: NavigationSlashNAVIGATE,
    action: typings.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): NavigationTabAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTabAction]
  }
  @scala.inline
  def NavigationBackAction(`type`: NavigationSlashBACK, immediate: js.UndefOr[Boolean] = js.undefined, key: String = null): NavigationTabAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTabAction]
  }
}

