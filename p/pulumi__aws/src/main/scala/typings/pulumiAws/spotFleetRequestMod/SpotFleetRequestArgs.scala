package typings.pulumiAws.spotFleetRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchSpecification
import typings.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchTemplateConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestArgs extends js.Object {
  /**
    * Indicates how to allocate the target capacity across
    * the Spot pools specified by the Spot fleet request. The default is
    * `lowestPrice`.
    */
  val allocationStrategy: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether running Spot
    * instances should be terminated if the target capacity of the Spot fleet
    * request is decreased below the current size of the Spot fleet.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The type of fleet request. Indicates whether the Spot Fleet only requests the target
    * capacity or also attempts to maintain it. Default is `maintain`.
    */
  val fleetType: js.UndefOr[Input[String]] = js.native
  /**
    * Grants the Spot fleet permission to terminate
    * Spot instances on your behalf when you cancel its Spot fleet request using
    * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
    * terminateInstancesWithExpiration.
    */
  val iamFleetRole: Input[String] = js.native
  /**
    * Indicates whether a Spot
    * instance stops or terminates when it is interrupted. Default is
    * `terminate`.
    */
  val instanceInterruptionBehaviour: js.UndefOr[Input[String]] = js.native
  /**
    * The number of Spot pools across which to allocate your target Spot capacity.
    * Valid only when `allocationStrategy` is set to `lowestPrice`. Spot Fleet selects
    * the cheapest Spot pools and evenly allocates your target Spot capacity across
    * the number of Spot pools that you specify.
    */
  val instancePoolsToUseCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Used to define the launch configuration of the
    * spot-fleet request. Can be specified multiple times to define different bids
    * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
    */
  val launchSpecifications: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecification]]]] = js.native
  /**
    * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
    */
  val launchTemplateConfigs: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchTemplateConfig]]]] = js.native
  /**
    * A list of elastic load balancer names to add to the Spot fleet.
    */
  val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum spot bid for this override request.
    */
  val spotPrice: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The number of units to request. You can choose to set the
    * target capacity in terms of instances or a performance characteristic that is
    * important to your application workload, such as vCPUs, memory, or I/O.
    */
  val targetCapacity: Input[Double] = js.native
  /**
    * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
    */
  val targetGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Indicates whether running Spot
    * instances should be terminated when the Spot fleet request expires.
    */
  val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  val validFrom: js.UndefOr[Input[String]] = js.native
  /**
    * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. Defaults to 24 hours.
    */
  val validUntil: js.UndefOr[Input[String]] = js.native
  /**
    * If set, this provider will
    * wait for the Spot Request to be fulfilled, and will throw an error if the
    * timeout of 10m is reached.
    */
  val waitForFulfillment: js.UndefOr[Input[Boolean]] = js.native
}

object SpotFleetRequestArgs {
  @scala.inline
  def apply(iamFleetRole: Input[String], targetCapacity: Input[Double]): SpotFleetRequestArgs = {
    val __obj = js.Dynamic.literal(iamFleetRole = iamFleetRole.asInstanceOf[js.Any], targetCapacity = targetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestArgs]
  }
  @scala.inline
  implicit class SpotFleetRequestArgsOps[Self <: SpotFleetRequestArgs] (val x: Self) extends AnyVal {
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
    def setIamFleetRole(value: Input[String]): Self = this.set("iamFleetRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetCapacity(value: Input[Double]): Self = this.set("targetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocationStrategy(value: Input[String]): Self = this.set("allocationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationStrategy: Self = this.set("allocationStrategy", js.undefined)
    @scala.inline
    def setExcessCapacityTerminationPolicy(value: Input[String]): Self = this.set("excessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcessCapacityTerminationPolicy: Self = this.set("excessCapacityTerminationPolicy", js.undefined)
    @scala.inline
    def setFleetType(value: Input[String]): Self = this.set("fleetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetType: Self = this.set("fleetType", js.undefined)
    @scala.inline
    def setInstanceInterruptionBehaviour(value: Input[String]): Self = this.set("instanceInterruptionBehaviour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInterruptionBehaviour: Self = this.set("instanceInterruptionBehaviour", js.undefined)
    @scala.inline
    def setInstancePoolsToUseCount(value: Input[Double]): Self = this.set("instancePoolsToUseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancePoolsToUseCount: Self = this.set("instancePoolsToUseCount", js.undefined)
    @scala.inline
    def setLaunchSpecificationsVarargs(value: Input[SpotFleetRequestLaunchSpecification]*): Self = this.set("launchSpecifications", js.Array(value :_*))
    @scala.inline
    def setLaunchSpecifications(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecification]]]): Self = this.set("launchSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchSpecifications: Self = this.set("launchSpecifications", js.undefined)
    @scala.inline
    def setLaunchTemplateConfigsVarargs(value: Input[SpotFleetRequestLaunchTemplateConfig]*): Self = this.set("launchTemplateConfigs", js.Array(value :_*))
    @scala.inline
    def setLaunchTemplateConfigs(value: Input[js.Array[Input[SpotFleetRequestLaunchTemplateConfig]]]): Self = this.set("launchTemplateConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateConfigs: Self = this.set("launchTemplateConfigs", js.undefined)
    @scala.inline
    def setLoadBalancersVarargs(value: Input[String]*): Self = this.set("loadBalancers", js.Array(value :_*))
    @scala.inline
    def setLoadBalancers(value: Input[js.Array[Input[String]]]): Self = this.set("loadBalancers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancers: Self = this.set("loadBalancers", js.undefined)
    @scala.inline
    def setReplaceUnhealthyInstances(value: Input[Boolean]): Self = this.set("replaceUnhealthyInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceUnhealthyInstances: Self = this.set("replaceUnhealthyInstances", js.undefined)
    @scala.inline
    def setSpotPrice(value: Input[String]): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotPrice: Self = this.set("spotPrice", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetGroupArnsVarargs(value: Input[String]*): Self = this.set("targetGroupArns", js.Array(value :_*))
    @scala.inline
    def setTargetGroupArns(value: Input[js.Array[Input[String]]]): Self = this.set("targetGroupArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupArns: Self = this.set("targetGroupArns", js.undefined)
    @scala.inline
    def setTerminateInstancesWithExpiration(value: Input[Boolean]): Self = this.set("terminateInstancesWithExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateInstancesWithExpiration: Self = this.set("terminateInstancesWithExpiration", js.undefined)
    @scala.inline
    def setValidFrom(value: Input[String]): Self = this.set("validFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidFrom: Self = this.set("validFrom", js.undefined)
    @scala.inline
    def setValidUntil(value: Input[String]): Self = this.set("validUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidUntil: Self = this.set("validUntil", js.undefined)
    @scala.inline
    def setWaitForFulfillment(value: Input[Boolean]): Self = this.set("waitForFulfillment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForFulfillment: Self = this.set("waitForFulfillment", js.undefined)
  }
  
}

