package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleAction extends StObject {
  
  /**
    * Instructs AWS WAF to allow the web request.
    */
  var allow: js.UndefOr[RuleGroupRuleActionAllow] = js.undefined
  
  /**
    * Instructs AWS WAF to block the web request.
    */
  var block: js.UndefOr[RuleGroupRuleActionBlock] = js.undefined
  
  /**
    * Instructs AWS WAF to count the web request and allow it.
    */
  var count: js.UndefOr[RuleGroupRuleActionCount] = js.undefined
}
object RuleGroupRuleAction {
  
  inline def apply(): RuleGroupRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleAction]
  }
  
  extension [Self <: RuleGroupRuleAction](x: Self) {
    
    inline def setAllow(value: RuleGroupRuleActionAllow): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setBlock(value: RuleGroupRuleActionBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setCount(value: RuleGroupRuleActionCount): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
