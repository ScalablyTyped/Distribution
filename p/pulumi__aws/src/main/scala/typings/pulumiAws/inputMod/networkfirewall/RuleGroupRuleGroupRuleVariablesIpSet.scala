package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRuleVariablesIpSet extends StObject {
  
  /**
    * A configuration block that defines a set of IP addresses. See IP Set below for details.
    */
  var ipSet: Input[RuleGroupRuleGroupRuleVariablesIpSetIpSet]
  
  /**
    * A unique alphanumeric string to identify the `ipSet`.
    */
  var key: Input[String]
}
object RuleGroupRuleGroupRuleVariablesIpSet {
  
  inline def apply(ipSet: Input[RuleGroupRuleGroupRuleVariablesIpSetIpSet], key: Input[String]): RuleGroupRuleGroupRuleVariablesIpSet = {
    val __obj = js.Dynamic.literal(ipSet = ipSet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesIpSet]
  }
  
  extension [Self <: RuleGroupRuleGroupRuleVariablesIpSet](x: Self) {
    
    inline def setIpSet(value: Input[RuleGroupRuleGroupRuleVariablesIpSetIpSet]): Self = StObject.set(x, "ipSet", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
