package typings
package atPulumiAwsLib.directconnectGatewayAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation")
@js.native
class GatewayAssociation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a GatewayAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: GatewayAssociationArgs) = this()
  def this(name: java.lang.String, args: GatewayAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
    */
  val allowedPrefixes: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
    * Used for single account Direct Connect gateway associations.
    */
  val associatedGatewayId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
    * Used for cross-account Direct Connect gateway associations.
    */
  val associatedGatewayOwnerAccountId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
    */
  val associatedGatewayType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  val dxGatewayAssociationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  val dxGatewayId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  val dxGatewayOwnerAccountId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the Direct Connect gateway association proposal.
    * Used for cross-account Direct Connect gateway associations.
    */
  val proposalId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * *Deprecated:* Use `associated_gateway_id` instead. The ID of the VGW with which to associate the gateway.
    * Used for single account Direct Connect gateway associations.
    */
  val vpnGatewayId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationState
  ): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectGatewayAssociationMod.GatewayAssociation = js.native
  /**
    * Returns true if the given object is an instance of GatewayAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ scala.Boolean = js.native
}

