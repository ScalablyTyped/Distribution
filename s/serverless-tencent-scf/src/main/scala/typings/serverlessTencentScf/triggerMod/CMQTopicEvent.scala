package typings.serverlessTencentScf.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMQTopicEvent extends js.Object {
  var Records: js.Array[CMQTopicEventRecord]
}

object CMQTopicEvent {
  @scala.inline
  def apply(Records: js.Array[CMQTopicEventRecord]): CMQTopicEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMQTopicEvent]
  }
}

