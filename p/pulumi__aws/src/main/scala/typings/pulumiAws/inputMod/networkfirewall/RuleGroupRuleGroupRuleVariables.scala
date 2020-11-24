package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRuleVariables extends js.Object {
  
  /**
    * Set of configuration blocks that define IP address information. See IP Sets below for details.
    */
  var ipSets: js.UndefOr[Input[js.Array[Input[RuleGroupRuleGroupRuleVariablesIpSet]]]] = js.native
  
  /**
    * Set of configuration blocks that define port range information. See Port Sets below for details.
    */
  var portSets: js.UndefOr[Input[js.Array[Input[RuleGroupRuleGroupRuleVariablesPortSet]]]] = js.native
}
object RuleGroupRuleGroupRuleVariables {
  
  @scala.inline
  def apply(): RuleGroupRuleGroupRuleVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariables]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesOps[Self <: RuleGroupRuleGroupRuleVariables] (val x: Self) extends AnyVal {
    
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
    def setIpSetsVarargs(value: Input[RuleGroupRuleGroupRuleVariablesIpSet]*): Self = this.set("ipSets", js.Array(value :_*))
    
    @scala.inline
    def setIpSets(value: Input[js.Array[Input[RuleGroupRuleGroupRuleVariablesIpSet]]]): Self = this.set("ipSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpSets: Self = this.set("ipSets", js.undefined)
    
    @scala.inline
    def setPortSetsVarargs(value: Input[RuleGroupRuleGroupRuleVariablesPortSet]*): Self = this.set("portSets", js.Array(value :_*))
    
    @scala.inline
    def setPortSets(value: Input[js.Array[Input[RuleGroupRuleGroupRuleVariablesPortSet]]]): Self = this.set("portSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortSets: Self = this.set("portSets", js.undefined)
  }
}
