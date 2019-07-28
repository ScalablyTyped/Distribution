package typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPublicVirtualInterfaceArgs extends js.Object {
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: Input[String]
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: Input[Double]
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: Input[String]
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name for the virtual interface.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: Input[String]
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: Input[js.Array[Input[String]]]
  /**
    * The VLAN ID.
    */
  val vlan: Input[Double]
}

object HostedPublicVirtualInterfaceArgs {
  @scala.inline
  def apply(
    addressFamily: Input[String],
    bgpAsn: Input[Double],
    connectionId: Input[String],
    ownerAccountId: Input[String],
    routeFilterPrefixes: Input[js.Array[Input[String]]],
    vlan: Input[Double],
    amazonAddress: Input[String] = null,
    bgpAuthKey: Input[String] = null,
    customerAddress: Input[String] = null,
    name: Input[String] = null
  ): HostedPublicVirtualInterfaceArgs = {
    val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], ownerAccountId = ownerAccountId.asInstanceOf[js.Any], routeFilterPrefixes = routeFilterPrefixes.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (bgpAuthKey != null) __obj.updateDynamic("bgpAuthKey")(bgpAuthKey.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPublicVirtualInterfaceArgs]
  }
}

