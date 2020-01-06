package typings.atPulumiAws.ec2GetCustomerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetCustomerGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCustomerGatewayResult extends js.Object {
  /**
    * (Optional) The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: Double = js.native
  val filters: js.UndefOr[js.Array[GetCustomerGatewayFilter]] = js.native
  val id: js.UndefOr[String] = js.native
  /**
    * (Optional) The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: String = js.native
  /**
    * Map of key-value pairs assigned to the gateway.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * (Optional) The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: String = js.native
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
    val __obj = js.Dynamic.literal(bgpAsn = bgpAsn.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerGatewayResult]
  }
}

