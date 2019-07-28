package typings.atPulumiAws.ec2DefaultSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultSubnet", "DefaultSubnet")
@js.native
class DefaultSubnet protected () extends CustomResource {
  /**
    * Create a DefaultSubnet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DefaultSubnetArgs) = this()
  def this(name: String, args: DefaultSubnetArgs, opts: CustomResourceOptions) = this()
  val arn: Output[String] = js.native
  val assignIpv6AddressOnCreation: Output[Boolean] = js.native
  val availabilityZone: Output[String] = js.native
  val availabilityZoneId: Output[String] = js.native
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: Output[String] = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: Output[String] = js.native
  val ipv6CidrBlockAssociationId: Output[String] = js.native
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address.
    */
  val mapPublicIpOnLaunch: Output[Boolean] = js.native
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The VPC ID.
    */
  val vpcId: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): DefaultSubnet = js.native
  def get(name: String, id: Input[ID], state: DefaultSubnetState): DefaultSubnet = js.native
  def get(name: String, id: Input[ID], state: DefaultSubnetState, opts: CustomResourceOptions): DefaultSubnet = js.native
  /**
    * Returns true if the given object is an instance of DefaultSubnet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSubnet.DefaultSubnet */ Boolean = js.native
}

