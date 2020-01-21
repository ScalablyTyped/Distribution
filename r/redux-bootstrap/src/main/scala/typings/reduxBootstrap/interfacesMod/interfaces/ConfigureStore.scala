package typings.reduxBootstrap.interfacesMod.interfaces

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Store
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

