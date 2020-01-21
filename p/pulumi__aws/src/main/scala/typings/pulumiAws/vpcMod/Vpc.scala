package typings.pulumiAws.vpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpc", "Vpc")
@js.native
class Vpc protected () extends CustomResource {
  /**
    * Create a Vpc resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcArgs) = this()
  def this(name: String, args: VpcArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: Output_[String] = js.native
  /**
    * Requests an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or
    * the size of the CIDR block. Default is `false`.
    */
  val assignGeneratedIpv6CidrBlock: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The CIDR block for the VPC.
    */
  val cidrBlock: Output_[String] = js.native
  /**
    * The ID of the network ACL created by default on VPC creation
    */
  val defaultNetworkAclId: Output_[String] = js.native
  /**
    * The ID of the route table created by default on VPC creation
    */
  val defaultRouteTableId: Output_[String] = js.native
  /**
    * The ID of the security group created by default on VPC creation
    */
  val defaultSecurityGroupId: Output_[String] = js.native
  val dhcpOptionsId: Output_[String] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: Output_[Boolean] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
    * Only valid in regions and accounts that support EC2 Classic.
    */
  val enableClassiclinkDnsSupport: Output_[Boolean] = js.native
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: Output_[Boolean] = js.native
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * A tenancy option for instances launched into the VPC
    */
  val instanceTenancy: Output_[js.UndefOr[String]] = js.native
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: Output_[String] = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: Output_[String] = js.native
  /**
    * The ID of the main route table associated with
    * this VPC. Note that you can change a VPC's main route table by using an
    * [`aws.ec2.MainRouteTableAssociation`](https://www.terraform.io/docs/providers/aws/r/main_route_table_assoc.html).
    */
  val mainRouteTableId: Output_[String] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpc", "Vpc")
@js.native
object Vpc extends js.Object {
  /**
    * Get an existing Vpc resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Vpc = js.native
  def get(name: String, id: Input[ID], state: VpcState): Vpc = js.native
  def get(name: String, id: Input[ID], state: VpcState, opts: CustomResourceOptions): Vpc = js.native
  /**
    * Returns true if the given object is an instance of Vpc.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpc.Vpc */ Boolean = js.native
}

