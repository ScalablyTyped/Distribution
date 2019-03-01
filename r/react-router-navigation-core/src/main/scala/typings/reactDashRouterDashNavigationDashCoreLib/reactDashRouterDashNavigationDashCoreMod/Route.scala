package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[T] extends js.Object {
  var key: java.lang.String
  var `match`: js.UndefOr[reactDashRouterLib.reactDashRouterMod.`match`[T]] = js.undefined
  var routeName: java.lang.String
}

object Route {
  @scala.inline
  def apply[T](
    key: java.lang.String,
    routeName: java.lang.String,
    `match`: reactDashRouterLib.reactDashRouterMod.`match`[T] = null
  ): Route[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("routeName")(routeName)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Route[T]]
  }
}

