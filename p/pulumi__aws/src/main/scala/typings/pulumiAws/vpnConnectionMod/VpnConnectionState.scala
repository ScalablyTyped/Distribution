package typings.pulumiAws.vpnConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.VpnConnectionRoute
import typings.pulumiAws.inputMod.ec2.VpnConnectionVgwTelemetry
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the VPN Connection.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format).
    */
  val customerGatewayConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: js.UndefOr[Input[String]] = js.native
  val routes: js.UndefOr[Input[js.Array[Input[VpnConnectionRoute]]]] = js.native
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * When associated with an EC2 Transit Gateway (`transitGatewayId` argument), the attachment ID.
    */
  val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address of the first VPN tunnel.
    */
  val tunnel1Address: js.UndefOr[Input[String]] = js.native
  /**
    * The bgp asn number of the first VPN tunnel.
    */
  val tunnel1BgpAsn: js.UndefOr[Input[String]] = js.native
  /**
    * The bgp holdtime of the first VPN tunnel.
    */
  val tunnel1BgpHoldtime: js.UndefOr[Input[Double]] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
    */
  val tunnel1CgwInsideAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: js.UndefOr[Input[String]] = js.native
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: js.UndefOr[Input[String]] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
    */
  val tunnel1VgwInsideAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address of the second VPN tunnel.
    */
  val tunnel2Address: js.UndefOr[Input[String]] = js.native
  /**
    * The bgp asn number of the second VPN tunnel.
    */
  val tunnel2BgpAsn: js.UndefOr[Input[String]] = js.native
  /**
    * The bgp holdtime of the second VPN tunnel.
    */
  val tunnel2BgpHoldtime: js.UndefOr[Input[Double]] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
    */
  val tunnel2CgwInsideAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block of the inside IP addresses for the second VPN tunnel.
    */
  val tunnel2InsideCidr: js.UndefOr[Input[String]] = js.native
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: js.UndefOr[Input[String]] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
    */
  val tunnel2VgwInsideAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: js.UndefOr[Input[String]] = js.native
  val vgwTelemetries: js.UndefOr[Input[js.Array[Input[VpnConnectionVgwTelemetry]]]] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionState {
  @scala.inline
  def apply(): VpnConnectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionState]
  }
  @scala.inline
  implicit class VpnConnectionStateOps[Self <: VpnConnectionState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCustomerGatewayConfiguration(value: Input[String]): Self = this.set("customerGatewayConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGatewayConfiguration: Self = this.set("customerGatewayConfiguration", js.undefined)
    @scala.inline
    def setCustomerGatewayId(value: Input[String]): Self = this.set("customerGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGatewayId: Self = this.set("customerGatewayId", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: Input[VpnConnectionRoute]*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: Input[js.Array[Input[VpnConnectionRoute]]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    @scala.inline
    def setStaticRoutesOnly(value: Input[Boolean]): Self = this.set("staticRoutesOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticRoutesOnly: Self = this.set("staticRoutesOnly", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTransitGatewayAttachmentId(value: Input[String]): Self = this.set("transitGatewayAttachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayAttachmentId: Self = this.set("transitGatewayAttachmentId", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: Input[String]): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("transitGatewayId", js.undefined)
    @scala.inline
    def setTunnel1Address(value: Input[String]): Self = this.set("tunnel1Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1Address: Self = this.set("tunnel1Address", js.undefined)
    @scala.inline
    def setTunnel1BgpAsn(value: Input[String]): Self = this.set("tunnel1BgpAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1BgpAsn: Self = this.set("tunnel1BgpAsn", js.undefined)
    @scala.inline
    def setTunnel1BgpHoldtime(value: Input[Double]): Self = this.set("tunnel1BgpHoldtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1BgpHoldtime: Self = this.set("tunnel1BgpHoldtime", js.undefined)
    @scala.inline
    def setTunnel1CgwInsideAddress(value: Input[String]): Self = this.set("tunnel1CgwInsideAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1CgwInsideAddress: Self = this.set("tunnel1CgwInsideAddress", js.undefined)
    @scala.inline
    def setTunnel1InsideCidr(value: Input[String]): Self = this.set("tunnel1InsideCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1InsideCidr: Self = this.set("tunnel1InsideCidr", js.undefined)
    @scala.inline
    def setTunnel1PresharedKey(value: Input[String]): Self = this.set("tunnel1PresharedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1PresharedKey: Self = this.set("tunnel1PresharedKey", js.undefined)
    @scala.inline
    def setTunnel1VgwInsideAddress(value: Input[String]): Self = this.set("tunnel1VgwInsideAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel1VgwInsideAddress: Self = this.set("tunnel1VgwInsideAddress", js.undefined)
    @scala.inline
    def setTunnel2Address(value: Input[String]): Self = this.set("tunnel2Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2Address: Self = this.set("tunnel2Address", js.undefined)
    @scala.inline
    def setTunnel2BgpAsn(value: Input[String]): Self = this.set("tunnel2BgpAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2BgpAsn: Self = this.set("tunnel2BgpAsn", js.undefined)
    @scala.inline
    def setTunnel2BgpHoldtime(value: Input[Double]): Self = this.set("tunnel2BgpHoldtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2BgpHoldtime: Self = this.set("tunnel2BgpHoldtime", js.undefined)
    @scala.inline
    def setTunnel2CgwInsideAddress(value: Input[String]): Self = this.set("tunnel2CgwInsideAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2CgwInsideAddress: Self = this.set("tunnel2CgwInsideAddress", js.undefined)
    @scala.inline
    def setTunnel2InsideCidr(value: Input[String]): Self = this.set("tunnel2InsideCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2InsideCidr: Self = this.set("tunnel2InsideCidr", js.undefined)
    @scala.inline
    def setTunnel2PresharedKey(value: Input[String]): Self = this.set("tunnel2PresharedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2PresharedKey: Self = this.set("tunnel2PresharedKey", js.undefined)
    @scala.inline
    def setTunnel2VgwInsideAddress(value: Input[String]): Self = this.set("tunnel2VgwInsideAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel2VgwInsideAddress: Self = this.set("tunnel2VgwInsideAddress", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVgwTelemetriesVarargs(value: Input[VpnConnectionVgwTelemetry]*): Self = this.set("vgwTelemetries", js.Array(value :_*))
    @scala.inline
    def setVgwTelemetries(value: Input[js.Array[Input[VpnConnectionVgwTelemetry]]]): Self = this.set("vgwTelemetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVgwTelemetries: Self = this.set("vgwTelemetries", js.undefined)
    @scala.inline
    def setVpnGatewayId(value: Input[String]): Self = this.set("vpnGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGatewayId: Self = this.set("vpnGatewayId", js.undefined)
  }
  
}

