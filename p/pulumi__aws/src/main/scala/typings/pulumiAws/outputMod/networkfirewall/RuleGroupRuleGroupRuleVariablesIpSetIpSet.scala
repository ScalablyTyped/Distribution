package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRuleVariablesIpSetIpSet extends StObject {
  
  /**
    * Set of IP addresses and address ranges, in CIDR notation.
    */
  var definitions: js.Array[String]
}
object RuleGroupRuleGroupRuleVariablesIpSetIpSet {
  
  inline def apply(definitions: js.Array[String]): RuleGroupRuleGroupRuleVariablesIpSetIpSet = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesIpSetIpSet]
  }
  
  extension [Self <: RuleGroupRuleGroupRuleVariablesIpSetIpSet](x: Self) {
    
    inline def setDefinitions(value: js.Array[String]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsVarargs(value: String*): Self = StObject.set(x, "definitions", js.Array(value :_*))
  }
}
