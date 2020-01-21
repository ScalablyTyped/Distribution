package typings.pulumiAws.getVpnAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnAttachmentArgs extends js.Object {
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: String = js.native
  /**
    * Identifier of the EC2 VPN Connection.
    */
  val vpnConnectionId: String = js.native
}

object GetVpnAttachmentArgs {
  @scala.inline
  def apply(transitGatewayId: String, vpnConnectionId: String, tags: StringDictionary[js.Any] = null): GetVpnAttachmentArgs = {
    val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpnConnectionId = vpnConnectionId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnAttachmentArgs]
  }
}

