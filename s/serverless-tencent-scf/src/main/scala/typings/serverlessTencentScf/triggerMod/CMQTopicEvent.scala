package typings.serverlessTencentScf.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMQTopicEvent extends js.Object {
  var Records: js.Array[CMQTopicEventRecord] = js.native
}

object CMQTopicEvent {
  @scala.inline
  def apply(Records: js.Array[CMQTopicEventRecord]): CMQTopicEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMQTopicEvent]
  }
  @scala.inline
  implicit class CMQTopicEventOps[Self <: CMQTopicEvent] (val x: Self) extends AnyVal {
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
    def setRecordsVarargs(value: CMQTopicEventRecord*): Self = this.set("Records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: js.Array[CMQTopicEventRecord]): Self = this.set("Records", value.asInstanceOf[js.Any])
  }
  
}

