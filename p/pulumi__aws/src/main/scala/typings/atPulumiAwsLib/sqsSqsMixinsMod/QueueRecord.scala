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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("awsRegion")(awsRegion)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("eventSource")(eventSource)
    __obj.updateDynamic("eventSourceARN")(eventSourceARN)
    __obj.updateDynamic("md5OfBody")(md5OfBody)
    __obj.updateDynamic("messageAttributes")(messageAttributes)
    __obj.updateDynamic("messageId")(messageId)
    __obj.updateDynamic("receiptHandle")(receiptHandle)
    __obj.asInstanceOf[QueueRecord]
  }
}

