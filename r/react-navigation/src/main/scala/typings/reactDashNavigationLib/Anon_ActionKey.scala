package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionKey extends js.Object {
  var action: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationAction] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationParams] = js.undefined
  var routeName: java.lang.String | Anon_Action
}

object Anon_ActionKey {
  @scala.inline
  def apply(
    routeName: java.lang.String | Anon_Action,
    action: reactDashNavigationLib.reactDashNavigationMod.NavigationAction = null,
    key: java.lang.String = null,
    params: reactDashNavigationLib.reactDashNavigationMod.NavigationParams = null
  ): Anon_ActionKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("routeName")(routeName.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_ActionKey]
  }
}

