package typings
package atPulumiAwsLib.ec2VpnConnectionRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute")
@js.native
class VpnConnectionRoute protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpnConnectionRoute resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpnConnectionRouteArgs) = this()
  def this(name: java.lang.String, args: VpnConnectionRouteArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute")
@js.native
object VpnConnectionRoute extends js.Object {
  /**
    * Get an existing VpnConnectionRoute resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRoute = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRouteState
  ): atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRoute = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRouteState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpnConnectionRouteMod.VpnConnectionRoute = js.native
}

