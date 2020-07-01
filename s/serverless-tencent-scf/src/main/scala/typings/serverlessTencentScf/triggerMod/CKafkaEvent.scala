package typings.serverlessTencentScf.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CKafkaEvent extends js.Object {
  var Records: js.Array[CKafkaEventRecord]
}

object CKafkaEvent {
  @scala.inline
  def apply(Records: js.Array[CKafkaEventRecord]): CKafkaEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CKafkaEvent]
  }
}

