package typings.reduxTestkit.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxTestkit.anon.Flush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", "FlushThunks")
@js.native
object FlushThunks extends js.Object {
  def createMiddleware(): (Middleware[js.Object, _, Dispatch[AnyAction]]) with Flush = js.native
}

