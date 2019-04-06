package typings
package atPulumiAwsLib.ec2transitgatewayGetVpnAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpnAttachmentArgs extends js.Object {
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: java.lang.String
  /**
    * Identifier of the EC2 VPN Connection.
    */
  val vpnConnectionId: java.lang.String
}

object GetVpnAttachmentArgs {
  @scala.inline
  def apply(
    transitGatewayId: java.lang.String,
    vpnConnectionId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetVpnAttachmentArgs = {
    val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId, vpnConnectionId = vpnConnectionId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpnAttachmentArgs]
  }
}

