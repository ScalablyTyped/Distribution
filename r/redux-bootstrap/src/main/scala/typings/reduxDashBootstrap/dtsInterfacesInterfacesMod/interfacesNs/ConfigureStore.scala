package typings.reduxDashBootstrap.dtsInterfacesInterfacesMod.interfacesNs

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureStore
  extends js.Function {
  def apply(
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]],
    rootReducer: js.Object,
    initialState: js.Any
  ): Store[_, AnyAction] = js.native
}

