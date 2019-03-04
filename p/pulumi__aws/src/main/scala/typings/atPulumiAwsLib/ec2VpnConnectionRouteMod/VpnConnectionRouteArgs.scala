package typings
package atPulumiAwsLib.ec2VpnConnectionRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionRouteArgs extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpnConnectionRouteArgs {
  @scala.inline
  def apply(
    destinationCidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpnConnectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): VpnConnectionRouteArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], vpnConnectionId = vpnConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpnConnectionRouteArgs]
  }
}

