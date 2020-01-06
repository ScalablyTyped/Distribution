package typings.atPulumiAws.cloudwatchLogDestinationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogDestinationArgs extends js.Object {
  /**
    * A name for the log destination
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
    */
  val roleArn: Input[String] = js.native
  /**
    * The ARN of the target Amazon Kinesis stream resource for the destination
    */
  val targetArn: Input[String] = js.native
}

object LogDestinationArgs {
  @scala.inline
  def apply(roleArn: Input[String], targetArn: Input[String], name: Input[String] = null): LogDestinationArgs = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationArgs]
  }
}

