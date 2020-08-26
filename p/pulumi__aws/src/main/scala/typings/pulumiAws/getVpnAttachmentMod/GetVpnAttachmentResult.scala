package typings.pulumiAws.getVpnAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2transitgateway.GetVpnAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnAttachmentResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetVpnAttachmentFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPN Attachment
    */
  val tags: StringDictionary[String] = js.native
  val transitGatewayId: js.UndefOr[String] = js.native
  val vpnConnectionId: js.UndefOr[String] = js.native
}

object GetVpnAttachmentResult {
  @scala.inline
  def apply(id: String, tags: StringDictionary[String]): GetVpnAttachmentResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnAttachmentResult]
  }
  @scala.inline
  implicit class GetVpnAttachmentResultOps[Self <: GetVpnAttachmentResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetVpnAttachmentFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpnAttachmentFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("transitGatewayId", js.undefined)
    @scala.inline
    def setVpnConnectionId(value: String): Self = this.set("vpnConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnConnectionId: Self = this.set("vpnConnectionId", js.undefined)
  }
  
}

