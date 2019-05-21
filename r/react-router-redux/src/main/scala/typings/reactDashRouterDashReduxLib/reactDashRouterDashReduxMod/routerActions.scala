package typings
package reactDashRouterDashReduxLib.reactDashRouterDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", "routerActions")
@js.native
object routerActions extends js.Object {
  var go: js.Function1[
    /* n */ scala.Double, 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ] = js.native
  var goBack: js.Function0[reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction] = js.native
  var goForward: js.Function0[reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction] = js.native
  var push: js.Function2[
    /* location */ historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState], 
    /* state */ js.UndefOr[historyLib.historyMod.LocationState], 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ] = js.native
  var replace: js.Function2[
    /* location */ historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState], 
    /* state */ js.UndefOr[historyLib.historyMod.LocationState], 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ] = js.native
}

