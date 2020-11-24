package typings.pulumiAws.vpnConnectionRouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionRouteState extends js.Object {
  
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the VPN connection.
    */
  val vpnConnectionId: js.UndefOr[Input[String]] = js.native
}
object VpnConnectionRouteState {
  
  @scala.inline
  def apply(): VpnConnectionRouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionRouteState]
  }
  
  @scala.inline
  implicit class VpnConnectionRouteStateOps[Self <: VpnConnectionRouteState] (val x: Self) extends AnyVal {
    
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
    def setVpnConnectionId(value: Input[String]): Self = this.set("vpnConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnConnectionId: Self = this.set("vpnConnectionId", js.undefined)
  }
}
