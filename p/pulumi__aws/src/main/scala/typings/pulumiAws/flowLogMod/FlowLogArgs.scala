package typings.pulumiAws.flowLogMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowLogArgs extends js.Object {
  /**
    * Elastic Network Interface ID to attach to
    */
  val eniId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the logging destination.
    */
  val logDestination: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
    */
  val logDestinationType: js.UndefOr[Input[String]] = js.native
  /**
    * The fields to include in the flow log record, in the order in which they should appear.
    */
  val logFormat: js.UndefOr[Input[String]] = js.native
  /**
    * *Deprecated:* Use `logDestination` instead. The name of the CloudWatch log group.
    *
    * @deprecated use 'log_destination' argument instead
    */
  val logGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum interval of time
    * during which a flow of packets is captured and aggregated into a flow
    * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
    * minutes). Default: `600`.
    */
  val maxAggregationInterval: js.UndefOr[Input[Double]] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
    */
  val trafficType: Input[String] = js.native
  /**
    * VPC ID to attach to
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object FlowLogArgs {
  @scala.inline
  def apply(trafficType: Input[String]): FlowLogArgs = {
    val __obj = js.Dynamic.literal(trafficType = trafficType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLogArgs]
  }
  @scala.inline
  implicit class FlowLogArgsOps[Self <: FlowLogArgs] (val x: Self) extends AnyVal {
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
    def setTrafficType(value: Input[String]): Self = this.set("trafficType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEniId(value: Input[String]): Self = this.set("eniId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEniId: Self = this.set("eniId", js.undefined)
    @scala.inline
    def setIamRoleArn(value: Input[String]): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("iamRoleArn", js.undefined)
    @scala.inline
    def setLogDestination(value: Input[String]): Self = this.set("logDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDestination: Self = this.set("logDestination", js.undefined)
    @scala.inline
    def setLogDestinationType(value: Input[String]): Self = this.set("logDestinationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDestinationType: Self = this.set("logDestinationType", js.undefined)
    @scala.inline
    def setLogFormat(value: Input[String]): Self = this.set("logFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogFormat: Self = this.set("logFormat", js.undefined)
    @scala.inline
    def setLogGroupName(value: Input[String]): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    @scala.inline
    def setMaxAggregationInterval(value: Input[Double]): Self = this.set("maxAggregationInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAggregationInterval: Self = this.set("maxAggregationInterval", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

