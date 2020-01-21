package typings.reduxStateSync.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-state-sync", "createStateSyncMiddleware")
@js.native
object createStateSyncMiddleware extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(config: Config): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

