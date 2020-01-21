package typings.pulumiAws.getDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectConnectGatewayAttachmentResult extends js.Object {
  val dxGatewayId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway Attachment
    */
  val tags: StringDictionary[js.Any] = js.native
  val transitGatewayId: String = js.native
}

object GetDirectConnectGatewayAttachmentResult {
  @scala.inline
  def apply(dxGatewayId: String, id: String, tags: StringDictionary[js.Any], transitGatewayId: String): GetDirectConnectGatewayAttachmentResult = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentResult]
  }
}

