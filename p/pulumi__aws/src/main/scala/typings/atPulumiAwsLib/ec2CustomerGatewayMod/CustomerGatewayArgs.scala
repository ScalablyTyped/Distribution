package typings
package atPulumiAwsLib.ec2CustomerGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerGatewayArgs extends js.Object {
  /**
    * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Tags to apply to the gateway.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The type of customer gateway. The only type AWS
    * supports at this time is "ipsec.1".
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object CustomerGatewayArgs {
  @scala.inline
  def apply(
    bgpAsn: atPulumiPulumiLib.outputMod.Input[scala.Double],
    ipAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): CustomerGatewayArgs = {
    val __obj = js.Dynamic.literal(bgpAsn = bgpAsn.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerGatewayArgs]
  }
}

