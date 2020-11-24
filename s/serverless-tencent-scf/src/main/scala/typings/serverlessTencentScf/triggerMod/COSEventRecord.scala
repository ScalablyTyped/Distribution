package typings.serverlessTencentScf.triggerMod

import typings.serverlessTencentScf.anon.CosBucket
import typings.serverlessTencentScf.anon.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait COSEventRecord extends js.Object {
  
  var cos: CosBucket = js.native
  
  var event: EventName = js.native
}
object COSEventRecord {
  
  @scala.inline
  def apply(cos: CosBucket, event: EventName): COSEventRecord = {
    val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[COSEventRecord]
  }
  
  @scala.inline
  implicit class COSEventRecordOps[Self <: COSEventRecord] (val x: Self) extends AnyVal {
    
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
    def setCos(value: CosBucket): Self = this.set("cos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: EventName): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
