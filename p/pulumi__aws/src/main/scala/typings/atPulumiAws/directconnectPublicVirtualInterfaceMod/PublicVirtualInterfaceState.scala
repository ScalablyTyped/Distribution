package typings.atPulumiAws.directconnectPublicVirtualInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicVirtualInterfaceState extends js.Object {
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
    * The name for the virtual interface.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The VLAN ID.
    */
  val vlan: js.UndefOr[Input[Double]] = js.undefined
}

object PublicVirtualInterfaceState {
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
    name: Input[String] = null,
    routeFilterPrefixes: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vlan: Input[Double] = null
  ): PublicVirtualInterfaceState = {
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
    if (routeFilterPrefixes != null) __obj.updateDynamic("routeFilterPrefixes")(routeFilterPrefixes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vlan != null) __obj.updateDynamic("vlan")(vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicVirtualInterfaceState]
  }
}

