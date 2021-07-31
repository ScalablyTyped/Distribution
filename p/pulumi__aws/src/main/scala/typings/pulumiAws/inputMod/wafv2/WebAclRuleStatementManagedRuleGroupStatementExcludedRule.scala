package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementManagedRuleGroupStatementExcludedRule extends StObject {
  
  /**
    * The name of the rule to exclude. If the rule group is managed by AWS, see the [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-list.html) for a list of names in the appropriate rule group in use.
    */
  var name: Input[String]
}
object WebAclRuleStatementManagedRuleGroupStatementExcludedRule {
  
  @scala.inline
  def apply(name: Input[String]): WebAclRuleStatementManagedRuleGroupStatementExcludedRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementManagedRuleGroupStatementExcludedRuleMutableBuilder[Self <: WebAclRuleStatementManagedRuleGroupStatementExcludedRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
