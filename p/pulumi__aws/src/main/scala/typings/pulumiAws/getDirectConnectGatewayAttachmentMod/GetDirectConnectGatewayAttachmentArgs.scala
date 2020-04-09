package typings.pulumiAws.getDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetDirectConnectGatewayAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectConnectGatewayAttachmentArgs extends js.Object {
  /**
    * Identifier of the Direct Connect Gateway.
    */
  val dxGatewayId: js.UndefOr[String] = js.native
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetDirectConnectGatewayAttachmentFilter]] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match a pair on the desired Transit Gateway Direct Connect Gateway Attachment.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[String] = js.native
}

object GetDirectConnectGatewayAttachmentArgs {
  @scala.inline
  def apply(
    dxGatewayId: String = null,
    filters: js.Array[GetDirectConnectGatewayAttachmentFilter] = null,
    tags: StringDictionary[js.Any] = null,
    transitGatewayId: String = null
  ): GetDirectConnectGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    if (dxGatewayId != null) __obj.updateDynamic("dxGatewayId")(dxGatewayId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentArgs]
  }
}

