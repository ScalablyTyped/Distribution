package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-router", "pathToAction")
@js.native
object pathToAction extends js.Object {
  def apply[TKeys, TState](pathname: String, routesMap: RoutesMap[TKeys, TState]): ReceivedAction = js.native
  def apply[TKeys, TState](pathname: String, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): ReceivedAction = js.native
}

