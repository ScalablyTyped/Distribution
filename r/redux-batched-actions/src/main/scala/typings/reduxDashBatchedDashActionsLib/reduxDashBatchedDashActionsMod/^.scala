package typings
package reduxDashBatchedDashActionsLib.reduxDashBatchedDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-batched-actions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BATCH: BatchActionType = js.native
  val batchDispatchMiddleware: reduxLib.reduxMod.Middleware[js.Object, js.Any, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def batchActions(actions: js.Array[reduxLib.reduxMod.AnyAction]): BatchAction = js.native
  def batchActions(actions: js.Array[reduxLib.reduxMod.AnyAction], `type`: java.lang.String): BatchAction = js.native
  def enableBatching[S](reduce: reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction]): reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction] = js.native
}

