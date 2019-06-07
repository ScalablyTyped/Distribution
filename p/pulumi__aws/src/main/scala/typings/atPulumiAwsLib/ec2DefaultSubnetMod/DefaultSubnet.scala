package typings
package atPulumiAwsLib.ec2DefaultSubnetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultSubnet", "DefaultSubnet")
@js.native
class DefaultSubnet protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DefaultSubnet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DefaultSubnetArgs) = this()
  def this(name: java.lang.String, args: DefaultSubnetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val assignIpv6AddressOnCreation: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  val availabilityZone: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val availabilityZoneId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val ipv6CidrBlockAssociationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address.
    */
  val mapPublicIpOnLaunch: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The VPC ID.
    */
  val vpcId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/defaultSubnet", "DefaultSubnet")
@js.native
object DefaultSubnet extends js.Object {
  /**
    * Get an existing DefaultSubnet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnetState
  ): atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2DefaultSubnetMod.DefaultSubnet = js.native
  /**
    * Returns true if the given object is an instance of DefaultSubnet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSubnet.DefaultSubnet */ scala.Boolean = js.native
}

