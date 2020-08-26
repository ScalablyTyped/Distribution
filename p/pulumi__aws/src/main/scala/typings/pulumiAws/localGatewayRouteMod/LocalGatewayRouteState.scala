package typings.pulumiAws.localGatewayRouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayRouteState extends js.Object {
  /**
    * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of EC2 Local Gateway Route Table.
    */
  val localGatewayRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of EC2 Local Gateway Virtual Interface Group.
    */
  val localGatewayVirtualInterfaceGroupId: js.UndefOr[Input[String]] = js.native
}

object LocalGatewayRouteState {
  @scala.inline
  def apply(): LocalGatewayRouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayRouteState]
  }
  @scala.inline
  implicit class LocalGatewayRouteStateOps[Self <: LocalGatewayRouteState] (val x: Self) extends AnyVal {
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
    def deleteDestinationCidrBlock: Self = this.set("destinationCidrBlock", js.undefined)
    @scala.inline
    def setLocalGatewayRouteTableId(value: Input[String]): Self = this.set("localGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("localGatewayRouteTableId", js.undefined)
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupId(value: Input[String]): Self = this.set("localGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayVirtualInterfaceGroupId: Self = this.set("localGatewayVirtualInterfaceGroupId", js.undefined)
  }
  
}

