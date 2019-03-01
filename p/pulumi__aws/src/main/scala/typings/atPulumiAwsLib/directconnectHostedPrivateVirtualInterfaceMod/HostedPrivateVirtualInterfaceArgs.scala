package typings
package atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPrivateVirtualInterfaceArgs extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
    */
  val mtu: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The name for the virtual interface.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The VLAN ID.
    */
  val vlan: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object HostedPrivateVirtualInterfaceArgs {
  @scala.inline
  def apply(
    addressFamily: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    bgpAsn: atPulumiPulumiLib.outputMod.Input[scala.Double],
    connectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ownerAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vlan: atPulumiPulumiLib.outputMod.Input[scala.Double],
    amazonAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bgpAuthKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customerAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    mtu: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): HostedPrivateVirtualInterfaceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    __obj.updateDynamic("bgpAsn")(bgpAsn.asInstanceOf[js.Any])
    __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    __obj.updateDynamic("ownerAccountId")(ownerAccountId.asInstanceOf[js.Any])
    __obj.updateDynamic("vlan")(vlan.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (bgpAuthKey != null) __obj.updateDynamic("bgpAuthKey")(bgpAuthKey.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (mtu != null) __obj.updateDynamic("mtu")(mtu.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPrivateVirtualInterfaceArgs]
  }
}

