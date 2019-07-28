package typings.atPulumiAws.wafGetRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRuleResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
}

object GetRuleResult {
  @scala.inline
  def apply(id: String, name: String): GetRuleResult = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[GetRuleResult]
  }
}

