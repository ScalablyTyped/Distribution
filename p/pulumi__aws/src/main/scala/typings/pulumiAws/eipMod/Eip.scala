package typings.pulumiAws.eipMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/eip", "Eip")
@js.native
class Eip protected () extends CustomResource {
  /**
    * Create a Eip resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EipArgs) = this()
  def this(name: String, args: EipArgs, opts: CustomResourceOptions) = this()
  val allocationId: Output_[String] = js.native
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: Output_[js.UndefOr[String]] = js.native
  val associationId: Output_[String] = js.native
  val domain: Output_[String] = js.native
  /**
    * EC2 instance ID.
    */
  val instance: Output_[String] = js.native
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: Output_[String] = js.native
  /**
    * The Private DNS associated with the Elastic IP address (if in VPC).
    */
  val privateDns: Output_[String] = js.native
  /**
    * Contains the private IP address (if in VPC).
    */
  val privateIp: Output_[String] = js.native
  /**
    * Public DNS associated with the Elastic IP address.
    */
  val publicDns: Output_[String] = js.native
  /**
    * Contains the public IP address.
    */
  val publicIp: Output_[String] = js.native
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: Output_[Boolean] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/eip", "Eip")
@js.native
object Eip extends js.Object {
  /**
    * Get an existing Eip resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Eip = js.native
  def get(name: String, id: Input[ID], state: EipState): Eip = js.native
  def get(name: String, id: Input[ID], state: EipState, opts: CustomResourceOptions): Eip = js.native
  /**
    * Returns true if the given object is an instance of Eip.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/eip.Eip */ Boolean = js.native
}

