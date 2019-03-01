package typings
package atPulumiAwsLib.ec2transitgatewayRouteTablePropagationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTablePropagationArgs extends js.Object {
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RouteTablePropagationArgs {
  @scala.inline
  def apply(
    transitGatewayAttachmentId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    transitGatewayRouteTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): RouteTablePropagationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transitGatewayAttachmentId")(transitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.updateDynamic("transitGatewayRouteTableId")(transitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTablePropagationArgs]
  }
}

