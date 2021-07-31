package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationSetParamsActionPayload extends StObject {
  
  // The key of the route where the params should be set
  var key: String
  
  // The new params to merge into the existing route params
  var params: NavigationParams
}
object NavigationSetParamsActionPayload {
  
  @scala.inline
  def apply(key: String, params: NavigationParams): NavigationSetParamsActionPayload = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSetParamsActionPayload]
  }
  
  @scala.inline
  implicit class NavigationSetParamsActionPayloadMutableBuilder[Self <: NavigationSetParamsActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: NavigationParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
