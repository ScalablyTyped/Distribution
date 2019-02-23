package typings
package atPulumiAwsLib.ec2FleetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/fleet", "Fleet")
@js.native
class Fleet protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Fleet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: FleetArgs) = this()
  def this(name: java.lang.String, args: FleetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
    */
  val excessCapacityTerminationPolicy: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZone] = js.native
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AllocationStrategy]] = js.native
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AllocationStrategyInstanceInterruptionBehavior]] = js.native
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_DefaultTargetCapacityType] = js.native
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/fleet", "Fleet")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2FleetMod.Fleet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2FleetMod.FleetState
  ): atPulumiAwsLib.ec2FleetMod.Fleet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2FleetMod.FleetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2FleetMod.Fleet = js.native
}

