package typings.reduxBootstrap

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.global.JSX.Element
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.reduxBootstrap.interfacesMod.interfaces.RouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootMod {
  
  @JSImport("redux-bootstrap/dts/containers/root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(store: Store[js.Any, AnyAction], history: History[LocationState], routes: Element): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], history.asInstanceOf[js.Any], routes.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def default(
    store: Store[js.Any, AnyAction],
    history: History[LocationState],
    routes: Element,
    routerProps: RouterProps
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], history.asInstanceOf[js.Any], routes.asInstanceOf[js.Any], routerProps.asInstanceOf[js.Any])).asInstanceOf[Element]
}
