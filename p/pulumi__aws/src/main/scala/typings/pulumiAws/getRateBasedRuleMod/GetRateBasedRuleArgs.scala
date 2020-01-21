package typings.pulumiAws.getRateBasedRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedRuleArgs extends js.Object {
  /**
    * The name of the WAF rate based rule.
    */
  val name: String = js.native
}

object GetRateBasedRuleArgs {
  @scala.inline
  def apply(name: String): GetRateBasedRuleArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRateBasedRuleArgs]
  }
}

