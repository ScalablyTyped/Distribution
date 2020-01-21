package typings.pulumiAws.vpnGatewayRoutePropagationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation")
@js.native
class VpnGatewayRoutePropagation protected () extends CustomResource {
  /**
    * Create a VpnGatewayRoutePropagation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpnGatewayRoutePropagationArgs) = this()
  def this(name: String, args: VpnGatewayRoutePropagationArgs, opts: CustomResourceOptions) = this()
  /**
    * The id of the `aws.ec2.RouteTable` to propagate routes into.
    */
  val routeTableId: Output_[String] = js.native
  /**
    * The id of the `aws.ec2.VpnGateway` to propagate routes from.
    */
  val vpnGatewayId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation")
@js.native
object VpnGatewayRoutePropagation extends js.Object {
  /**
    * Get an existing VpnGatewayRoutePropagation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpnGatewayRoutePropagation = js.native
  def get(name: String, id: Input[ID], state: VpnGatewayRoutePropagationState): VpnGatewayRoutePropagation = js.native
  def get(name: String, id: Input[ID], state: VpnGatewayRoutePropagationState, opts: CustomResourceOptions): VpnGatewayRoutePropagation = js.native
  /**
    * Returns true if the given object is an instance of VpnGatewayRoutePropagation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGatewayRoutePropagation.VpnGatewayRoutePropagation */ Boolean = js.native
}

