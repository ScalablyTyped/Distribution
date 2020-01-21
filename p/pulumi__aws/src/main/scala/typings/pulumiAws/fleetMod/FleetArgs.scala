package typings.pulumiAws.fleetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig
import typings.pulumiAws.inputMod.ec2.FleetOnDemandOptions
import typings.pulumiAws.inputMod.ec2.FleetSpotOptions
import typings.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetArgs extends js.Object {
  /**
    * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: Input[FleetLaunchTemplateConfig] = js.native
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: js.UndefOr[Input[FleetOnDemandOptions]] = js.native
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: js.UndefOr[Input[FleetSpotOptions]] = js.native
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: Input[FleetTargetCapacitySpecification] = js.native
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object FleetArgs {
  @scala.inline
  def apply(
    launchTemplateConfig: Input[FleetLaunchTemplateConfig],
    targetCapacitySpecification: Input[FleetTargetCapacitySpecification],
    excessCapacityTerminationPolicy: Input[String] = null,
    onDemandOptions: Input[FleetOnDemandOptions] = null,
    replaceUnhealthyInstances: Input[Boolean] = null,
    spotOptions: Input[FleetSpotOptions] = null,
    tags: Input[StringDictionary[_]] = null,
    terminateInstances: Input[Boolean] = null,
    terminateInstancesWithExpiration: Input[Boolean] = null,
    `type`: Input[String] = null
  ): FleetArgs = {
    val __obj = js.Dynamic.literal(launchTemplateConfig = launchTemplateConfig.asInstanceOf[js.Any], targetCapacitySpecification = targetCapacitySpecification.asInstanceOf[js.Any])
    if (excessCapacityTerminationPolicy != null) __obj.updateDynamic("excessCapacityTerminationPolicy")(excessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (onDemandOptions != null) __obj.updateDynamic("onDemandOptions")(onDemandOptions.asInstanceOf[js.Any])
    if (replaceUnhealthyInstances != null) __obj.updateDynamic("replaceUnhealthyInstances")(replaceUnhealthyInstances.asInstanceOf[js.Any])
    if (spotOptions != null) __obj.updateDynamic("spotOptions")(spotOptions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (terminateInstances != null) __obj.updateDynamic("terminateInstances")(terminateInstances.asInstanceOf[js.Any])
    if (terminateInstancesWithExpiration != null) __obj.updateDynamic("terminateInstancesWithExpiration")(terminateInstancesWithExpiration.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetArgs]
  }
}

