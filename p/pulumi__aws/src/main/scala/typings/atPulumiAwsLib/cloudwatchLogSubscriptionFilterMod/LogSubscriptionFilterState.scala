package typings
package atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogSubscriptionFilterState extends js.Object {
  /**
    * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
    */
  val destinationArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
    */
  val distribution: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
    */
  val filterPattern: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the log group to associate the subscription filter with
    */
  val logGroup: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.cloudwatchLogGroupMod.LogGroup]] = js.undefined
  /**
    * A name for the subscription filter
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws_lambda_permission` resource for granting access from CloudWatch logs to the destination Lambda function.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

