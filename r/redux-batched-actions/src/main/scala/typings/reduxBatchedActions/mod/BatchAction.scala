package typings.reduxBatchedActions.mod

import typings.redux.mod.Action
import typings.reduxBatchedActions.anon.Batch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAction extends js.Object {
  var meta: Batch = js.native
  var payload: js.Array[Action[_]] = js.native
  var `type`: BatchActionType = js.native
}

object BatchAction {
  @scala.inline
  def apply(meta: Batch, payload: js.Array[Action[_]], `type`: BatchActionType): BatchAction = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAction]
  }
  @scala.inline
  implicit class BatchActionOps[Self <: BatchAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeta(value: Batch): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayloadVarargs(value: Action[js.Any]*): Self = this.set("payload", js.Array(value :_*))
    @scala.inline
    def setPayload(value: js.Array[Action[_]]): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BatchActionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

