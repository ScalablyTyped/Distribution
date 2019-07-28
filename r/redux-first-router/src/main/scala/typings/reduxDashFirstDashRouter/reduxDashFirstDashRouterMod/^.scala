package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import typings.history.historyMod.History
import typings.reduxDashFirstDashRouter.Anon_Enhancer
import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterStrings.`@@redux-first-router/NOT_FOUND`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val NOT_FOUND: `@@redux-first-router/NOT_FOUND` = js.native
  def actionToPath[TKeys, TState](action: ReceivedAction, routesMap: RoutesMap[TKeys, TState]): String = js.native
  def actionToPath[TKeys, TState](action: ReceivedAction, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): String = js.native
  def back(): Unit = js.native
  def canGo(n: Double): Boolean = js.native
  def canGoBack(): Boolean = js.native
  def canGoForward(): Boolean = js.native
  def connectRoutes[TKeys, TState](routesMap: RoutesMap[TKeys, TState]): Anon_Enhancer[TKeys, TState] = js.native
  def connectRoutes[TKeys, TState](routesMap: RoutesMap[TKeys, TState], options: Options[TKeys, TState]): Anon_Enhancer[TKeys, TState] = js.native
  def go(n: Double): Unit = js.native
  def history(): History[typings.history.historyMod.LocationState] = js.native
  def isLocationAction(action: js.Any): Boolean = js.native
  def next(): Unit = js.native
  def nextPath(): String | Unit = js.native
  def pathToAction[TKeys, TState](pathname: String, routesMap: RoutesMap[TKeys, TState]): ReceivedAction = js.native
  def pathToAction[TKeys, TState](pathname: String, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): ReceivedAction = js.native
  def prevPath(): String | Unit = js.native
  def push(pathname: String): Unit = js.native
  def redirect(action: Action): Action = js.native
  def replace(pathname: String): Unit = js.native
  def scrollBehavior(): ScrollBehavior | Unit = js.native
  def setKind(action: Action, kind: String): Action = js.native
  def updateScroll(): Unit = js.native
}

