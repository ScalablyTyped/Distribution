package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationCompleteTransitionActionPayload extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var toChildKey: js.UndefOr[String] = js.undefined
}
object NavigationCompleteTransitionActionPayload {
  
  @scala.inline
  def apply(): NavigationCompleteTransitionActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationCompleteTransitionActionPayload]
  }
  
  @scala.inline
  implicit class NavigationCompleteTransitionActionPayloadMutableBuilder[Self <: NavigationCompleteTransitionActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setToChildKey(value: String): Self = StObject.set(x, "toChildKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToChildKeyUndefined: Self = StObject.set(x, "toChildKey", js.undefined)
  }
}
