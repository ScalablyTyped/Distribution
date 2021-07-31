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
  
  @scala.inline
  def apply(definitions: js.Array[String]): RuleGroupRuleGroupRuleVariablesPortSetPortSet = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesPortSetPortSet]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesPortSetPortSetMutableBuilder[Self <: RuleGroupRuleGroupRuleVariablesPortSetPortSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitions(value: js.Array[String]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsVarargs(value: String*): Self = StObject.set(x, "definitions", js.Array(value :_*))
  }
}
