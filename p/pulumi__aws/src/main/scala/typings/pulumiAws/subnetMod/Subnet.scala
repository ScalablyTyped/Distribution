package typings.pulumiAws.subnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/subnet", "Subnet")
@js.native
class Subnet protected () extends CustomResource {
  /**
    * Create a Subnet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SubnetArgs) = this()
  def this(name: String, args: SubnetArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the subnet.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Specify true to indicate
    * that network interfaces created in the specified subnet should be
    * assigned an IPv6 address. Default is `false`
    */
  val assignIpv6AddressOnCreation: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The AZ for the subnet.
    */
  val availabilityZone: Output_[String] = js.native
  
  /**
    * The AZ ID of the subnet.
    */
  val availabilityZoneId: Output_[String] = js.native
  
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: Output_[String] = js.native
  
  /**
    * The IPv6 network range for the subnet,
    * in CIDR notation. The subnet size must use a /64 prefix length.
    */
  val ipv6CidrBlock: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6CidrBlockAssociationId: Output_[String] = js.native
  
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address. Default is `false`.
    */
  val mapPublicIpOnLaunch: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  val outpostArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The VPC ID.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/subnet", "Subnet")
@js.native
object Subnet extends js.Object {
  
  /**
    * Get an existing Subnet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Subnet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Subnet = js.native
  def get(name: String, id: Input[ID], state: SubnetState): Subnet = js.native
  def get(name: String, id: Input[ID], state: SubnetState, opts: CustomResourceOptions): Subnet = js.native
  
  /**
    * Returns true if the given object is an instance of Subnet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/subnet.Subnet */ Boolean = js.native
}
