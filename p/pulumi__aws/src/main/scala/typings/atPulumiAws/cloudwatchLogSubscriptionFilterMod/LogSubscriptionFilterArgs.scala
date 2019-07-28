package typings.atPulumiAws.cloudwatchLogSubscriptionFilterMod

import typings.atPulumiAws.cloudwatchLogGroupMod.LogGroup
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogSubscriptionFilterArgs extends js.Object {
  /**
    * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
    */
  val destinationArn: Input[String]
  /**
    * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
    */
  val distribution: js.UndefOr[Input[String]] = js.undefined
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
    */
  val filterPattern: Input[String]
  /**
    * The name of the log group to associate the subscription filter with
    */
  val logGroup: Input[LogGroup]
  /**
    * A name for the subscription filter
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws_lambda_permission` resource for granting access from CloudWatch logs to the destination Lambda function.
    */
  val roleArn: js.UndefOr[Input[String]] = js.undefined
}

object LogSubscriptionFilterArgs {
  @scala.inline
  def apply(
    destinationArn: Input[String],
    filterPattern: Input[String],
    logGroup: Input[LogGroup],
    distribution: Input[String] = null,
    name: Input[String] = null,
    roleArn: Input[String] = null
  ): LogSubscriptionFilterArgs = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], filterPattern = filterPattern.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSubscriptionFilterArgs]
  }
}

