package typings.pulumiAws.getVpnAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnAttachmentResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPN Attachment
    */
  val tags: StringDictionary[js.Any] = js.native
  val transitGatewayId: String = js.native
  val vpnConnectionId: String = js.native
}

object GetVpnAttachmentResult {
  @scala.inline
  def apply(id: String, tags: StringDictionary[js.Any], transitGatewayId: String, vpnConnectionId: String): GetVpnAttachmentResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpnConnectionId = vpnConnectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVpnAttachmentResult]
  }
}

