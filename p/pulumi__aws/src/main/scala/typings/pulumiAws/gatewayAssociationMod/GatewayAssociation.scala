package typings.pulumiAws.gatewayAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation")
@js.native
class GatewayAssociation protected () extends CustomResource {
  /**
    * Create a GatewayAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GatewayAssociationArgs) = this()
  def this(name: String, args: GatewayAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: Output_[js.Array[String]] = js.native
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    * Used for single account Direct Connect gateway associations.
    */
  val associatedGatewayId: Output_[String] = js.native
  /**
    * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
    * Used for cross-account Direct Connect gateway associations.
    */
  val associatedGatewayOwnerAccountId: Output_[String] = js.native
  /**
    * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
    */
  val associatedGatewayType: Output_[String] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  val dxGatewayAssociationId: Output_[String] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  val dxGatewayId: Output_[String] = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  val dxGatewayOwnerAccountId: Output_[String] = js.native
  /**
    * The ID of the Direct Connect gateway association proposal.
    * Used for cross-account Direct Connect gateway associations.
    */
  val proposalId: Output_[js.UndefOr[String]] = js.native
  /**
    * *Deprecated:* Use `associatedGatewayId` instead. The ID of the VGW with which to associate the gateway.
    * Used for single account Direct Connect gateway associations.
    */
  val vpnGatewayId: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation")
@js.native
object GatewayAssociation extends js.Object {
  /**
    * Get an existing GatewayAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): GatewayAssociation = js.native
  def get(name: String, id: Input[ID], state: GatewayAssociationState): GatewayAssociation = js.native
  def get(name: String, id: Input[ID], state: GatewayAssociationState, opts: CustomResourceOptions): GatewayAssociation = js.native
  /**
    * Returns true if the given object is an instance of GatewayAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean = js.native
}

