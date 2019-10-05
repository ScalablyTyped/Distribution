package typings.atPulumiAws.ec2FleetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.FleetLaunchTemplateConfig
import typings.atPulumiAws.typesInputMod.ec2.FleetOnDemandOptions
import typings.atPulumiAws.typesInputMod.ec2.FleetSpotOptions
import typings.atPulumiAws.typesInputMod.ec2.FleetTargetCapacitySpecification
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetArgs extends js.Object {
  /**
    * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: Input[FleetLaunchTemplateConfig]
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: js.UndefOr[Input[FleetOnDemandOptions]] = js.undefined
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: js.UndefOr[Input[FleetSpotOptions]] = js.undefined
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: Input[FleetTargetCapacitySpecification]
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: js.UndefOr[Input[String]] = js.undefined
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
    tags: Input[StringDictionary[Input[String]]] = null,
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

