package typings.pulumiAws.getVpcLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcLinkResult extends js.Object {
  /**
    * Set to the ID of the found API Gateway VPC Link.
    */
  val id: String = js.native
  val name: String = js.native
}

object GetVpcLinkResult {
  @scala.inline
  def apply(id: String, name: String): GetVpcLinkResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVpcLinkResult]
  }
}

