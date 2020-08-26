package typings.pulumiAws.getCustomerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetCustomerGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCustomerGatewayResult extends js.Object {
  /**
    * The ARN of the customer gateway.
    */
  val arn: String = js.native
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
  val tags: StringDictionary[String] = js.native
  /**
    * (Optional) The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: String = js.native
}

object GetCustomerGatewayResult {
  @scala.inline
  def apply(arn: String, bgpAsn: Double, ipAddress: String, tags: StringDictionary[String], `type`: String): GetCustomerGatewayResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerGatewayResult]
  }
  @scala.inline
  implicit class GetCustomerGatewayResultOps[Self <: GetCustomerGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgpAsn(value: Double): Self = this.set("bgpAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetCustomerGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetCustomerGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

