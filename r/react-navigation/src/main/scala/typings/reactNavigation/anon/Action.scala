package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationNavigateAction
import typings.reactNavigation.mod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T /* <: NavigationParams */] extends js.Object {
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[T] = js.undefined
  var routeName: String
}

object Action {
  @scala.inline
  def apply[T](routeName: String, action: NavigationNavigateAction = null, key: String = null, params: T = null): Action[T] = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
}

