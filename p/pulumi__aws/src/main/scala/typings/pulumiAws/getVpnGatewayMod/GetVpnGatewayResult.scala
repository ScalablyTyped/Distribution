package typings.pulumiAws.getVpnGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetVpnGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnGatewayResult extends js.Object {
  val amazonSideAsn: String = js.native
  val arn: String = js.native
  val attachedVpcId: String = js.native
  val availabilityZone: String = js.native
  val filters: js.UndefOr[js.Array[GetVpnGatewayFilter]] = js.native
  val id: String = js.native
  val state: String = js.native
  val tags: StringDictionary[String] = js.native
}

object GetVpnGatewayResult {
  @scala.inline
  def apply(
    amazonSideAsn: String,
    arn: String,
    attachedVpcId: String,
    availabilityZone: String,
    id: String,
    state: String,
    tags: StringDictionary[String]
  ): GetVpnGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], attachedVpcId = attachedVpcId.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnGatewayResult]
  }
  @scala.inline
  implicit class GetVpnGatewayResultOps[Self <: GetVpnGatewayResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachedVpcId(value: String): Self = this.set("attachedVpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetVpnGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpnGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

