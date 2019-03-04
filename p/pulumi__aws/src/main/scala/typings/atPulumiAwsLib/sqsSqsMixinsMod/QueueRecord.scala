package typings
package atPulumiAwsLib.sqsSqsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueRecord extends js.Object {
  var attributes: atPulumiAwsLib.Anon_ApproximateFirstReceiveTimestamp
  var awsRegion: java.lang.String
  var body: java.lang.String
  var eventSource: java.lang.String
  var eventSourceARN: java.lang.String
  var md5OfBody: java.lang.String
  var messageAttributes: stdLib.Record[java.lang.String, _]
  var messageId: java.lang.String
  var receiptHandle: java.lang.String
}

object QueueRecord {
  @scala.inline
  def apply(
    attributes: atPulumiAwsLib.Anon_ApproximateFirstReceiveTimestamp,
    awsRegion: java.lang.String,
    body: java.lang.String,
    eventSource: java.lang.String,
    eventSourceARN: java.lang.String,
    md5OfBody: java.lang.String,
    messageAttributes: stdLib.Record[java.lang.String, _],
    messageId: java.lang.String,
    receiptHandle: java.lang.String
  ): QueueRecord = {
    val __obj = js.Dynamic.literal(attributes = attributes, awsRegion = awsRegion, body = body, eventSource = eventSource, eventSourceARN = eventSourceARN, md5OfBody = md5OfBody, messageAttributes = messageAttributes, messageId = messageId, receiptHandle = receiptHandle)
  
    __obj.asInstanceOf[QueueRecord]
  }
}

