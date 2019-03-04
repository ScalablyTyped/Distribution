package typings
package atPulumiAwsLib.directconnectPublicVirtualInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicVirtualInterfaceArgs extends js.Object {
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
    * The name for the virtual interface.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The VLAN ID.
    */
  val vlan: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object PublicVirtualInterfaceArgs {
  @scala.inline
  def apply(
    addressFamily: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    bgpAsn: atPulumiPulumiLib.outputMod.Input[scala.Double],
    connectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    routeFilterPrefixes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    vlan: atPulumiPulumiLib.outputMod.Input[scala.Double],
    amazonAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bgpAuthKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customerAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): PublicVirtualInterfaceArgs = {
    val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], routeFilterPrefixes = routeFilterPrefixes.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (bgpAuthKey != null) __obj.updateDynamic("bgpAuthKey")(bgpAuthKey.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicVirtualInterfaceArgs]
  }
}

