package typings.atPulumiAws.ec2transitgatewayRouteTablePropagationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTablePropagationArgs extends js.Object {
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: Input[String]
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: Input[String]
}

object RouteTablePropagationArgs {
  @scala.inline
  def apply(transitGatewayAttachmentId: Input[String], transitGatewayRouteTableId: Input[String]): RouteTablePropagationArgs = {
    val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteTablePropagationArgs]
  }
}

