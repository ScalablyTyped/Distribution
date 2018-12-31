package typings
package reactDashRouterDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Replace extends js.Object {
  var go: js.Function1[
    /* n */ scala.Double, 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ]
  var goBack: js.Function0[reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction]
  var goForward: js.Function0[reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction]
  var push: js.Function2[
    /* location */ historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState], 
    /* state */ js.UndefOr[historyLib.historyMod.LocationState], 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ]
  var replace: js.Function2[
    /* location */ historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState], 
    /* state */ js.UndefOr[historyLib.historyMod.LocationState], 
    reactDashRouterDashReduxLib.reactDashRouterDashReduxMod.RouterAction
  ]
}

