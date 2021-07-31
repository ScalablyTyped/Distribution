package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleOverrideAction extends StObject {
  
  /**
    * Override the rule action setting to count (i.e. only count matches). Configured as an empty block `{}`.
    */
  var count: js.UndefOr[Input[WebAclRuleOverrideActionCount]] = js.undefined
  
  /**
    * Don't override the rule action setting. Configured as an empty block `{}`.
    */
  var none: js.UndefOr[Input[WebAclRuleOverrideActionNone]] = js.undefined
}
object WebAclRuleOverrideAction {
  
  @scala.inline
  def apply(): WebAclRuleOverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleOverrideAction]
  }
  
  @scala.inline
  implicit class WebAclRuleOverrideActionMutableBuilder[Self <: WebAclRuleOverrideAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Input[WebAclRuleOverrideActionCount]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setNone(value: Input[WebAclRuleOverrideActionNone]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
  }
}
