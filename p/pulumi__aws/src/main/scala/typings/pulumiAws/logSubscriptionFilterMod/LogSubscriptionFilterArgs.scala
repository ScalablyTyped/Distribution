package typings.pulumiAws.logSubscriptionFilterMod

import typings.pulumiAws.cloudwatchMod.LogGroup
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSubscriptionFilterArgs extends js.Object {
  /**
    * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
    */
  val destinationArn: Input[String] = js.native
  /**
    * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
    */
  val distribution: js.UndefOr[Input[String]] = js.native
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
    */
  val filterPattern: Input[String] = js.native
  /**
    * The name of the log group to associate the subscription filter with
    */
  val logGroup: Input[String | LogGroup] = js.native
  /**
    * A name for the subscription filter
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object LogSubscriptionFilterArgs {
  @scala.inline
  def apply(destinationArn: Input[String], filterPattern: Input[String], logGroup: Input[String | LogGroup]): LogSubscriptionFilterArgs = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], filterPattern = filterPattern.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSubscriptionFilterArgs]
  }
  @scala.inline
  implicit class LogSubscriptionFilterArgsOps[Self <: LogSubscriptionFilterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationArn(value: Input[String]): Self = this.set("destinationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterPattern(value: Input[String]): Self = this.set("filterPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogGroup(value: Input[String | LogGroup]): Self = this.set("logGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistribution(value: Input[String]): Self = this.set("distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

