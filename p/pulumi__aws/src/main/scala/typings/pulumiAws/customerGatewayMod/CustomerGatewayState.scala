package typings.pulumiAws.customerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerGatewayState extends js.Object {
  /**
    * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: js.UndefOr[Input[Double]] = js.native
  /**
    * The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Tags to apply to the gateway.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of customer gateway. The only type AWS
    * supports at this time is "ipsec.1".
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object CustomerGatewayState {
  @scala.inline
  def apply(
    bgpAsn: Input[Double] = null,
    ipAddress: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    `type`: Input[String] = null
  ): CustomerGatewayState = {
    val __obj = js.Dynamic.literal()
    if (bgpAsn != null) __obj.updateDynamic("bgpAsn")(bgpAsn.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerGatewayState]
  }
}

