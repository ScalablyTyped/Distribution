package typings.atPulumiAws.directconnectMod

import typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposalArgs
import typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposalState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal")
@js.native
class GatewayAssociationProposal protected ()
  extends typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposal {
  /**
    * Create a GatewayAssociationProposal resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GatewayAssociationProposalArgs) = this()
  def this(name: String, args: GatewayAssociationProposalArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "GatewayAssociationProposal")
@js.native
object GatewayAssociationProposal extends js.Object {
  /**
    * Get an existing GatewayAssociationProposal resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposal = js.native
  def get(name: String, id: Input[ID], state: GatewayAssociationProposalState): typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposal = js.native
  def get(name: String, id: Input[ID], state: GatewayAssociationProposalState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectGatewayAssociationProposalMod.GatewayAssociationProposal = js.native
  /**
    * Returns true if the given object is an instance of GatewayAssociationProposal.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociationProposal.GatewayAssociationProposal */ Boolean = js.native
}

