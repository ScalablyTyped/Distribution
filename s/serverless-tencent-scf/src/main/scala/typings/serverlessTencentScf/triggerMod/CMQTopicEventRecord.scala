package typings.serverlessTencentScf.triggerMod

import typings.serverlessTencentScf.anon.MsgBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMQTopicEventRecord extends js.Object {
  var CMQ: MsgBody
}

object CMQTopicEventRecord {
  @scala.inline
  def apply(CMQ: MsgBody): CMQTopicEventRecord = {
    val __obj = js.Dynamic.literal(CMQ = CMQ.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMQTopicEventRecord]
  }
}

