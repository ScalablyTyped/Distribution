package typings.atPulumiAws.wafregionalGetWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebAclResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
}

object GetWebAclResult {
  @scala.inline
  def apply(id: String, name: String): GetWebAclResult = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[GetWebAclResult]
  }
}

