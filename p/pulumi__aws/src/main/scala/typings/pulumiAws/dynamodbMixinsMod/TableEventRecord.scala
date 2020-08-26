package typings.pulumiAws.dynamodbMixinsMod

import typings.pulumiAws.anon.ApproximateCreationDateTime
import typings.pulumiAws.anon.PrincipalId
import typings.pulumiAws.pulumiAwsStrings.INSERT
import typings.pulumiAws.pulumiAwsStrings.MODIFY
import typings.pulumiAws.pulumiAwsStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableEventRecord extends js.Object {
  var awsRegion: String = js.native
  var dynamodb: ApproximateCreationDateTime = js.native
  var eventID: String = js.native
  var eventName: INSERT | MODIFY | REMOVE = js.native
  var eventSource: String = js.native
  var eventVersion: String = js.native
  var userIdentity: PrincipalId = js.native
}

object TableEventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    dynamodb: ApproximateCreationDateTime,
    eventID: String,
    eventName: INSERT | MODIFY | REMOVE,
    eventSource: String,
    eventVersion: String,
    userIdentity: PrincipalId
  ): TableEventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], dynamodb = dynamodb.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableEventRecord]
  }
  @scala.inline
  implicit class TableEventRecordOps[Self <: TableEventRecord] (val x: Self) extends AnyVal {
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
    def setDynamodb(value: ApproximateCreationDateTime): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventID(value: String): Self = this.set("eventID", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventName(value: INSERT | MODIFY | REMOVE): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventVersion(value: String): Self = this.set("eventVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserIdentity(value: PrincipalId): Self = this.set("userIdentity", value.asInstanceOf[js.Any])
  }
  
}

