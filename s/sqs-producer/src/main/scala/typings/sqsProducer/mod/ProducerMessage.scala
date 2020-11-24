package typings.sqsProducer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProducerMessage extends js.Object {
  
  var body: String = js.native
  
  var deduplicationId: js.UndefOr[String] = js.native
  
  var delaySeconds: js.UndefOr[Double] = js.native
  
  var groupId: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var messageAttributes: js.UndefOr[StringDictionary[ProducerMessageAttribute]] = js.native
}
object ProducerMessage {
  
  @scala.inline
  def apply(body: String, id: String): ProducerMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
  
  @scala.inline
  implicit class ProducerMessageOps[Self <: ProducerMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeduplicationId(value: String): Self = this.set("deduplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeduplicationId: Self = this.set("deduplicationId", js.undefined)
    
    @scala.inline
    def setDelaySeconds(value: Double): Self = this.set("delaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelaySeconds: Self = this.set("delaySeconds", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setMessageAttributes(value: StringDictionary[ProducerMessageAttribute]): Self = this.set("messageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageAttributes: Self = this.set("messageAttributes", js.undefined)
  }
}
