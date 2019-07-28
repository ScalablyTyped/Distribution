package typings.reduxDashRouter.libActionCreatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router/lib/actionCreators", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def go(args: js.Object*): ReduxRouterAction = js.native
  def goBack(args: js.Object*): ReduxRouterAction = js.native
  def goForward(args: js.Object*): ReduxRouterAction = js.native
  def historyAPI(method: js.Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = js.native
  def initRoutes(routes: js.Any): ReduxRouterAction = js.native
  def push(args: js.Object*): ReduxRouterAction = js.native
  def pushState(args: js.Object*): ReduxRouterAction = js.native
  def replace(args: js.Object*): ReduxRouterAction = js.native
  def replaceRoutes(routes: js.Any): ReduxRouterAction = js.native
  def replaceState(args: js.Object*): ReduxRouterAction = js.native
  def routerDidChange(state: js.Any): ReduxRouterAction = js.native
  def setState(args: js.Object*): ReduxRouterAction = js.native
}

