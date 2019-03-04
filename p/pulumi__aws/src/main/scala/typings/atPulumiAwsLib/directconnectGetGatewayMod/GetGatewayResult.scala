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
}

object GetGatewayResult {
  @scala.inline
  def apply(amazonSideAsn: java.lang.String, id: java.lang.String): GetGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn, id = id)
  
    __obj.asInstanceOf[GetGatewayResult]
  }
}

