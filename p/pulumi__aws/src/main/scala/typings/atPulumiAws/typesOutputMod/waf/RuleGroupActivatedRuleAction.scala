package typings.atPulumiAws.typesOutputMod.waf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroupActivatedRuleAction extends js.Object {
  /**
    * The rule type, either [`REGULAR`](https://www.terraform.io/docs/providers/aws/r/waf_rule.html), [`RATE_BASED`](https://www.terraform.io/docs/providers/aws/r/waf_rate_based_rule.html), or `GROUP`. Defaults to `REGULAR`.
    */
  var `type`: String
}

object RuleGroupActivatedRuleAction {
  @scala.inline
  def apply(`type`: String): RuleGroupActivatedRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RuleGroupActivatedRuleAction]
  }
}

