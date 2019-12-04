package typings.reduxDashBootstrap

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.Store
import typings.redux.reduxMod.StoreEnhancer
import typings.reduxDashBootstrap.dtsInterfacesInterfacesMod.interfaces.DevToolsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-bootstrap/dts/store/configure_store", JSImport.Namespace)
@js.native
object dtsStoreConfigureUnderscoreStoreMod extends js.Object {
  def default(
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]],
    enhancers: js.Array[StoreEnhancer[_, js.Object]],
    rootReducer: Reducer[_, AnyAction],
    initialState: js.Any,
    devToolsOptions: DevToolsOptions
  ): Store[_, AnyAction] = js.native
}

