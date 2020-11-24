package typings.pulumiAws.ec2transitgatewayRouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteArgs extends js.Object {
  
  /**
    * Indicates whether to drop traffic that matches this route (default to `false`).
    */
  val blackhole: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: Input[String] = js.native
  
  /**
    * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: Input[String] = js.native
}
object RouteArgs {
  
  @scala.inline
  def apply(destinationCidrBlock: Input[String], transitGatewayRouteTableId: Input[String]): RouteArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteArgs]
  }
  
  @scala.inline
  implicit class RouteArgsOps[Self <: RouteArgs] (val x: Self) extends AnyVal {
    
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
    def setDestinationCidrBlock(value: Input[String]): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: Input[String]): Self = this.set("transitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackhole(value: Input[Boolean]): Self = this.set("blackhole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackhole: Self = this.set("blackhole", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: Input[String]): Self = this.set("transitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayAttachmentId: Self = this.set("transitGatewayAttachmentId", js.undefined)
  }
}
