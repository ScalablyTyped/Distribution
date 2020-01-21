package typings.pulumiAws.eventStreamMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStreamState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    */
  val destinationStreamArn: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object EventStreamState {
  @scala.inline
  def apply(
    applicationId: Input[String] = null,
    destinationStreamArn: Input[String] = null,
    roleArn: Input[String] = null
  ): EventStreamState = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (destinationStreamArn != null) __obj.updateDynamic("destinationStreamArn")(destinationStreamArn.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStreamState]
  }
}

