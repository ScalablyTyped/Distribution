package typings
package atPulumiAwsLib.ec2CustomerGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerGatewayState extends js.Object {
  /**
    * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Tags to apply to the gateway.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The type of customer gateway. The only type AWS
    * supports at this time is "ipsec.1".
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

