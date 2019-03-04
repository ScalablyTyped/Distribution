package typings
package atPulumiAwsLib.cloudwatchLogDestinationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDestinationArgs extends js.Object {
  /**
    * A name for the log destination
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN of the target Amazon Kinesis stream or Amazon Lambda resource for the destination
    */
  val targetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object LogDestinationArgs {
  @scala.inline
  def apply(
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    targetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): LogDestinationArgs = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationArgs]
  }
}

