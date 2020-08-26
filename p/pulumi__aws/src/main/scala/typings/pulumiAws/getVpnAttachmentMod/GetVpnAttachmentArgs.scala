package typings.pulumiAws.getVpnAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetVpnAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnAttachmentArgs extends js.Object {
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetVpnAttachmentFilter]] = js.native
  /**
    * A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway VPN Attachment.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[String] = js.native
  /**
    * Identifier of the EC2 VPN Connection.
    */
  val vpnConnectionId: js.UndefOr[String] = js.native
}

object GetVpnAttachmentArgs {
  @scala.inline
  def apply(): GetVpnAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpnAttachmentArgs]
  }
  @scala.inline
  implicit class GetVpnAttachmentArgsOps[Self <: GetVpnAttachmentArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetVpnAttachmentFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpnAttachmentFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
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

