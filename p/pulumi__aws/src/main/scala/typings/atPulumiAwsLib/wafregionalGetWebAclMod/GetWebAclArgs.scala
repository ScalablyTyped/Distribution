package typings
package atPulumiAwsLib.wafregionalGetWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebAclArgs extends js.Object {
  /**
    * The name of the WAF Web ACL.
    */
  val name: java.lang.String
}

object GetWebAclArgs {
  @scala.inline
  def apply(name: java.lang.String): GetWebAclArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetWebAclArgs]
  }
}

