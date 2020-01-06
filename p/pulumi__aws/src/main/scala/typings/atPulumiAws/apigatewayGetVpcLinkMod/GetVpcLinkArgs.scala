package typings.atPulumiAws.apigatewayGetVpcLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcLinkArgs extends js.Object {
  /**
    * The name of the API Gateway VPC Link to look up. If no API Gateway VPC Link is found with this name, an error will be returned.
    * If multiple API Gateway VPC Links are found with this name, an error will be returned.
    */
  val name: String = js.native
}

object GetVpcLinkArgs {
  @scala.inline
  def apply(name: String): GetVpcLinkArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVpcLinkArgs]
  }
}

