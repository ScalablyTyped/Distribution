package typings.atPulumiAws.wafregionalGetWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebAclArgs extends js.Object {
  /**
    * The name of the WAF Regional Web ACL.
    */
  val name: String = js.native
}

object GetWebAclArgs {
  @scala.inline
  def apply(name: String): GetWebAclArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetWebAclArgs]
  }
}

