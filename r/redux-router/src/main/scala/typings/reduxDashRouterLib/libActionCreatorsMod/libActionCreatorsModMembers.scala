package typings
package reduxDashRouterLib.libActionCreatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router/lib/actionCreators", JSImport.Namespace)
@js.native
object libActionCreatorsModMembers extends js.Object {
  val go: js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  val goBack: js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  val goForward: js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  val push: js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  val pushState: js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  val replace: js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  val replaceState: js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  val setState: js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  def historyAPI(method: js.Any): js.Function1[/* repeated */js.Object, ReduxRouterAction] = js.native
  def initRoutes(routes: js.Any): ReduxRouterAction = js.native
  def replaceRoutes(routes: js.Any): ReduxRouterAction = js.native
  def routerDidChange(state: js.Any): ReduxRouterAction = js.native
}

