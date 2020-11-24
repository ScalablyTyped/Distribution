package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRuleVariablesIpSetIpSet extends js.Object {
  
  /**
    * Set of IP addresses and address ranges, in CIDR notation.
    */
  var definitions: Input[js.Array[Input[String]]] = js.native
}
object RuleGroupRuleGroupRuleVariablesIpSetIpSet {
  
  @scala.inline
  def apply(definitions: Input[js.Array[Input[String]]]): RuleGroupRuleGroupRuleVariablesIpSetIpSet = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesIpSetIpSet]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesIpSetIpSetOps[Self <: RuleGroupRuleGroupRuleVariablesIpSetIpSet] (val x: Self) extends AnyVal {
    
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
    def setDefinitionsVarargs(value: Input[String]*): Self = this.set("definitions", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: Input[js.Array[Input[String]]]): Self = this.set("definitions", value.asInstanceOf[js.Any])
  }
}
