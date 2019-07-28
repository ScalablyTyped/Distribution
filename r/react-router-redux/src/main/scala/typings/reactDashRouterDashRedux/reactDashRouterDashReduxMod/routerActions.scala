package typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod

import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", "routerActions")
@js.native
object routerActions extends js.Object {
  var go: js.Function1[/* n */ Double, RouterAction] = js.native
  var goBack: js.Function0[RouterAction] = js.native
  var goForward: js.Function0[RouterAction] = js.native
  var push: js.Function2[
    /* location */ LocationDescriptor[LocationState], 
    /* state */ js.UndefOr[LocationState], 
    RouterAction
  ] = js.native
  var replace: js.Function2[
    /* location */ LocationDescriptor[LocationState], 
    /* state */ js.UndefOr[LocationState], 
    RouterAction
  ] = js.native
}

