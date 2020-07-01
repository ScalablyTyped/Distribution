package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgBody extends js.Object {
  var msgBody: String
  var msgId: String
  var msgTag: String
  var publishTime: String
  var requestId: String
  var subscriptionName: String
  var topicName: String
  var topicOwner: Double
  var `type`: String
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
}

