package typings
package atPulumiAwsLib.pinpointEventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStreamArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    */
  val destinationStreamArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  val roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

