package typings.atPulumiAws.ec2transitgatewayGetDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDirectConnectGatewayAttachmentResult extends js.Object {
  val dxGatewayId: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Key-value tags for the EC2 Transit Gateway Attachment
    */
  val tags: StringDictionary[js.Any]
  val transitGatewayId: String
}

object GetDirectConnectGatewayAttachmentResult {
  @scala.inline
  def apply(dxGatewayId: String, id: String, tags: StringDictionary[js.Any], transitGatewayId: String): GetDirectConnectGatewayAttachmentResult = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId, id = id, tags = tags, transitGatewayId = transitGatewayId)
  
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentResult]
  }
}

