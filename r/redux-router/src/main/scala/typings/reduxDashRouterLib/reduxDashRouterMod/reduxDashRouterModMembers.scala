package typings
package reduxDashRouterLib.reduxDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router", JSImport.Namespace)
@js.native
object reduxDashRouterModMembers extends js.Object {
  val reduxReactRouter: js.Any = js.native
  def go(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def goBack(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def goForward(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def historyAPI(method: js.Any): js.Function1[
    /* repeated */ js.Object, 
    reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction
  ] = js.native
  def isActive(pathname: historyLib.historyMod.Pathname): scala.Boolean = js.native
  def isActive(
    pathname: historyLib.historyMod.Pathname,
    query: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify H.Query */ js.Any
  ): scala.Boolean = js.native
  def isActive(
    pathname: historyLib.historyMod.Pathname,
    query: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify H.Query */ js.Any,
    indexOnly: scala.Boolean
  ): scala.Boolean = js.native
  def push(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def pushState(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def replace(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def replaceState(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
  def routerStateReducer(state: js.Any, action: js.Any): js.Any = js.native
  def setState(args: js.Object*): reduxDashRouterLib.libActionCreatorsMod.ReduxRouterAction = js.native
}

