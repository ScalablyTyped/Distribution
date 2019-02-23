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

