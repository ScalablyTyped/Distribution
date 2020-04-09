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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPN Attachment
    */
  val tags: StringDictionary[js.Any] = js.native
  val transitGatewayId: js.UndefOr[String] = js.native
  val vpnConnectionId: js.UndefOr[String] = js.native
}

object GetVpnAttachmentResult {
  @scala.inline
  def apply(
    id: String,
    tags: StringDictionary[js.Any],
    filters: js.Array[GetVpnAttachmentFilter] = null,
    transitGatewayId: String = null,
    vpnConnectionId: String = null
  ): GetVpnAttachmentResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    if (vpnConnectionId != null) __obj.updateDynamic("vpnConnectionId")(vpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnAttachmentResult]
  }
}

