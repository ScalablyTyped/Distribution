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
}

