package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationReplaceActionPayload extends StObject {
  
  var action: js.UndefOr[NavigationAction] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var newKey: js.UndefOr[String] = js.native
  
  var params: js.UndefOr[NavigationParams] = js.native
  
  var routeName: String = js.native
}
object NavigationReplaceActionPayload {
  
  @scala.inline
  def apply(routeName: String): NavigationReplaceActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationReplaceActionPayload]
  }
  
  @scala.inline
  implicit class NavigationReplaceActionPayloadMutableBuilder[Self <: NavigationReplaceActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setNewKey(value: String): Self = StObject.set(x, "newKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewKeyUndefined: Self = StObject.set(x, "newKey", js.undefined)
    
    @scala.inline
    def setParams(value: NavigationParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
