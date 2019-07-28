package typings.atPulumiAws.wafGetWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebAclArgs extends js.Object {
  /**
    * The name of the WAF Web ACL.
    */
  val name: String
}

object GetWebAclArgs {
  @scala.inline
  def apply(name: String): GetWebAclArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetWebAclArgs]
  }
}

