package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRuleVariablesIpSet extends StObject {
  
  /**
    * A configuration block that defines a set of IP addresses. See IP Set below for details.
    */
  var ipSet: RuleGroupRuleGroupRuleVariablesIpSetIpSet
  
  /**
    * A unique alphanumeric string to identify the `ipSet`.
    */
  var key: String
}
object RuleGroupRuleGroupRuleVariablesIpSet {
  
  @scala.inline
  def apply(ipSet: RuleGroupRuleGroupRuleVariablesIpSetIpSet, key: String): RuleGroupRuleGroupRuleVariablesIpSet = {
    val __obj = js.Dynamic.literal(ipSet = ipSet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesIpSet]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesIpSetMutableBuilder[Self <: RuleGroupRuleGroupRuleVariablesIpSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpSet(value: RuleGroupRuleGroupRuleVariablesIpSetIpSet): Self = StObject.set(x, "ipSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
