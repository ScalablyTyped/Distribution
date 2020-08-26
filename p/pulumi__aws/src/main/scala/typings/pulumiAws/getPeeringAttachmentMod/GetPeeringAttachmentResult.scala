package typings.pulumiAws.getPeeringAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2transitgateway.GetPeeringAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPeeringAttachmentResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetPeeringAttachmentFilter]] = js.native
  val id: js.UndefOr[String] = js.native
  /**
    * Identifier of the peer AWS account
    */
  val peerAccountId: String = js.native
  /**
    * Identifier of the peer AWS region
    */
  val peerRegion: String = js.native
  /**
    * Identifier of the peer EC2 Transit Gateway
    */
  val peerTransitGatewayId: String = js.native
  val tags: StringDictionary[String] = js.native
  /**
    * Identifier of the local EC2 Transit Gateway
    */
  val transitGatewayId: String = js.native
}

object GetPeeringAttachmentResult {
  @scala.inline
  def apply(
    peerAccountId: String,
    peerRegion: String,
    peerTransitGatewayId: String,
    tags: StringDictionary[String],
    transitGatewayId: String
  ): GetPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal(peerAccountId = peerAccountId.asInstanceOf[js.Any], peerRegion = peerRegion.asInstanceOf[js.Any], peerTransitGatewayId = peerTransitGatewayId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPeeringAttachmentResult]
  }
  @scala.inline
  implicit class GetPeeringAttachmentResultOps[Self <: GetPeeringAttachmentResult] (val x: Self) extends AnyVal {
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
    def setPeerAccountId(value: String): Self = this.set("peerAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerRegion(value: String): Self = this.set("peerRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerTransitGatewayId(value: String): Self = this.set("peerTransitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetPeeringAttachmentFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetPeeringAttachmentFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

