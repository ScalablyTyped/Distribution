package typings
package atPulumiAwsLib.ec2NatGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/natGateway", "NatGateway")
@js.native
class NatGateway protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a NatGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: NatGatewayArgs) = this()
  def this(name: java.lang.String, args: NatGatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Allocation ID of the Elastic IP address for the gateway.
    */
  val allocationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ENI ID of the network interface created by the NAT gateway.
    */
  val networkInterfaceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The private IP address of the NAT Gateway.
    */
  val privateIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The public IP address of the NAT Gateway.
    */
  val publicIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Subnet ID of the subnet in which to place the gateway.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2NatGatewayMod.NatGateway = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2NatGatewayMod.NatGatewayState
  ): atPulumiAwsLib.ec2NatGatewayMod.NatGateway = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2NatGatewayMod.NatGatewayState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2NatGatewayMod.NatGateway = js.native
}

