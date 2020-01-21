package typings.pulumiAws.natGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/natGateway", "NatGateway")
@js.native
class NatGateway protected () extends CustomResource {
  /**
    * Create a NatGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NatGatewayArgs) = this()
  def this(name: String, args: NatGatewayArgs, opts: CustomResourceOptions) = this()
  /**
    * The Allocation ID of the Elastic IP address for the gateway.
    */
  val allocationId: Output_[String] = js.native
  /**
    * The ENI ID of the network interface created by the NAT gateway.
    */
  val networkInterfaceId: Output_[String] = js.native
  /**
    * The private IP address of the NAT Gateway.
    */
  val privateIp: Output_[String] = js.native
  /**
    * The public IP address of the NAT Gateway.
    */
  val publicIp: Output_[String] = js.native
  /**
    * The Subnet ID of the subnet in which to place the gateway.
    */
  val subnetId: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/natGateway", "NatGateway")
@js.native
object NatGateway extends js.Object {
  /**
    * Get an existing NatGateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): NatGateway = js.native
  def get(name: String, id: Input[ID], state: NatGatewayState): NatGateway = js.native
  def get(name: String, id: Input[ID], state: NatGatewayState, opts: CustomResourceOptions): NatGateway = js.native
  /**
    * Returns true if the given object is an instance of NatGateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/natGateway.NatGateway */ Boolean = js.native
}

