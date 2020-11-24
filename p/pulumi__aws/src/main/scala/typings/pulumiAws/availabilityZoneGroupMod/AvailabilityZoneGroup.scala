package typings.pulumiAws.availabilityZoneGroupMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup")
@js.native
class AvailabilityZoneGroup protected () extends CustomResource {
  /**
    * Create a AvailabilityZoneGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AvailabilityZoneGroupArgs) = this()
  def this(name: String, args: AvailabilityZoneGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Name of the Availability Zone Group.
    */
  val groupName: Output_[String] = js.native
  
  /**
    * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
    */
  val optInStatus: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup")
@js.native
object AvailabilityZoneGroup extends js.Object {
  
  /**
    * Get an existing AvailabilityZoneGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AvailabilityZoneGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AvailabilityZoneGroup = js.native
  def get(name: String, id: Input[ID], state: AvailabilityZoneGroupState): AvailabilityZoneGroup = js.native
  def get(name: String, id: Input[ID], state: AvailabilityZoneGroupState, opts: CustomResourceOptions): AvailabilityZoneGroup = js.native
  
  /**
    * Returns true if the given object is an instance of AvailabilityZoneGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/availabilityZoneGroup.AvailabilityZoneGroup */ Boolean = js.native
}
