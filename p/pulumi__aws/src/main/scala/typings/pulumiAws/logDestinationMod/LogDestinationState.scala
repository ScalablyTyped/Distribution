package typings.pulumiAws.logDestinationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogDestinationState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the log destination.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A name for the log destination
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the target Amazon Kinesis stream resource for the destination
    */
  val targetArn: js.UndefOr[Input[String]] = js.native
}

object LogDestinationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    roleArn: Input[String] = null,
    targetArn: Input[String] = null
  ): LogDestinationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationState]
  }
}

