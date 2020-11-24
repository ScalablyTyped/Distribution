package typings.pulumiAws.instanceFleetMod

import typings.pulumiAws.outputMod.emr.InstanceFleetInstanceTypeConfig
import typings.pulumiAws.outputMod.emr.InstanceFleetLaunchSpecifications
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet")
@js.native
class InstanceFleet protected () extends CustomResource {
  /**
    * Create a InstanceFleet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InstanceFleetArgs) = this()
  def this(name: String, args: InstanceFleetArgs, opts: CustomResourceOptions) = this()
  
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: Output_[String] = js.native
  
  /**
    * Configuration block for instance fleet
    */
  val instanceTypeConfigs: Output_[js.UndefOr[js.Array[InstanceFleetInstanceTypeConfig]]] = js.native
  
  /**
    * Configuration block for launch specification
    */
  val launchSpecifications: Output_[js.UndefOr[InstanceFleetLaunchSpecifications]] = js.native
  
  /**
    * Friendly name given to the instance fleet.
    */
  val name: Output_[String] = js.native
  
  val provisionedOnDemandCapacity: Output_[Double] = js.native
  
  val provisionedSpotCapacity: Output_[Double] = js.native
  
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
    */
  val targetOnDemandCapacity: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
    */
  val targetSpotCapacity: Output_[js.UndefOr[Double]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet")
@js.native
object InstanceFleet extends js.Object {
  
  /**
    * Get an existing InstanceFleet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): InstanceFleet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): InstanceFleet = js.native
  def get(name: String, id: Input[ID], state: InstanceFleetState): InstanceFleet = js.native
  def get(name: String, id: Input[ID], state: InstanceFleetState, opts: CustomResourceOptions): InstanceFleet = js.native
  
  /**
    * Returns true if the given object is an instance of InstanceFleet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceFleet.InstanceFleet */ Boolean = js.native
}
