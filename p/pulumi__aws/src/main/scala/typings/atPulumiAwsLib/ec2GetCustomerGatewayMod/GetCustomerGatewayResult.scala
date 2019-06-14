package typings
package atPulumiAwsLib.ec2GetCustomerGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCustomerGatewayResult extends js.Object {
  /**
    * (Optional) The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: scala.Double
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Optional) The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: java.lang.String
  /**
    * Map of key-value pairs assigned to the gateway.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * (Optional) The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: java.lang.String
}

object GetCustomerGatewayResult {
  @scala.inline
  def apply(
    bgpAsn: scala.Double,
    ipAddress: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    `type`: java.lang.String,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    id: java.lang.String = null
  ): GetCustomerGatewayResult = {
    val __obj = js.Dynamic.literal(bgpAsn = bgpAsn, ipAddress = ipAddress, tags = tags)
    __obj.updateDynamic("type")(`type`)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetCustomerGatewayResult]
  }
}

