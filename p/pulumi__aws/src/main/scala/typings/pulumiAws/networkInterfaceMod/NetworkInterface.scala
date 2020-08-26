package typings.pulumiAws.networkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.NetworkInterfaceAttachment
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/networkInterface", "NetworkInterface")
@js.native
class NetworkInterface protected () extends CustomResource {
  /**
    * Create a NetworkInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkInterfaceArgs) = this()
  def this(name: String, args: NetworkInterfaceArgs, opts: CustomResourceOptions) = this()
  /**
    * Block to define the attachment of the ENI. Documented below.
    */
  val attachments: Output_[js.Array[NetworkInterfaceAttachment]] = js.native
  /**
    * A description for the network interface.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The MAC address of the network interface.
    */
  val macAddress: Output_[String] = js.native
  val outpostArn: Output_[String] = js.native
  /**
    * The private DNS name of the network interface (IPv4).
    */
  val privateDnsName: Output_[String] = js.native
  val privateIp: Output_[String] = js.native
  /**
    * List of private IPs to assign to the ENI.
    */
  val privateIps: Output_[js.Array[String]] = js.native
  /**
    * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
    */
  val privateIpsCount: Output_[Double] = js.native
  /**
    * List of security group IDs to assign to the ENI.
    */
  val securityGroups: Output_[js.Array[String]] = js.native
  /**
    * Whether to enable source destination checking for the ENI. Default true.
    */
  val sourceDestCheck: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Subnet ID to create the ENI in.
    */
  val subnetId: Output_[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/networkInterface", "NetworkInterface")
@js.native
object NetworkInterface extends js.Object {
  /**
    * Get an existing NetworkInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NetworkInterface = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NetworkInterface = js.native
  def get(name: String, id: Input[ID], state: NetworkInterfaceState): NetworkInterface = js.native
  def get(name: String, id: Input[ID], state: NetworkInterfaceState, opts: CustomResourceOptions): NetworkInterface = js.native
  /**
    * Returns true if the given object is an instance of NetworkInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ Boolean = js.native
}

