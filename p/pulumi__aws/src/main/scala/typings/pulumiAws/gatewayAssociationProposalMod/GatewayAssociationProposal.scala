package typings.pulumiAws.gatewayAssociationProposalMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/gatewayAssociationProposal", "GatewayAssociationProposal")
@js.native
class GatewayAssociationProposal protected () extends CustomResource {
  /**
    * Create a GatewayAssociationProposal resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GatewayAssociationProposalArgs) = this()
  def this(name: String, args: GatewayAssociationProposalArgs, opts: CustomResourceOptions) = this()
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: Output_[js.Array[String]] = js.native
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayId: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
    */
  val associatedGatewayOwnerAccountId: Output_[String] = js.native
  /**
    * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
    */
  val associatedGatewayType: Output_[String] = js.native
  /**
    * Direct Connect Gateway identifier.
    */
  val dxGatewayId: Output_[String] = js.native
  /**
    * AWS Account identifier of the Direct Connect Gateway's owner.
    */
  val dxGatewayOwnerAccountId: Output_[String] = js.native
  /**
    * *Deprecated:* Use `associatedGatewayId` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
    *
    * @deprecated use 'associated_gateway_id' argument instead
    */
  val vpnGatewayId: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/gatewayAssociationProposal", "GatewayAssociationProposal")
@js.native
object GatewayAssociationProposal extends js.Object {
  /**
    * Get an existing GatewayAssociationProposal resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): GatewayAssociationProposal = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GatewayAssociationProposal = js.native
  def get(name: String, id: Input[ID], state: GatewayAssociationProposalState): GatewayAssociationProposal = js.native
  def get(name: String, id: Input[ID], state: GatewayAssociationProposalState, opts: CustomResourceOptions): GatewayAssociationProposal = js.native
  /**
    * Returns true if the given object is an instance of GatewayAssociationProposal.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociationProposal.GatewayAssociationProposal */ Boolean = js.native
}

