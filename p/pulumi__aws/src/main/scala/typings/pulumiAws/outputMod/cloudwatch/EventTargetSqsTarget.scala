package typings.pulumiAws.outputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetSqsTarget extends js.Object {
  /**
    * The FIFO message group ID to use as the target.
    */
  var messageGroupId: js.UndefOr[String] = js.native
}

object EventTargetSqsTarget {
  @scala.inline
  def apply(): EventTargetSqsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTargetSqsTarget]
  }
  @scala.inline
  implicit class EventTargetSqsTargetOps[Self <: EventTargetSqsTarget] (val x: Self) extends AnyVal {
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
    def setMessageGroupId(value: String): Self = this.set("messageGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageGroupId: Self = this.set("messageGroupId", js.undefined)
  }
  
}

