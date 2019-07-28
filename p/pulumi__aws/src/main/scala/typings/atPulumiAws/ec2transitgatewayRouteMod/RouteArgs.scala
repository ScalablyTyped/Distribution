package typings.atPulumiAws.ec2transitgatewayRouteMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteArgs extends js.Object {
  /**
    * Indicates whether to drop traffic that matches this route (default to `false`).
    */
  val blackhole: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: Input[String]
  /**
    * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: Input[String]
}

object RouteArgs {
  @scala.inline
  def apply(
    destinationCidrBlock: Input[String],
    transitGatewayRouteTableId: Input[String],
    blackhole: Input[Boolean] = null,
    transitGatewayAttachmentId: Input[String] = null
  ): RouteArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
    if (blackhole != null) __obj.updateDynamic("blackhole")(blackhole.asInstanceOf[js.Any])
    if (transitGatewayAttachmentId != null) __obj.updateDynamic("transitGatewayAttachmentId")(transitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteArgs]
  }
}

