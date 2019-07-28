package typings.atPulumiAws.ec2transitgatewayVpcAttachmentAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val dnsSupport: Output[String] = js.native
  /**
    * Whether IPv6 support is enabled. Valid values: `disable`, `enable`.
    */
  val ipv6Support: Output[String] = js.native
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: Output[js.Array[String]] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ID of the EC2 Transit Gateway Attachment to manage.
    */
  val transitGatewayAttachmentId: Output[String] = js.native
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Output[String] = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: Output[String] = js.native
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: Output[String] = js.native
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
    */
  def get(name: String, id: Input[ID]): VpcAttachmentAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): VpcAttachmentAccepter = js.native
  def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): VpcAttachmentAccepter = js.native
  /**
    * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = js.native
}

