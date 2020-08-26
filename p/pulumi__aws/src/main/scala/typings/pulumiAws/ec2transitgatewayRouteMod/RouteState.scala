package typings.pulumiAws.ec2transitgatewayRouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteState extends js.Object {
  /**
    * Indicates whether to drop traffic that matches this route (default to `false`).
    */
  val blackhole: js.UndefOr[Input[Boolean]] = js.native
  /**
    * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: js.UndefOr[Input[String]] = js.native
}

object RouteState {
  @scala.inline
  def apply(): RouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteState]
  }
  @scala.inline
  implicit class RouteStateOps[Self <: RouteState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlackhole(value: Input[Boolean]): Self = this.set("blackhole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlackhole: Self = this.set("blackhole", js.undefined)
    @scala.inline
    def setDestinationCidrBlock(value: Input[String]): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("destinationCidrBlock", js.undefined)
    @scala.inline
    def setTransitGatewayAttachmentId(value: Input[String]): Self = this.set("transitGatewayAttachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayAttachmentId: Self = this.set("transitGatewayAttachmentId", js.undefined)
    @scala.inline
    def setTransitGatewayRouteTableId(value: Input[String]): Self = this.set("transitGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayRouteTableId: Self = this.set("transitGatewayRouteTableId", js.undefined)
  }
  
}

