package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRuleVariablesPortSet extends js.Object {
  
  /**
    * An unique alphanumeric string to identify the `portSet`.
    */
  var key: String = js.native
  
  /**
    * A configuration block that defines a set of port ranges. See Port Set below for details.
    */
  var portSet: RuleGroupRuleGroupRuleVariablesPortSetPortSet = js.native
}
object RuleGroupRuleGroupRuleVariablesPortSet {
  
  @scala.inline
  def apply(key: String, portSet: RuleGroupRuleGroupRuleVariablesPortSetPortSet): RuleGroupRuleGroupRuleVariablesPortSet = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], portSet = portSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesPortSet]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesPortSetOps[Self <: RuleGroupRuleGroupRuleVariablesPortSet] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortSet(value: RuleGroupRuleGroupRuleVariablesPortSetPortSet): Self = this.set("portSet", value.asInstanceOf[js.Any])
  }
}
