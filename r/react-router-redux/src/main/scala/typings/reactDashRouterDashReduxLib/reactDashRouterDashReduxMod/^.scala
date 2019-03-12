package typings
package reactDashRouterDashReduxLib.reactDashRouterDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CALL_HISTORY_METHOD: /* @@router/CALL_HISTORY_METHOD */ java.lang.String = js.native
  val LOCATION_CHANGE: /* @@router/LOCATION_CHANGE */ java.lang.String = js.native
  val routerActions: reactDashRouterDashReduxLib.Anon_Go = js.native
  val routerReducer: reduxLib.reduxMod.Reducer[RouterState, reduxLib.reduxMod.AnyAction] = js.native
  def createMatchSelector(path: java.lang.String): js.Function1[
    /* state */ reactDashRouterDashReduxLib.Anon_Router, 
    reactDashRouterLib.reactDashRouterMod.`match`[js.Object] | scala.Null
  ] = js.native
  def go(n: scala.Double): RouterAction = js.native
  def goBack(): RouterAction = js.native
  def goForward(): RouterAction = js.native
  def push(location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): RouterAction = js.native
  def push(
    location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState
  ): RouterAction = js.native
  def replace(location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): RouterAction = js.native
  def replace(
    location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState
  ): RouterAction = js.native
  def routerMiddleware(history: historyLib.historyMod.History[historyLib.historyMod.LocationState]): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
}

