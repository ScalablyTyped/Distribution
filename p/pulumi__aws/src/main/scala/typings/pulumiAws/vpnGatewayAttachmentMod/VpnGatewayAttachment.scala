package typings.pulumiAws.vpnGatewayAttachmentMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment")
@js.native
class VpnGatewayAttachment protected () extends CustomResource {
  /**
    * Create a VpnGatewayAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpnGatewayAttachmentArgs) = this()
  def this(name: String, args: VpnGatewayAttachmentArgs, opts: CustomResourceOptions) = this()
  /**
    * The ID of the VPC.
    */
  val vpcId: Output_[String] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpnGatewayAttachment", "VpnGatewayAttachment")
@js.native
object VpnGatewayAttachment extends js.Object {
  /**
    * Get an existing VpnGatewayAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpnGatewayAttachment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpnGatewayAttachment = js.native
  def get(name: String, id: Input[ID], state: VpnGatewayAttachmentState): VpnGatewayAttachment = js.native
  def get(name: String, id: Input[ID], state: VpnGatewayAttachmentState, opts: CustomResourceOptions): VpnGatewayAttachment = js.native
  /**
    * Returns true if the given object is an instance of VpnGatewayAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGatewayAttachment.VpnGatewayAttachment */ Boolean = js.native
}

