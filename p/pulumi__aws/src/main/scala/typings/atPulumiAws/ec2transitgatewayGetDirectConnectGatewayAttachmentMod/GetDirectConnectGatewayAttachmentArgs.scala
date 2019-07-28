package typings.atPulumiAws.ec2transitgatewayGetDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDirectConnectGatewayAttachmentArgs extends js.Object {
  /**
    * Identifier of the Direct Connect Gateway.
    */
  val dxGatewayId: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: String
}

object GetDirectConnectGatewayAttachmentArgs {
  @scala.inline
  def apply(dxGatewayId: String, transitGatewayId: String, tags: StringDictionary[js.Any] = null): GetDirectConnectGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId, transitGatewayId = transitGatewayId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentArgs]
  }
}

