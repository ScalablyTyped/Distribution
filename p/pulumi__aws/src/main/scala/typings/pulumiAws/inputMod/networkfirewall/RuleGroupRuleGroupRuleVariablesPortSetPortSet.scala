package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRuleVariablesPortSetPortSet extends StObject {
  
  /**
    * Set of port ranges.
    */
  var definitions: Input[js.Array[Input[String]]]
}
object RuleGroupRuleGroupRuleVariablesPortSetPortSet {
  
  inline def apply(definitions: Input[js.Array[Input[String]]]): RuleGroupRuleGroupRuleVariablesPortSetPortSet = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesPortSetPortSet]
  }
  
  extension [Self <: RuleGroupRuleGroupRuleVariablesPortSetPortSet](x: Self) {
    
    inline def setDefinitions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsVarargs(value: Input[String]*): Self = StObject.set(x, "definitions", js.Array(value :_*))
  }
}
