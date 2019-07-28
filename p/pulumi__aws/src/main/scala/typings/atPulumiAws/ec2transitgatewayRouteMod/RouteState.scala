package typings.atPulumiAws.ec2transitgatewayRouteMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteState extends js.Object {
  /**
    * Indicates whether to drop traffic that matches this route (default to `false`).
    */
  val blackhole: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: js.UndefOr[Input[String]] = js.undefined
}

object RouteState {
  @scala.inline
  def apply(
    blackhole: Input[Boolean] = null,
    destinationCidrBlock: Input[String] = null,
    transitGatewayAttachmentId: Input[String] = null,
    transitGatewayRouteTableId: Input[String] = null
  ): RouteState = {
    val __obj = js.Dynamic.literal()
    if (blackhole != null) __obj.updateDynamic("blackhole")(blackhole.asInstanceOf[js.Any])
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock.asInstanceOf[js.Any])
    if (transitGatewayAttachmentId != null) __obj.updateDynamic("transitGatewayAttachmentId")(transitGatewayAttachmentId.asInstanceOf[js.Any])
    if (transitGatewayRouteTableId != null) __obj.updateDynamic("transitGatewayRouteTableId")(transitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteState]
  }
}

