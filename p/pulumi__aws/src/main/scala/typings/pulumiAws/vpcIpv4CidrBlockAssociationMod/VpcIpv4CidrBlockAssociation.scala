package typings.pulumiAws.vpcIpv4CidrBlockAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation", "VpcIpv4CidrBlockAssociation")
@js.native
class VpcIpv4CidrBlockAssociation protected () extends CustomResource {
  /**
    * Create a VpcIpv4CidrBlockAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcIpv4CidrBlockAssociationArgs) = this()
  def this(name: String, args: VpcIpv4CidrBlockAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * The additional IPv4 CIDR block to associate with the VPC.
    */
  val cidrBlock: Output_[String] = js.native
  /**
    * The ID of the VPC to make the association with.
    */
  val vpcId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation", "VpcIpv4CidrBlockAssociation")
@js.native
object VpcIpv4CidrBlockAssociation extends js.Object {
  /**
    * Get an existing VpcIpv4CidrBlockAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpcIpv4CidrBlockAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcIpv4CidrBlockAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcIpv4CidrBlockAssociationState): VpcIpv4CidrBlockAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcIpv4CidrBlockAssociationState, opts: CustomResourceOptions): VpcIpv4CidrBlockAssociation = js.native
  /**
    * Returns true if the given object is an instance of VpcIpv4CidrBlockAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation.VpcIpv4CidrBlockAssociation */ Boolean = js.native
}

