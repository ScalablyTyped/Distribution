package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclDefaultAction extends StObject {
  
  /**
    * Specifies that AWS WAF should allow requests by default.
    */
  var allow: js.UndefOr[WebAclDefaultActionAllow] = js.undefined
  
  /**
    * Specifies that AWS WAF should block requests by default.
    */
  var block: js.UndefOr[WebAclDefaultActionBlock] = js.undefined
}
object WebAclDefaultAction {
  
  inline def apply(): WebAclDefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclDefaultAction]
  }
  
  extension [Self <: WebAclDefaultAction](x: Self) {
    
    inline def setAllow(value: WebAclDefaultActionAllow): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setBlock(value: WebAclDefaultActionBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
  }
}
