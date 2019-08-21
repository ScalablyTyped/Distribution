package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typings.history.historyMod.Hash
import typings.history.historyMod.History
import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyMod.LocationState
import typings.history.historyMod.Pathname
import typings.history.historyMod.Search
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.Store
import typings.reduxDashFirstDashRouting.Anon_HashPathname
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/GO_BACK`
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/GO_FORWARD`
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/GO`
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/LOCATION_CHANGE`
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/PUSH`
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/REPLACE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GO: `ROUTER/GO` = js.native
  val GO_BACK: `ROUTER/GO_BACK` = js.native
  val GO_FORWARD: `ROUTER/GO_FORWARD` = js.native
  val LOCATION_CHANGE: `ROUTER/LOCATION_CHANGE` = js.native
  val PUSH: `ROUTER/PUSH` = js.native
  val REPLACE: `ROUTER/REPLACE` = js.native
  val routerReducer: Reducer[State, AnyAction] = js.native
  def createBrowserHistory[S](): History[S] = js.native
  def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  def go[T /* <: Double */](index: T): goAction[T] = js.native
  def goBack(): goBackAction = js.native
  def goForward(): goForwardAction = js.native
  def locationChange[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](`_`: Anon_HashPathname[P, S, H]): locationChangeAction[P, S, H] = js.native
  def push(href: String): pushAction[String] = js.native
  def push(href: LocationDescriptorObject[LocationState]): pushAction[LocationDescriptorObject[LocationState]] = js.native
  def replace(href: String): replaceAction[String] = js.native
  def replace(href: LocationDescriptorObject[LocationState]): replaceAction[LocationDescriptorObject[LocationState]] = js.native
  def routerMiddleware(history: History[LocationState]): Middleware[_, State, Dispatch[AnyAction]] = js.native
  def startListener(history: History[LocationState], store: Store[_, AnyAction]): Unit = js.native
}

