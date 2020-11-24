package typings.pulumiAws.vpnGatewayRoutePropagationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewayRoutePropagationState extends js.Object {
  
  /**
    * The id of the `aws.ec2.RouteTable` to propagate routes into.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The id of the `aws.ec2.VpnGateway` to propagate routes from.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}
object VpnGatewayRoutePropagationState {
  
  @scala.inline
  def apply(): VpnGatewayRoutePropagationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayRoutePropagationState]
  }
  
  @scala.inline
  implicit class VpnGatewayRoutePropagationStateOps[Self <: VpnGatewayRoutePropagationState] (val x: Self) extends AnyVal {
    
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
    def setRouteTableId(value: Input[String]): Self = this.set("routeTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteTableId: Self = this.set("routeTableId", js.undefined)
    
    @scala.inline
    def setVpnGatewayId(value: Input[String]): Self = this.set("vpnGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnGatewayId: Self = this.set("vpnGatewayId", js.undefined)
  }
}
