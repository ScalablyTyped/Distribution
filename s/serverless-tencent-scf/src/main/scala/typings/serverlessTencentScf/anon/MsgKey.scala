package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsgKey extends js.Object {
  var msgBody: String = js.native
  var msgKey: String = js.native
  var offset: Double = js.native
  var partition: Double = js.native
  var topic: String = js.native
}

object MsgKey {
  @scala.inline
  def apply(msgBody: String, msgKey: String, offset: Double, partition: Double, topic: String): MsgKey = {
    val __obj = js.Dynamic.literal(msgBody = msgBody.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgKey]
  }
  @scala.inline
  implicit class MsgKeyOps[Self <: MsgKey] (val x: Self) extends AnyVal {
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
    def setMsgBody(value: String): Self = this.set("msgBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsgKey(value: String): Self = this.set("msgKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartition(value: Double): Self = this.set("partition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
  }
  
}

