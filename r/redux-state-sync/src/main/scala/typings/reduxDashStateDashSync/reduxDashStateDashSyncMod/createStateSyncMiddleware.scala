package typings.reduxDashStateDashSync.reduxDashStateDashSyncMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-state-sync", "createStateSyncMiddleware")
@js.native
object createStateSyncMiddleware extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(config: Config): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

