package typings.atPulumiAws.ec2GetCustomerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2Ns.GetCustomerGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCustomerGatewayResult extends js.Object {
  /**
    * (Optional) The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: Double
  val filters: js.UndefOr[js.Array[GetCustomerGatewayFilter]] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  /**
    * (Optional) The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: String
  /**
    * Map of key-value pairs assigned to the gateway.
    */
  val tags: StringDictionary[js.Any]
  /**
    * (Optional) The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: String
}

object GetCustomerGatewayResult {
  @scala.inline
  def apply(
    bgpAsn: Double,
    ipAddress: String,
    tags: StringDictionary[js.Any],
    `type`: String,
    filters: js.Array[GetCustomerGatewayFilter] = null,
    id: String = null
  ): GetCustomerGatewayResult = {
    val __obj = js.Dynamic.literal(bgpAsn = bgpAsn, ipAddress = ipAddress, tags = tags)
    __obj.updateDynamic("type")(`type`)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetCustomerGatewayResult]
  }
}

