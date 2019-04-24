package typings
package atPulumiAwsLib.apigatewayGetVpcLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcLinkResult extends js.Object {
  /**
    * Set to the ID of the found API Gateway VPC Link.
    */
  val id: java.lang.String
  val name: java.lang.String
}

object GetVpcLinkResult {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): GetVpcLinkResult = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[GetVpcLinkResult]
  }
}

