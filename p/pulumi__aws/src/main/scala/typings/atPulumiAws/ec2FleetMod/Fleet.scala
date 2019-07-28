package typings.atPulumiAws.ec2FleetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AllocationStrategy
import typings.atPulumiAws.Anon_AllocationStrategyInstanceInterruptionBehavior
import typings.atPulumiAws.Anon_DefaultTargetCapacityType
import typings.atPulumiAws.Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZone
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/fleet", "Fleet")
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
    * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
    */
  val excessCapacityTerminationPolicy: Output[js.UndefOr[String]] = js.native
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: Output[Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZone] = js.native
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: Output[js.UndefOr[Anon_AllocationStrategy]] = js.native
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: Output[js.UndefOr[Anon_AllocationStrategyInstanceInterruptionBehavior]] = js.native
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: Output[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: Output[Anon_DefaultTargetCapacityType] = js.native
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: Output[js.UndefOr[String]] = js.native
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
  def get(name: String, id: Input[ID]): Fleet = js.native
  def get(name: String, id: Input[ID], state: FleetState): Fleet = js.native
  def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): Fleet = js.native
  /**
    * Returns true if the given object is an instance of Fleet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/fleet.Fleet */ Boolean = js.native
}

