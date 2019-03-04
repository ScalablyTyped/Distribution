package typings
package reduxDashBatchedDashActionsLib.reduxDashBatchedDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAction extends js.Object {
  var meta: reduxDashBatchedDashActionsLib.Anon_Batch
  var payload: js.Array[reduxLib.reduxMod.Action[_]]
  var `type`: BatchActionType
}

object BatchAction {
  @scala.inline
  def apply(
    meta: reduxDashBatchedDashActionsLib.Anon_Batch,
    payload: js.Array[reduxLib.reduxMod.Action[_]],
    `type`: BatchActionType
  ): BatchAction = {
    val __obj = js.Dynamic.literal(meta = meta, payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BatchAction]
  }
}

