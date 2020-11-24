package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleAction extends js.Object {
  
  /**
    * Instructs AWS WAF to allow the web request.
    */
  var allow: js.UndefOr[Input[RuleGroupRuleActionAllow]] = js.native
  
  /**
    * Instructs AWS WAF to block the web request.
    */
  var block: js.UndefOr[Input[RuleGroupRuleActionBlock]] = js.native
  
  /**
    * Instructs AWS WAF to count the web request and allow it.
    */
  var count: js.UndefOr[Input[RuleGroupRuleActionCount]] = js.native
}
object RuleGroupRuleAction {
  
  @scala.inline
  def apply(): RuleGroupRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleAction]
  }
  
  @scala.inline
  implicit class RuleGroupRuleActionOps[Self <: RuleGroupRuleAction] (val x: Self) extends AnyVal {
    
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
    def setAllow(value: Input[RuleGroupRuleActionAllow]): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    
    @scala.inline
    def setBlock(value: Input[RuleGroupRuleActionBlock]): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setCount(value: Input[RuleGroupRuleActionCount]): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
  }
}
