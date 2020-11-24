package typings.serverlessTencentScf.triggerMod

import typings.serverlessTencentScf.anon.MsgKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CKafkaEventRecord extends js.Object {
  
  var Ckafka: MsgKey = js.native
}
object CKafkaEventRecord {
  
  @scala.inline
  def apply(Ckafka: MsgKey): CKafkaEventRecord = {
    val __obj = js.Dynamic.literal(Ckafka = Ckafka.asInstanceOf[js.Any])
    __obj.asInstanceOf[CKafkaEventRecord]
  }
  
  @scala.inline
  implicit class CKafkaEventRecordOps[Self <: CKafkaEventRecord] (val x: Self) extends AnyVal {
    
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
    def setCkafka(value: MsgKey): Self = this.set("Ckafka", value.asInstanceOf[js.Any])
  }
}
