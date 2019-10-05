package typings.reduxDashStorage.reduxDashStorageMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-storage", "createMiddleware")
@js.native
object createMiddleware extends js.Object {
  def apply(engine: StorageEngine): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(engine: StorageEngine, actionBlacklist: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: ActionTypeCheckCallback): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

