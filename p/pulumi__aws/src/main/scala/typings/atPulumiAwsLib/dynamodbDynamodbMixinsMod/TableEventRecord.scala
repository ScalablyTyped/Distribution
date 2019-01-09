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

