package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationInitActionPayload extends StObject {
  
  var params: js.UndefOr[NavigationParams] = js.undefined
}
object NavigationInitActionPayload {
  
  @scala.inline
  def apply(): NavigationInitActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationInitActionPayload]
  }
  
  @scala.inline
  implicit class NavigationInitActionPayloadMutableBuilder[Self <: NavigationInitActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: NavigationParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
