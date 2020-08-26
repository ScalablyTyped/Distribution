package typings.pulumiAws.gameliftFleetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission
import typings.pulumiAws.inputMod.gamelift.FleetResourceCreationLimitPolicy
import typings.pulumiAws.inputMod.gamelift.FleetRuntimeConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetArgs extends js.Object {
  /**
    * ID of the Gamelift Build to be deployed on the fleet.
    */
  val buildId: Input[String] = js.native
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
  val ec2InstanceType: Input[String] = js.native
  /**
    * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
    */
  val fleetType: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of an IAM role that instances in the fleet can assume.
    */
  val instanceRoleArn: js.UndefOr[Input[String]] = js.native
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
    * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
    */
  val resourceCreationLimitPolicy: js.UndefOr[Input[FleetResourceCreationLimitPolicy]] = js.native
  /**
    * Instructions for launching server processes on each instance in the fleet. See below.
    */
  val runtimeConfiguration: js.UndefOr[Input[FleetRuntimeConfiguration]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object FleetArgs {
  @scala.inline
  def apply(buildId: Input[String], ec2InstanceType: Input[String]): FleetArgs = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], ec2InstanceType = ec2InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetArgs]
  }
  @scala.inline
  implicit class FleetArgsOps[Self <: FleetArgs] (val x: Self) extends AnyVal {
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
    def setBuildId(value: Input[String]): Self = this.set("buildId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEc2InstanceType(value: Input[String]): Self = this.set("ec2InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEc2InboundPermissionsVarargs(value: Input[FleetEc2InboundPermission]*): Self = this.set("ec2InboundPermissions", js.Array(value :_*))
    @scala.inline
    def setEc2InboundPermissions(value: Input[js.Array[Input[FleetEc2InboundPermission]]]): Self = this.set("ec2InboundPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2InboundPermissions: Self = this.set("ec2InboundPermissions", js.undefined)
    @scala.inline
    def setFleetType(value: Input[String]): Self = this.set("fleetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetType: Self = this.set("fleetType", js.undefined)
    @scala.inline
    def setInstanceRoleArn(value: Input[String]): Self = this.set("instanceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceRoleArn: Self = this.set("instanceRoleArn", js.undefined)
    @scala.inline
    def setMetricGroupsVarargs(value: Input[String]*): Self = this.set("metricGroups", js.Array(value :_*))
    @scala.inline
    def setMetricGroups(value: Input[js.Array[Input[String]]]): Self = this.set("metricGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricGroups: Self = this.set("metricGroups", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNewGameSessionProtectionPolicy(value: Input[String]): Self = this.set("newGameSessionProtectionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewGameSessionProtectionPolicy: Self = this.set("newGameSessionProtectionPolicy", js.undefined)
    @scala.inline
    def setResourceCreationLimitPolicy(value: Input[FleetResourceCreationLimitPolicy]): Self = this.set("resourceCreationLimitPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceCreationLimitPolicy: Self = this.set("resourceCreationLimitPolicy", js.undefined)
    @scala.inline
    def setRuntimeConfiguration(value: Input[FleetRuntimeConfiguration]): Self = this.set("runtimeConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeConfiguration: Self = this.set("runtimeConfiguration", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

