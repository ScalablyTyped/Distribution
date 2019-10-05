package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "startListener")
@js.native
object startListener extends js.Object {
  def apply(history: History[LocationState], store: Store[_, AnyAction]): Unit = js.native
}

