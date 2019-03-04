package typings
package atPulumiAwsLib.pinpointEventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStreamArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    */
  val destinationStreamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object EventStreamArgs {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    destinationStreamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): EventStreamArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], destinationStreamArn = destinationStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventStreamArgs]
  }
}

