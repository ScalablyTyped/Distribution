package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsgBody extends js.Object {
  
  var msgBody: String = js.native
  
  var msgId: String = js.native
  
  var msgTag: String = js.native
  
  var publishTime: String = js.native
  
  var requestId: String = js.native
  
  var subscriptionName: String = js.native
  
  var topicName: String = js.native
  
  var topicOwner: Double = js.native
  
  var `type`: String = js.native
}
object MsgBody {
  
  @scala.inline
  def apply(
    msgBody: String,
    msgId: String,
    msgTag: String,
    publishTime: String,
    requestId: String,
    subscriptionName: String,
    topicName: String,
    topicOwner: Double,
    `type`: String
  ): MsgBody = {
    val __obj = js.Dynamic.literal(msgBody = msgBody.asInstanceOf[js.Any], msgId = msgId.asInstanceOf[js.Any], msgTag = msgTag.asInstanceOf[js.Any], publishTime = publishTime.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], subscriptionName = subscriptionName.asInstanceOf[js.Any], topicName = topicName.asInstanceOf[js.Any], topicOwner = topicOwner.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgBody]
  }
  
  @scala.inline
  implicit class MsgBodyOps[Self <: MsgBody] (val x: Self) extends AnyVal {
    
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
    def setMsgId(value: String): Self = this.set("msgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgTag(value: String): Self = this.set("msgTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishTime(value: String): Self = this.set("publishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionName(value: String): Self = this.set("subscriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicOwner(value: Double): Self = this.set("topicOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
