package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRuleVariablesIpSet extends js.Object {
  
  /**
    * A configuration block that defines a set of IP addresses. See IP Set below for details.
    */
  var ipSet: RuleGroupRuleGroupRuleVariablesIpSetIpSet = js.native
  
  /**
    * A unique alphanumeric string to identify the `ipSet`.
    */
  var key: String = js.native
}
object RuleGroupRuleGroupRuleVariablesIpSet {
  
  @scala.inline
  def apply(ipSet: RuleGroupRuleGroupRuleVariablesIpSetIpSet, key: String): RuleGroupRuleGroupRuleVariablesIpSet = {
    val __obj = js.Dynamic.literal(ipSet = ipSet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesIpSet]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesIpSetOps[Self <: RuleGroupRuleGroupRuleVariablesIpSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIpSet(value: RuleGroupRuleGroupRuleVariablesIpSetIpSet): Self = this.set("ipSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
