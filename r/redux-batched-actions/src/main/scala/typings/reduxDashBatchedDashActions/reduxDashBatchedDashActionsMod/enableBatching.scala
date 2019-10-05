package typings.reduxDashBatchedDashActions.reduxDashBatchedDashActionsMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-batched-actions", "enableBatching")
@js.native
object enableBatching extends js.Object {
  def apply[S](reduce: Reducer[S, AnyAction]): Reducer[S, AnyAction] = js.native
}

