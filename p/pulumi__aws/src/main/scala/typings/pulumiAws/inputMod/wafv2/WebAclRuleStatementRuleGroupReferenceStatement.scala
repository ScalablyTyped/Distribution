package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRuleGroupReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the `aws.wafv2.RuleGroup` resource.
    */
  var arn: Input[String]
  
  /**
    * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
    */
  var excludedRules: js.UndefOr[
    Input[js.Array[Input[WebAclRuleStatementRuleGroupReferenceStatementExcludedRule]]]
  ] = js.undefined
}
object WebAclRuleStatementRuleGroupReferenceStatement {
  
  @scala.inline
  def apply(arn: Input[String]): WebAclRuleStatementRuleGroupReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRuleGroupReferenceStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRuleGroupReferenceStatementMutableBuilder[Self <: WebAclRuleStatementRuleGroupReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedRules(value: Input[js.Array[Input[WebAclRuleStatementRuleGroupReferenceStatementExcludedRule]]]): Self = StObject.set(x, "excludedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedRulesUndefined: Self = StObject.set(x, "excludedRules", js.undefined)
    
    @scala.inline
    def setExcludedRulesVarargs(value: Input[WebAclRuleStatementRuleGroupReferenceStatementExcludedRule]*): Self = StObject.set(x, "excludedRules", js.Array(value :_*))
  }
}
