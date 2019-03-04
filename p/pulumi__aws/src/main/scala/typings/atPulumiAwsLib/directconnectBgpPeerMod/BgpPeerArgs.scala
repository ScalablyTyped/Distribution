package typings
package atPulumiAwsLib.directconnectBgpPeerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BgpPeerArgs extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon.
    * Required for IPv4 BGP peers on public virtual interfaces.
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
    * The IPv4 CIDR destination address to which Amazon should send traffic.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val customerAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the Direct Connect virtual interface on which to create the BGP peer.
    */
  val virtualInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object BgpPeerArgs {
  @scala.inline
  def apply(
    addressFamily: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    bgpAsn: atPulumiPulumiLib.outputMod.Input[scala.Double],
    virtualInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    amazonAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bgpAuthKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customerAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): BgpPeerArgs = {
    val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (bgpAuthKey != null) __obj.updateDynamic("bgpAuthKey")(bgpAuthKey.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgpPeerArgs]
  }
}

