package typings.pulumiAws.vpcDhcpOptionsAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcDhcpOptionsAssociation", "VpcDhcpOptionsAssociation")
@js.native
class VpcDhcpOptionsAssociation protected () extends CustomResource {
  /**
    * Create a VpcDhcpOptionsAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcDhcpOptionsAssociationArgs) = this()
  def this(name: String, args: VpcDhcpOptionsAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * The ID of the DHCP Options Set to associate to the VPC.
    */
  val dhcpOptionsId: Output_[String] = js.native
  /**
    * The ID of the VPC to which we would like to associate a DHCP Options Set.
    */
  val vpcId: Output_[String] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): VpcDhcpOptionsAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcDhcpOptionsAssociationState): VpcDhcpOptionsAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcDhcpOptionsAssociationState, opts: CustomResourceOptions): VpcDhcpOptionsAssociation = js.native
  /**
    * Returns true if the given object is an instance of VpcDhcpOptionsAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcDhcpOptionsAssociation.VpcDhcpOptionsAssociation */ Boolean = js.native
}

