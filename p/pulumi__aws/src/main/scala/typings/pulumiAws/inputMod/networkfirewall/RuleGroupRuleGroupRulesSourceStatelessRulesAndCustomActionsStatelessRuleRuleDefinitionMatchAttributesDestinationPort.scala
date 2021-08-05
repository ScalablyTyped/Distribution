package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort extends StObject {
  
  /**
    * The lower limit of the port range. This must be less than or equal to the `toPort`.
    */
  var fromPort: Input[Double]
  
  /**
    * The upper limit of the port range. This must be greater than or equal to the `fromPort`.
    */
  var toPort: js.UndefOr[Input[Double]] = js.undefined
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort {
  
  inline def apply(fromPort: Input[Double]): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPort](x: Self) {
    
    inline def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    inline def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
  }
}
