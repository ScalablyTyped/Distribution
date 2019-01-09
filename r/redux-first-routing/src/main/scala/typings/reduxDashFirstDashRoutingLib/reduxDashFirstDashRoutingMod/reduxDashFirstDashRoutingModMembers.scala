package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", JSImport.Namespace)
@js.native
object reduxDashFirstDashRoutingModMembers extends js.Object {
  val GO: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/GO` = js.native
  val GO_BACK: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/GO_BACK` = js.native
  val GO_FORWARD: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/GO_FORWARD` = js.native
  val LOCATION_CHANGE: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/LOCATION_CHANGE` = js.native
  val PUSH: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/PUSH` = js.native
  val REPLACE: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/REPLACE` = js.native
  val routerReducer: reduxLib.reduxMod.Reducer[State, reduxLib.reduxMod.AnyAction] = js.native
  def createBrowserHistory(): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  def createBrowserHistory(options: historyLib.createBrowserHistoryMod.BrowserHistoryBuildOptions): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  def go[T /* <: scala.Double */](index: T): goAction[T] = js.native
  def goBack(): goBackAction = js.native
  def goForward(): goForwardAction = js.native
  def locationChange[P /* <: historyLib.historyMod.Pathname */, S /* <: historyLib.historyMod.Search */, H /* <: historyLib.historyMod.Hash */](`_`: reduxDashFirstDashRoutingLib.Anon_HashPathname[P, S, H]): locationChangeAction[P, S, H] = js.native
  def push[T /* <: historyLib.historyMod.Path | historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] */](href: T): pushAction[T] = js.native
  def replace[T /* <: historyLib.historyMod.Path | historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] */](href: T): replaceAction[T] = js.native
  def routerMiddleware(history: historyLib.historyMod.History[historyLib.historyMod.LocationState]): reduxLib.reduxMod.Middleware[_, State, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def startListener(
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]
  ): scala.Unit = js.native
}

