package typings.atPulumiAws.wafGetRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRuleArgs extends js.Object {
  /**
    * The name of the WAF rule.
    */
  val name: String
}

object GetRuleArgs {
  @scala.inline
  def apply(name: String): GetRuleArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetRuleArgs]
  }
}

