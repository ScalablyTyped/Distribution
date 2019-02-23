package typings
package atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPublicVirtualInterfaceArgs extends js.Object {
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
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * The VLAN ID.
    */
  val vlan: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

