package typings.rabbitmqSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends Topology {
  var messageSchema: js.Object = js.native
  var queue: String = js.native
}

object Queue {
  @scala.inline
  def apply(messageSchema: js.Object, queue: String): Queue = {
    val __obj = js.Dynamic.literal(messageSchema = messageSchema.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  @scala.inline
  implicit class QueueOps[Self <: Queue] (val x: Self) extends AnyVal {
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
    def setMessageSchema(value: js.Object): Self = this.set("messageSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
  
}

