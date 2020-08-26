package typings.pulumiAws.peeringAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment")
@js.native
class PeeringAttachment protected () extends CustomResource {
  /**
    * Create a PeeringAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PeeringAttachmentArgs) = this()
  def this(name: String, args: PeeringAttachmentArgs, opts: CustomResourceOptions) = this()
  /**
    * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
    */
  val peerAccountId: Output_[String] = js.native
  /**
    * Region of EC2 Transit Gateway to peer with.
    */
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
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment")
@js.native
object PeeringAttachment extends js.Object {
  /**
    * Get an existing PeeringAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PeeringAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PeeringAttachment = js.native
  def get(name: String, id: Input[ID], state: PeeringAttachmentState): PeeringAttachment = js.native
  def get(name: String, id: Input[ID], state: PeeringAttachmentState, opts: CustomResourceOptions): PeeringAttachment = js.native
  /**
    * Returns true if the given object is an instance of PeeringAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean = js.native
}

