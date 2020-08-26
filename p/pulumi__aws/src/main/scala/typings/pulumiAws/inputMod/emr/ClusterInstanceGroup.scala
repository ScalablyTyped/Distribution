package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterInstanceGroup extends js.Object {
  /**
    * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
    */
  var autoscalingPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
    */
  var bidPrice: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
    */
  var ebsConfigs: js.UndefOr[Input[js.Array[Input[ClusterInstanceGroupEbsConfig]]]] = js.native
  /**
    * The ID of the EMR Cluster
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * Target number of instances for the instance group. Must be 1 or 3. Defaults to 1. Launching with multiple master nodes is only supported in EMR version 5.23.0+, and requires this resource's `coreInstanceGroup` to be configured. Public (Internet accessible) instances must be created in VPC subnets that have `map public IP on launch` enabled. Termination protection is automatically enabled when launched with multiple master nodes and this provider must have the `terminationProtection = false` configuration applied before destroying this resource.
    */
  var instanceCount: js.UndefOr[Input[Double]] = js.native
  /**
    * The role of the instance group in the cluster. Valid values are: `MASTER`, `CORE`, and `TASK`.
    */
  var instanceRole: Input[String] = js.native
  /**
    * EC2 instance type for all instances in the instance group.
    */
  var instanceType: Input[String] = js.native
  /**
    * The name of the step.
    */
  var name: js.UndefOr[Input[String]] = js.native
}

object ClusterInstanceGroup {
  @scala.inline
  def apply(instanceRole: Input[String], instanceType: Input[String]): ClusterInstanceGroup = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInstanceGroup]
  }
  @scala.inline
  implicit class ClusterInstanceGroupOps[Self <: ClusterInstanceGroup] (val x: Self) extends AnyVal {
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
    def setInstanceRole(value: Input[String]): Self = this.set("instanceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoscalingPolicy(value: Input[String]): Self = this.set("autoscalingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscalingPolicy: Self = this.set("autoscalingPolicy", js.undefined)
    @scala.inline
    def setBidPrice(value: Input[String]): Self = this.set("bidPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidPrice: Self = this.set("bidPrice", js.undefined)
    @scala.inline
    def setEbsConfigsVarargs(value: Input[ClusterInstanceGroupEbsConfig]*): Self = this.set("ebsConfigs", js.Array(value :_*))
    @scala.inline
    def setEbsConfigs(value: Input[js.Array[Input[ClusterInstanceGroupEbsConfig]]]): Self = this.set("ebsConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsConfigs: Self = this.set("ebsConfigs", js.undefined)
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInstanceCount(value: Input[Double]): Self = this.set("instanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("instanceCount", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

