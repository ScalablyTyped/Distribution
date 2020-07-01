package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgKey extends js.Object {
  var msgBody: String
  var msgKey: String
  var offset: Double
  var partition: Double
  var topic: String
}

object MsgKey {
  @scala.inline
  def apply(msgBody: String, msgKey: String, offset: Double, partition: Double, topic: String): MsgKey = {
    val __obj = js.Dynamic.literal(msgBody = msgBody.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgKey]
  }
}

