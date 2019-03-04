package typings
package atPulumiAwsLib.directconnectGatewayAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayAssociationArgs extends js.Object {
  /**
    * The ID of the Direct Connect Gateway.
    */
  val dxGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the VGW with which to associate the gateway.
    */
  val vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object GatewayAssociationArgs {
  @scala.inline
  def apply(
    dxGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): GatewayAssociationArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatewayAssociationArgs]
  }
}

