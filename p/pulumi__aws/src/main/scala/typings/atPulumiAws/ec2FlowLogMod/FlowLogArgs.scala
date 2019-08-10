package typings.atPulumiAws.ec2FlowLogMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowLogArgs extends js.Object {
  /**
    * Elastic Network Interface ID to attach to
    */
  val eniId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the logging destination.
    */
  val logDestination: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
    */
  val logDestinationType: js.UndefOr[Input[String]] = js.undefined
  /**
    * *Deprecated:* Use `logDestination` instead. The name of the CloudWatch log group.
    */
  val logGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
    */
  val trafficType: Input[String]
  /**
    * VPC ID to attach to
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object FlowLogArgs {
  @scala.inline
  def apply(
    trafficType: Input[String],
    eniId: Input[String] = null,
    iamRoleArn: Input[String] = null,
    logDestination: Input[String] = null,
    logDestinationType: Input[String] = null,
    logGroupName: Input[String] = null,
    subnetId: Input[String] = null,
    vpcId: Input[String] = null
  ): FlowLogArgs = {
    val __obj = js.Dynamic.literal(trafficType = trafficType.asInstanceOf[js.Any])
    if (eniId != null) __obj.updateDynamic("eniId")(eniId.asInstanceOf[js.Any])
    if (iamRoleArn != null) __obj.updateDynamic("iamRoleArn")(iamRoleArn.asInstanceOf[js.Any])
    if (logDestination != null) __obj.updateDynamic("logDestination")(logDestination.asInstanceOf[js.Any])
    if (logDestinationType != null) __obj.updateDynamic("logDestinationType")(logDestinationType.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLogArgs]
  }
}

