package typings
package atPulumiAwsLib.gameliftFleetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetArgs extends js.Object {
  /**
    * ID of the Gamelift Build to be deployed on the fleet.
    */
  val buildId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Human-readable description of the fleet.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
    */
  val ec2InboundPermissions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FromPortIpRange]]]
  ] = js.undefined
  /**
    * Name of an EC2 instance type. e.g. `t2.micro`
    */
  val ec2InstanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
    */
  val metricGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the fleet.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
    */
  val newGameSessionProtectionPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
    */
  val resourceCreationLimitPolicy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NewGameSessionsPerCreatorPolicyPeriodInMinutes]
  ] = js.undefined
  /**
    * Instructions for launching server processes on each instance in the fleet. See below.
    */
  val runtimeConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.Anon_GameSessionActivationTimeoutSecondsMaxConcurrentGameSessionActivations
    ]
  ] = js.undefined
}

object FleetArgs {
  @scala.inline
  def apply(
    buildId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ec2InstanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ec2InboundPermissions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FromPortIpRange]]] = null,
    metricGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    newGameSessionProtectionPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceCreationLimitPolicy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NewGameSessionsPerCreatorPolicyPeriodInMinutes] = null,
    runtimeConfiguration: atPulumiPulumiLib.outputMod.Input[
      atPulumiAwsLib.Anon_GameSessionActivationTimeoutSecondsMaxConcurrentGameSessionActivations
    ] = null
  ): FleetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildId")(buildId.asInstanceOf[js.Any])
    __obj.updateDynamic("ec2InstanceType")(ec2InstanceType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ec2InboundPermissions != null) __obj.updateDynamic("ec2InboundPermissions")(ec2InboundPermissions.asInstanceOf[js.Any])
    if (metricGroups != null) __obj.updateDynamic("metricGroups")(metricGroups.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (newGameSessionProtectionPolicy != null) __obj.updateDynamic("newGameSessionProtectionPolicy")(newGameSessionProtectionPolicy.asInstanceOf[js.Any])
    if (resourceCreationLimitPolicy != null) __obj.updateDynamic("resourceCreationLimitPolicy")(resourceCreationLimitPolicy.asInstanceOf[js.Any])
    if (runtimeConfiguration != null) __obj.updateDynamic("runtimeConfiguration")(runtimeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetArgs]
  }
}

