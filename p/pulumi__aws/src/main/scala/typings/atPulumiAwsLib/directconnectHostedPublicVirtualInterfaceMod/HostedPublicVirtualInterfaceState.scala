package typings
package atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPublicVirtualInterfaceState extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the virtual interface.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  val awsDevice: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the virtual interface.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The VLAN ID.
    */
  val vlan: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object HostedPublicVirtualInterfaceState {
  @scala.inline
  def apply(
    addressFamily: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    amazonAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    awsDevice: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bgpAsn: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    bgpAuthKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    connectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    customerAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ownerAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    routeFilterPrefixes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    vlan: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): HostedPublicVirtualInterfaceState = {
    val __obj = js.Dynamic.literal()
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice.asInstanceOf[js.Any])
    if (bgpAsn != null) __obj.updateDynamic("bgpAsn")(bgpAsn.asInstanceOf[js.Any])
    if (bgpAuthKey != null) __obj.updateDynamic("bgpAuthKey")(bgpAuthKey.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerAccountId != null) __obj.updateDynamic("ownerAccountId")(ownerAccountId.asInstanceOf[js.Any])
    if (routeFilterPrefixes != null) __obj.updateDynamic("routeFilterPrefixes")(routeFilterPrefixes.asInstanceOf[js.Any])
    if (vlan != null) __obj.updateDynamic("vlan")(vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPublicVirtualInterfaceState]
  }
}

