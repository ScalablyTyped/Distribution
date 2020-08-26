package typings.pulumiAws.vpnConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionArgs extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: Input[String] = js.native
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: js.UndefOr[Input[String]] = js.native
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block of the inside IP addresses for the second VPN tunnel.
    */
  val tunnel2InsideCidr: js.UndefOr[Input[String]] = js.native
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: js.UndefOr[Input[String]] = js.native
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: Input[String] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionArgs {
  @scala.inline
  def apply(customerGatewayId: Input[String], `type`: Input[String]): VpnConnectionArgs = {
    val __obj = js.Dynamic.literal(customerGatewayId = customerGatewayId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionArgs]
  }
  @scala.inline
  implicit class VpnConnectionArgsOps[Self <: VpnConnectionArgs] (val x: Self) extends AnyVal {
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
    def setCustomerGatewayId(value: Input[String]): Self = this.set("customerGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticRoutesOnly(value: Input[Boolean]): Self = this.set("staticRoutesOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticRoutesOnly: Self = this.set("staticRoutesOnly", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: Input[String]): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("transitGatewayId", js.undefined)
    @scala.inline
    def setTunnel1InsideCidr(value: Input[String]): Self = this.set("tunnel1InsideCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1InsideCidr: Self = this.set("tunnel1InsideCidr", js.undefined)
    @scala.inline
    def setTunnel1PresharedKey(value: Input[String]): Self = this.set("tunnel1PresharedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1PresharedKey: Self = this.set("tunnel1PresharedKey", js.undefined)
    @scala.inline
    def setTunnel2InsideCidr(value: Input[String]): Self = this.set("tunnel2InsideCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2InsideCidr: Self = this.set("tunnel2InsideCidr", js.undefined)
    @scala.inline
    def setTunnel2PresharedKey(value: Input[String]): Self = this.set("tunnel2PresharedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2PresharedKey: Self = this.set("tunnel2PresharedKey", js.undefined)
    @scala.inline
    def setVpnGatewayId(value: Input[String]): Self = this.set("vpnGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGatewayId: Self = this.set("vpnGatewayId", js.undefined)
  }
  
}

