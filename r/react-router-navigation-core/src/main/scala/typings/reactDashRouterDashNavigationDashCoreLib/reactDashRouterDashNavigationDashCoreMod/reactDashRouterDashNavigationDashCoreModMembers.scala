package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", JSImport.Namespace)
@js.native
object reactDashRouterDashNavigationDashCoreModMembers extends js.Object {
  val build: js.Function2[
    /* children */ js.Array[reactLib.reactMod.ReactNs.ReactElement[js.Any]], 
    /* oldBuild */ js.UndefOr[js.Array[js.Any]], 
    js.Array[js.Any]
  ] = js.native
  val createKey: js.Function1[/* route */ Route[js.Object], java.lang.String] = js.native
  val get: js.Function2[
    /* items */ js.Array[Route[js.Object]], 
    /* route */ Route[js.Object], 
    Route[js.Object]
  ] = js.native
  val getRoute: js.Function2[
    /* stack */ js.Array[RouteProps], 
    /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    js.UndefOr[Route[js.Object]]
  ] = js.native
  val renderSubView: js.Function2[
    /* render */ js.Function2[/* propsA */ js.Any, /* propsB */ js.Any, reactLib.reactMod.ReactNs.ReactNode], 
    /* additionalProps */ js.UndefOr[js.Any], 
    js.Function1[/* ownProps */ js.Any, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.native
  val runHistoryListenner: js.Function2[
    /* history */ historyLib.historyMod.History[historyLib.historyMod.LocationState], 
    /* onListenHistory */ js.Function0[scala.Unit], 
    js.Function0[scala.Unit]
  ] = js.native
  val shouldUpdate: js.Function4[
    /* currentItem */ RouteProps, 
    /* nextItem */ RouteProps, 
    /* currentLocation */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    /* nextLocation */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    scala.Boolean
  ] = js.native
}

