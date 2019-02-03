package typings
package atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway/vpcAttachment", "VpcAttachment")
@js.native
class VpcAttachment protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpcAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcAttachmentArgs) = this()
  def this(name: java.lang.String, args: VpcAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val dnsSupport: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
    */
  val ipv6Support: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway/vpcAttachment", "VpcAttachment")
@js.native
object VpcAttachment extends js.Object {
  /**
    * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachmentState
  ): atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod.VpcAttachment = js.native
}

