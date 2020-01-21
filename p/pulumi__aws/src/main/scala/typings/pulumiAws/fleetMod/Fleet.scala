package typings.pulumiAws.fleetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.FleetLaunchTemplateConfig
import typings.pulumiAws.outputMod.ec2.FleetOnDemandOptions
import typings.pulumiAws.outputMod.ec2.FleetSpotOptions
import typings.pulumiAws.outputMod.ec2.FleetTargetCapacitySpecification
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val excessCapacityTerminationPolicy: Output_[js.UndefOr[String]] = js.native
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: Output_[FleetLaunchTemplateConfig] = js.native
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: Output_[js.UndefOr[FleetOnDemandOptions]] = js.native
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: Output_[js.UndefOr[FleetSpotOptions]] = js.native
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: Output_[FleetTargetCapacitySpecification] = js.native
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: Output_[js.UndefOr[String]] = js.native
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

