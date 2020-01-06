package typings.atPulumiAws.gameliftFleetMod

import typings.atPulumiAws.typesInputMod.gamelift.FleetEc2InboundPermission
import typings.atPulumiAws.typesInputMod.gamelift.FleetResourceCreationLimitPolicy
import typings.atPulumiAws.typesInputMod.gamelift.FleetRuntimeConfiguration
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetState extends js.Object {
  /**
    * Fleet ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the Gamelift Build to be deployed on the fleet.
    */
  val buildId: js.UndefOr[Input[String]] = js.native
  /**
    * Human-readable description of the fleet.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
    */
  val ec2InboundPermissions: js.UndefOr[Input[js.Array[Input[FleetEc2InboundPermission]]]] = js.native
  /**
    * Name of an EC2 instance type. e.g. `t2.micro`
    */
  val ec2InstanceType: js.UndefOr[Input[String]] = js.native
  val logPaths: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
    */
  val metricGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the fleet.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
    */
  val newGameSessionProtectionPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Operating system of the fleet's computing resources.
    */
  val operatingSystem: js.UndefOr[Input[String]] = js.native
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
    */
  val resourceCreationLimitPolicy: js.UndefOr[Input[FleetResourceCreationLimitPolicy]] = js.native
  /**
    * Instructions for launching server processes on each instance in the fleet. See below.
    */
  val runtimeConfiguration: js.UndefOr[Input[FleetRuntimeConfiguration]] = js.native
}

object FleetState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    buildId: Input[String] = null,
    description: Input[String] = null,
    ec2InboundPermissions: Input[js.Array[Input[FleetEc2InboundPermission]]] = null,
    ec2InstanceType: Input[String] = null,
    logPaths: Input[js.Array[Input[String]]] = null,
    metricGroups: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    newGameSessionProtectionPolicy: Input[String] = null,
    operatingSystem: Input[String] = null,
    resourceCreationLimitPolicy: Input[FleetResourceCreationLimitPolicy] = null,
    runtimeConfiguration: Input[FleetRuntimeConfiguration] = null
  ): FleetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (buildId != null) __obj.updateDynamic("buildId")(buildId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ec2InboundPermissions != null) __obj.updateDynamic("ec2InboundPermissions")(ec2InboundPermissions.asInstanceOf[js.Any])
    if (ec2InstanceType != null) __obj.updateDynamic("ec2InstanceType")(ec2InstanceType.asInstanceOf[js.Any])
    if (logPaths != null) __obj.updateDynamic("logPaths")(logPaths.asInstanceOf[js.Any])
    if (metricGroups != null) __obj.updateDynamic("metricGroups")(metricGroups.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (newGameSessionProtectionPolicy != null) __obj.updateDynamic("newGameSessionProtectionPolicy")(newGameSessionProtectionPolicy.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    if (resourceCreationLimitPolicy != null) __obj.updateDynamic("resourceCreationLimitPolicy")(resourceCreationLimitPolicy.asInstanceOf[js.Any])
    if (runtimeConfiguration != null) __obj.updateDynamic("runtimeConfiguration")(runtimeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetState]
  }
}

