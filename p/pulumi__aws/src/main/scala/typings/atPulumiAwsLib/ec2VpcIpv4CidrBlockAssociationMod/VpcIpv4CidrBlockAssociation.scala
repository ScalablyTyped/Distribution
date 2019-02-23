package typings
package atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation", "VpcIpv4CidrBlockAssociation")
@js.native
class VpcIpv4CidrBlockAssociation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpcIpv4CidrBlockAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcIpv4CidrBlockAssociationArgs) = this()
  def this(name: java.lang.String, args: VpcIpv4CidrBlockAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The additional IPv4 CIDR block to associate with the VPC.
    */
  val cidrBlock: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the VPC to make the association with.
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociationState
  ): atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcIpv4CidrBlockAssociationMod.VpcIpv4CidrBlockAssociation = js.native
}

