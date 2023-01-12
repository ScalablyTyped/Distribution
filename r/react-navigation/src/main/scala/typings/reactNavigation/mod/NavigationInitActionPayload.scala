package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationInitActionPayload extends StObject {
  
  var params: js.UndefOr[NavigationParams] = js.undefined
}
object NavigationInitActionPayload {
  
  inline def apply(): NavigationInitActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationInitActionPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationInitActionPayload] (val x: Self) extends AnyVal {
    
    inline def setParams(value: NavigationParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
