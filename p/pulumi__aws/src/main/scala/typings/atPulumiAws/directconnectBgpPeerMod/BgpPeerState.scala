package typings.atPulumiAws.directconnectBgpPeerMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BgpPeerState extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val amazonAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
    */
  val awsDevice: js.UndefOr[Input[String]] = js.undefined
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the BGP peer.
    */
  val bgpPeerId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Up/Down state of the BGP peer.
    */
  val bgpStatus: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val customerAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the Direct Connect virtual interface on which to create the BGP peer.
    */
  val virtualInterfaceId: js.UndefOr[Input[String]] = js.undefined
}

object BgpPeerState {
  @scala.inline
  def apply(
    addressFamily: Input[String] = null,
    amazonAddress: Input[String] = null,
    awsDevice: Input[String] = null,
    bgpAsn: Input[Double] = null,
    bgpAuthKey: Input[String] = null,
    bgpPeerId: Input[String] = null,
    bgpStatus: Input[String] = null,
    customerAddress: Input[String] = null,
    virtualInterfaceId: Input[String] = null
  ): BgpPeerState = {
    val __obj = js.Dynamic.literal()
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice.asInstanceOf[js.Any])
    if (bgpAsn != null) __obj.updateDynamic("bgpAsn")(bgpAsn.asInstanceOf[js.Any])
    if (bgpAuthKey != null) __obj.updateDynamic("bgpAuthKey")(bgpAuthKey.asInstanceOf[js.Any])
    if (bgpPeerId != null) __obj.updateDynamic("bgpPeerId")(bgpPeerId.asInstanceOf[js.Any])
    if (bgpStatus != null) __obj.updateDynamic("bgpStatus")(bgpStatus.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgpPeerState]
  }
}

