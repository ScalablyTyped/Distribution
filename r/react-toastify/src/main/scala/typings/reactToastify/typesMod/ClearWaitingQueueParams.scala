package typings.reactToastify.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearWaitingQueueParams extends js.Object {
  var containerId: js.UndefOr[Id] = js.native
}

object ClearWaitingQueueParams {
  @scala.inline
  def apply(): ClearWaitingQueueParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearWaitingQueueParams]
  }
  @scala.inline
  implicit class ClearWaitingQueueParamsOps[Self <: ClearWaitingQueueParams] (val x: Self) extends AnyVal {
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
    def setContainerId(value: Id): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
  }
  
}

