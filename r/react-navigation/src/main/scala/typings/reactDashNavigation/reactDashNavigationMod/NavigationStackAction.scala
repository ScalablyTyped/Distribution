package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/BACK`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/COMPLETE_TRANSITION`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/INIT`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/NAVIGATE`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/POP_TO_TOP`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/POP`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/PUSH`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/REPLACE`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/RESET`
import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/SET_PARAMS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationInitAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationBackAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationSetParamsAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationResetAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationReplaceAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationPopAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationPushAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationPopToTopAction
  - typings.reactDashNavigation.reactDashNavigationMod.NavigationCompleteTransitionAction
*/
trait NavigationStackAction extends _NavigationAction

object NavigationStackAction {
  @scala.inline
  def NavigationPopAction(
    `type`: `Navigation/POP`,
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    n: Int | Double = null
  ): NavigationStackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationCompleteTransitionAction(key: String, `type`: `Navigation/COMPLETE_TRANSITION`): NavigationStackAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationBackAction(`type`: `Navigation/BACK`, immediate: js.UndefOr[Boolean] = js.undefined, key: String = null): NavigationStackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationResetAction(
    actions: js.Array[NavigationNavigateAction],
    index: Double,
    `type`: `Navigation/RESET`,
    key: String = null
  ): NavigationStackAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationSetParamsAction(key: String, `type`: `Navigation/SET_PARAMS`, params: NavigationParams = null): NavigationStackAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationReplaceAction(
    key: String,
    routeName: String,
    `type`: `Navigation/REPLACE`,
    action: NavigationNavigateAction = null,
    params: NavigationParams = null
  ): NavigationStackAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationPopToTopAction(`type`: `Navigation/POP_TO_TOP`, immediate: js.UndefOr[Boolean] = js.undefined, key: String = null): NavigationStackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationNavigateAction(
    routeName: String,
    `type`: `Navigation/NAVIGATE`,
    action: typings.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): NavigationStackAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationPushAction(
    routeName: String,
    `type`: `Navigation/PUSH`,
    action: NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): NavigationStackAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
  @scala.inline
  def NavigationInitAction(`type`: `Navigation/INIT`, key: String = null, params: NavigationParams = null): NavigationStackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackAction]
  }
}

