package typings.atPulumiAws.sqsSqsMixinsMod

import typings.atPulumiAws.Anon_ApproximateFirstReceiveTimestamp
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueRecord extends js.Object {
  var attributes: Anon_ApproximateFirstReceiveTimestamp = js.native
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
    attributes: Anon_ApproximateFirstReceiveTimestamp,
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
}

