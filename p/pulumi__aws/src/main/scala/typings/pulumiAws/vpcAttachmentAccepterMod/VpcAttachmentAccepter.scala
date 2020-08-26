package typings.pulumiAws.vpcAttachmentAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter", "VpcAttachmentAccepter")
@js.native
class VpcAttachmentAccepter protected () extends CustomResource {
  /**
    * Create a VpcAttachmentAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcAttachmentAccepterArgs) = this()
  def this(name: String, args: VpcAttachmentAccepterArgs, opts: CustomResourceOptions) = this()
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`.
    */
  val dnsSupport: Output_[String] = js.native
  /**
    * Whether IPv6 support is enabled. Valid values: `disable`, `enable`.
    */
  val ipv6Support: Output_[String] = js.native
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The ID of the EC2 Transit Gateway Attachment to manage.
    */
  val transitGatewayAttachmentId: Output_[String] = js.native
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Output_[String] = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: Output_[String] = js.native
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter", "VpcAttachmentAccepter")
@js.native
object VpcAttachmentAccepter extends js.Object {
  /**
    * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpcAttachmentAccepter = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcAttachmentAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): VpcAttachmentAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): VpcAttachmentAccepter = js.native
  /**
    * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = js.native
}

