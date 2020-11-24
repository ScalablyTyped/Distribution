package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRuleGroupReferenceStatement extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the `aws.wafv2.RuleGroup` resource.
    */
  var arn: Input[String] = js.native
  
  /**
    * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
    */
  var excludedRules: js.UndefOr[
    Input[js.Array[Input[WebAclRuleStatementRuleGroupReferenceStatementExcludedRule]]]
  ] = js.native
}
object WebAclRuleStatementRuleGroupReferenceStatement {
  
  @scala.inline
  def apply(arn: Input[String]): WebAclRuleStatementRuleGroupReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRuleGroupReferenceStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRuleGroupReferenceStatementOps[Self <: WebAclRuleStatementRuleGroupReferenceStatement] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedRulesVarargs(value: Input[WebAclRuleStatementRuleGroupReferenceStatementExcludedRule]*): Self = this.set("excludedRules", js.Array(value :_*))
    
    @scala.inline
    def setExcludedRules(value: Input[js.Array[Input[WebAclRuleStatementRuleGroupReferenceStatementExcludedRule]]]): Self = this.set("excludedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedRules: Self = this.set("excludedRules", js.undefined)
  }
}
