package typings.pulumiAws.kinesisMixinsMod

import typings.pulumiAws.AnonDataKinesisSchemaVersion
import typings.pulumiAws.pulumiAwsStrings.awsColonkinesis
import typings.pulumiAws.pulumiAwsStrings.awsColonkinesisColonrecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamEventRecord extends js.Object {
  var awsRegion: String = js.native
  var eventID: String = js.native
  var eventName: awsColonkinesisColonrecord = js.native
  var eventSource: awsColonkinesis = js.native
  var eventSourceARN: String = js.native
  var eventVersion: String = js.native
  var invokeIdentityArn: String = js.native
  var kinesis: AnonDataKinesisSchemaVersion = js.native
}

object StreamEventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    eventID: String,
    eventName: awsColonkinesisColonrecord,
    eventSource: awsColonkinesis,
    eventSourceARN: String,
    eventVersion: String,
    invokeIdentityArn: String,
    kinesis: AnonDataKinesisSchemaVersion
  ): StreamEventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], invokeIdentityArn = invokeIdentityArn.asInstanceOf[js.Any], kinesis = kinesis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StreamEventRecord]
  }
}

