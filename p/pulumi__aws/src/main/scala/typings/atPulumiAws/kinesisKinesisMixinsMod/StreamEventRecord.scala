package typings.atPulumiAws.kinesisKinesisMixinsMod

import typings.atPulumiAws.Anon_DataKinesisSchemaVersion
import typings.atPulumiAws.atPulumiAwsStrings.`aws:kinesis:record`
import typings.atPulumiAws.atPulumiAwsStrings.`aws:kinesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamEventRecord extends js.Object {
  var awsRegion: String
  var eventID: String
  var eventName: `aws:kinesis:record`
  var eventSource: `aws:kinesis`
  var eventSourceARN: String
  var eventVersion: String
  var invokeIdentityArn: String
  var kinesis: Anon_DataKinesisSchemaVersion
}

object StreamEventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventID: String,
    eventName: `aws:kinesis:record`,
    eventSource: `aws:kinesis`,
    eventSourceARN: String,
    eventVersion: String,
    invokeIdentityArn: String,
    kinesis: Anon_DataKinesisSchemaVersion
  ): StreamEventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, eventID = eventID, eventName = eventName, eventSource = eventSource, eventSourceARN = eventSourceARN, eventVersion = eventVersion, invokeIdentityArn = invokeIdentityArn, kinesis = kinesis)
  
    __obj.asInstanceOf[StreamEventRecord]
  }
}

