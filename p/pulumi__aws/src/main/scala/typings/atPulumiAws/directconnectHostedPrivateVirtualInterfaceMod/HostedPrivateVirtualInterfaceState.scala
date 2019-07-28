package typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPrivateVirtualInterfaceState extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the virtual interface.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
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
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
    */
  val mtu: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The name for the virtual interface.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The VLAN ID.
    */
  val vlan: js.UndefOr[Input[Double]] = js.undefined
}

object HostedPrivateVirtualInterfaceState {
  @scala.inline
  def apply(
    addressFamily: Input[String] = null,
    amazonAddress: Input[String] = null,
    arn: Input[String] = null,
    awsDevice: Input[String] = null,
    bgpAsn: Input[Double] = null,
    bgpAuthKey: Input[String] = null,
    connectionId: Input[String] = null,
    customerAddress: Input[String] = null,
    jumboFrameCapable: Input[Boolean] = null,
    mtu: Input[Double] = null,
    name: Input[String] = null,
    ownerAccountId: Input[String] = null,
    vlan: Input[Double] = null
  ): HostedPrivateVirtualInterfaceState = {
    val __obj = js.Dynamic.literal()
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice.asInstanceOf[js.Any])
    if (bgpAsn != null) __obj.updateDynamic("bgpAsn")(bgpAsn.asInstanceOf[js.Any])
    if (bgpAuthKey != null) __obj.updateDynamic("bgpAuthKey")(bgpAuthKey.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (jumboFrameCapable != null) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable.asInstanceOf[js.Any])
    if (mtu != null) __obj.updateDynamic("mtu")(mtu.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerAccountId != null) __obj.updateDynamic("ownerAccountId")(ownerAccountId.asInstanceOf[js.Any])
    if (vlan != null) __obj.updateDynamic("vlan")(vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPrivateVirtualInterfaceState]
  }
}

