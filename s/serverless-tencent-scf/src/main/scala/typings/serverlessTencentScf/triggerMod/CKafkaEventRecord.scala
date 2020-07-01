package typings.serverlessTencentScf.triggerMod

import typings.serverlessTencentScf.anon.MsgKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CKafkaEventRecord extends js.Object {
  var Ckafka: MsgKey
}

object CKafkaEventRecord {
  @scala.inline
  def apply(Ckafka: MsgKey): CKafkaEventRecord = {
    val __obj = js.Dynamic.literal(Ckafka = Ckafka.asInstanceOf[js.Any])
    __obj.asInstanceOf[CKafkaEventRecord]
  }
}

