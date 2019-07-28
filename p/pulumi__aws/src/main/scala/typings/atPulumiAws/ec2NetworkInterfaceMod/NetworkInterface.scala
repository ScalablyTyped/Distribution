package typings.atPulumiAws.ec2NetworkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AttachmentIdDeviceIndex
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val attachments: Output[js.Array[Anon_AttachmentIdDeviceIndex]] = js.native
  /**
    * A description for the network interface.
    */
  val description: Output[js.UndefOr[String]] = js.native
  val privateDnsName: Output[String] = js.native
  val privateIp: Output[String] = js.native
  /**
    * List of private IPs to assign to the ENI.
    */
  val privateIps: Output[js.Array[String]] = js.native
  /**
    * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
    */
  val privateIpsCount: Output[Double] = js.native
  /**
    * List of security group IDs to assign to the ENI.
    */
  val securityGroups: Output[js.Array[String]] = js.native
  /**
    * Whether to enable source destination checking for the ENI. Default true.
    */
  val sourceDestCheck: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Subnet ID to create the ENI in.
    */
  val subnetId: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
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
    */
  def get(name: String, id: Input[ID]): NetworkInterface = js.native
  def get(name: String, id: Input[ID], state: NetworkInterfaceState): NetworkInterface = js.native
  def get(name: String, id: Input[ID], state: NetworkInterfaceState, opts: CustomResourceOptions): NetworkInterface = js.native
  /**
    * Returns true if the given object is an instance of NetworkInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ Boolean = js.native
}

