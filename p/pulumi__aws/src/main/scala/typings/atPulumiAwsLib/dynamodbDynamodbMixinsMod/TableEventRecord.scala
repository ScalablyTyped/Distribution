package typings
package atPulumiAwsLib.dynamodbDynamodbMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEventRecord extends js.Object {
  var awsRegion: java.lang.String
  var dynamodb: atPulumiAwsLib.Anon_ApproximateCreationDateTime
  var eventID: java.lang.String
  var eventName: atPulumiAwsLib.atPulumiAwsLibStrings.INSERT | atPulumiAwsLib.atPulumiAwsLibStrings.MODIFY | atPulumiAwsLib.atPulumiAwsLibStrings.REMOVE
  var eventSource: java.lang.String
  var eventVersion: java.lang.String
  var userIdentity: atPulumiAwsLib.Anon_PrincipalId
}

object TableEventRecord {
  @scala.inline
  def apply(
    awsRegion: java.lang.String,
    dynamodb: atPulumiAwsLib.Anon_ApproximateCreationDateTime,
    eventID: java.lang.String,
    eventName: atPulumiAwsLib.atPulumiAwsLibStrings.INSERT | atPulumiAwsLib.atPulumiAwsLibStrings.MODIFY | atPulumiAwsLib.atPulumiAwsLibStrings.REMOVE,
    eventSource: java.lang.String,
    eventVersion: java.lang.String,
    userIdentity: atPulumiAwsLib.Anon_PrincipalId
  ): TableEventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, dynamodb = dynamodb, eventID = eventID, eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource, eventVersion = eventVersion, userIdentity = userIdentity)
  
    __obj.asInstanceOf[TableEventRecord]
  }
}

