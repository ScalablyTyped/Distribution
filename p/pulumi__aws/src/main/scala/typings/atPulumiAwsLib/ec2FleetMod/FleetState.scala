package typings
package atPulumiAwsLib.ec2FleetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetState extends js.Object {
  /**
    * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType
    ]
  ] = js.undefined
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllocationStrategyInput]] = js.undefined
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount
    ]
  ] = js.undefined
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity]
  ] = js.undefined
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

