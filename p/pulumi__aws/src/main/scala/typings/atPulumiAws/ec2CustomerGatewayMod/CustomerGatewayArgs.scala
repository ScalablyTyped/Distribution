package typings.atPulumiAws.ec2CustomerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerGatewayArgs extends js.Object {
  /**
    * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: Input[Double] = js.native
  /**
    * The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: Input[String] = js.native
  /**
    * Tags to apply to the gateway.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of customer gateway. The only type AWS
    * supports at this time is "ipsec.1".
    */
  val `type`: Input[String] = js.native
}

object CustomerGatewayArgs {
  @scala.inline
  def apply(
    bgpAsn: Input[Double],
    ipAddress: Input[String],
    `type`: Input[String],
    tags: Input[StringDictionary[_]] = null
  ): CustomerGatewayArgs = {
    val __obj = js.Dynamic.literal(bgpAsn = bgpAsn.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerGatewayArgs]
  }
}

