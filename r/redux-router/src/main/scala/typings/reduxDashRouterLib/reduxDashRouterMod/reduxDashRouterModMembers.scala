package typings
package reduxDashRouterLib.reduxDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router", JSImport.Namespace)
@js.native
object reduxDashRouterModMembers extends js.Object {
  val go: js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  val goBack: js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  val goForward: js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  val push: js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  val pushState: js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  val reduxReactRouter: js.Any = js.native
  val replace: js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  val replaceState: js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  val setState: js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  def historyAPI(method: js.Any): js.Function1[/* repeated */js.Object, reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction] = js.native
  def isActive(pathname: historyLib.historyMod.Pathname): scala.Boolean = js.native
  def isActive(pathname: historyLib.historyMod.Pathname, query: js.Any): scala.Boolean = js.native
  def isActive(pathname: historyLib.historyMod.Pathname, query: js.Any, indexOnly: scala.Boolean): scala.Boolean = js.native
  def routerStateReducer(state: js.Any, action: js.Any): js.Any = js.native
}

