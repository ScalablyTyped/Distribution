package typings.atPulumiAws.sqsSqsMixinsMod

import typings.atPulumiAws.Anon_ApproximateFirstReceiveTimestamp
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueRecord extends js.Object {
  var attributes: Anon_ApproximateFirstReceiveTimestamp
  var awsRegion: String
  var body: String
  var eventSource: String
  var eventSourceARN: String
  var md5OfBody: String
  var messageAttributes: Record[String, _]
  var messageId: String
  var receiptHandle: String
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
    val __obj = js.Dynamic.literal(attributes = attributes, awsRegion = awsRegion, body = body, eventSource = eventSource, eventSourceARN = eventSourceARN, md5OfBody = md5OfBody, messageAttributes = messageAttributes, messageId = messageId, receiptHandle = receiptHandle)
  
    __obj.asInstanceOf[QueueRecord]
  }
}

