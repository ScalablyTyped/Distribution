package typings.atPulumiAws.pinpointEventStreamMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStreamArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: Input[String]
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    */
  val destinationStreamArn: Input[String]
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  val roleArn: Input[String]
}

object EventStreamArgs {
  @scala.inline
  def apply(applicationId: Input[String], destinationStreamArn: Input[String], roleArn: Input[String]): EventStreamArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], destinationStreamArn = destinationStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventStreamArgs]
  }
}

