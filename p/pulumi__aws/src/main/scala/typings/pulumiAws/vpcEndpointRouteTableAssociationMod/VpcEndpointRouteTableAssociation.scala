package typings.pulumiAws.vpcEndpointRouteTableAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation")
@js.native
class VpcEndpointRouteTableAssociation protected () extends CustomResource {
  /**
    * Create a VpcEndpointRouteTableAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointRouteTableAssociationArgs) = this()
  def this(name: String, args: VpcEndpointRouteTableAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
    */
  val routeTableId: Output_[String] = js.native
  /**
    * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
    */
  val vpcEndpointId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation")
@js.native
object VpcEndpointRouteTableAssociation extends js.Object {
  /**
    * Get an existing VpcEndpointRouteTableAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpcEndpointRouteTableAssociation = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointRouteTableAssociationState): VpcEndpointRouteTableAssociation = js.native
  def get(
    name: String,
    id: Input[ID],
    state: VpcEndpointRouteTableAssociationState,
    opts: CustomResourceOptions
  ): VpcEndpointRouteTableAssociation = js.native
  /**
    * Returns true if the given object is an instance of VpcEndpointRouteTableAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointRouteTableAssociation.VpcEndpointRouteTableAssociation */ Boolean = js.native
}

