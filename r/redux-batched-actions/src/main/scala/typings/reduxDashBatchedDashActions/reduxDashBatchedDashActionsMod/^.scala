package typings.reduxDashBatchedDashActions.reduxDashBatchedDashActionsMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-batched-actions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BATCH: BatchActionType = js.native
  val batchDispatchMiddleware: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  def batchActions(actions: js.Array[AnyAction]): BatchAction = js.native
  def batchActions(actions: js.Array[AnyAction], `type`: String): BatchAction = js.native
  def enableBatching[S](reduce: Reducer[S, AnyAction]): Reducer[S, AnyAction] = js.native
}

