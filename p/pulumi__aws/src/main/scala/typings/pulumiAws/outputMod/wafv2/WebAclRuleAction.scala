package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleAction extends StObject {
  
  /**
    * Instructs AWS WAF to allow the web request. Configure as an empty block `{}`.
    */
  var allow: js.UndefOr[WebAclRuleActionAllow] = js.undefined
  
  /**
    * Instructs AWS WAF to block the web request. Configure as an empty block `{}`.
    */
  var block: js.UndefOr[WebAclRuleActionBlock] = js.undefined
  
  /**
    * Instructs AWS WAF to count the web request and allow it. Configure as an empty block `{}`.
    */
  var count: js.UndefOr[WebAclRuleActionCount] = js.undefined
}
object WebAclRuleAction {
  
  inline def apply(): WebAclRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleAction]
  }
  
  extension [Self <: WebAclRuleAction](x: Self) {
    
    inline def setAllow(value: WebAclRuleActionAllow): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setBlock(value: WebAclRuleActionBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setCount(value: WebAclRuleActionCount): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
