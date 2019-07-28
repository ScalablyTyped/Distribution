package typings.atPulumiAws.apigatewayGetVpcLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcLinkResult extends js.Object {
  /**
    * Set to the ID of the found API Gateway VPC Link.
    */
  val id: String
  val name: String
}

object GetVpcLinkResult {
  @scala.inline
  def apply(id: String, name: String): GetVpcLinkResult = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[GetVpcLinkResult]
  }
}

