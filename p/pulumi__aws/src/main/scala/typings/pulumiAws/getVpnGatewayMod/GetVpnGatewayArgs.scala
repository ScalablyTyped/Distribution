package typings.pulumiAws.getVpnGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpnGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnGatewayArgs extends js.Object {
  /**
    * The Autonomous System Number (ASN) for the Amazon side of the specific VPN Gateway to retrieve.
    */
  val amazonSideAsn: js.UndefOr[String] = js.native
  /**
    * The ID of a VPC attached to the specific VPN Gateway to retrieve.
    */
  val attachedVpcId: js.UndefOr[String] = js.native
  /**
    * The Availability Zone of the specific VPN Gateway to retrieve.
    */
  val availabilityZone: js.UndefOr[String] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpnGatewayFilter]] = js.native
  /**
    * The ID of the specific VPN Gateway to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The state of the specific VPN Gateway to retrieve.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A map of tags, each pair of which must exactly match
    * a pair on the desired VPN Gateway.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetVpnGatewayArgs {
  @scala.inline
  def apply(): GetVpnGatewayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpnGatewayArgs]
  }
  @scala.inline
  implicit class GetVpnGatewayArgsOps[Self <: GetVpnGatewayArgs] (val x: Self) extends AnyVal {
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
    def setAmazonSideAsn(value: String): Self = this.set("amazonSideAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("amazonSideAsn", js.undefined)
    @scala.inline
    def setAttachedVpcId(value: String): Self = this.set("attachedVpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachedVpcId: Self = this.set("attachedVpcId", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: GetVpnGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpnGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

