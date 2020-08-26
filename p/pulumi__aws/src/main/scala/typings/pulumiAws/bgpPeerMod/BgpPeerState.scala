package typings.pulumiAws.bgpPeerMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BgpPeerState extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val amazonAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
    */
  val awsDevice: js.UndefOr[Input[String]] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: js.UndefOr[Input[Double]] = js.native
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the BGP peer.
    */
  val bgpPeerId: js.UndefOr[Input[String]] = js.native
  /**
    * The Up/Down state of the BGP peer.
    */
  val bgpStatus: js.UndefOr[Input[String]] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val customerAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Direct Connect virtual interface on which to create the BGP peer.
    */
  val virtualInterfaceId: js.UndefOr[Input[String]] = js.native
}

object BgpPeerState {
  @scala.inline
  def apply(): BgpPeerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BgpPeerState]
  }
  @scala.inline
  implicit class BgpPeerStateOps[Self <: BgpPeerState] (val x: Self) extends AnyVal {
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
    def setAddressFamily(value: Input[String]): Self = this.set("addressFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressFamily: Self = this.set("addressFamily", js.undefined)
    @scala.inline
    def setAmazonAddress(value: Input[String]): Self = this.set("amazonAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmazonAddress: Self = this.set("amazonAddress", js.undefined)
    @scala.inline
    def setAwsDevice(value: Input[String]): Self = this.set("awsDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsDevice: Self = this.set("awsDevice", js.undefined)
    @scala.inline
    def setBgpAsn(value: Input[Double]): Self = this.set("bgpAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpAsn: Self = this.set("bgpAsn", js.undefined)
    @scala.inline
    def setBgpAuthKey(value: Input[String]): Self = this.set("bgpAuthKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpAuthKey: Self = this.set("bgpAuthKey", js.undefined)
    @scala.inline
    def setBgpPeerId(value: Input[String]): Self = this.set("bgpPeerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpPeerId: Self = this.set("bgpPeerId", js.undefined)
    @scala.inline
    def setBgpStatus(value: Input[String]): Self = this.set("bgpStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgpStatus: Self = this.set("bgpStatus", js.undefined)
    @scala.inline
    def setCustomerAddress(value: Input[String]): Self = this.set("customerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerAddress: Self = this.set("customerAddress", js.undefined)
    @scala.inline
    def setVirtualInterfaceId(value: Input[String]): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualInterfaceId: Self = this.set("virtualInterfaceId", js.undefined)
  }
  
}

