package typings.atPulumiAws.ec2transitgatewayGetVpnAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpnAttachmentArgs extends js.Object {
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: String
  /**
    * Identifier of the EC2 VPN Connection.
    */
  val vpnConnectionId: String
}

object GetVpnAttachmentArgs {
  @scala.inline
  def apply(transitGatewayId: String, vpnConnectionId: String, tags: StringDictionary[js.Any] = null): GetVpnAttachmentArgs = {
    val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId, vpnConnectionId = vpnConnectionId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpnAttachmentArgs]
  }
}

