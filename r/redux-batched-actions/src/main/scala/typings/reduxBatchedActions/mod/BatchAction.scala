package typings.reduxBatchedActions.mod

import typings.redux.mod.Action
import typings.reduxBatchedActions.anon.Batch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAction extends js.Object {
  var meta: Batch
  var payload: js.Array[Action[_]]
  var `type`: BatchActionType
}

object BatchAction {
  @scala.inline
  def apply(meta: Batch, payload: js.Array[Action[_]], `type`: BatchActionType): BatchAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAction]
  }
}

