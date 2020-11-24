package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceRulesSourceList extends js.Object {
  
  /**
    * String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
    */
  var generatedRulesType: String = js.native
  
  /**
    * Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
    */
  var targetTypes: js.Array[String] = js.native
  
  /**
    * Set of domains that you want to inspect for in your traffic flows.
    */
  var targets: js.Array[String] = js.native
}
object RuleGroupRuleGroupRulesSourceRulesSourceList {
  
  @scala.inline
  def apply(generatedRulesType: String, targetTypes: js.Array[String], targets: js.Array[String]): RuleGroupRuleGroupRulesSourceRulesSourceList = {
    val __obj = js.Dynamic.literal(generatedRulesType = generatedRulesType.asInstanceOf[js.Any], targetTypes = targetTypes.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceRulesSourceList]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceRulesSourceListOps[Self <: RuleGroupRuleGroupRulesSourceRulesSourceList] (val x: Self) extends AnyVal {
    
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
    def setGeneratedRulesType(value: String): Self = this.set("generatedRulesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypesVarargs(value: String*): Self = this.set("targetTypes", js.Array(value :_*))
    
    @scala.inline
    def setTargetTypes(value: js.Array[String]): Self = this.set("targetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = this.set("targets", value.asInstanceOf[js.Any])
  }
}
