package typings.atPulumiAws.wafGetIpsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIpsetResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
}

object GetIpsetResult {
  @scala.inline
  def apply(id: String, name: String): GetIpsetResult = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[GetIpsetResult]
  }
}

