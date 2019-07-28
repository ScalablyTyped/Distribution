package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationAction extends js.Object {
  var action: js.UndefOr[NavigationAction] = js.undefined
  var actions: js.UndefOr[js.Array[NavigationAction]] = js.undefined
  var key: js.UndefOr[Nullable[String]] = js.undefined
  var meta: js.UndefOr[js.Object] = js.undefined
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  var params: js.UndefOr[Params] = js.undefined
  var routeName: js.UndefOr[String] = js.undefined
  var `type`: String
}

object NavigationAction {
  @scala.inline
  def apply(
    `type`: String,
    action: NavigationAction = null,
    actions: js.Array[NavigationAction] = null,
    key: Nullable[String] = null,
    meta: js.Object = null,
    navKey: Nullable[String] = null,
    params: Params = null,
    routeName: String = null
  ): NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (action != null) __obj.updateDynamic("action")(action)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (navKey != null) __obj.updateDynamic("navKey")(navKey.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (routeName != null) __obj.updateDynamic("routeName")(routeName)
    __obj.asInstanceOf[NavigationAction]
  }
}

