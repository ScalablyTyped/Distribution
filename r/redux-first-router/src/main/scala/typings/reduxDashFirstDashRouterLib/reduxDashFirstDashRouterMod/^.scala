package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val NOT_FOUND: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterLibStrings.`@@redux-first-router/NOT_FOUND` = js.native
  def actionToPath[TKeys, TState](action: ReceivedAction, routesMap: RoutesMap[TKeys, TState]): java.lang.String = js.native
  def actionToPath[TKeys, TState](action: ReceivedAction, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): java.lang.String = js.native
  def back(): scala.Unit = js.native
  def canGo(n: scala.Double): scala.Boolean = js.native
  def canGoBack(): scala.Boolean = js.native
  def canGoForward(): scala.Boolean = js.native
  def connectRoutes[TKeys, TState](routesMap: RoutesMap[TKeys, TState]): reduxDashFirstDashRouterLib.Anon_ActionApi[TKeys, TState] = js.native
  def connectRoutes[TKeys, TState](routesMap: RoutesMap[TKeys, TState], options: Options[TKeys, TState]): reduxDashFirstDashRouterLib.Anon_ActionApi[TKeys, TState] = js.native
  def go(n: scala.Double): scala.Unit = js.native
  def history(): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  def isLocationAction(action: js.Any): scala.Boolean = js.native
  def next(): scala.Unit = js.native
  def nextPath(): java.lang.String | scala.Unit = js.native
  def pathToAction[TKeys, TState](pathname: java.lang.String, routesMap: RoutesMap[TKeys, TState]): ReceivedAction = js.native
  def pathToAction[TKeys, TState](pathname: java.lang.String, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): ReceivedAction = js.native
  def prevPath(): java.lang.String | scala.Unit = js.native
  def push(pathname: java.lang.String): scala.Unit = js.native
  def redirect(action: Action): Action = js.native
  def replace(pathname: java.lang.String): scala.Unit = js.native
  def scrollBehavior(): ScrollBehavior | scala.Unit = js.native
  def setKind(action: Action, kind: java.lang.String): Action = js.native
  def updateScroll(): scala.Unit = js.native
}

