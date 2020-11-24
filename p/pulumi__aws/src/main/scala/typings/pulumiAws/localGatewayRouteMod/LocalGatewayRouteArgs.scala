package typings.pulumiAws.localGatewayRouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalGatewayRouteArgs extends js.Object {
  
  /**
    * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: Input[String] = js.native
  
  /**
    * Identifier of EC2 Local Gateway Route Table.
    */
  val localGatewayRouteTableId: Input[String] = js.native
  
  /**
    * Identifier of EC2 Local Gateway Virtual Interface Group.
    */
  val localGatewayVirtualInterfaceGroupId: Input[String] = js.native
}
object LocalGatewayRouteArgs {
  
  @scala.inline
  def apply(
    destinationCidrBlock: Input[String],
    localGatewayRouteTableId: Input[String],
    localGatewayVirtualInterfaceGroupId: Input[String]
  ): LocalGatewayRouteArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], localGatewayRouteTableId = localGatewayRouteTableId.asInstanceOf[js.Any], localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalGatewayRouteArgs]
  }
  
  @scala.inline
  implicit class LocalGatewayRouteArgsOps[Self <: LocalGatewayRouteArgs] (val x: Self) extends AnyVal {
    
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
    def setLocalGatewayRouteTableId(value: Input[String]): Self = this.set("localGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupId(value: Input[String]): Self = this.set("localGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
  }
}
