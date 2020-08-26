package typings.serverlessTencentScf.triggerMod

import typings.serverlessTencentScf.anon.MsgBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMQTopicEventRecord extends js.Object {
  var CMQ: MsgBody = js.native
}

object CMQTopicEventRecord {
  @scala.inline
  def apply(CMQ: MsgBody): CMQTopicEventRecord = {
    val __obj = js.Dynamic.literal(CMQ = CMQ.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMQTopicEventRecord]
  }
  @scala.inline
  implicit class CMQTopicEventRecordOps[Self <: CMQTopicEventRecord] (val x: Self) extends AnyVal {
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
    def setCMQ(value: MsgBody): Self = this.set("CMQ", value.asInstanceOf[js.Any])
  }
  
}

