package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRuleVariables extends StObject {
  
  /**
    * Set of configuration blocks that define IP address information. See IP Sets below for details.
    */
  var ipSets: js.UndefOr[Input[js.Array[Input[RuleGroupRuleGroupRuleVariablesIpSet]]]] = js.undefined
  
  /**
    * Set of configuration blocks that define port range information. See Port Sets below for details.
    */
  var portSets: js.UndefOr[Input[js.Array[Input[RuleGroupRuleGroupRuleVariablesPortSet]]]] = js.undefined
}
object RuleGroupRuleGroupRuleVariables {
  
  inline def apply(): RuleGroupRuleGroupRuleVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariables]
  }
  
  extension [Self <: RuleGroupRuleGroupRuleVariables](x: Self) {
    
    inline def setIpSets(value: Input[js.Array[Input[RuleGroupRuleGroupRuleVariablesIpSet]]]): Self = StObject.set(x, "ipSets", value.asInstanceOf[js.Any])
    
    inline def setIpSetsUndefined: Self = StObject.set(x, "ipSets", js.undefined)
    
    inline def setIpSetsVarargs(value: Input[RuleGroupRuleGroupRuleVariablesIpSet]*): Self = StObject.set(x, "ipSets", js.Array(value :_*))
    
    inline def setPortSets(value: Input[js.Array[Input[RuleGroupRuleGroupRuleVariablesPortSet]]]): Self = StObject.set(x, "portSets", value.asInstanceOf[js.Any])
    
    inline def setPortSetsUndefined: Self = StObject.set(x, "portSets", js.undefined)
    
    inline def setPortSetsVarargs(value: Input[RuleGroupRuleGroupRuleVariablesPortSet]*): Self = StObject.set(x, "portSets", js.Array(value :_*))
  }
}
