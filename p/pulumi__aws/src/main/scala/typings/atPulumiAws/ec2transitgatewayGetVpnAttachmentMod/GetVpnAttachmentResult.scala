package typings.atPulumiAws.ec2transitgatewayGetVpnAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpnAttachmentResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Key-value tags for the EC2 Transit Gateway VPN Attachment
    */
  val tags: StringDictionary[js.Any]
  val transitGatewayId: String
  val vpnConnectionId: String
}

object GetVpnAttachmentResult {
  @scala.inline
  def apply(id: String, tags: StringDictionary[js.Any], transitGatewayId: String, vpnConnectionId: String): GetVpnAttachmentResult = {
    val __obj = js.Dynamic.literal(id = id, tags = tags, transitGatewayId = transitGatewayId, vpnConnectionId = vpnConnectionId)
  
    __obj.asInstanceOf[GetVpnAttachmentResult]
  }
}

