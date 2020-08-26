package typings.pulumiAws.kinesisMixinsMod

import typings.pulumiAws.anon.KinesisSchemaVersion
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
  var kinesis: KinesisSchemaVersion = js.native
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
    kinesis: KinesisSchemaVersion
  ): StreamEventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], invokeIdentityArn = invokeIdentityArn.asInstanceOf[js.Any], kinesis = kinesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEventRecord]
  }
  @scala.inline
  implicit class StreamEventRecordOps[Self <: StreamEventRecord] (val x: Self) extends AnyVal {
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
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventID(value: String): Self = this.set("eventID", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventName(value: awsColonkinesisColonrecord): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSource(value: awsColonkinesis): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSourceARN(value: String): Self = this.set("eventSourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventVersion(value: String): Self = this.set("eventVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvokeIdentityArn(value: String): Self = this.set("invokeIdentityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setKinesis(value: KinesisSchemaVersion): Self = this.set("kinesis", value.asInstanceOf[js.Any])
  }
  
}

