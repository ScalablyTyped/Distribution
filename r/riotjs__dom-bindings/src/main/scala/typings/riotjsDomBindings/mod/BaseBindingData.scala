package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBindingData[Scope] extends StObject {
  
  var evaluate: js.UndefOr[js.Function1[/* scope */ Scope, Any]] = js.undefined
  
  var redundantAttribute: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[BindingType] = js.undefined
}
object BaseBindingData {
  
  inline def apply[Scope](): BaseBindingData[Scope] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBindingData[Scope]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseBindingData[?], Scope] (val x: Self & BaseBindingData[Scope]) extends AnyVal {
    
    inline def setEvaluate(value: /* scope */ Scope => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
    
    inline def setRedundantAttribute(value: String): Self = StObject.set(x, "redundantAttribute", value.asInstanceOf[js.Any])
    
    inline def setRedundantAttributeUndefined: Self = StObject.set(x, "redundantAttribute", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setType(value: BindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
