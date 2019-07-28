package typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build[Item](children: js.Array[ReactElement]): js.Array[Item] = js.native
  def build[Item](children: js.Array[ReactElement], oldBuild: js.Array[Item]): js.Array[Item] = js.native
  def createKey(route: Route[js.Object]): String = js.native
  def get[Item /* <: Route[js.Object] */](items: js.Array[Item], route: Route[js.Object]): Item = js.native
  def getRoute(stack: js.Array[RouteProps], location: Location[LocationState]): js.UndefOr[Route[js.Object]] = js.native
  def renderSubView(render: js.Function2[/* propsA */ js.Any, /* propsB */ js.Any, ReactNode]): js.Function1[/* ownProps */ js.Any, ReactNode] = js.native
  def renderSubView(render: js.Function2[/* propsA */ js.Any, /* propsB */ js.Any, ReactNode], additionalProps: js.Any): js.Function1[/* ownProps */ js.Any, ReactNode] = js.native
  def runHistoryListenner(history: History[LocationState], onListenHistory: js.Function0[Unit]): js.Function0[Unit] = js.native
  def shouldUpdate(
    currentItem: RouteProps,
    nextItem: RouteProps,
    currentLocation: Location[LocationState],
    nextLocation: Location[LocationState]
  ): Boolean = js.native
}

