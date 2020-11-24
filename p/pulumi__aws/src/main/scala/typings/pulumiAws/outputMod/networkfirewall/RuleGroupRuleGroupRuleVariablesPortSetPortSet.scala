package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRuleVariablesPortSetPortSet extends js.Object {
  
  /**
    * Set of port ranges.
    */
  var definitions: js.Array[String] = js.native
}
object RuleGroupRuleGroupRuleVariablesPortSetPortSet {
  
  @scala.inline
  def apply(definitions: js.Array[String]): RuleGroupRuleGroupRuleVariablesPortSetPortSet = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRuleVariablesPortSetPortSet]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRuleVariablesPortSetPortSetOps[Self <: RuleGroupRuleGroupRuleVariablesPortSetPortSet] (val x: Self) extends AnyVal {
    
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
    def setDefinitionsVarargs(value: String*): Self = this.set("definitions", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: js.Array[String]): Self = this.set("definitions", value.asInstanceOf[js.Any])
  }
}
