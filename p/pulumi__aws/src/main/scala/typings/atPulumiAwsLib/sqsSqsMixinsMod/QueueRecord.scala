package typings
package atPulumiAwsLib.sqsSqsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueRecord extends js.Object {
  var attributes: atPulumiAwsLib.Anon_ApproximateReceiveCount
  var awsRegion: java.lang.String
  var body: java.lang.String
  var eventSource: java.lang.String
  var eventSourceARN: java.lang.String
  var md5OfBody: java.lang.String
  var messageAttributes: stdLib.Record[java.lang.String, _]
  var messageId: java.lang.String
  var receiptHandle: java.lang.String
}

