package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val NOT_FOUND: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterLibStrings.`@@redux-first-router/NOT_FOUND` = js.native
  def actionToPath[TKeys, TState](
    action: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.ReceivedAction,
    routesMap: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RoutesMap[TKeys, TState]
  ): java.lang.String = js.native
  def actionToPath[TKeys, TState](
    action: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.ReceivedAction,
    routesMap: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RoutesMap[TKeys, TState],
    querySerializer: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.QuerySerializer
  ): java.lang.String = js.native
  def back(): scala.Unit = js.native
  def canGo(n: scala.Double): scala.Boolean = js.native
  def canGoBack(): scala.Boolean = js.native
  def canGoForward(): scala.Boolean = js.native
  def connectRoutes[TKeys, TState](routesMap: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RoutesMap[TKeys, TState]): reduxDashFirstDashRouterLib.Anon_ActionApi[TKeys, TState] = js.native
  def connectRoutes[TKeys, TState](
    routesMap: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RoutesMap[TKeys, TState],
    options: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Options[TKeys, TState]
  ): reduxDashFirstDashRouterLib.Anon_ActionApi[TKeys, TState] = js.native
  def go(n: scala.Double): scala.Unit = js.native
  def history(): historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  def isLocationAction(action: js.Any): scala.Boolean = js.native
  def next(): scala.Unit = js.native
  def nextPath(): java.lang.String | scala.Unit = js.native
  def pathToAction[TKeys, TState](
    pathname: java.lang.String,
    routesMap: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RoutesMap[TKeys, TState]
  ): reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.ReceivedAction = js.native
  def pathToAction[TKeys, TState](
    pathname: java.lang.String,
    routesMap: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RoutesMap[TKeys, TState],
    querySerializer: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.QuerySerializer
  ): reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.ReceivedAction = js.native
  def prevPath(): java.lang.String | scala.Unit = js.native
  def push(pathname: java.lang.String): scala.Unit = js.native
  def redirect(action: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Action): reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Action = js.native
  def replace(pathname: java.lang.String): scala.Unit = js.native
  def scrollBehavior(): reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.ScrollBehavior | scala.Unit = js.native
  def setKind(action: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Action, kind: java.lang.String): reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Action = js.native
  def updateScroll(): scala.Unit = js.native
}

