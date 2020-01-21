package typings.reactRouterNavigationCore.mod

import typings.history.mod.Location
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "getRoute")
@js.native
object getRoute extends js.Object {
  def apply(stack: js.Array[RouteProps], location: Location[LocationState]): js.UndefOr[Route[js.Object]] = js.native
}

