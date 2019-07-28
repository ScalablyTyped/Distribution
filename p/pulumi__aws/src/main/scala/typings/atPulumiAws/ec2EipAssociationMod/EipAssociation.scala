package typings.atPulumiAws.ec2EipAssociationMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/eipAssociation", "EipAssociation")
@js.native
class EipAssociation protected () extends CustomResource {
  /**
    * Create a EipAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EipAssociationArgs) = this()
  def this(name: String, args: EipAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * The allocation ID. This is required for EC2-VPC.
    */
  val allocationId: Output[String] = js.native
  /**
    * Whether to allow an Elastic IP to
    * be re-associated. Defaults to `true` in VPC.
    */
  val allowReassociation: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The ID of the instance. This is required for
    * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
    * network interface ID, but not both. The operation fails if you specify an
    * instance ID unless exactly one network interface is attached.
    */
  val instanceId: Output[String] = js.native
  /**
    * The ID of the network interface. If the
    * instance has more than one network interface, you must specify a network
    * interface ID.
    */
  val networkInterfaceId: Output[String] = js.native
  /**
    * The primary or secondary private IP address
    * to associate with the Elastic IP address. If no private IP address is
    * specified, the Elastic IP address is associated with the primary private IP
    * address.
    */
  val privateIpAddress: Output[String] = js.native
  /**
    * The Elastic IP address. This is required for EC2-Classic.
    */
  val publicIp: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/eipAssociation", "EipAssociation")
@js.native
object EipAssociation extends js.Object {
  /**
    * Get an existing EipAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): EipAssociation = js.native
  def get(name: String, id: Input[ID], state: EipAssociationState): EipAssociation = js.native
  def get(name: String, id: Input[ID], state: EipAssociationState, opts: CustomResourceOptions): EipAssociation = js.native
  /**
    * Returns true if the given object is an instance of EipAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/eipAssociation.EipAssociation */ Boolean = js.native
}

