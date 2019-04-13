package typings
package reactDashRouterDashReduxLib.reactDashRouterDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", "routerActions")
@js.native
object routerActions extends js.Object {
  @JSName("goBack")
  var goBack_Original: js.Function0[reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction] = js.native
  @JSName("goForward")
  var goForward_Original: js.Function0[reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction] = js.native
  @JSName("go")
  var go_Original: js.Function1[
    /* n */ scala.Double, 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ] = js.native
  @JSName("push")
  var push_Original: js.Function2[
    /* location */ historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState], 
    /* state */ js.UndefOr[historyLib.historyMod.LocationState], 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ] = js.native
  @JSName("replace")
  var replace_Original: js.Function2[
    /* location */ historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState], 
    /* state */ js.UndefOr[historyLib.historyMod.LocationState], 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ] = js.native
  def go(n: scala.Double): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def goBack(): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def goForward(): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def push(location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def push(
    location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState
  ): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def replace(location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
  def replace(
    location: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    state: historyLib.historyMod.LocationState
  ): reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction = js.native
}

