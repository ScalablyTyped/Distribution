package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRuleVariablesPortSetPortSet extends StObject {
  
  /**
    * Set of port ranges.
    */
  var definitions: js.Array[String]
}
object RuleGroupRuleGroupRuleVariablesPortSetPortSet {
  
  inline def apply(definitions: js.Array[String]): RuleGroupRuleGroupRuleVariablesPortSetPortSet = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesPortSetPortSet]
  }
  
  extension [Self <: RuleGroupRuleGroupRuleVariablesPortSetPortSet](x: Self) {
    
    inline def setDefinitions(value: js.Array[String]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsVarargs(value: String*): Self = StObject.set(x, "definitions", js.Array(value :_*))
  }
}
