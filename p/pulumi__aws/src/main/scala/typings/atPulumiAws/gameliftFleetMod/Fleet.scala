package typings.atPulumiAws.gameliftFleetMod

import typings.atPulumiAws.typesOutputMod.gamelift.FleetEc2InboundPermission
import typings.atPulumiAws.typesOutputMod.gamelift.FleetResourceCreationLimitPolicy
import typings.atPulumiAws.typesOutputMod.gamelift.FleetRuntimeConfiguration
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/gamelift/fleet", "Fleet")
@js.native
class Fleet protected () extends CustomResource {
  /**
    * Create a Fleet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FleetArgs) = this()
  def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
  /**
    * Fleet ARN.
    */
  val arn: Output[String] = js.native
  /**
    * ID of the Gamelift Build to be deployed on the fleet.
    */
  val buildId: Output[String] = js.native
  /**
    * Human-readable description of the fleet.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
    */
  val ec2InboundPermissions: Output[js.UndefOr[js.Array[FleetEc2InboundPermission]]] = js.native
  /**
    * Name of an EC2 instance type. e.g. `t2.micro`
    */
  val ec2InstanceType: Output[String] = js.native
  val logPaths: Output[js.Array[String]] = js.native
  /**
    * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
    */
  val metricGroups: Output[js.Array[String]] = js.native
  /**
    * The name of the fleet.
    */
  val name: Output[String] = js.native
  /**
    * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
    */
  val newGameSessionProtectionPolicy: Output[js.UndefOr[String]] = js.native
  /**
    * Operating system of the fleet's computing resources.
    */
  val operatingSystem: Output[String] = js.native
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
    */
  val resourceCreationLimitPolicy: Output[js.UndefOr[FleetResourceCreationLimitPolicy]] = js.native
  /**
    * Instructions for launching server processes on each instance in the fleet. See below.
    */
  val runtimeConfiguration: Output[js.UndefOr[FleetRuntimeConfiguration]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/gamelift/fleet", "Fleet")
@js.native
object Fleet extends js.Object {
  /**
    * Get an existing Fleet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Fleet = js.native
  def get(name: String, id: Input[ID], state: FleetState): Fleet = js.native
  def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): Fleet = js.native
  /**
    * Returns true if the given object is an instance of Fleet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/fleet.Fleet */ Boolean = js.native
}

