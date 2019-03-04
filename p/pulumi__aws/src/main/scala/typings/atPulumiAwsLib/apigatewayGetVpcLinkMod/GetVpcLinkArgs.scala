package typings
package atPulumiAwsLib.apigatewayGetVpcLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcLinkArgs extends js.Object {
  /**
    * The name of the API Gateway VPC Link to look up. If no API Gateway VPC Link is found with this name, an error will be returned.
    * If multiple API Gateway VPC Links are found with this name, an error will be returned.
    */
  val name: java.lang.String
}

object GetVpcLinkArgs {
  @scala.inline
  def apply(name: java.lang.String): GetVpcLinkArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetVpcLinkArgs]
  }
}

