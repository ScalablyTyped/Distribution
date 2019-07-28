package typings.reduxDashRouter.reduxDashRouterMod

import typings.history.historyMod.Pathname
import typings.reduxDashRouter.libActionCreatorsMod.ReduxRouterAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val reduxReactRouter: js.Any = js.native
  def go(args: js.Object*): ReduxRouterAction = js.native
  def goBack(args: js.Object*): ReduxRouterAction = js.native
  def goForward(args: js.Object*): ReduxRouterAction = js.native
  def historyAPI(method: js.Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = js.native
  def isActive(pathname: Pathname): Boolean = js.native
  def isActive(
    pathname: Pathname,
    query: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify H.Query */ js.Any
  ): Boolean = js.native
  def isActive(
    pathname: Pathname,
    query: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify H.Query */ js.Any,
    indexOnly: Boolean
  ): Boolean = js.native
  def push(args: js.Object*): ReduxRouterAction = js.native
  def pushState(args: js.Object*): ReduxRouterAction = js.native
  def replace(args: js.Object*): ReduxRouterAction = js.native
  def replaceState(args: js.Object*): ReduxRouterAction = js.native
  def routerStateReducer(state: js.Any, action: js.Any): js.Any = js.native
  def setState(args: js.Object*): ReduxRouterAction = js.native
}

