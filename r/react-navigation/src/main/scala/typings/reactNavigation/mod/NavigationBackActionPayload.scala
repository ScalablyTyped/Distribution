package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBackActionPayload extends StObject {
  
  var immediate: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String | Null] = js.undefined
}
object NavigationBackActionPayload {
  
  inline def apply(): NavigationBackActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBackActionPayload]
  }
  
  extension [Self <: NavigationBackActionPayload](x: Self) {
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
