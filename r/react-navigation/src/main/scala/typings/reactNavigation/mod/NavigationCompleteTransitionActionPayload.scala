package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationCompleteTransitionActionPayload extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var toChildKey: js.UndefOr[String] = js.undefined
}
object NavigationCompleteTransitionActionPayload {
  
  inline def apply(): NavigationCompleteTransitionActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationCompleteTransitionActionPayload]
  }
  
  extension [Self <: NavigationCompleteTransitionActionPayload](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setToChildKey(value: String): Self = StObject.set(x, "toChildKey", value.asInstanceOf[js.Any])
    
    inline def setToChildKeyUndefined: Self = StObject.set(x, "toChildKey", js.undefined)
  }
}
