package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConstructorProperty extends StObject {
  
  var attribute: js.UndefOr[String] = js.undefined
  
  var elementRef: js.UndefOr[Boolean] = js.undefined
  
  var method: js.UndefOr[Boolean] = js.undefined
  
  var mutable: js.UndefOr[Boolean] = js.undefined
  
  var reflect: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[ComponentConstructorPropertyType] = js.undefined
  
  var watchCallbacks: js.UndefOr[js.Array[String]] = js.undefined
}
object ComponentConstructorProperty {
  
  inline def apply(): ComponentConstructorProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentConstructorProperty]
  }
  
  extension [Self <: ComponentConstructorProperty](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setElementRef(value: Boolean): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
    
    inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
    
    inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMutable(value: Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
    
    inline def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
    
    inline def setReflect(value: Boolean): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
    
    inline def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
    
    inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: ComponentConstructorPropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWatchCallbacks(value: js.Array[String]): Self = StObject.set(x, "watchCallbacks", value.asInstanceOf[js.Any])
    
    inline def setWatchCallbacksUndefined: Self = StObject.set(x, "watchCallbacks", js.undefined)
    
    inline def setWatchCallbacksVarargs(value: String*): Self = StObject.set(x, "watchCallbacks", js.Array(value*))
  }
}
