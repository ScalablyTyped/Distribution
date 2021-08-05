package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBindingData extends StObject {
  
  var evaluate: js.UndefOr[js.Function1[/* scope */ js.Any, js.Any]] = js.undefined
  
  var redundantAttribute: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[BindingType] = js.undefined
}
object BaseBindingData {
  
  inline def apply(): BaseBindingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBindingData]
  }
  
  extension [Self <: BaseBindingData](x: Self) {
    
    inline def setEvaluate(value: /* scope */ js.Any => js.Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
    
    inline def setRedundantAttribute(value: String): Self = StObject.set(x, "redundantAttribute", value.asInstanceOf[js.Any])
    
    inline def setRedundantAttributeUndefined: Self = StObject.set(x, "redundantAttribute", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setType(value: BindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
