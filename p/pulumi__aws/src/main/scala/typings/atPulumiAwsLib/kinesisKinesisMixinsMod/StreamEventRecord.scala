package typings
package atPulumiAwsLib.kinesisKinesisMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamEventRecord extends js.Object {
  var awsRegion: java.lang.String
  var eventID: java.lang.String
  var eventName: atPulumiAwsLib.atPulumiAwsLibStrings.`aws:kinesis:record`
  var eventSource: atPulumiAwsLib.atPulumiAwsLibStrings.`aws:kinesis`
  var eventSourceARN: java.lang.String
  var eventVersion: java.lang.String
  var invokeIdentityArn: java.lang.String
  var kinesis: atPulumiAwsLib.Anon_DataKinesisSchemaVersion
}

object StreamEventRecord {
  @scala.inline
  def apply(
    awsRegion: java.lang.String,
    eventID: java.lang.String,
    eventName: atPulumiAwsLib.atPulumiAwsLibStrings.`aws:kinesis:record`,
    eventSource: atPulumiAwsLib.atPulumiAwsLibStrings.`aws:kinesis`,
    eventSourceARN: java.lang.String,
    eventVersion: java.lang.String,
    invokeIdentityArn: java.lang.String,
    kinesis: atPulumiAwsLib.Anon_DataKinesisSchemaVersion
  ): StreamEventRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("awsRegion")(awsRegion)
    __obj.updateDynamic("eventID")(eventID)
    __obj.updateDynamic("eventName")(eventName)
    __obj.updateDynamic("eventSource")(eventSource)
    __obj.updateDynamic("eventSourceARN")(eventSourceARN)
    __obj.updateDynamic("eventVersion")(eventVersion)
    __obj.updateDynamic("invokeIdentityArn")(invokeIdentityArn)
    __obj.updateDynamic("kinesis")(kinesis)
    __obj.asInstanceOf[StreamEventRecord]
  }
}

