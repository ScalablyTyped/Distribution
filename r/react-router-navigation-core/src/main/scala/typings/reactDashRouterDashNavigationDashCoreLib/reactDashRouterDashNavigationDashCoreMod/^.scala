package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build[Item](children: js.Array[reactLib.reactMod.ReactNs.ReactElement[Item]]): js.Array[Item] = js.native
  def build[Item](children: js.Array[reactLib.reactMod.ReactNs.ReactElement[Item]], oldBuild: js.Array[Item]): js.Array[Item] = js.native
  def createKey(
    route: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.Route[js.Object]
  ): java.lang.String = js.native
  def get[Item /* <: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.Route[js.Object] */](
    items: js.Array[Item],
    route: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.Route[js.Object]
  ): Item = js.native
  def getRoute(
    stack: js.Array[
      reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.RouteProps
    ],
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState]
  ): js.UndefOr[
    reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.Route[js.Object]
  ] = js.native
  def renderSubView(
    render: js.Function2[/* propsA */ js.Any, /* propsB */ js.Any, reactLib.reactMod.ReactNs.ReactNode]
  ): js.Function1[/* ownProps */ js.Any, reactLib.reactMod.ReactNs.ReactNode] = js.native
  def renderSubView(
    render: js.Function2[/* propsA */ js.Any, /* propsB */ js.Any, reactLib.reactMod.ReactNs.ReactNode],
    additionalProps: js.Any
  ): js.Function1[/* ownProps */ js.Any, reactLib.reactMod.ReactNs.ReactNode] = js.native
  def runHistoryListenner(
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    onListenHistory: js.Function0[scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def shouldUpdate(
    currentItem: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.RouteProps,
    nextItem: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.RouteProps,
    currentLocation: historyLib.historyMod.Location[historyLib.historyMod.LocationState],
    nextLocation: historyLib.historyMod.Location[historyLib.historyMod.LocationState]
  ): scala.Boolean = js.native
}

