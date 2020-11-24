package typings.reduxBootstrap

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.global.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.reduxBootstrap.interfacesMod.interfaces.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-bootstrap/dts/containers/root", JSImport.Namespace)
@js.native
object rootMod extends js.Object {
  
  def default(store: Store[_, AnyAction], history: History[LocationState], routes: Element): Element = js.native
  def default(
    store: Store[_, AnyAction],
    history: History[LocationState],
    routes: Element,
    routerProps: RouterProps
  ): Element = js.native
}
