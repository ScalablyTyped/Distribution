package typings.atPulumiAws.dynamodbDynamodbMixinsMod

import typings.atPulumiAws.Anon_ApproximateCreationDateTime
import typings.atPulumiAws.Anon_PrincipalId
import typings.atPulumiAws.atPulumiAwsStrings.INSERT
import typings.atPulumiAws.atPulumiAwsStrings.MODIFY
import typings.atPulumiAws.atPulumiAwsStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEventRecord extends js.Object {
  var awsRegion: String
  var dynamodb: Anon_ApproximateCreationDateTime
  var eventID: String
  var eventName: INSERT | MODIFY | REMOVE
  var eventSource: String
  var eventVersion: String
  var userIdentity: Anon_PrincipalId
}

object TableEventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    dynamodb: Anon_ApproximateCreationDateTime,
    eventID: String,
    eventName: INSERT | MODIFY | REMOVE,
    eventSource: String,
    eventVersion: String,
    userIdentity: Anon_PrincipalId
  ): TableEventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, dynamodb = dynamodb, eventID = eventID, eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource, eventVersion = eventVersion, userIdentity = userIdentity)
  
    __obj.asInstanceOf[TableEventRecord]
  }
}

