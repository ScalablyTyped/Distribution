package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRuleVariablesPortSet extends StObject {
  
  /**
    * An unique alphanumeric string to identify the `portSet`.
    */
  var key: Input[String]
  
  /**
    * A configuration block that defines a set of port ranges. See Port Set below for details.
    */
  var portSet: Input[RuleGroupRuleGroupRuleVariablesPortSetPortSet]
}
object RuleGroupRuleGroupRuleVariablesPortSet {
  
  @scala.inline
  def apply(key: Input[String], portSet: Input[RuleGroupRuleGroupRuleVariablesPortSetPortSet]): RuleGroupRuleGroupRuleVariablesPortSet = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], portSet = portSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesPortSet]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesPortSetMutableBuilder[Self <: RuleGroupRuleGroupRuleVariablesPortSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortSet(value: Input[RuleGroupRuleGroupRuleVariablesPortSetPortSet]): Self = StObject.set(x, "portSet", value.asInstanceOf[js.Any])
  }
}
