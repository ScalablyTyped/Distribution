package typings.pulumiAws.getDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2transitgateway.GetDirectConnectGatewayAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectConnectGatewayAttachmentResult extends js.Object {
  val dxGatewayId: js.UndefOr[String] = js.native
  val filters: js.UndefOr[js.Array[GetDirectConnectGatewayAttachmentFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway Attachment
    */
  val tags: StringDictionary[js.Any] = js.native
  val transitGatewayId: js.UndefOr[String] = js.native
}

object GetDirectConnectGatewayAttachmentResult {
  @scala.inline
  def apply(
    id: String,
    tags: StringDictionary[js.Any],
    dxGatewayId: String = null,
    filters: js.Array[GetDirectConnectGatewayAttachmentFilter] = null,
    transitGatewayId: String = null
  ): GetDirectConnectGatewayAttachmentResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (dxGatewayId != null) __obj.updateDynamic("dxGatewayId")(dxGatewayId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentResult]
  }
}

