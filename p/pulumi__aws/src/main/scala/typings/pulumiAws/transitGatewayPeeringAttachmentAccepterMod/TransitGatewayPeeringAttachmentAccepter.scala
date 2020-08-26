package typings.pulumiAws.transitGatewayPeeringAttachmentAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/transitGatewayPeeringAttachmentAccepter", "TransitGatewayPeeringAttachmentAccepter")
@js.native
class TransitGatewayPeeringAttachmentAccepter protected () extends CustomResource {
  /**
    * Create a TransitGatewayPeeringAttachmentAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TransitGatewayPeeringAttachmentAccepterArgs) = this()
  def this(name: String, args: TransitGatewayPeeringAttachmentAccepterArgs, opts: CustomResourceOptions) = this()
  /**
    * Identifier of the AWS account that owns the EC2 TGW peering.
    */
  val peerAccountId: Output_[String] = js.native
  val peerRegion: Output_[String] = js.native
  /**
    * Identifier of EC2 Transit Gateway to peer with.
    */
  val peerTransitGatewayId: Output_[String] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway Peering Attachment.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The ID of the EC2 Transit Gateway Peering Attachment to manage.
    */
  val transitGatewayAttachmentId: Output_[String] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/transitGatewayPeeringAttachmentAccepter", "TransitGatewayPeeringAttachmentAccepter")
@js.native
object TransitGatewayPeeringAttachmentAccepter extends js.Object {
  /**
    * Get an existing TransitGatewayPeeringAttachmentAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): TransitGatewayPeeringAttachmentAccepter = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TransitGatewayPeeringAttachmentAccepter = js.native
  def get(name: String, id: Input[ID], state: TransitGatewayPeeringAttachmentAccepterState): TransitGatewayPeeringAttachmentAccepter = js.native
  def get(
    name: String,
    id: Input[ID],
    state: TransitGatewayPeeringAttachmentAccepterState,
    opts: CustomResourceOptions
  ): TransitGatewayPeeringAttachmentAccepter = js.native
  /**
    * Returns true if the given object is an instance of TransitGatewayPeeringAttachmentAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/transitGatewayPeeringAttachmentAccepter.TransitGatewayPeeringAttachmentAccepter */ Boolean = js.native
}

