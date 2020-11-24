package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroup extends js.Object {
  
  /**
    * A configuration block that defines additional settings available to use in the rules defined in the rule group. See Rule Variables below for details.
    */
  var ruleVariables: js.UndefOr[Input[RuleGroupRuleGroupRuleVariables]] = js.native
  
  /**
    * A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
    */
  var rulesSource: Input[RuleGroupRuleGroupRulesSource] = js.native
}
object RuleGroupRuleGroup {
  
  @scala.inline
  def apply(rulesSource: Input[RuleGroupRuleGroupRulesSource]): RuleGroupRuleGroup = {
    val __obj = js.Dynamic.literal(rulesSource = rulesSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroup]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupOps[Self <: RuleGroupRuleGroup] (val x: Self) extends AnyVal {
    
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
    def setRulesSource(value: Input[RuleGroupRuleGroupRulesSource]): Self = this.set("rulesSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVariables(value: Input[RuleGroupRuleGroupRuleVariables]): Self = this.set("ruleVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleVariables: Self = this.set("ruleVariables", js.undefined)
  }
}
