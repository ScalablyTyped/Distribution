package typings
package atPulumiAwsLib.ec2SpotFleetRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotFleetRequestState extends js.Object {
  /**
    * Indicates how to allocate the target capacity across
    * the Spot pools specified by the Spot fleet request. The default is
    * `lowestPrice`.
    */
  val allocationStrategy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val clientToken: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates whether running Spot
    * instances should be terminated if the target capacity of the Spot fleet
    * request is decreased below the current size of the Spot fleet.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of fleet request. Indicates whether the Spot Fleet only requests the target
    * capacity or also attempts to maintain it. Default is `maintain`.
    */
  val fleetType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Grants the Spot fleet permission to terminate
    * Spot instances on your behalf when you cancel its Spot fleet request using
    * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
    * terminateInstancesWithExpiration.
    */
  val iamFleetRole: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates whether a Spot
    * instance stops or terminates when it is interrupted. Default is
    * `terminate`.
    */
  val instanceInterruptionBehaviour: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    *
    * The number of Spot pools across which to allocate your target Spot capacity.
    * Valid only when `allocation_strategy` is set to `lowestPrice`. Spot Fleet selects
    * the cheapest Spot pools and evenly allocates your target Spot capacity across
    * the number of Spot pools that you specify.
    */
  val instancePoolsToUseCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Used to define the launch configuration of the
    * spot-fleet request. Can be specified multiple times to define different bids
    * across different markets and instance types.
    */
  val launchSpecifications: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AmiAssociatePublicIpAddress]
      ]
    ]
  ] = js.undefined
  /**
    * A list of elastic load balancer names to add to the Spot fleet.
    */
  val loadBalancers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The maximum bid price per unit hour.
    */
  val spotPrice: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The state of the Spot fleet request.
    */
  val spotRequestState: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of units to request. You can choose to set the
    * target capacity in terms of instances or a performance characteristic that is
    * important to your application workload, such as vCPUs, memory, or I/O.
    */
  val targetCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A list of `aws_alb_target_group` ARNs, for use with Application Load Balancing.
    */
  val targetGroupArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Indicates whether running Spot
    * instances should be terminated when the Spot fleet request expires.
    */
  val terminateInstancesWithExpiration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  val validFrom: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. Defaults to 24 hours.
    */
  val validUntil: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If set, Terraform will
    * wait for the Spot Request to be fulfilled, and will throw an error if the
    * timeout of 10m is reached.
    */
  val waitForFulfillment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object SpotFleetRequestState {
  @scala.inline
  def apply(
    allocationStrategy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clientToken: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    excessCapacityTerminationPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    fleetType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    iamFleetRole: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceInterruptionBehaviour: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instancePoolsToUseCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    launchSpecifications: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AmiAssociatePublicIpAddress]
      ]
    ] = null,
    loadBalancers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    replaceUnhealthyInstances: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    spotPrice: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    spotRequestState: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    targetCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    targetGroupArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    terminateInstancesWithExpiration: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    validFrom: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    validUntil: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    waitForFulfillment: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): SpotFleetRequestState = {
    val __obj = js.Dynamic.literal()
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (excessCapacityTerminationPolicy != null) __obj.updateDynamic("excessCapacityTerminationPolicy")(excessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (fleetType != null) __obj.updateDynamic("fleetType")(fleetType.asInstanceOf[js.Any])
    if (iamFleetRole != null) __obj.updateDynamic("iamFleetRole")(iamFleetRole.asInstanceOf[js.Any])
    if (instanceInterruptionBehaviour != null) __obj.updateDynamic("instanceInterruptionBehaviour")(instanceInterruptionBehaviour.asInstanceOf[js.Any])
    if (instancePoolsToUseCount != null) __obj.updateDynamic("instancePoolsToUseCount")(instancePoolsToUseCount.asInstanceOf[js.Any])
    if (launchSpecifications != null) __obj.updateDynamic("launchSpecifications")(launchSpecifications.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (replaceUnhealthyInstances != null) __obj.updateDynamic("replaceUnhealthyInstances")(replaceUnhealthyInstances.asInstanceOf[js.Any])
    if (spotPrice != null) __obj.updateDynamic("spotPrice")(spotPrice.asInstanceOf[js.Any])
    if (spotRequestState != null) __obj.updateDynamic("spotRequestState")(spotRequestState.asInstanceOf[js.Any])
    if (targetCapacity != null) __obj.updateDynamic("targetCapacity")(targetCapacity.asInstanceOf[js.Any])
    if (targetGroupArns != null) __obj.updateDynamic("targetGroupArns")(targetGroupArns.asInstanceOf[js.Any])
    if (terminateInstancesWithExpiration != null) __obj.updateDynamic("terminateInstancesWithExpiration")(terminateInstancesWithExpiration.asInstanceOf[js.Any])
    if (validFrom != null) __obj.updateDynamic("validFrom")(validFrom.asInstanceOf[js.Any])
    if (validUntil != null) __obj.updateDynamic("validUntil")(validUntil.asInstanceOf[js.Any])
    if (waitForFulfillment != null) __obj.updateDynamic("waitForFulfillment")(waitForFulfillment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestState]
  }
}

