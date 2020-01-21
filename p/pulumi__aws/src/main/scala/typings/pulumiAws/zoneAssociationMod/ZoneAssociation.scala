package typings.pulumiAws.zoneAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation")
@js.native
class ZoneAssociation protected () extends CustomResource {
  /**
    * Create a ZoneAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ZoneAssociationArgs) = this()
  def this(name: String, args: ZoneAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: Output_[String] = js.native
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: Output_[String] = js.native
  /**
    * The private hosted zone to associate.
    */
  val zoneId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation")
@js.native
object ZoneAssociation extends js.Object {
  /**
    * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ZoneAssociation = js.native
  def get(name: String, id: Input[ID], state: ZoneAssociationState): ZoneAssociation = js.native
  def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): ZoneAssociation = js.native
  /**
    * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = js.native
}

