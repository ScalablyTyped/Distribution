package typings
package atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcDhcpOptionsAssociation", "VpcDhcpOptionsAssociation")
@js.native
class VpcDhcpOptionsAssociation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpcDhcpOptionsAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcDhcpOptionsAssociationArgs) = this()
  def this(name: java.lang.String, args: VpcDhcpOptionsAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ID of the DHCP Options Set to associate to the VPC.
    */
  val dhcpOptionsId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the VPC to which we would like to associate a DHCP Options Set.
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/ec2/vpcDhcpOptionsAssociation", "VpcDhcpOptionsAssociation")
@js.native
object VpcDhcpOptionsAssociation extends js.Object {
  /**
    * Get an existing VpcDhcpOptionsAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociationState
  ): atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod.VpcDhcpOptionsAssociation = js.native
}

