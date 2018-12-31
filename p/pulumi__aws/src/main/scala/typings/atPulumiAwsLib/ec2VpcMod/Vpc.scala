package typings
package atPulumiAwsLib.ec2VpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpc", "Vpc")
@js.native
class Vpc protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Vpc resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpcArgs) = this()
  def this(name: java.lang.String, args: VpcArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Requests an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or
    * the size of the CIDR block. Default is `false`.
    */
  val assignGeneratedIpv6CidrBlock: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The CIDR block for the VPC.
    */
  val cidrBlock: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the network ACL created by default on VPC creation
    */
  val defaultNetworkAclId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the route table created by default on VPC creation
    */
  val defaultRouteTableId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the security group created by default on VPC creation
    */
  val defaultSecurityGroupId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val dhcpOptionsId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
    * Only valid in regions and accounts that support EC2 Classic.
    */
  val enableClassiclinkDnsSupport: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * A tenancy option for instances launched into the VPC
    */
  val instanceTenancy: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the main route table associated with
    * this VPC. Note that you can change a VPC's main route table by using an
    * [`aws_main_route_table_association`](https://www.terraform.io/docs/providers/aws/r/main_route_table_assoc.html).
    */
  val mainRouteTableId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpcMod.Vpc = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcMod.VpcState
  ): atPulumiAwsLib.ec2VpcMod.Vpc = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpcMod.VpcState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpcMod.Vpc = js.native
}

