package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRuleGroupReferenceStatementExcludedRule extends StObject {
  
  /**
    * The name of the rule to exclude. If the rule group is managed by AWS, see the [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-list.html) for a list of names in the appropriate rule group in use.
    */
  var name: Input[String] = js.native
}
object WebAclRuleStatementRuleGroupReferenceStatementExcludedRule {
  
  @scala.inline
  def apply(name: Input[String]): WebAclRuleStatementRuleGroupReferenceStatementExcludedRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRuleGroupReferenceStatementExcludedRule]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleMutableBuilder[Self <: WebAclRuleStatementRuleGroupReferenceStatementExcludedRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
