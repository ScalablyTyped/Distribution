package typings
package atPulumiAwsLib.ec2DefaultVpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultVpc", "DefaultVpc")
@js.native
class DefaultVpc protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DefaultVpc resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: DefaultVpcArgs) = this()
  def this(name: java.lang.String, args: DefaultVpcArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Whether or not an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC was assigned
    */
  val assignGeneratedIpv6CidrBlock: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
  /**
    * The CIDR block of the VPC
    */
  val cidrBlock: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the network ACL created by default on VPC creation
    */
  val defaultNetworkAclId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the route table created by default on VPC creation
    */
  val defaultRouteTableId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the security group created by default on VPC creation
    */
  val defaultSecurityGroupId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val dhcpOptionsId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
  val enableClassiclinkDnsSupport: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Tenancy of instances spin up within VPC.
    */
  val instanceTenancy: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The association ID for the IPv6 CIDR block of the VPC
    */
  val ipv6AssociationId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The IPv6 CIDR block of the VPC
    */
  val ipv6CidrBlock: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the main route table associated with
    * this VPC. Note that you can change a VPC's main route table by using an
    * [`aws_main_route_table_association`](https://www.terraform.io/docs/providers/aws/r/main_route_table_assoc.html)
    */
  val mainRouteTableId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/defaultVpc", "DefaultVpc")
@js.native
object DefaultVpc extends js.Object {
  /**
    * Get an existing DefaultVpc resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpc = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpcState
  ): atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpc = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpcState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2DefaultVpcMod.DefaultVpc = js.native
}

