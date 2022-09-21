package typings.stencilCore.anon

import typings.stencilCore.stencilPrivateMod.HostRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rules extends StObject {
  
  var rules: js.UndefOr[js.Array[HostRule]] = js.undefined
}
object Rules {
  
  inline def apply(): Rules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rules]
  }
  
  extension [Self <: Rules](x: Self) {
    
    inline def setRules(value: js.Array[HostRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: HostRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
