package typings.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleOverrideAction extends js.Object {
  
  /**
    * Override the rule action setting to count (i.e. only count matches). Configured as an empty block `{}`.
    */
  var count: js.UndefOr[WebAclRuleOverrideActionCount] = js.native
  
  /**
    * Don't override the rule action setting. Configured as an empty block `{}`.
    */
  var none: js.UndefOr[WebAclRuleOverrideActionNone] = js.native
}
object WebAclRuleOverrideAction {
  
  @scala.inline
  def apply(): WebAclRuleOverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleOverrideAction]
  }
  
  @scala.inline
  implicit class WebAclRuleOverrideActionOps[Self <: WebAclRuleOverrideAction] (val x: Self) extends AnyVal {
    
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
    def setCount(value: WebAclRuleOverrideActionCount): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setNone(value: WebAclRuleOverrideActionNone): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
  }
}
