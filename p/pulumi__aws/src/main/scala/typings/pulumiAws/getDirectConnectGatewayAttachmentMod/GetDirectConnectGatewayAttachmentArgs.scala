package typings.pulumiAws.getDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectConnectGatewayAttachmentArgs extends js.Object {
  /**
    * Identifier of the Direct Connect Gateway.
    */
  val dxGatewayId: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: String = js.native
}

object GetDirectConnectGatewayAttachmentArgs {
  @scala.inline
  def apply(dxGatewayId: String, transitGatewayId: String, tags: StringDictionary[js.Any] = null): GetDirectConnectGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentArgs]
  }
}

