package typings
package atPulumiAwsLib.wafGetWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebAclResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
}

object GetWebAclResult {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): GetWebAclResult = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[GetWebAclResult]
  }
}

