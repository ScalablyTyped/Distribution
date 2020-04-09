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
    * A mapping of tags, each pair of which must exactly match a pair on the desired Transit Gateway VPN Attachment.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
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
  def apply(
    filters: js.Array[GetVpnAttachmentFilter] = null,
    tags: StringDictionary[js.Any] = null,
    transitGatewayId: String = null,
    vpnConnectionId: String = null
  ): GetVpnAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    if (vpnConnectionId != null) __obj.updateDynamic("vpnConnectionId")(vpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnAttachmentArgs]
  }
}

