package typings
package atPulumiAwsLib.ec2transitgatewayGetDirectConnectGatewayAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDirectConnectGatewayAttachmentArgs extends js.Object {
  /**
    * Identifier of the Direct Connect Gateway.
    */
  val dxGatewayId: java.lang.String
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: java.lang.String
}

object GetDirectConnectGatewayAttachmentArgs {
  @scala.inline
  def apply(
    dxGatewayId: java.lang.String,
    transitGatewayId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetDirectConnectGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId, transitGatewayId = transitGatewayId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentArgs]
  }
}

