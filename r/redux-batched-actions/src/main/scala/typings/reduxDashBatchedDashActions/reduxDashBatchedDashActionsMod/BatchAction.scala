package typings.reduxDashBatchedDashActions.reduxDashBatchedDashActionsMod

import typings.redux.reduxMod.Action
import typings.reduxDashBatchedDashActions.Anon_Batch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAction extends js.Object {
  var meta: Anon_Batch
  var payload: js.Array[Action[_]]
  var `type`: BatchActionType
}

object BatchAction {
  @scala.inline
  def apply(meta: Anon_Batch, payload: js.Array[Action[_]], `type`: BatchActionType): BatchAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAction]
  }
}

