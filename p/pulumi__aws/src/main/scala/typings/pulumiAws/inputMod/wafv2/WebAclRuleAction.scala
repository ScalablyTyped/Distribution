package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleAction extends StObject {
  
  /**
    * Instructs AWS WAF to allow the web request. Configure as an empty block `{}`.
    */
  var allow: js.UndefOr[Input[WebAclRuleActionAllow]] = js.native
  
  /**
    * Instructs AWS WAF to block the web request. Configure as an empty block `{}`.
    */
  var block: js.UndefOr[Input[WebAclRuleActionBlock]] = js.native
  
  /**
    * Instructs AWS WAF to count the web request and allow it. Configure as an empty block `{}`.
    */
  var count: js.UndefOr[Input[WebAclRuleActionCount]] = js.native
}
object WebAclRuleAction {
  
  @scala.inline
  def apply(): WebAclRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleAction]
  }
  
  @scala.inline
  implicit class WebAclRuleActionMutableBuilder[Self <: WebAclRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Input[WebAclRuleActionAllow]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    @scala.inline
    def setBlock(value: Input[WebAclRuleActionBlock]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setCount(value: Input[WebAclRuleActionCount]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
