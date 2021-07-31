package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRuleVariablesIpSetIpSet extends StObject {
  
  /**
    * Set of IP addresses and address ranges, in CIDR notation.
    */
  var definitions: Input[js.Array[Input[String]]]
}
object RuleGroupRuleGroupRuleVariablesIpSetIpSet {
  
  @scala.inline
  def apply(definitions: Input[js.Array[Input[String]]]): RuleGroupRuleGroupRuleVariablesIpSetIpSet = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesIpSetIpSet]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesIpSetIpSetMutableBuilder[Self <: RuleGroupRuleGroupRuleVariablesIpSetIpSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsVarargs(value: Input[String]*): Self = StObject.set(x, "definitions", js.Array(value :_*))
  }
}
