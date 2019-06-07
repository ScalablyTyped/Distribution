package typings
package atPulumiAwsLib.ec2transitgatewayGetDirectConnectGatewayAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDirectConnectGatewayAttachmentResult extends js.Object {
  val dxGatewayId: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Key-value tags for the EC2 Transit Gateway Attachment
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val transitGatewayId: java.lang.String
}

object GetDirectConnectGatewayAttachmentResult {
  @scala.inline
  def apply(
    dxGatewayId: java.lang.String,
    id: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    transitGatewayId: java.lang.String
  ): GetDirectConnectGatewayAttachmentResult = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId, id = id, tags = tags, transitGatewayId = transitGatewayId)
  
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentResult]
  }
}

