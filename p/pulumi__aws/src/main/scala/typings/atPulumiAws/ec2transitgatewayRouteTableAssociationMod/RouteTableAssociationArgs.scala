package typings.atPulumiAws.ec2transitgatewayRouteTableAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableAssociationArgs extends js.Object {
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: Input[String]
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: Input[String]
}

object RouteTableAssociationArgs {
  @scala.inline
  def apply(transitGatewayAttachmentId: Input[String], transitGatewayRouteTableId: Input[String]): RouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteTableAssociationArgs]
  }
}

