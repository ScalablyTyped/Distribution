package typings.pulumiAws.transitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2transitgateway/transitGateway", "TransitGateway")
@js.native
class TransitGateway protected () extends CustomResource {
  /**
    * Create a TransitGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: TransitGatewayArgs) = this()
  def this(name: String, args: TransitGatewayArgs, opts: CustomResourceOptions) = this()
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
    */
  val amazonSideAsn: Output_[js.UndefOr[Double]] = js.native
  /**
    * EC2 Transit Gateway Amazon Resource Name (ARN)
    */
  val arn: Output_[ARN] = js.native
  /**
    * Identifier of the default association route table
    */
  val associationDefaultRouteTableId: Output_[String] = js.native
  /**
    * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
    */
  val autoAcceptSharedAttachments: Output_[js.UndefOr[String]] = js.native
  /**
    * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val defaultRouteTableAssociation: Output_[js.UndefOr[String]] = js.native
  /**
    * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val defaultRouteTablePropagation: Output_[js.UndefOr[String]] = js.native
  /**
    * Description of the EC2 Transit Gateway.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val dnsSupport: Output_[js.UndefOr[String]] = js.native
  /**
    * Identifier of the AWS account that owns the EC2 Transit Gateway
    */
  val ownerId: Output_[String] = js.native
  /**
    * Identifier of the default propagation route table
    */
  val propagationDefaultRouteTableId: Output_[String] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val vpnEcmpSupport: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2transitgateway/transitGateway", "TransitGateway")
@js.native
object TransitGateway extends js.Object {
  /**
    * Get an existing TransitGateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): TransitGateway = js.native
  def get(name: String, id: Input[ID], state: TransitGatewayState): TransitGateway = js.native
  def get(name: String, id: Input[ID], state: TransitGatewayState, opts: CustomResourceOptions): TransitGateway = js.native
  /**
    * Returns true if the given object is an instance of TransitGateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean = js.native
}

