package typings.pulumiAws.sqsMixinsMod

import typings.pulumiAws.anon.ApproximateFirstReceiveTimestamp
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueRecord extends js.Object {
  
  var attributes: ApproximateFirstReceiveTimestamp = js.native
  
  var awsRegion: String = js.native
  
  var body: String = js.native
  
  var eventSource: String = js.native
  
  var eventSourceARN: String = js.native
  
  var md5OfBody: String = js.native
  
  var messageAttributes: Record[String, _] = js.native
  
  var messageId: String = js.native
  
  var receiptHandle: String = js.native
}
object QueueRecord {
  
  @scala.inline
  def apply(
    attributes: ApproximateFirstReceiveTimestamp,
    awsRegion: String,
    body: String,
    eventSource: String,
    eventSourceARN: String,
    md5OfBody: String,
    messageAttributes: Record[String, _],
    messageId: String,
    receiptHandle: String
  ): QueueRecord = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], awsRegion = awsRegion.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], md5OfBody = md5OfBody.asInstanceOf[js.Any], messageAttributes = messageAttributes.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], receiptHandle = receiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueRecord]
  }
  
  @scala.inline
  implicit class QueueRecordOps[Self <: QueueRecord] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: ApproximateFirstReceiveTimestamp): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceARN(value: String): Self = this.set("eventSourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5OfBody(value: String): Self = this.set("md5OfBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageAttributes(value: Record[String, _]): Self = this.set("messageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptHandle(value: String): Self = this.set("receiptHandle", value.asInstanceOf[js.Any])
  }
}
