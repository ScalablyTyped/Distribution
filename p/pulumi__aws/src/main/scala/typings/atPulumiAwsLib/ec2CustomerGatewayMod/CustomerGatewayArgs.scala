package typings
package atPulumiAwsLib.ec2CustomerGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerGatewayArgs extends js.Object {
  /**
    * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Tags to apply to the gateway.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The type of customer gateway. The only type AWS
    * supports at this time is "ipsec.1".
    */
  val `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

