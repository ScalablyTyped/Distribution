package typings.reduxDashTestkit.reduxDashTestkitMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.reduxDashTestkit.Anon_Flush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", "FlushThunks")
@js.native
object FlushThunksNs extends js.Object {
  def createMiddleware(): (Middleware[js.Object, _, Dispatch[AnyAction]]) with Anon_Flush = js.native
}

