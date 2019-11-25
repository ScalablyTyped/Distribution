package typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[T] extends js.Object {
  var key: String
  var `match`: js.UndefOr[typings.reactDashRouter.reactDashRouterMod.`match`[T]] = js.undefined
  var routeName: String
}

object Route {
  @scala.inline
  def apply[T](key: String, routeName: String, `match`: `match`[T] = null): Route[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[T]]
  }
}

