package typings.atPulumiAws.directconnectGetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGatewayResult extends js.Object {
  /**
    * The ASN on the Amazon side of the connection.
    */
  val amazonSideAsn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * AWS Account ID of the gateway.
    */
  val ownerAccountId: String
}

object GetGatewayResult {
  @scala.inline
  def apply(amazonSideAsn: String, id: String, name: String, ownerAccountId: String): GetGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn, id = id, name = name, ownerAccountId = ownerAccountId)
  
    __obj.asInstanceOf[GetGatewayResult]
  }
}

