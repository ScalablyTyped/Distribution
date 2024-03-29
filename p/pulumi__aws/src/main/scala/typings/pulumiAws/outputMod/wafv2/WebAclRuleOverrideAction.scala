package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleOverrideAction extends StObject {
  
  /**
    * Override the rule action setting to count (i.e. only count matches). Configured as an empty block `{}`.
    */
  var count: js.UndefOr[WebAclRuleOverrideActionCount] = js.undefined
  
  /**
    * Don't override the rule action setting. Configured as an empty block `{}`.
    */
  var none: js.UndefOr[WebAclRuleOverrideActionNone] = js.undefined
}
object WebAclRuleOverrideAction {
  
  inline def apply(): WebAclRuleOverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleOverrideAction]
  }
  
  extension [Self <: WebAclRuleOverrideAction](x: Self) {
    
    inline def setCount(value: WebAclRuleOverrideActionCount): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setNone(value: WebAclRuleOverrideActionNone): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
  }
}
