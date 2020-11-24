package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementManagedRuleGroupStatement extends js.Object {
  
  /**
    * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
    */
  var excludedRules: js.UndefOr[Input[js.Array[Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]]]] = js.native
  
  /**
    * The name of the managed rule group.
    */
  var name: Input[String] = js.native
  
  /**
    * The name of the managed rule group vendor.
    */
  var vendorName: Input[String] = js.native
}
object WebAclRuleStatementManagedRuleGroupStatement {
  
  @scala.inline
  def apply(name: Input[String], vendorName: Input[String]): WebAclRuleStatementManagedRuleGroupStatement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], vendorName = vendorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementManagedRuleGroupStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementManagedRuleGroupStatementOps[Self <: WebAclRuleStatementManagedRuleGroupStatement] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorName(value: Input[String]): Self = this.set("vendorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedRulesVarargs(value: Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]*): Self = this.set("excludedRules", js.Array(value :_*))
    
    @scala.inline
    def setExcludedRules(value: Input[js.Array[Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]]]): Self = this.set("excludedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedRules: Self = this.set("excludedRules", js.undefined)
  }
}
