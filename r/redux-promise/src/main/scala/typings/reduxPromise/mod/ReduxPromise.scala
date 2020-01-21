package typings.reduxPromise.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-promise", "ReduxPromise")
@js.native
object ReduxPromise extends js.Object {
  type Promise = Middleware[js.Object, js.Any, Dispatch[AnyAction]]
}

