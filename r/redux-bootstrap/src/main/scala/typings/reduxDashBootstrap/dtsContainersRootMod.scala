package typings.reduxDashBootstrap

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.react.reactMod._Global_.JSX.Element
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import typings.reduxDashBootstrap.dtsInterfacesInterfacesMod.interfaces.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-bootstrap/dts/containers/root", JSImport.Namespace)
@js.native
object dtsContainersRootMod extends js.Object {
  def default(store: Store[_, AnyAction], history: History[LocationState], routes: Element): Element = js.native
  def default(
    store: Store[_, AnyAction],
    history: History[LocationState],
    routes: Element,
    routerProps: RouterProps
  ): Element = js.native
}

