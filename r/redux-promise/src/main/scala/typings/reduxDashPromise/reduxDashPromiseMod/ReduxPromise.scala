package typings.reduxDashPromise.reduxDashPromiseMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-promise", "ReduxPromise")
@js.native
object ReduxPromise extends js.Object {
  type Promise = Middleware[js.Object, js.Any, Dispatch[AnyAction]]
}

