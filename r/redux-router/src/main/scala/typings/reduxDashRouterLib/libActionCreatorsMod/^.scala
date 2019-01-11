package typings
package reduxDashRouterLib.libActionCreatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router/lib/actionCreators", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def go(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def goBack(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def goForward(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def historyAPI(method: js.Any): js.Function1[
    /* repeated */ js.Object, 
    reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction
  ] = js.native
  def initRoutes(routes: js.Any): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def push(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def pushState(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def replace(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def replaceRoutes(routes: js.Any): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def replaceState(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def routerDidChange(state: js.Any): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def setState(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
}

