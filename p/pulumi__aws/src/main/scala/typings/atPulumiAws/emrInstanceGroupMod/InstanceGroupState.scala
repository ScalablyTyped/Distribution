package typings.atPulumiAws.emrInstanceGroupMod

import typings.atPulumiAws.typesInputMod.emr.InstanceGroupEbsConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupState extends js.Object {
  /**
    * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
    */
  val autoscalingPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
    */
  val bidPrice: js.UndefOr[Input[String]] = js.undefined
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: js.UndefOr[Input[String]] = js.undefined
  /**
    * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
    */
  val ebsConfigs: js.UndefOr[Input[js.Array[Input[InstanceGroupEbsConfig]]]] = js.undefined
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * target number of instances for the instance group. defaults to 0.
    */
  val instanceCount: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
    */
  val instanceType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Human friendly name given to the instance group. Changing this forces a new resource to be created.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  val runningInstanceCount: js.UndefOr[Input[Double]] = js.undefined
  val status: js.UndefOr[Input[String]] = js.undefined
}

object InstanceGroupState {
  @scala.inline
  def apply(
    autoscalingPolicy: Input[String] = null,
    bidPrice: Input[String] = null,
    clusterId: Input[String] = null,
    ebsConfigs: Input[js.Array[Input[InstanceGroupEbsConfig]]] = null,
    ebsOptimized: Input[Boolean] = null,
    instanceCount: Input[Double] = null,
    instanceType: Input[String] = null,
    name: Input[String] = null,
    runningInstanceCount: Input[Double] = null,
    status: Input[String] = null
  ): InstanceGroupState = {
    val __obj = js.Dynamic.literal()
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (ebsConfigs != null) __obj.updateDynamic("ebsConfigs")(ebsConfigs.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (runningInstanceCount != null) __obj.updateDynamic("runningInstanceCount")(runningInstanceCount.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupState]
  }
}

