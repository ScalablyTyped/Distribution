package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupActivatedRuleAction extends StObject {
  
  /**
    * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
    */
  var `type`: Input[String]
}
object RuleGroupActivatedRuleAction {
  
  @scala.inline
  def apply(`type`: Input[String]): RuleGroupActivatedRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupActivatedRuleAction]
  }
  
  @scala.inline
  implicit class RuleGroupActivatedRuleActionMutableBuilder[Self <: RuleGroupActivatedRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
