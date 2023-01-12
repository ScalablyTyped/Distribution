package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationPopToTopActionPayload extends StObject {
  
  var immediate: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
}
object NavigationPopToTopActionPayload {
  
  inline def apply(): NavigationPopToTopActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPopToTopActionPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationPopToTopActionPayload] (val x: Self) extends AnyVal {
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
