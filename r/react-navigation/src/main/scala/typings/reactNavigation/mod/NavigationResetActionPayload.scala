package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationResetActionPayload extends StObject {
  
  var actions: js.Array[NavigationNavigateAction]
  
  var index: Double
  
  var key: js.UndefOr[String | Null] = js.undefined
}
object NavigationResetActionPayload {
  
  inline def apply(actions: js.Array[NavigationNavigateAction], index: Double): NavigationResetActionPayload = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResetActionPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationResetActionPayload] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[NavigationNavigateAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: NavigationNavigateAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
