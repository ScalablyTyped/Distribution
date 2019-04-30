package typings
package atPulumiAwsLib.directconnectGetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGatewayResult extends js.Object {
  /**
    * The ASN on the Amazon side of the connection.
    */
  val amazonSideAsn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
  /**
    * AWS Account ID of the gateway.
    */
  val ownerAccountId: java.lang.String
}

object GetGatewayResult {
  @scala.inline
  def apply(
    amazonSideAsn: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    ownerAccountId: java.lang.String
  ): GetGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn, id = id, name = name, ownerAccountId = ownerAccountId)
  
    __obj.asInstanceOf[GetGatewayResult]
  }
}

