package typings.atPulumiAws.ec2DefaultVpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultVpc", "DefaultVpc")
@js.native
class DefaultVpc protected () extends CustomResource {
  /**
    * Create a DefaultVpc resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DefaultVpcArgs) = this()
  def this(name: String, args: DefaultVpcArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: Output[String] = js.native
  /**
    * Whether or not an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC was assigned
    */
  val assignGeneratedIpv6CidrBlock: Output[Boolean] = js.native
  /**
    * The CIDR block of the VPC
    */
  val cidrBlock: Output[String] = js.native
  /**
    * The ID of the network ACL created by default on VPC creation
    */
  val defaultNetworkAclId: Output[String] = js.native
  /**
    * The ID of the route table created by default on VPC creation
    */
  val defaultRouteTableId: Output[String] = js.native
  /**
    * The ID of the security group created by default on VPC creation
    */
  val defaultSecurityGroupId: Output[String] = js.native
  val dhcpOptionsId: Output[String] = js.native
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: Output[Boolean] = js.native
  val enableClassiclinkDnsSupport: Output[Boolean] = js.native
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: Output[Boolean] = js.native
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Tenancy of instances spin up within VPC.
    */
  val instanceTenancy: Output[String] = js.native
  /**
    * The association ID for the IPv6 CIDR block of the VPC
    */
  val ipv6AssociationId: Output[String] = js.native
  /**
    * The IPv6 CIDR block of the VPC
    */
  val ipv6CidrBlock: Output[String] = js.native
  /**
    * The ID of the main route table associated with
    * this VPC. Note that you can change a VPC's main route table by using an
    * [`aws_main_route_table_association`](https://www.terraform.io/docs/providers/aws/r/main_route_table_assoc.html)
    */
  val mainRouteTableId: Output[String] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
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
  def get(name: String, id: Input[ID]): DefaultVpc = js.native
  def get(name: String, id: Input[ID], state: DefaultVpcState): DefaultVpc = js.native
  def get(name: String, id: Input[ID], state: DefaultVpcState, opts: CustomResourceOptions): DefaultVpc = js.native
  /**
    * Returns true if the given object is an instance of DefaultVpc.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpc.DefaultVpc */ Boolean = js.native
}

